import java.util.*;
class Primnumber
 {
  public static void main(String args[])
  {
   int i,j=2,ch=0;
   Scanner sc =new Scanner(System.in);
   i=sc.nextInt();
   if(i==1)
   ch=1;
   while(j<=i/2)
    {
     if(i%j==0)
      {
       ch=1;
       break;
       } 
      else
      {
       j++;
       }
     }
    if(ch==0)
    {System.out.println(i+"is prime number");
     }
     else
      {
       System.out.println(i+"is not prime number");
      }
  }
}