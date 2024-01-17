class problem{
    void find(int year){
        if(year%2==0){
            System.out.println("It is a leap year");
        }
        else {
            System.out.println("It is not a leap year");
        }

    }
}


class program{

    public static void main(String[] args) {
       int year=2024;
       problem p=new problem();
       p.find(year);

    }
}