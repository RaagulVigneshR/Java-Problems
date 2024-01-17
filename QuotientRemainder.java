
import java.awt.*;

class program {
    void Quotient(int dividend,int divisor){
        int quotient=dividend/divisor;
        System.out.println("Quotient is:"+quotient);

    }
    void Remainder(int dividend,int divisor){
        int remainder=dividend%divisor;
        System.out.println("Remainder is:"+remainder);

}}


class  Main1{
    public static void main(String[] args) {
        int dividend, divisor;
        program p=new program();
        p.Quotient(6,3);
        p.Remainder(6,3);

    }}