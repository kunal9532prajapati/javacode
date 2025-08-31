public class ArrayLists{
  public static viod main (String[] args){
    ArrayList <Integer> arr = new ArrayList<>();
    arr.add(10);
    arr.add(16);
    arr.add(18);
    arr.add(145);
    arr.add(155);
    arr.add(103);
    System.out.println(arr); // [10,16,18,145,155,103]
    System.out.println(arr.get(2)); // 18
    arr.set(2,50);//(index, value) replace element
    int n = arr.size(); // arr.length

    // three way to print all length of array
    System.out.println(arr);

    for(int i=0; i<n; i++){
       System.out.println(arr.get(i));
    }

    for(int print: arr){
       System.out.println(print);
    }

    arr.add(999); // append at the end of array

    arr.add(2,999); // insert at index 2

    arr.remove(arr.size() - 1);
    System.out.println(arr);  // [ 10,16,999,145155,103,999]

    Collections.reverse(arr);
    System.out.println(arr);


    
  }
}
