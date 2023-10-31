import java.io.*;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class Numbergame
{
public static void main(String[] args) 
{
int lownum = 50;
int highnum = 100;
int userGuess;
int quit=1;
int attempt=0;
int maxattempt = 5;
int roundwons=0;
String username;      
Scanner scanner = new Scanner(System.in);
while (true) { 
int randomNumber = ThreadLocalRandom.current().nextInt(lownum, highnum + 1);
System.out.print("Enter your name: ");

username = scanner.next();
System.out.println("Welcome to the Number Guessing Game!"+" "+username); 
scanner.nextLine();
System.out.println("");
System.out.println("You can start your game now.....");
scanner.nextLine();

System.out.println("Random number between the " + lownum + " and " + highnum + ": " + randomNumber);
scanner.nextLine();
attempt=0;

while(attempt<maxattempt)
{
System.out.print("Enter your guess number or press '1' to quit: ");
                                                 
userGuess = scanner.nextInt();
attempt++;

if(userGuess==randomNumber){
System.out.println("congrates!! Your guessing number is correct!");
System.out.println("");
roundwons++;
break;
}
else if(userGuess == quit)
{
System.out.println("You've chosen to quit. The correct number was: " + randomNumber);
break; }
else if(userGuess > randomNumber)
{
System.out.println("Sorry!! Your guessing number is too high.");
System.out.println("Please try once again.");
System.out.println("");
}
else 
{
System.out.println("oops!! Your guessing number is too low.");
System.out.println("Please try once again.");
System.out.println("");
}

if (attempt >= maxattempt) 
{
System.out.println("You've reached the maximum number of attempts.");
System.out.println("The correct number was: " + randomNumber);
break; }

System.out.print("Do you want to play again? (yes/no): ");

String playAgain = scanner.next().toLowerCase();
scanner.nextLine();

if(!playAgain.equals("yes"))
{
System.out.println("Thanks for playing!");
break;}}
System.out.println("User score: " + roundwons); // Display rounds won
System.out.print("Do you want to play another round? (yes/no): ");
           
String playAnotherRound = scanner.next().toLowerCase();
scanner.nextLine();

if (!playAnotherRound.equals("yes")) {
System.out.println("");
System.out.println("Thanks for playing! Goodbye.");
break;
}
}
scanner.close();
}
}