let likeButton = document.getElementById("LikeButton"); 
let likeCount = document.getElementById("likes"); 

let numberOfLikes = 0;

likeButton.addEventListener("click", function(){
  numberOfLikes++;
  likeCount.innerText = numberOfLikes;
});