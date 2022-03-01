import java.util.*;

public class fib{

    public Integer fib(Integer n){
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else{
            return fib(n-1)+fib(n-2);
        }
    }
    public void run(){
        Scanner input = 
        for (int i = 0; i < ; i++){
            System.out.println(fib(i));
        }
    }
    public static void main(String[] args) {
        fib obj = new fib();
        obj.run();
}
