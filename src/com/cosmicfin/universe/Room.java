//package com.cosmicfin.universe;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Code created by Hexatin
 * 2016
 */
public class Room extends Thing {

  private Thing[] furniture;
  private Thing[] people;
  private String name;
  private Thing parent;
  private FurnitureCategory furnitureCategory;
  private BuildingType type;
  private String lastname;

  public Room(Thing parent, BuildingType type, String lastname) {
    this.parent = parent;
    this.type = type;
    this.lastname = lastname;
  }

  public String toString() {
    return name;
  }

  @Override
  Thing parent() {
    return parent;
  }

  @Override
  void generate() {
    furnitureCategory = Generator.randRoomCategory(type);
    name = Generator.randRoomName(furnitureCategory);
    Random r = new Random();
    furniture = new Furniture[r.nextInt(3) + 1];
    people = new Person[r.nextInt(3)];

    for (int i = 0; i < furniture.length; i++) {
      furniture[i] = new Furniture(this, furnitureCategory);
    }

    for (int i = 0; i < people.length; i++) {
      people[i] = new Person(this, lastname);
    }
  }

  @Override
  void print() {
    generate();

    //System.out.printf("   %s%n", name);

    Charset utf8 = StandardCharsets.UTF_8;
    List<String> lines = Arrays.asList(String.format("<h3>%s</h3>", name));

    try {
      Files.write(Paths.get("output.html"), lines, utf8, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
    } catch (IOException e) {
      e.printStackTrace();
    }

    for (int i = 0; i < furniture.length; i++) {
      furniture[i].print();
    }

    for (int i = 0; i < people.length; i++) {
      people[i].print();
    }
  }
}
