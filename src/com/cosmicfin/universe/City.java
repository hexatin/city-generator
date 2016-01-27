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
public class City extends Thing {

  private Thing[] buildings;
  private String name;

  public String toString() {
    return name;
  }

  @Override
  Thing parent() {
    return null;
  }

  @Override
  void generate() {
    System.out.println("Beginning city generation. This may take some time.");
    name = Generator.randCityName();
    Random r = new Random();
    //avg. size of households in america is 2.58 people
    int max = 43023; //estimated number of households in carlsbad, california (this would have been LA but it's just far too many)
    int min = 14000; //arbitrary (relatively) small number
    buildings = new Thing[r.nextInt(max - min) + min];

    for (int i = 0; i < buildings.length; i++) {
      buildings[i] = new Building(this);
    }
  }

  @Override
  void print() {
    generate();

    Charset utf8 = StandardCharsets.UTF_8;
    List<String> lines = Arrays.asList(String.format("<h1>%S</h1>", name));

    try {
      Files.write(Paths.get("output.html"), lines, utf8, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
    } catch (IOException e) {
      e.printStackTrace();
    }

    System.out.println("Generating buildings...");
    for (int i = 0; i < buildings.length; i++) {
      buildings[i].print();
      System.out.printf("%,.0f%%\r", ((double) i / (double) buildings.length) * 100);
    }

    System.out.println("City generation complete. The city hierarchy has been saved to output.html.");
  }
}
