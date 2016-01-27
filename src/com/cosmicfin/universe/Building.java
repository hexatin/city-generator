package com.cosmicfin.universe;

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
public class Building extends Thing {

  private Thing[] rooms;
  private String name;
  private Thing parent;
  private BuildingType type;
  private String lastname = "";

  public Building(Thing parent) {
    this.parent = parent;
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
    type = Generator.randBuildingType();
    if (type == BuildingType.HOUSE) {
      lastname = Generator.randPersonLastName();
      name = String.format("The %s Residence", lastname);
    } else {
      name = Generator.randBuildingName(type);
    }
    Random r = new Random();
    rooms = new Room[r.nextInt(5) + 1];
    for (int i = 0; i < rooms.length; i++) {
      rooms[i] = new Room(this, type, lastname);
    }
  }

  @Override
  void print() {
    generate();

    //System.out.printf(" %s%n", name);

    Charset utf8 = StandardCharsets.UTF_8;
    List<String> lines = Arrays.asList(String.format("<h2>%s</h2>", name));

    try {
      Files.write(Paths.get("output.html"), lines, utf8, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
    } catch (IOException e) {
      e.printStackTrace();
    }

    for (int i = 0; i < rooms.length; i++) {
      rooms[i].print();
    }
  }
}
