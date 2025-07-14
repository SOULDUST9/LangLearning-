//This function checks if a word is a palindrome using recursion
//then prints it to the console for testing.

function isPalindrome(word){
    word = word.toLowerCase();
  
    if(word.length == 1 || word.length == 0){
      return true;
    }
    else {
      if (word.charAt(0) == word.charAt(word.length-1)){
        return isPalindrome(word.slice(1,-1));
      }else {
        return false;
      }
    }
  }
  
  let word1 = "Kayak";
  let word2 = "Tower";
  let word3 = "Tent";
  let word4 = "racecar";
  
  console.log(isPalindrome(word1));
  console.log(isPalindrome(word2));
  console.log(isPalindrome(word3));
  console.log(isPalindrome(word4));
  