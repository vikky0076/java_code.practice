
import java.util.Scanner;

class input{
    public static void main(String[] args) {
        Scanner vikky = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = vikky.nextLine();
        System.out.println("Enter your age:");
        int age = vikky.nextInt();
        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);  
    }
}