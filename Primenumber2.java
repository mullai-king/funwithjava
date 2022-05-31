import java.util.*;
class Primenumber
 {
  public static void main(String args[])
  {
   int i,j=2,ch,k;
   Scanner sc =new Scanner(System.in);
   System.out.println("enter the number");
   i=sc.nextInt();
   System.out.println("enter the number");
     k=i;
      for(i=1;i<=k;i++)
      {
		ch=0;j=2;
     if(i<=1){
     ch=1;}
     while(j<=i/2)
     {
     if(i%j==0)
      {
		//System.out.println(i+"ch1");  
       ch=1;
       break;
       } 
      else
      {
		 j++;
       //System.out.println(i+"j++");
       }
	    //System.out.println(i+"j++1");
     }
     if(ch==0)
     {
		System.out.println(i+" ");
     }
      else
      {
     //System.out.println(i+" is not prime number");
      }
	  
     }
  }
}