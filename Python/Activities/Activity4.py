while True:
    player1_opt = input("Enter player1 choice answer")
    player2_opt = input("Enter player2 choice answer")  
    if(player1_opt == player2_opt):
        print("No one won. Its tie!!")
    elif player1_opt == 'rock':
         if player2_opt == "scissors":
             print("Rock beats scissors")
    elif player1_opt == 'Scissors':
         if player2_opt == "paper":
               print("Scissors beats paper")
    elif player1_opt == 'paper':
         if player2_opt == "rock":
              print("Paper beats rock")
    else:
         print("Invalid input! You have not entered rock, paper or scissors, try again.")   
         repeat = input("Do you want to play another game ?")
         if(repeat == "yes"):
              pass
         elif(repeat == "no"):
              raise SystemExit
         else:
              print("You entered an invalid option. Exiting now.")
              raise SystemExit