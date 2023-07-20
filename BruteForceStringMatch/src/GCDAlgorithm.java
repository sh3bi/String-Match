
import java.util.Scanner;


public class GCDAlgorithm {

    public static void main(String[] args) {

        
        System.out.println("enter the text : \n");
        Scanner  scan = new Scanner(System.in); 
        String text = scan.nextLine();
        
        
        System.out.println("enter the Pattern : \n");
        String pattern = scan.nextLine();
        
        
        int hitMiss = BruteForceStringMatch( text, pattern);
        
        if (hitMiss ==-1){
        System.out.println("the index is not found ");
        }else if(hitMiss>=0){
                    System.out.println("the index of the match is :" +(1+hitMiss));

        }
    }
    
    public static int BruteForceStringMatch(String text, String pattern) {

        int len_t = text.length();
        int len_p = pattern.length();

        int k = 0;

        for (int i = 0; i <= (len_t - len_p); i++) {

            int j = 0;
            while (j < len_p && pattern.charAt(j) == text.charAt(i + j)) {
                j++;
                if(j==len_p){
                    return i ;
                }
            }

        }

        return -1;
    }
}
