package JPMorgan;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SortArray {

    static long buyMaximumProducts(int n, long amount, int[] a) {
       Map<Integer, Integer> treeMap = new TreeMap<Integer, Integer>(); 
       for(int arr_i = 0; arr_i < a.length; arr_i++){
            treeMap.put(a[arr_i], (arr_i+1));
       } 
       Iterator<Integer> itr = treeMap.keySet().iterator();
       long counter=0, temp;
       while(itr.hasNext()){
          
           temp  = 0;
           Integer key = itr.next();
           Integer value = treeMap.get(key);
           //System.out.println("Key -> "+key + " Value ->"+value+"  "+amount);
           if(amount > key ){
               
              while(temp < value && amount > key){
                  counter++;
                  temp++;
                  amount -= key;
              }
              treeMap.put(key, (int) ((int)value - temp));
           }else{
               //System.out.println("get out");
               break;
           }    
       } 
       System.out.println(treeMap);
        System.out.println(amount);
       return counter; 
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        long k = in.nextLong();
        long result = buyMaximumProducts(n, k, arr);
        System.out.println(result);
        in.close();
    }
}
