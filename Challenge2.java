import java.util.Scanner;
class Challenge2{
public static void main(String[] args){
	//1.no of pennis,nickels,dimes,quarters
	float pennis,nickels,dimes,quarters;
	float totalDollar,remDollarReq;
	System.out.println("Enter the pennis count");
	Scanner scanner = new Scanner(System.in);
	pennis = scanner.nextInt();
	pennis =pennis*.01f;
	System.out.println("Enter the nickels count");
	nickels = scanner.nextInt();
	nickels = nickels*0.05f;
	System.out.println("Enter the dimes count");
	dimes = scanner.nextInt();
	dimes = dimes*0.10f;
	System.out.println("Enter the quarters count");
	quarters = scanner.nextInt();
	quarters =quarters*.25f;
	//2.count total value
	totalDollar = pennis+nickels+ dimes+quarters;
	System.out.println(totalDollar);
	//3.print message m won or loose
	if(totalDollar==1)
	{
		System.out.println("yeah! thats exactly $1.you won");
	}
	//4.if they loose tell them remaining $ 
	else if(totalDollar > 1)
	{
		remDollarReq = totalDollar - 1;
		System.out.println("noo! you have over " +String.format("%.2f",remDollarReq) + ".you lost");
	}
	else if(totalDollar < 1)
	{
		remDollarReq = 1- totalDollar ;
		System.out.println("noo! you have less " +String.format("%.2f",remDollarReq) + " .you lost");
	}
}

}