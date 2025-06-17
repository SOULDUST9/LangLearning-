// quiz.cpp - does a basic 4 question quiz to test users knowlege and lets them know what they got right and wrong

#include <iostream>

int main(){

	//get the vars 
	int Q1;
	int Q2;
	int Q3;
	int Q4;

	std::cout << "Welcome to the Quiz: (remeber this Quiz is cap sensitive)" << std::endl;

	//Q1
	std::cout << "Q1: What is the name of the world's longest river? " << std::endl;
	std::cout << "1) Missouri River" << std::endl;
	std::cout << "2) Nile" << std::endl;
	std::cout << "3) Amazon River" << std::endl;
	std::cout << "4) Yangtze River" << std::endl;

	std::cout << "Input the answer: ";
	std::cin >> Q1;

	//Q2
	std::cout << "Q2: How many bones are in the human body?" << std::endl;
	std::cout << "1) 150" << std::endl;
	std::cout << "2) 200" << std::endl;
	std::cout << "3) 206" << std::endl;
	std::cout << "4) 207" << std::endl;

	std::cout << "Input the answer: ";
	std::cin >> Q2;

	//Q3
	std::cout << "Q3: How many dots are on a pair of dice?" << std::endl;
	std::cout << "1) 6" << std::endl;
	std::cout << "2) 12" << std::endl;
	std::cout << "3) 18" << std::endl;
	std::cout << "4) 21" << std::endl;

	std::cout << "Input the answer: ";
	std::cin >> Q3;

	//Q4
	std::cout << "Q4: How many continents are there?" << std::endl;
	std::cout << "1) 7" << std::endl;
	std::cout << "2) 4" << std::endl;
	std::cout << "3) 6" << std::endl;
	std::cout << "4) 5" << std::endl;

	std::cout << "Input the answer: ";
	std::cin >> Q4;


	//get the # of correct answers 
	int correct = 0;
	if (Q1 == 2){
		correct = correct + 1;
	}
	if (Q2 == 3){
		correct = correct + 1;
	}
	if (Q3 == 4){
		correct = correct + 1;
	}
	if (Q4 == 1){
		correct = correct + 1;
	}


	//display
	std::cout << "You got " << correct << " answers right." << std::endl;
}