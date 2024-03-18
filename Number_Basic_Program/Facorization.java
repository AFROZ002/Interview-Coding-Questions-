package Number_Basic_Program;

public class Facorization {
//    public  static  int Fact(int n){
//        int factorial=1;
//        for(int i=n;i>=1;--i){
//            factorial=factorial*i;
//        }
//        return factorial;
//    }

    public  static  int Fact(int n){
        if(n==0){
            return 1;
        }

      int    fact=n*Fact(n-1);

        return fact;
    }
    public static void main(String[] args) {
        int n=5;
    int result=Fact(n);
        System.out.println(result);

    }
}
