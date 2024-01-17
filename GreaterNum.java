import java.util.Scanner;
class program{

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter 3 numbers ");
        int num1= input.nextInt();
        int num2= input.nextInt();
        int num3= input.nextInt();
     
        if(num1>num2&&num1>num3 ){
           System.out.println("num1 is greater");
       }
else if(num2>num1&&num2>num3){
           System.out.println("num2 is greater");
           
    }
else {
            System.out.println("num3 is greater");
        }
}}



