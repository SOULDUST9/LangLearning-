const characters = [
    "The Wally Watchers",
    "Wilma",
    "Fritz",
    "Wizard Whitebeard",
    "Odlaw",
    "Waldo",
    "Woof"
  ];
  
  if (characters.includes("Waldo") == true){
    console.log("Waldo is located at index: " + characters.indexOf("Waldo"));
  }else {
    console.log("Not found");
  }