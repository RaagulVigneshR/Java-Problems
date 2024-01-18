class program {
    void fact(int n){
        System.out.println("The number given is "+n);
        System.out.println("The factors are");
        for(int i=1;i<n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }

    }
}

class main1 {

    public static void main(String[] args) {
        program p = new program();
        int n = 78;
        p.fact(n);

    }
}
