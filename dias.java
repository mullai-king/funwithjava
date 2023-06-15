import java.util.Scanner;
import java.util.Random;
class DiasRoll{
	public static void main(String[] args){
		int diesScore,diesRemaining;
		int diesRollCount;
		diesScore=0;
		//Random importgenerate random 1 to 6
		Random random =new Random();
		//travel the game board of 20 spaces within five dies rolls
		for(diesRollCount =1;diesRollCount<=5;diesRollCount++){
			//tell player which game spaces they are on and how many more space they have to win
			int diesValue = random.nextInt(6) + 1;
			diesScore = diesValue + diesScore; 
			diesRemaining = 20 - diesScore;
			//if they player advances exactly 20 spaces within five die roll they win  
			if(diesScore<20 && diesRollCount<5){
			System.out.println("Roll #" + diesRollCount + ": you've rolled a " + diesValue +" . you are now " +diesScore+" and have " + diesRemaining+" more to go");	
			}
			else if(diesScore==20 &&diesRollCount ==5){
			System.out.println("Roll #" + diesRollCount + ": you've rolled a " + diesValue +" . you on space " +diesScore+"congrats.you won");
			}
			else if(diesScore>20 && diesRollCount==5){
			System.out.println("Roll #" + diesRollCount + ": you've rolled a " + diesValue +" . you advances space " +diesScore);
			}
			else if(diesScore<20 && diesRollCount==5){
			System.out.println("Roll #" + diesRollCount + ": you've rolled a " + diesValue +" . you've now " +diesScore+" you lost u want more to win "+ diesRemaining);
			}
			
		}
	}
}





//ex: Roll #1: you've rolled a 3. you are now 3 and have 17 more to go