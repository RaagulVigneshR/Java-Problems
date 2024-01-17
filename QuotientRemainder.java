import java.awt.*;
class program {
    void swap(int a,int b){

       int temp=a;
       b=a;
       a=temp;
        System.out.println("swapped values are:"+a+b);
    }                                 

}


class  Main1{
    public static void main(String[] args) {
        int a,int b;
        program p=new program();
        p.swap(6,5);
}}
