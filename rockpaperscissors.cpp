#include <iostream>
#include <cstdlib>
#include <ctime>

int main() {
    srand(time(0));
    std::string choices[] = {"rock", "paper", "scissors"};
    std::string computer = choices[rand() % 3];
    std::string player;

    std::cout << "Enter rock, paper, or scissors: ";
    std::cin >> player;

    std::cout << "Computer chose " << computer << std::endl;

    if (player == computer) {
        std::cout << "Tie!" << std::endl;
    } else if ((player == "rock" && computer == "scissors") ||
               (player == "paper" && computer == "rock") ||
               (player == "scissors" && computer == "paper")) {
        std::cout << "You win!" << std::endl;
    } else {
        std::cout << "You lose!" << std::endl;
    }

    return 0;
}