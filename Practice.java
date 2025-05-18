
import java.util.*;


//Some practice problems-- 
/*
 * Given an array, find the most frequent element in it.If there are multiple elements that appear a
 * maximum number of times, print any of them 
 * 
 * sample input- n=6
 * arr[]={1,2,3,1,4,1}
 * 
 * output: 1
 */

public class Practice {
    
public static void main(String[] args) {
    int n;
  
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the size of the array");
   n=sc.nextInt();
   int[] arr=new int[n];
   System.out.println("Enter the elements of the array");
   for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
   }

    hashMapps(arr, n);

}

static void hashMapps(int arr1[], int n){

    Map<Integer, Integer> mp=new HashMap<>();
   
    for(int el : arr1){
        // This checks if the key already exists or not in the key 
        if(!mp.containsKey(el)){
//if the key doesn't already exists we are putting the key with value as 1
            mp.put(el,1);
        }
       else 
       //and if the key already exists in the hashmap we are incrementing the value by 1
              mp.put(el, mp.get(el)+1);  

        }
        System.out.println("Frequency map ");
        // we are printing the entryset that is the key and value pair-- this can be printed without even using a loop 

        System.out.println(mp.entrySet());
    
          // now we need the print the key with maximum value and we will be doing that using 
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
//   we will maintain two variables that are maxVal and ansKey and then assign the value to maxVal after comparisons

int maxValue=0;
int ansKey=0;
for(var e: mp.entrySet()){
 if(maxValue<e.getValue()){
   maxValue=e.getValue();
   ansKey= e.getKey();
 }

} 
//with printf we don't use + to add the statement with the value
System.out.printf(" %d  has max frequency and it appears %d times ", ansKey,maxValue);
}

}
