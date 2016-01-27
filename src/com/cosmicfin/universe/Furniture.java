package com.cosmicfin.universe;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

/**
 * Code created by Hexatin
 * 2016
 */
public class Furniture extends Thing {

  private String name;
  private FurnitureCategory category;
  private Thing parent;

  @Override
  Thing parent() {
    return parent;
  }

  public Furniture(Thing parent, FurnitureCategory category) {
    this.parent = parent;
    this.category = category;
  }

  public String toString() {
    return name;
  }

  @Override
  void generate() {
    name = Generator.randFurnitureName(category);
    //TODO if it's a container, generate things inside
  }

  @Override
  void print() {
    generate();

    //System.out.printf("     %s%n", name);

    Charset utf8 = StandardCharsets.UTF_8;
    List<String> lines = Arrays.asList(String.format("<p>%s</p>", name));

    try {
      Files.write(Paths.get("output.html"), lines, utf8, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

}
