import java.util.*;
class A{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Random random=new Random();
    int r=random.nextInt(1,101),i,f=0,round=0;
    for(i=0;i<3;i++)
    {
        round=i+1;
        int attempt=3;
        System.out.println("Round "+round);
        System.out.println();
        System.out.println();
        while(attempt>0)
        {
        System.out.println(attempt+" attempts left");
        System.out.println();
        System.out.println("Enter a number");
        int n=sc.nextInt();
        if(n>r)
        System.out.println("Number is lesser keep trying");
        else if(n<r)
        System.out.println("Number is greater keep trying");
        else if(n==r)
        {
        System.out.println("You have guessed it right!");
        f=1;
        break;
        }
        attempt--;
        }
        if(f==1)
        break;
    }
    System.out.println();
    if(f==1)
    {
    if(round==1)
    System.out.println("Your score is 10/10");
    else if(round==2)
    System.out.println("Your score is 8/10");
    else if(round==3)
    System.out.println("Your score is 6/10");   
    }
    else
    {
    System.out.println("Your score is 0");   
    }
}
}