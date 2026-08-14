import java.util.*;
public class seven{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int m=0,n=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                int x = sc.nextInt();
                if(x==1){
                    m=i;
                    n=j;
                }
            }
        }
        int count =0;
        int tar = 3;
        while(m!=tar || n!= tar){
            
            count++;
        if(tar>m){
            m++;
        }else if(tar<m){  
            m--;
        }
        if(tar>n){   
            n++;
        }else if(tar<n){    
            n--;
        }
    }
    System.out.println(count);
    }
}