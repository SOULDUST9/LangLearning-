pokemon = {
    name: "Pikachu",
    type: "Electric ⚡️",
    level: 25,
  }
  
  console.log("You through a PokeBall at " + pokemon.name);
  
  flag = Math.floor(Math.random() * 3);
  
  if(flag == 0){//failed catch
    console.log("");
    console.log("Wiggle");
    console.log("Wiggle");
    console.log("Wiggle");
    console.log("");
    console.log("Sorry, " + pokemon.name + " has escaped.");
    pokemon.isCaught = false;
  }else{//success catch
    console.log("");
    console.log("Wiggle");
    console.log("Wiggle");
    console.log("Wiggle");
  
    console.log("");
    console.log("Congrats, " + pokemon.name + " has Caught.");
    
    console.log("");
    console.log("Stats: ");
    console.log("pokemon: " + pokemon.name);
    console.log("type: " + pokemon.type);
    console.log("level: " + pokemon.level);
  
    pokemon.isCaught = true; 
  }
  