
import java.util.Scanner;


public class Conditions {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int age;
        String name;
        System.out.print("what is youre age ");
        age = scanner.nextInt();
        name = scanner.nextLine();
        if(name.isEmpty())
        if(age >= 65){
            System.out.print("You are an senior ");
        }
        else if(age >= 18){
            System.out.print("You are an adult");
        }
        else if(age == 0){
            System.out.print("You're a baby");
        }
        else{
            System.out.print("you are a child ");
        }
        scanner.close();
    }
    
}
