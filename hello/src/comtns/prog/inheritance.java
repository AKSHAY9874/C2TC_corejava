import java.util.Scanner; public class ScannerDemol

public static void main(String[] args)

{

// Declare the object and initialize with // predefined standard input object System.out.println("enter the character");

Scanner sc = new Scanner(System.in);
System.out.println("enter the character");


// Character input
char c = sc.next().charAt(0);

// Print the read value 
System.out.println("c = "+c);
