import java.util.*;

public class Main{

    static void HashMapsWorking(){
        //syntax
        Map<String, Integer> mp= new HashMap<>();
        //Datatype of key and value can be anything
        //Adding/insert elements-- we use put(key,value) method-- first we need to add key and then values
         mp.put("Akash", 21);
         mp.put("Yash", 16);
         mp.put("Luv", 17);
         mp.put("Rishika", 19);
         mp.put("Harry", 18);
         System.out.println(mp.get("Akash"));

         //TO get the value of a key from hashmap-- a method get(key) to get the value of the specified key

         System.out.println("The age of"+ mp.get("Yash")); // returns the value to which he specified key is mapped

         //changing the value of a key in hashmap 

         //we  will use put() method again--since we are changing the key entry and a key in hashmap is unique
         //so the last updated value will replace the old value in the hashtable

         mp.put("Akash",26);
         System.out.println(mp.get("Akash"));

         //Removing a pair from the hashmap -- to remove a pair from hashmap we use remove() method
         System.out.println(mp.remove("Akash")); //returns 26-- which was the value stored for the specified key
         System.out.println(mp.remove("Anjali")); // returns null-- as the key does not exist
         /*
          * 
          remove()-- parameter- key-whose mapping has to be removed
          --returns- The previous value associated with key and null if there was no mapping for key.
            value, if key exists
            null, if key doesn't exists
 
          */
          //Checking if a key is in the hashmap
           //we use -- containsKey() method
           System.out.println(mp.containsKey("Akash")); // returns false
           System.out.println(mp.containsKey("Yash")); // returns true
           /*parameter-- key whose existence we have to check */

           //Adding a new entry only if the new key doesn't exists already
              if(!mp.containsKey("Yash")){ // checks if the key already exists or not
                mp.put("Yash", 14); // adds the value if the condition is true
             }

        //OR we can use a method-- putIfAbsent() -- params-- both <key ,value>

        mp.putIfAbsent("Yashika", 19);
     // this method will only add a new entry if the key doesn't already exists

//-- Get all the keys in HashMap-- We use methods -- keySet()-- returns the set view of the key present
    System.out.println(mp.keySet());

// -- to get all the values in hashmap and not the keys just the values-- we use method values()-- 
//returns the set of values present in the hashmap
    System.out.println(mp.values());

    //--to get all the entries of the hashmap we use entrySet()--
    //returns the set view of the mappings contained in this map
    //

    System.out.print(mp.entrySet()); 

    //Traversing all the methods of hashmaps--multiple methods are used

    //--traverse all the key using for each loop
     for(String key : mp.keySet())
{
  //using printf when you need specific formatting.
    System.out.printf("Age of %s is %d\n", key, mp.get(key)); //%s is string and %d is for integer modulus
}
//--  second method

//-- data type used will be   because entry has different combination of datatypes 
   for( Map.Entry<String, Integer> e: mp.entrySet()){

    System.out.printf("Age of %s is %d\n" , e.getKey(), e.getValue());
   
   }
   //we can also use var-- it takes in all type of data when printing entry set

   for(var e: mp.entrySet())
    {
      System.out.printf("Age is %s and %d\n",e.getKey(), e.getValue());
    }
 

    }
         //
         public static void main(String[]args){
            HashMapsWorking();
         }


    
}