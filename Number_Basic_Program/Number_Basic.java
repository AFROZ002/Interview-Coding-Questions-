package Number_Basic_Program;

public class Number_Basic {
//    public static  int Fibbo(int n){
//        if(n==0 || n==1){
//            return 1;
//        }
//        int f=1,s=1,t=0;
//        for(int i=3;i<=n;++i){
//            t=f+s;
//            f=s;
//            s=t;
//
//        }
//        return t;
//    }

//    Recursive Approach

    public  static  int Fibbo(int n,int f, int s, int t){
        if(n==0 ){
            return f;
        }
        if(n==1){
            return s;
        }
        t=f+s;
    return  Fibbo(n-1,s,t,f+s);


    }
    public static void main(String[] args) {
        int n=7;
        int f=0;
        int s=1;
        int t=0;
        int result=Fibbo(n,f,s,t);
        System.out.println(result);
    }
}
