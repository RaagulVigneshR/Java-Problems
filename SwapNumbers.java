import java.awt.*;

class program {
    void swap(int a,int b){
        System.out.println("before swapping:"+"a="+a+" "+"b="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swapping:"+"a="+a+" "+"b="+b);
    }

}


class  Main1{
    public static void main(String[] args) {
        int a, b;
        program p=new program();
        p.swap(7,8);
    }}