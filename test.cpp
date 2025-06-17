#include <iostream>
#include <cstdlib>

int main(){
	srand(time(0));
  	int random = rand() % 10 + 1;
  	std::cout << random << std::endl; 
  	if (random > 5){
  	  	std::cout << "NICE";
  	}else{
    	std::cout << "BAD";
  	}
}