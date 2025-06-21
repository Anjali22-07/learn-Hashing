import java.util.*;

public class Ques2HashSet {
    
    public static void main(String[] args) {
        
        int[] arr={2,1,1,3,2,3};
        int r= FindNumber(arr);
        System.out.println("The maximum numbers that were on the table at the same time"+r);

    }
            static int FindNumber(int[] Num){

        HashSet<Integer> st= new HashSet<>();
       
        int maxCount=0;

         for(int num: Num){
              
             if(st.contains(num)){
                               
                 st.remove(num);
             }
             else{
                st.add(num);
                
             }
             maxCount= Math.max(maxCount, st.size());
         }

 return maxCount;
    }
}
