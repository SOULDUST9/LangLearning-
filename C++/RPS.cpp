//// RPS.cpp - a rock paper sizzors game where you play agains a bot (random library) 

#include <iostream>
#include <cstdlib> 

int main(){

    srand(time(0));

    //variables 
    int playerLives = 3;
    int botLives = 3;
    int randomNumber;
    std::string PlayerAns;
    std::string botAns;

    //intro
    std::cout << "Welcome to the Rock, Paper, Sizzors Game. In this game you will play against ME so good luck" << std::endl;
    std::cout << "Ready lets play! \n" << std::endl;

    //Gameloop
    while(playerLives!=0 and botLives!=0){
        
        //see how many lives both players have 
        std::cout << "You have " << playerLives << " lives left. and i have " << botLives << " lives left.\n" << std::endl;

        //playerAns Decision making 
        std::cout << "Pick ROCK, PAPER,or SIZZORS: ";
        std::cin >> PlayerAns;

        randomNumber = rand() % 3; //gets a # (0-2) inclusive

        //botAns Decision making
        if(randomNumber == 0){
            botAns = "ROCK";
        }else if(randomNumber == 1){
            botAns = "PAPER";
        }else if(randomNumber == 2){
            botAns = "SIZZORS";
        }

        //Game
        if(PlayerAns == "ROCK"){
            std::cout << "\nI choose " << botAns << std::endl;
            std::cout << "Looks like you choose " << PlayerAns << std::endl;
            if(botAns == "ROCK"){
                std::cout << "Looks like we tied to bad.\n" << std::endl;
            }else if(botAns == "PAPER"){
                std::cout << "Looks like I won.\n " << std::endl;
                playerLives--;
            }else if(botAns == "SIZZORS"){
                std::cout << "To Bad I lost.\n " << std::endl;
                botLives--;
            }
        }else if(PlayerAns == "PAPER"){
            std::cout << "\nI choose " << botAns << std::endl;
            std::cout << "Looks like you choose " << PlayerAns << std::endl;
            if(botAns == "PAPER"){
                std::cout << "Looks like we tied to bad.\n" << std::endl;
            }else if(botAns == "SIZZORS"){
                std::cout << "Looks like I won.\n " << std::endl;
                playerLives--;
            }else if(botAns == "ROCK"){
                std::cout << "To Bad I lost. \n" << std::endl;
                botLives--;
            }
        }else if(PlayerAns == "SIZZORS"){
            std::cout << "\nI choose " << botAns << std::endl;
            std::cout << "Looks like you choose " << PlayerAns << std::endl;
            if(botAns == "SIZZORS"){
                std::cout << "Looks like we tied to bad.\n" << std::endl;
            }else if(botAns == "ROCK"){
                std::cout << "Looks like I won.\n " << std::endl;
                playerLives--;
            }else if(botAns == "PAPER"){
                std::cout << "To Bad I lost.\n " << std::endl;
                botLives--;
            }
        }else{
            std::cout << "Sorry that is not an input.\n" << std::endl;
        }

    }

    //winner
    if (playerLives == 0){
        std::cout << "Sorry you lose." << std::endl;
    }else if (botLives == 0){
        std::cout << "Congrats look like you win!" << std::endl;
    }
}