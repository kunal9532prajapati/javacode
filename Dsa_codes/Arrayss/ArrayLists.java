package Arrayss;

import java.util.ArrayList;
import java.util.Collections;


public class ArrayLists{

  public static void main (String[] args){
    ArrayList <Integer> arr = new ArrayList<>();
    arr.add(10);
    arr.add(16);
    arr.add(18);
    arr.add(145);
    arr.add(155);
    arr.add(103);
    System.out.print(arr); // [10,16,18,145,155,103]

    System.out.println();

    System.out.print(arr.get(2)); // 18
    arr.set(2,50);//(index, value) replace element
    int n = arr.size(); // arr.length

    System.out.println();

    // three way to print all length of array
    System.out.println(arr);

    System.out.println();

    for(int i=0; i<n; i++){
       System.out.print(" " + arr.get(i));
    }
    System.out.println();

    for(int print: arr){
       System.out.print(" " + print);
    }

    System.out.println();

    arr.add(999); // append at the end of array

    arr.add(2,999); // insert at index 2

    arr.remove(arr.size() - 1);// [ 10,16,999,145,155,103,999]
    System.out.println(arr);  // [ 10,16,999,145,155,103]

    Collections.reverse(arr); //[103, 155, 145, 50, 999, 16, 10]
    System.out.println(arr);


    
  }
}
