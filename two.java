import java.util.*;
public class two {
    

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.next();
        }
        String[] ans = new String[n];
        for(int i=0;i<n;i++){
            String s = arr[i];
            if(s.length() <=10)ans[i]=s;
            else{
                StringBuilder sb = new StringBuilder();
                sb.append(s.charAt(0));
                sb.append(s.length()-2);
                sb.append(s.charAt(s.length()-1));
                ans[i] = sb.toString();
            }
        }
        for(String s: ans){
            System.out.println(s);
        }
    }
}
