// Step 1: Read and understand the problem statement and sample test cases

// Click on 'Next' once you are ready to proceed.
import java.util.Scanner;
public class avgint
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();//test cases
        for(int i=0;i<t;i++){//loop for each test case
        System.out.println("enter two nos");
        int a=sc.nextInt();
        int c=sc.nextInt();
        int avg=(a+c)/2;
        if (avg==(int)avg){
            System.out.println(avg);
        }
            else{
                System.out.println("-1");
            }
            
        }
        sc.close();
        
    }
}
