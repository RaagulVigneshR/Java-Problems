import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER THE NAME:");
        String st = scanner.nextLine();
        Student s = new Student(st,88,"NWC",1234567890);

        System.out.println(s);
    }
}