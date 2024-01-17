import java.lang.Math;
class program{

    public static void main(String[] args) {
        double  rand= Math.random();
        System.out.print("the random number generated is ");
        System.out.println(rand);
       if(rand>=0 && rand<0.5){
           System.out.println("it is tails");
       }
else{
           System.out.println("it is heads");
    }
}}
