// numberGuesser.cpp - gets the user to play a game where they must guess the number.

#include <iostream>

int main() {

  int random = 25;
  int userGuess;
  int guess = 1;

  std::cout << "LETS PLAY A GAME. in this game you will guess a number between 1-64" << std::endl;

  std::cout << "PLEASE INPUT YOUR FIRST GUESS: ";
  std::cin >> userGuess;

  while (userGuess != random){
    std::cout << "INCORRECT, YOU NOW HAVE " << guess << " WRONG GUESS." << std::endl;
    std::cout << "PLEASE INPUT YOUR NEXT GUESS: ";
    std::cin >> userGuess;
    guess = guess + 1;
  }

  std::cout << "CONGRATS YOU GOT IT. WITH ONLY " << guess << " WRONG GUESS'S." << std::endl;

  
}