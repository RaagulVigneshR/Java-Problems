public class Student {
    String name;
    int regno;
    String dept;
    long phno;
     Student( String n,int r,String d,long p){
        this.name=n;
        this.regno=r;
        this.dept=d;
        this.phno=p;
    }
    public String toString(){
         return name;
    }

}
