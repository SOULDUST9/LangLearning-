function Greeting(){
    let choice = Math.floor(Math.random() * 4);
  
    if (choice == 0){
      console.log("Hi");
    }else if (choice == 1){
      console.log("Hello");
    } else if (choice == 2){
      console.log("Hey");
    } else{
      console.log("Howdy");
    }
  
    
  }
  for (let i=0; i<3; i++){
    Greeting();
  }