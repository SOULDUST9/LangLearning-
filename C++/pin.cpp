// pin.cpp - a basic pin maker + guesser.

#include <iostream>

int main(){

	//declare vars
	int savedPIN;
	int typedPIN;

	//creates a PIN 
	std::cout << "PLEASE TYPE IN YOUR NEW CODE: ";
	std::cin >> savedPIN;

	//start of looping sequence
	std::cout << "ENTER YOUR PIN: ";
	std::cin >> typedPIN;

	while (savedPIN != typedPIN){
		std::cout << "INCORRECT PIN PLEASE TRY AGAIN: ";
		std::cin >> typedPIN;
	}

	std::cout << "PIN ACCEPTED";
}