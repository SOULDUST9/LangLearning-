//0 to represent "Rock", 1 to represent "Paper", and 2 to represent "Scissors."
let playerChoice = 0; // this will eventually be replaced with user input

let computerChoice = Math.floor(Math.random()*3);

console.log("Player picked: " + playerChoice);
console.log("Computer picked: " + computerChoice);

if (playerChoice == 0){
  if (computerChoice == 0){
    console.log("Looks like we tied.");
  }else if(computerChoice == 1){
    console.log("Looks I Won.");
  }else{
    console.log("Looks I Lost.");
  }
}else if (playerChoice == 1){
  if (computerChoice == 1){
    console.log("Looks like we tied.");
  }else if(computerChoice == 2){
    console.log("Looks I Won.");
  }else{
    console.log("Looks I Lost.");
  }
}else{
   if (computerChoice == 2){
    console.log("Looks like we tied.");
  }else if(computerChoice == 0){
    console.log("Looks I Won.");
  }else{
    console.log("Looks I Lost.");
  }
}
