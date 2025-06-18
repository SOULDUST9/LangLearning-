// simpleBank.cpp - 

#include <iostream>

int main(){

    //starting variables
    int money = 25; 
    std::string name = "atlas";
    int bankingNumber = 25025;
    std::string answer = "a";

    //intro 
    std::cout << "Welcome to Sebs banking service" <<  std::endl;

    while (answer != "CLOSE"){
        std::cout << "Please enter the service you would like to use:\nINFO, PURCHASE, CLOSE: ";
        std::cin >> answer; 
        if (answer == "INFO"){
            std::cout << "Your name is " << name << ", Your banking number is " << bankingNumber << ", currently you have " << money << " in your account." << std::endl;
        }else if(answer == "PURCHASE"){
            if (money - 5 < 0){
                std::cout << "Sorry you do not have enough money in you account. " << std::endl;
            }else{
                money = money - 5;
                std::cout << "You have purchased something for 5$, you currently have "<< money << "$ left." << std::endl;
            }
        }else if(answer == "CLOSE"){
            std::cout << "Have a good day." << std::endl;
        }
    }

}