//thsi code is used to check if a car is used or new and print the appropriate message
//this class is made to test object creation.

const car = {
    model: "Tesla", 
    year: 2024,
    color: "white", 
    used: false
  };
  
  if(car.used == true){
    console.log("I'm looking for a " + car.color + " " + car.year + " " + car.model + " that is used.");
  }else{
    console.log("I'm looking for a " + car.color + " " + car.year + " that is new.");
  }