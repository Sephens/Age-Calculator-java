package agecalculator;
import java.util.*;
public class AgeCalculator {
    
    public AgeCalculator(){
        Scanner stri = new Scanner(System.in);
        System.out.print("Enter Name:");
        String name = stri.nextLine();
        
        Scanner ageScan = new Scanner(System.in);
        System.out.print("Enter Your Age:");
        int age = ageScan.nextInt();
        
        if(age<=5 && age!=0){
        System.out.println(name+ "\t You are an Infant");
        }
        else if(age >5 && age <=20){
            System.out.println(name + "\t You are a Teeneger");
            
        }
        else if(age >20 && age <110){
            System.out.println(name +"\t You are an Adult");
        }
        
        else{
            System.out.println("Error!!: No Such Age..");
        }
            
        
        
    }
    
    public static void main(String[] args) {
        
        AgeCalculator ageCalc = new AgeCalculator();
        
    }
    
}
