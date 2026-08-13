import java.util.*;
public class five {
    

    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        
        for(int i=0;i<n;i++){
          arr[i] = sc.nextInt(); 
        }
        if(arr[0]==0){
            System.out.println(0);
            return;
        }
      
        for(int i=0;i<k;i++){
            if(arr[k-2]==arr[k-1] && arr[k-1]!=0){
                k++;
            }else if(arr[k-2]==0){
                k--;
            }
               
            }
            System.out.println(k-1);
        }
    
    
}
