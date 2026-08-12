import java.util.*;
public class one{

    public static boolean fourA(int w){
        if(w >2 && w%2 == 0)return true;


        return false;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        System.out.println(fourA(w) ? "YES" : "NO");
    } 
}