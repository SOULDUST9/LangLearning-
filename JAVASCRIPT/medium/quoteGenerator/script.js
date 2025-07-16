const quoteList = [
    "Some doors only open from the inside. Breath is a way of accessing that door.",
    "What has to be taught first, is the breath.",
    "Remember the blue sky. It may at times be obscured by clouds, but it is always there.",
    "In the midst of movement and chaos, keep stillness inside of you.",
    "We can't control the sea, but we can learn how to surf the waves.",
    "Feelings come and go like clouds in a windy sky. Conscious breathing is my anchor.",
    "To understand the immeasurable, the mind must be extraordinarily quiet, still."
  ];
  
  const colors = ["#e81416", "#ffa500", "#faeb36", "#79c314", "#487de7", "#4b369d", "#70369d"];
  
  let wrapperDiv = document.getElementById("wrapper");
  
  let quoteText = document.getElementById("quote-text");
  
  let quoteButton = document.getElementById("quote-button");
  
  quoteButton.addEventListener("click", function() {
    let randomIndex = Math.floor(Math.random() * 7); 
    let randomQuote = quoteList[randomIndex];
  
    quoteText.innerText = randomQuote;
    if(randomIndex == 0){
    wrapperDiv.style.backgroundColor = "red";
    }else if(randomIndex == 1){
      wrapperDiv.style.backgroundColor = "orange";
    }else if(randomIndex == 2){
      wrapperDiv.style.backgroundColor = "yellow";
    }else if(randomIndex == 3){
      wrapperDiv.style.backgroundColor = "green";
    }else if(randomIndex == 4){
      wrapperDiv.style.backgroundColor = "blue";
    }else if(randomIndex == 5){
      wrapperDiv.style.backgroundColor = "#4169e1";
    }else{
      wrapperDiv.style.backgroundColor = "#00008b";
    }
  });