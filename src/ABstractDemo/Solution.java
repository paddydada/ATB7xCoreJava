package ABstractDemo;

import java.util.Scanner;

abstract class Book {
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}

class MyBook extends Book {
    @Override
    void setTitle(String s) {
        title = s;
    }
}

public class Solution {
    public static void main(String[] args) {
        // Initialize Scanner to read input
//        Scanner sc = new Scanner(System.in);
//        
//        // Read the book title from the input
    	String title = "A tale of two cities";
        
        // Create MyBook object and set title
        MyBook newBook = new MyBook();
        newBook.setTitle(title);
        
        // Output the title in the required format
        System.out.println("The title is: " + newBook.getTitle());
        
        // Close the scanner
      
    }
}
