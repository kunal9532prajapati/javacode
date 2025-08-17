//package Switchcase;
import java.util.Scanner;
class SwitchCase{
    public static void main(String[] args) {

        int age;
       
        System.out.println("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        age= sc.nextInt();
        
        switch(age){

            case 18:      
                System.out.println("U can vote");
                break;
                
            case 60:
                System.out.println("U r getting Retirement");
                break;
                
            case 80 :
                System.out.println(" Take Bed rest");
                break; 
                
            default:
                System.out.println("Error, plese enter valid age");
                break;
        }     
    }
}
