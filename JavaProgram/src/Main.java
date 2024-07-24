import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TIP Press <shortcut actionId="ShowIntentionAction>
        //to see how IntelliJ Idea suggests fixing it.
        Scanner scanner = new Scanner(System.in);
        // tyo access the method from Scanner uing obj
        String name = scanner.nextLine();
        int age = scanner.nextInt();

//        if(age<18){
//            System.out.println("My name is" + name + "and my age is " + age +" I am not eligibble for voting");
//        }
//        else{
//            System.out.println("My name is" + name + "and my age is " + age +" I am  eligibble for voting");
//        }
// To check the user is eligible for voting or not
        String output =(age>=18) ? "YOu are eligible":"you are not eligible for vote";
        System.out.println("My name is " + name + " and my age is " + age +" I am  eligibble for voting");
    }
}
