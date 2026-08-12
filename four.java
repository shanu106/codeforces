import java.util.*;
public class four {
    

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        String[] arr = new String[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.next();
        }
        for(int i=0;i<n;i++){
            if(arr[i].equals("X++") || arr[i].equals("++X"))x++;
            else x--;
        }
        System.out.println(x);
    }

}
