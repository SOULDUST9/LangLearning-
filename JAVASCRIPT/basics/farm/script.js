const animal = {
    type: "pig", 
    age: 25, 
    makeSound() {
      if (animal.type == "pig"){
        console.log("This " + animal.type + " is age " + animal.age + " and it sounds like Oink Oink Oink!");
      }else if (animal.type == "sheep"){
        console.log("This " + animal.type + " is age " + animal.age + " and it sounds like Baa Baa Baa!");
      }else if (animal.type == "dog"){
        console.log("This " + animal.type + " is age " + animal.age + " and it sounds like Bark Bark Bark!");
      }
    }
  };
  
  animal.makeSound();
  animal.type = "sheep";
  animal.age = 12;
  animal.makeSound();
  animal.type = "dog";
  animal.age = 9;
  animal.makeSound();