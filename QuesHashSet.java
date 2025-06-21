import java.util.*;

public class QuesHashSet {

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        HashSet<Integer> in= new HashSet<>();
        System.out.println("Enter the size of the array");
         int n= sc.nextInt();
        for(int i=0;i<n;i++){
            //to insert elements in the hashset
            in.add(sc.nextInt());
        }

        System.out.println(in);

        int maxstreak=0;
        
        //finding the starting point for the subsequence

        for(int el: in){
        if(!in.contains(el-1)){
            int currstart= el;   //el is the starting point of the subsequence
            int currstreak=1; // length of current subsequence
            while(in.contains(currstart+1)){
                currstreak++;
                currstart++;    //incrementing the value so that the loop begins from currstart+1 value

            }
            maxstreak= Math.max(maxstreak, currstreak);

        }
        
        }
        System.out.println("The longest consecutive sequence in the array is:"+ maxstreak);
         
        
       


    }
    
}
