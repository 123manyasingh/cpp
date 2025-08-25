const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

const choices = ["rock", "paper", "scissors"];
const computer = choices[Math.floor(Math.random() * 3)];

rl.question('Enter rock, paper, or scissors: ', (player) => {
  player = player.toLowerCase();

  console.log(`Computer chose ${computer}`);

  if (player === computer) {
    console.log("Tie!");
  } else if ((player === "rock" && computer === "scissors") ||
             (player === "paper" && computer === "rock") ||
             (player === "scissors" && computer === "paper")) {
    console.log("You win!");
  } else {
    console.log("You lose!");
  }

  rl.close();
});
