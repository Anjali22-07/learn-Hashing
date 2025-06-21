import java.util.*;

public class ImplementingHashMap {


    //using generics parameters--- k and v to make it compatible with any data type
    static class MyHashMap<K,V>   {
        //initialising load factor and initial capacity

        public static final int DEFAULT_CAPACITY=4;
         public static final float DEFAULT_LOAD_FACTOR=0.75f;

         //we also need nodes-- that will be added to the bucket in case of collision
         private class Node{
               K key;
               V value;
               Node(K key, V value){
                    this.key=key;
                    this.value=value;
               }
            }
         
            //other things that we need
            private int n;// returns the number of elements in map

            //Declaring the linked list
            private LinkedList<Node>[] buckets;   //LinkedList array to craete the bucket
            
            //we need buckets array and in each empty bucket of array there must be an empty linked list
             
              private void initBuckets(int N){    //N-- size/capacity of the empty bucket
                // creating a list of N size array
                buckets= new LinkedList[N];
                for(int i=0;i<buckets.length;i++){

                  //this adds empty nodes to the empty buckets of linked list array
                  buckets[i]= new LinkedList<>();
                }

              }


           public MyHashMap(){
                 
            //calling the initbuckets method and passing the default_capacity i.e. is 4
              initBuckets(DEFAULT_CAPACITY);
             
           }

           //HashFunction to calculate the index of the key

           private int HashFunc(K key){   // using genericws because key can be of any data type

              int hc= key.hashCode();   //this function returns a hashcode value for the function
              
              //taking mod of hc -- so that it doesn't exceeds the bucket limit

              return (Math.abs(hc))%buckets.length;

           }


           //method SearchInBucket traverses the linked list and looks for the key  and returns the index if it exists already or returns -1 if value doesn't exists

            private int SearchInBucket(LinkedList<Node> ll, K key){

              for(int i=0;i<ll.size();i++){

                if(ll.get(i).key==key){
                  return i;
                }
               
              }
               return -1;           

            }

            //Rehash function in case the number of elements exceeds the threshold value
           private void rehash(){

              LinkedList<Node>[] oldBucket= buckets;
              initBuckets(oldBucket.length*2);
              n=0;   //making the number of elements 0 because the rehashing is done and a new hash table is created.
             
              //for each bucket
              for( var bucket: oldBucket){
                //for each node of each bucket
                  for(var node: bucket){
                     put(node.key, node.value);
                  }
                 
              }
               
              


           }




            //the functions which we need to implement
            //get(), put(), size(), remove()

            public int size(){   //returns the number of entries in hashmap

              return n;
            }
             
            
            //PUT function 
            public void put(K key, V value){   // for insert and update

              //we need a hashFunction -- which will calculate the index where the key will be stored 

              int bi= HashFunc(key);
              //creating a new node to store the value if it doesn't exists
              //the current node will have the nodes

              LinkedList<Node> currentBucket= buckets[bi];

          //to check whether the element already exists or not-- we use the function SearchInBucket

              int el= SearchInBucket(currentBucket, key);

                    if(el==-1){   //key doesn't exists, so inserting the value

                    Node node= new Node(key, value);
                       currentBucket.add(node);    // since the key doesn't exists already it inserts the new node into the current node
                       //and we increment the number of elements in the buckets
                         n++;

                    }     
                    else{   //key already exists, so we update the value 
                      Node currNode= currentBucket.get(el);   // the key at currentBucket at index el is stored in currNode
                     
                      //updating the value at current node with the new value
                        currNode.value=value;

                    }         
 //To optimize the code we will rehash the map.
            //we Rehash when the number of elements inserted > threshold value
                    if(n>= buckets.length* DEFAULT_LOAD_FACTOR){
                       rehash();
                    }
            }
 
            //GET function 
             public V get(K key){      //returns value 
                    
                int bi= HashFunc(key);
                 LinkedList<Node> currentBskt= buckets[bi];
                 int el1 = SearchInBucket(currentBskt, key);
                if(el1!=-1){  //key exists
                        Node currNode = currentBskt.get(el1);                        
                        return currNode.value;
                      }
                   else{   //key doesn't exists
                        return null;
                      }
                  }

                  //Remove function 
                  public V remove(K key){     // removes an elntry key from hashMap and returns value or null accordinglly 

                    int bi= HashFunc(key);
              //creating a new node to store the value if it doesn't exists
              //the current node will have the nodes

              LinkedList<Node> currentBucket= buckets[bi];

          //to check whether the element already exists or not-- we use the function SearchInBucket

              int el= SearchInBucket(currentBucket, key);

               if(el!=-1){   //key exists

                  Node currNode= currentBucket.get(el);
                  //puts the current value in V value
                    V val= currNode.value;
                    //use remove function to remove the element
                    currentBucket.remove(el);
                    //decrementing the number of entries
                    n--;
                    return val;

               }
               return null;

                  }



          }

    public static void main(String[] args) {
        
        MyHashMap<String, Integer> mp =new MyHashMap<>();
        System.out.println("Testing Put");
        mp.put("a",1);
         mp.put("b",2);
          mp.put("c",3);
          mp.put("x",12);
          mp.put("Y", 15);

          System.out.println("Testing size"+mp.size());

          System.out.println("Testing get()");
          System.out.println(mp.get("a"));
          System.out.println(mp.get("b"));
          System.out.println(mp.get("c"));

          System.out.println("testing Remove");
         System.out.println("The Value removed is:"+mp.remove("c"));
          System.out.println(mp.get("a"));
          System.out.println(mp.get("b"));
          System.out.println(mp.get("x"));   
          System.out.println(mp.get("Y"));


    }
    
}
