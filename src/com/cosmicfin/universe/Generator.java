package com.cosmicfin.universe;

//import com.cosmicfin.proceduralpoetry.Word;
//import com.cosmicfin.proceduralpoetry.WordType;

import java.util.Random;

/**
 * Code created by Hexatin
 * 2016
 */
public class Generator {

  /*private static Word[] nouns = {
      new Word("way", 1, WordType.NOUN),
      new Word("group", 1, WordType.NOUN),
      new Word("problem", 2, WordType.NOUN),
      new Word("hand", 1, WordType.NOUN),
      new Word("place", 1, WordType.NOUN),
      new Word("number", 2, WordType.NOUN),
      new Word("night", 1, WordType.NOUN),
      new Word("point", 1, WordType.NOUN),
      new Word("home", 1, WordType.NOUN),
      new Word("water", 2, WordType.NOUN),
      new Word("room", 1, WordType.NOUN),
      new Word("mother", 2, WordType.NOUN),
      new Word("area", 3, WordType.NOUN),
      new Word("money", 2, WordType.NOUN),
      new Word("storey", 2, WordType.NOUN),
      new Word("fact", 1, WordType.NOUN),
      new Word("month", 1, WordType.NOUN),
      new Word("lot", 1, WordType.NOUN),
      new Word("right", 1, WordType.NOUN),
      new Word("study", 2, WordType.NOUN),
      new Word("book", 1, WordType.NOUN),
      new Word("eye", 1, WordType.NOUN),
      new Word("job", 1, WordType.NOUN),
      new Word("town", 1, WordType.NOUN),
      new Word("ton", 1, WordType.NOUN),
      new Word("ville", 1, WordType.NOUN),
      new Word("brook", 1, WordType.NOUN),
      new Word("river", 1, WordType.NOUN)
  };

  private static Word[] adjectives = {
      new Word("Other", 2, WordType.ADJECTIVE),
      new Word("New", 1, WordType.ADJECTIVE),
      new Word("Good", 1, WordType.ADJECTIVE),
      new Word("High", 1, WordType.ADJECTIVE),
      new Word("Old", 1, WordType.ADJECTIVE),
      new Word("Great", 1, WordType.ADJECTIVE),
      new Word("Small", 1, WordType.ADJECTIVE),
      new Word("Large", 1, WordType.ADJECTIVE),
      new Word("Young", 1, WordType.ADJECTIVE),
      new Word("Different", 2, WordType.ADJECTIVE),
      new Word("Black", 1, WordType.ADJECTIVE),
      new Word("Long", 1, WordType.ADJECTIVE),
      new Word("Little", 2, WordType.ADJECTIVE),
      new Word("Bad", 1, WordType.ADJECTIVE),
      new Word("white", 1, WordType.ADJECTIVE),
      new Word("real", 2, WordType.ADJECTIVE),
      new Word("best", 1, WordType.ADJECTIVE),
      new Word("right", 1, WordType.ADJECTIVE),
      new Word("only", 2, WordType.ADJECTIVE),
      new Word("sure", 1, WordType.ADJECTIVE),
      new Word("low", 1, WordType.ADJECTIVE),
      new Word("early", 2, WordType.ADJECTIVE),
      new Word("able", 2, WordType.ADJECTIVE),
      new Word("late", 1, WordType.ADJECTIVE),
      new Word("hard", 1, WordType.ADJECTIVE),
      new Word("major", 2, WordType.ADJECTIVE),
      new Word("better", 2, WordType.ADJECTIVE),
      new Word("strong", 1, WordType.ADJECTIVE),
      new Word("possible", 3, WordType.ADJECTIVE),
      new Word("whole", 1, WordType.ADJECTIVE),
      new Word("free", 1, WordType.ADJECTIVE),
      new Word("true", 1, WordType.ADJECTIVE),
      new Word("full", 1, WordType.ADJECTIVE),
      new Word("special", 2, WordType.ADJECTIVE),
      new Word("easy", 2, WordType.ADJECTIVE),
      new Word("clear", 1, WordType.ADJECTIVE),
      new Word("recent", 2, WordType.ADJECTIVE),
      new Word("certain", 2, WordType.ADJECTIVE),
      new Word("open", 2, WordType.ADJECTIVE),
      new Word("red", 1, WordType.ADJECTIVE),
      new Word("likely", 2, WordType.ADJECTIVE),
      new Word("short", 1, WordType.ADJECTIVE),
      new Word("single", 2, WordType.ADJECTIVE),
      new Word("current", 2, WordType.ADJECTIVE),
      new Word("wrong", 1, WordType.ADJECTIVE),
      new Word("past", 1, WordType.ADJECTIVE),
      new Word("fine", 1, WordType.ADJECTIVE),
      new Word("common", 2, WordType.ADJECTIVE),
      new Word("poor", 1, WordType.ADJECTIVE),
      new Word("natural", 3, WordType.ADJECTIVE),
      new Word("significant", 4, WordType.ADJECTIVE),
      new Word("similar", 3, WordType.ADJECTIVE),
      new Word("hot", 1, WordType.ADJECTIVE),
      new Word("dead", 1, WordType.ADJECTIVE),
      new Word("central", 2, WordType.ADJECTIVE),
      new Word("happy", 2, WordType.ADJECTIVE),
      new Word("serious", 3, WordType.ADJECTIVE),
      new Word("ready", 2, WordType.ADJECTIVE),
      new Word("simple", 2, WordType.ADJECTIVE),
      new Word("left", 1, WordType.ADJECTIVE),
      new Word("blue", 1, WordType.ADJECTIVE),
      new Word("dark", 1, WordType.ADJECTIVE),
      new Word("entire", 3, WordType.ADJECTIVE),
      new Word("close", 1, WordType.ADJECTIVE),
      new Word("cold", 1, WordType.ADJECTIVE),
      new Word("final", 2, WordType.ADJECTIVE),
      new Word("main", 1, WordType.ADJECTIVE),
      new Word("green", 1, WordType.ADJECTIVE),
      new Word("nice", 1, WordType.ADJECTIVE),
      new Word("huge", 1, WordType.ADJECTIVE)
  };*/

  private static String[] familyNames = {
      "Smith",
      "Johnson",
      "Williams",
      "Brown",
      "Jones",
      "Miller",
      "Davis",
      "Garcia",
      "Rodriguez",
      "Wilson",
      "Martinez",
      "Anderson",
      "Taylor",
      "Thomas",
      "Hernandez",
      "Moore",
      "Martin",
      "Jackson",
      "Thompson",
      "White",
      "Lopez",
      "Lee",
      "Gonzalez",
      "Harris",
      "Clark",
      "Lewis",
      "Robinson",
      "Walker",
      "Perez",
      "Hall",
      "Young",
      "Allen",
      "Sanchez",
      "Wright",
      "King",
      "Scott",
      "Green",
      "Baker",
      "Adams",
      "Nelson",
      "Hill",
      "Ramirez",
      "Campbell",
      "Mitchell",
      "Roberts",
      "Carter",
      "Phillips",
      "Evans",
      "Turner",
      "Torres",
      "Parker",
      "Collins",
      "Edwards",
      "Stewart",
      "Flores",
      "Morris",
      "Nguyen",
      "Murphy",
      "Rivera",
      "Cook",
      "Rogers",
      "Morgan",
      "Peterson",
      "Cooper",
      "Reed",
      "Bailey",
      "Bell",
      "Gomez",
      "Kelly",
      "Howard",
      "Ward",
      "Cox",
      "Diaz",
      "Richardson",
      "Wood",
      "Watson",
      "Brooks",
      "Bennett",
      "Gray",
      "James",
      "Reyes",
      "Cruz",
      "Hughes",
      "Price",
      "Myers",
      "Long",
      "Foster",
      "Sanders",
      "Ross",
      "Morales",
      "Powell",
      "Sullivan",
      "Russell",
      "Oriz",
      "Jenkins",
      "Perry",
      "Butler",
      "Barnes",
      "Fisher"
  };

  private static String[] bedrooms = {
      "Bedroom",
      "Attic",
      "Basement",
      "Loft",
      "Nursery",
  };

  public static String[] bathrooms = {
      "Bathroom"
  };

  public static String[] kitchens = {
      "Kitchen"
  };

  public static String[] diningrooms = {
      "Dining Room"
  };

  public static String[] outsiderooms = {
      "Swimming Pool"
  };

  public static String[] livingrooms = {
      "Atrium",
      "Conservatory",
      "Foyer",
      "Front Room",
      "Hearth",
      "Living Room",
      "Rumpus Room",
      "Den",
      "Parlour",
      "Porch",
  };

  public static String[] miscrooms = {
      "Workshop",
      "Sunroom",
      "Cellar",
      "Alcove",
      "Library",
      "Loft",
      "Nook",
      "Pantry",
      "Stairwell",
      "Attic",
      "Basement",
      "Laundry Room",
      "Garage",
      "Office",
  };

  private static String[] firstNamesBoys = {
      "Jacob",
      "Michael",
      "Matthew",
      "Joshua",
      "Christopher",
      "Nicholas",
      "Andrew",
      "Joseph",
      "Daniel",
      "Tyler",
      "William",
      "Brandon",
      "Ryan",
      "John",
      "Zachary",
      "David",
      "Anthony",
      "James",
      "Justin",
      "Alexander",
      "Jonathan",
      "Christian",
      "Austin",
      "Dylan",
      "Ethan",
      "Benjamin",
      "Noah",
      "Samuel",
      "Robert",
      "Nathan",
      "Cameron",
      "Keivn",
      "Thomas",
      "Jose",
      "Hunter",
      "Jordan",
      "Kyle",
      "Caleb",
      "Jason",
      "Logan",
      "Aaron",
      "Eric",
      "Brian",
      "Gabriel",
      "Adam",
      "Jack",
      "Isaiah",
      "Juan",
      "Connor",
      "Charles",
      "Elijah",
      "Isacc",
      "Steven",
      "Evan",
      "Jared",
      "Sean",
      "Timothy",
      "Luke",
      "Cody",
      "Nathaniel",
      "Alex",
      "Seth",
      "Mason",
      "Richard",
      "Carlos",
      "Angel",
      "Patrick",
      "Devin",
      "Bryan",
      "Cole",
      "Jackson",
      "Ian",
      "Garrett",
      "Trevor",
      "Jesus",
      "Chase",
      "Adrian",
      "Mark",
      "Blake",
      "Sebastian",
      "Antonio",
      "Lucas",
      "Gavin",
      "Jeremy",
      "Miguel",
      "Dakota",
      "Alejandro",
      "Jesse",
      "Dalton",
      "Bryce",
      "Tanner",
      "Kenneth",
      "Stephen",
      "Jake",
      "Victor",
      "Spencer",
      "Marcus",
      "Paul"
  };

  private static String[] firstNamesGirls = {
      "Emily",
      "Hannah",
      "Madison",
      "Ashley",
      "Sarah",
      "Alexis",
      "Samantha",
      "Jessica",
      "Elizabeth",
      "Taylor",
      "Lauren",
      "Alyssa",
      "Kayla",
      "Abigail",
      "Brianna",
      "Olivia",
      "Emma",
      "Megan",
      "Grace",
      "Victoria",
      "Rachel",
      "Anna",
      "Sydney",
      "Destiny",
      "Morgan",
      "Jennifer",
      "Jasmine",
      "Haley",
      "Julia",
      "Kaitlyn",
      "Nicole",
      "Amanda",
      "Katherine",
      "Natalie",
      "Hailey",
      "Alexandra",
      "Savannah",
      "Chloe",
      "Rebecca",
      "Stephanie",
      "Maria",
      "Sophia",
      "Mackenzie",
      "Allison",
      "Isabella",
      "Amber",
      "Mary",
      "Danielle",
      "Gabrielle",
      "Jordan",
      "Brooke",
      "Michelle",
      "Sierra",
      "Katelyn",
      "Andrea",
      "Madeline",
      "Sara",
      "Kimberly",
      "Courtney",
      "Erin",
      "Brittany",
      "Vanessa",
      "Jenna",
      "Jacqueline",
      "Caroline",
      "Faith",
      "Makayla",
      "Bailey",
      "Paige",
      "Shelby",
      "Melissa",
      "Kaylee",
      "Christina",
      "Trinity",
      "Mariah",
      "Caitlin",
      "Autumn",
      "Marissa",
      "Breanna",
      "Angela",
      "Catherine",
      "Zoe",
      "Briana",
      "Jada",
      "Laura",
      "Claire",
      "Alexa",
      "Kelsey",
      "Kathryn",
      "Leslie",
      "Alexandria",
      "Sabrina",
      "Mia",
      "Isabel",
      "Molly",
      "Leah",
      "Katie",
      "Gabriella",
      "Cheyenne",
      "Cassandra",
      "Lucy"
  };

  private static String[] chairs = {
      "Chair",
      "Bean Bag",
      "Ottoman",
      "Recliner",
      "Stool",
      "Bench",
      "Futon",
      "Couch"
  };

  private static String[] beds = {
      "Bed",
      "Bunk Bed",
      "Canopy Bed",
      "Four-Poster Bed",
      "Futon",
      "Waterbed",
      "Hammock",
      "Crib"
  };

  private static String[] containers = {
      "Bookcase",
      "Closet",
      "Cupboard",
      "Cabinet",
      "Dresser",
      "Wardrobe",
      "Hat Rack"
  };

  private static String[] surfaces = {
      "Desk",
      "Computer Desk",
      "Writing Desk",
      "Drawing Desk",
      "Pedestal",
      "Coffee Table",
      "Dining Table",
      "End Table",
      "Baker's Rack",
  };

  private static String[] bathroomEquipment = {
      "Toilet",
      "Sink",
      "Shower",
      "Bath",
      "Medicine Cabinet"
  };

  private static String[] entertainment = {
      "Jukebox",
      "Pinball Machine",
      "Chess Set",
      "Television"
  };

  public static String[] hotel_firstpart = {
      "King's",
      "Lunar",
      "Viridian",
      "Scarlet",
      "Monolith",
      "Vortex",
      "Regal",
      "Noble",
      "Triple",
      "Double",
      "Multiple",
      "Super",
      "Varnished",
      "Queen's",
      "Ivory",
      "Pewter",
      "Lapis",
      "Solar",
      "Golden",
      "Silver",
      "Gilded",
      "Emblazened",
      "Relaxation",
      "Countryside",
      "Royal",
      "Deluxe",
      "Revelation",
      "Raven's",
      "Crow's",
      "Owl's",
      "Voyage",
      "Supreme",
      "Liberty",
      "Soft",
      "Warm",
      "Palm Tree",
      "Excalibur"
  };

  public static String[] hotel_secondpart = {
      "Oasis",
      "Expanse",
      "Expanses",
      "Road",
      "Roads",
      "Path",
      "Paths",
      "Oases",
      "Island",
      "Islands",
      "Vista",
      "Fjord",
      "Plain",
      "Plains",
      "Vistas",
      "Hill",
      "Hills",
      "Valley",
      "Valleys",
      "Horizon",
      "Horizons",
      "Residence",
      "Residences",
      "Arms",
      "Tower",
      "Towers",
      "Plaza",
      "Plazas",
      "Cloak",
      "Cloaks",
      "Pier",
      "Piers",
      "Voyage",
      "Voyages",
      "Monarch"
  };

  public static String[] hotel_thirdpart = {
      "Hotel",
      "Hotel & Spa",
      "Resort",
      "Resort & Spa",
      "Lodge",
      "Retreat"
  };

  public static String[] apt_firstpart = {
      "Princess",
      "Elm",
      "Farmer",
      "Little",
      "Heritage",
      "Ferry",
      "Lowland",
      "Art",
      "Saffron",
      "Bush",
      "Shade",
      "Mandarin",
      "Cliff",
      "Broom",
      "Sun",
      "Chapel",
      "Azure",
      "Hawthorne",
      "Monolith",
      "Great One",
      "Almighty",
      "Supreme",
      "Wayside",
      "Electric",
      "Hunter",
      "Gatherer",
      "Homeward",
      "Low",
      "Left",
      "Right",
      "Upstream",
      "Downstream",
      "Backwards",
      "Forwards"
  };

  public static String[] apt_secondpart = {
      "Street",
      "Road",
      "Terrace",
      "Plaza",
      "Place",
      "Passage",
      "Row",
      "Avenue",
      "Lane",
      "Boulevard",
      "Square",
      "Court"
  };

  private static String[] shop_firstpart = {
      "Evil",
      "Silver",
      "Gold",
      "Shiny",
      "Dull",
      "All-Seeing",
      "Blue",
      "Azure",
      "Diamond",
      "Emerald",
      "Ruby",
      "Good",
      "Nice",
      "Exalted",
      "Flawless",
      "Bleeding",
      "Listening",
      "Truthful",
      "Inspired",
      "Inspiring",
      "Uniformed",
      "Uniform",
      "Absolute",
      "Fancy",
      "Towering",
      "Village",
      "Old-Fashioned",
      "Modern",
      "Perfect",
      "Sunny",
      "Dark",
      "Cloudy",
      "Warm",
      "Relaxing",
      "Amazing",
      "Scandalous",
      "Early",
      "Clear"
  };

  private static String[] shop_secondpart = {
      "Fish",
      "Temple",
      "Eye",
      "Mask",
      "Overlord",
      "Painter",
      "Farmer",
      "Human",
      "Horse",
      "Pig",
      "Cat",
      "Dog",
      "Cake",
      "Pantheon",
      "Peach",
      "Potion",
      "Berry",
      "Pond",
      "Castle",
      "Bowl",
      "Kettle",
      "Model",
      "Plane",
      "Beauty",
      "Clothing",
      "Day",
      "Sky",
      "Swimmer",
      "Pool",
      "Ocean",
      "Sea",
      "Lake",
      "Lagoon"
  };

  public static String[] shop_thirdpart = {
      "Sports",
      "Sports Company",
      "Sports Inc.",
      "Wares",
      "General Store",
      "Mart",
      "Sales",
      "Teashop",
      "Tearoom",
      "Pharmacy",
      "Corner Store",
      "Music Store",
      "Instrument Shop",
      "Pawn Shop",
      "Pawn Store",
      "Perfumery",
      "Swimwear",
      "Department Store",
      "Hardware Store",
      "Potions",
      "Menagerie",
      "Concerns",
      "Yarn",
      "Hobby Shop",
      "Recreation Gear",
      "Gear",
      "Coats",
      "Jackets",
      "Fishery",
      "Butcher",
      "Meats",
      "General Grocery",
      "Grocery Store",
      "Grocers",
      "Jewelers",
      "Jewelery Store",
      "Travel Agency",
      "Tavern",
      "Pub",
      "Outfitter",
      "Furniture Store",
      "Kitchens",
      "Candy Store",
      "Candy Shop",
      "Supermarket",
      "Bakers",
      "Bakery",
      "Patisserie",
      "Burgers",
      "Hamburgers",
      "Salon",
      "Pet Store",
      "Fish and Chips",
      "Antiques",
      "Antique Store",
      "Store",
      "Garden Store",
      "Garden Center",
      "Repairs",
      "Electronics",
      "Computers",
      "Cafe",
      "Mexican Food"
  };

  private static String[] city_firstpart = { //TODO more city name options
      "Large",
      "Noble"
  };

  private static String[] city_secondpart = { //TODO more city secondparts
      "Water",
      "House"
  };

  private static String[] hotelrecreation = {
      "Swimming Pool",
      "Spa",
      "Large Swimming Pool",
      "Artifical Beach",
      "Hot Spring",
      "Sauna",
      "Lounge",
      "Tennis Court",
      "Golf Field",
      "Casino",
      "Bar",
      "Restaurant"
  };

  private static String[] hoteladministration = {
    "Lobby",
    "Janitor's Closet",
    "Laundry Room",
    "Electrician's Room",
    "Communal Bathroom"
  };


  private static Random r = new Random();
  //TODO GUI
  //TODO descriptions of things

  public static String randCityName() {
    //TODO add MORE CITIES (one at a time to avoid memory boiling over)
    return "THE CITY OF " + choose(city_firstpart) + choose(city_secondpart);
  }

  public static String randBuildingName(BuildingType type) {
    //TODO generate names for each type of building
    //TODO generate shops inside malls
    //TODO generate shelves inside shops with products on them
    //TODO generate bookshelves inside libraries with books on them, complete with pages of text
    switch (type) {
      case HOUSE:
        return String.format("The %s Residence", choose(familyNames));
      case HOTEL:
        return (r.nextInt(10) == 3 ? "The " : "") + choose(hotel_firstpart) + " " + (r.nextInt() <= 7 ? choose(hotel_secondpart) : "") + " " + choose(hotel_thirdpart);
      case APARTMENT:
        return (r.nextInt(600) + 100) + " " + choose(apt_firstpart) + " " + choose(apt_secondpart);
      case SHOP:
        return (r.nextBoolean() ? "The " + choose(shop_firstpart) + " " + (r.nextInt() <= 7 ? choose(shop_secondpart) + " " : "") : (r.nextBoolean() ? choose(firstNamesGirls) : choose(firstNamesBoys)) + "'s " ) + choose(shop_thirdpart);
      case MALL:
        return "The Centre MK";
      case THEME_PARK:
        return "Elitch Gardens";
      case WATER_PARK:
        return "Splasha";
      case LIBRARY:
        return "The Library";
      case PARK:
        return "Central Park";
      default:
        return "Building";
    }
  }

  public static BuildingType randBuildingType() {
    return (BuildingType) weightedChoose(new BuildingType[]{BuildingType.HOUSE, BuildingType.APARTMENT, BuildingType.SHOP, BuildingType.HOTEL, BuildingType.LIBRARY, BuildingType.MALL, BuildingType.PARK, BuildingType.THEME_PARK, BuildingType.WATER_PARK}, 5);
  }

  public static String randRoomName(FurnitureCategory category) {
    //TODO rooms based on type of building (floors for apartments, apartment rooms, changing rooms for water parks, main rooms for libraries, etc)
    switch (category) {
      case BED:
        return "" + choose(bedrooms);
      case BATH:
        return "" + choose(bathrooms);
      case KITCHEN:
        return "" + choose(kitchens);
      case DINING:
        return "" + choose(diningrooms);
      case OUTSIDE:
        return "" + choose(outsiderooms);
      case LIVING:
        return "" + choose(livingrooms);
      case HOTEL_ROOM:
        return "Room " + (r.nextInt(299) + 100);
      case HOTEL_REC:
        return "" + choose(hotelrecreation);
      case HOTEL_ADMIN:
        return "" + choose(hoteladministration);
      case HOTEL_CREEPY:
        return "Attic";
      default:
        return "Room";
    }
  }

  public static String randFurnitureName(FurnitureCategory category) {
    //TODO categorize furniture into things that can have people in them (like beds, chairs, etc) and then generate people inside of them
    //TODO outside furniture
    //TODO kitchen furniture
    //TODO exclusive furniture for new building types
    switch (category) {
      case BED:
        return "" + weightedChoose(new Object[]{choose(beds), choose(containers), choose(entertainment)}, 4);
      case BATH:
        return "" + choose(bathroomEquipment);
      case KITCHEN:
        return "" + weightedChoose(new Object[]{choose(surfaces), choose(chairs)}, 1.1);
      case DINING:
        return "" + weightedChoose(new Object[]{choose(surfaces), choose(chairs), choose(entertainment), choose(containers)}, 1.5);
      case OUTSIDE:
        return "Outside thing";
      case LIVING:
        return "" + weightedChoose(new Object[]{choose(surfaces), choose(chairs), choose(entertainment), choose(containers)}, 3);
      default:
        return "Object";
    }
  }

  public static FurnitureCategory randRoomCategory(BuildingType type) {
    //TODO furniture category based on building type
    switch(type){
      case HOUSE:
        if (r.nextInt(100) <= 50) {
          return (FurnitureCategory) choose(new FurnitureCategory[]{FurnitureCategory.BED, FurnitureCategory.BATH});
        } else {
          return (FurnitureCategory) weightedChoose(new FurnitureCategory[]{FurnitureCategory.KITCHEN, FurnitureCategory.DINING, FurnitureCategory.LIVING, FurnitureCategory.OUTSIDE}, 2);
        }
      case HOTEL:
        if(r.nextInt(1000000) == 42){
          return FurnitureCategory.HOTEL_CREEPY;
        }else{
          return (FurnitureCategory) weightedChoose(new FurnitureCategory[]{FurnitureCategory.HOTEL_ROOM, FurnitureCategory.HOTEL_REC, FurnitureCategory.HOTEL_ADMIN}, 10);
        }
      case APARTMENT:
        return (FurnitureCategory) weightedChoose(new FurnitureCategory[]{FurnitureCategory.APT_ROOM, FurnitureCategory.APT_ADMIN},10);
      default:
        if (r.nextInt(100) <= 50) {
          return (FurnitureCategory) choose(new FurnitureCategory[]{FurnitureCategory.BED, FurnitureCategory.BATH});
        } else {
          return (FurnitureCategory) weightedChoose(new FurnitureCategory[]{FurnitureCategory.KITCHEN, FurnitureCategory.DINING, FurnitureCategory.LIVING, FurnitureCategory.OUTSIDE}, 2);
        }
    }
  }

  public static String randPersonName() {
    String[] toChooseFrom = r.nextBoolean() ? firstNamesBoys : firstNamesGirls;
    return weightedChoose(toChooseFrom, 1.14) + " ";
  }

  public static String randPersonLastName() {
    return weightedChoose(familyNames, 1.13) + "";
  }

  //TODO pets

  public static Object choose(Object[] arr) {
    int rand = r.nextInt(arr.length);
    return arr[rand];
  }

  public static Object weightedChoose(Object[] arr, double weight) {
    if (weight <= 0) weight = 1;
    return arr[((int) Math.floor(Math.pow(Math.random(), weight) * arr.length))];
  }
}
