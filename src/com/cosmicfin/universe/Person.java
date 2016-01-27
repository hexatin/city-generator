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
public class Person extends Thing {

  private String name;
  private Thing parent;
  private String lastname;

  public Person(Thing parent, String lastname) {
    this.parent = parent;
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
    Random r = new Random();
    name = Generator.randPersonName();
    if (lastname.equals("")) {
      name += Generator.randPersonLastName();
    } else {
      name += r.nextInt(10) == 1 ? Generator.randPersonLastName() : lastname;
    }
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
