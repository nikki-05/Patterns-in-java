import java.util.Scanner;
public class Nikki{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int age;
        String bloodgroup;
        String name;
        name=sc.nextLine();
        age=sc.nextInt();
        bloodgroup=sc.nextLine();
        System.out.println("------------------------");
        System.out.println("Name:"+ name);
        System.out.println("Age:" +age);
        System.out.println("BloodGroup:" + bloodgroup);
        System.out.println("--------------------------");
        
        if(age>20){
            System.out.println("Your group is REd");
        }
            else if(age>=15 && age<20){
                System.out.println("Your group is BLUE");
            }
                else if(age>=10 && age<15){
                    System.out.println("Your group is YELLOW");
                 }
                else {
                    System.out.println("You don't belong to any group ");
                }
        System.out.println("--------------------------");
            sc.close();
            

    
    



    }
}