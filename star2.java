import java.util.Scanner;
public class star2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=5;                             //you can also take user input 
        for(int i=1;i<=n;i++){              //outerlooop

            for(int j=1;j<=i;j++){        //inner loop where the rows will be equal to the column 

            System.out.print(" * ");
            }
        System.out.println();
        }
        sc.close();                      //close method for preventing resource leakage 
    }
}
