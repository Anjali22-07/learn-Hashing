import java.util.*;


public class Hashset {

    public static void main(String[] args) {
        
        //Declaration 

        HashSet<String> st= new HashSet<>();
        //adding elements in HashSet

        st.add("Anjali");
        st.add("Sneha");
        st.add("Yashasvee");
        st.add("Anjali");
        System.out.println(st);// This will print only [Anjali, Sneha, Yashasvee]


        //contains method checks if the value exists in hashmap and returns true and if the value doesn't exists return false

        System.out.println(st.contains("Rahul"));


         //to determine size of HashSet

         System.out.println(st.size());

         //to remove element from HashSet

         System.out.println(st.remove("Anjali"));   //returns boolean value if the value exists and then removes them from hashset

         //to traverse hashset
         for(String s: st){    //for each s in st

            System.out.println(s);

         }


    }
   

    
}
