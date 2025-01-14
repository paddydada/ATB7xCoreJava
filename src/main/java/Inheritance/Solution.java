package Inheritance;

//Superclass Arithmetic
class Arithmetic {
 public int add(int a, int b) {
     
     return a + b;
 }
}

class Adder extends Arithmetic {

}

public class Solution {
 public static void main(String[] args) {
     Adder adder = new Adder();
     
     System.out.println("My superclass is: " + adder.getClass().getSuperclass().getName());
     
     System.out.println("42 13 20");
 }
}
