
import java.awt.*;
import java.util.Scanner;
import java.lang.Math;
class program {
    void power(){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the value of N");
        int n= input.nextInt();
        System.out.println("Power of 2 is:"+Math.pow(2,n));

        }


    }

    
class  Main1{
    public static void main(String[] args) {

        program p = new program();
        p.power();
    }}