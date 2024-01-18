
import  java.util.Scanner;
class program {
    void VowelConsonant(){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a character");
        char Alpha=  input.next().charAt(0);
        if(Alpha=='A'||Alpha=='E'||Alpha=='I'||Alpha=='0'||Alpha=='U'||Alpha=='a'||Alpha=='e'||Alpha=='i'||Alpha=='o'||Alpha=='u'){
            System.out.println("The given input is a vowel ");
        }
        else{
            System.out.println("The given input is a consonant");
        }

        }


    }


class main1 {

    public static void main(String[] args) {
        program p = new program();
        p.VowelConsonant();

    }
}


