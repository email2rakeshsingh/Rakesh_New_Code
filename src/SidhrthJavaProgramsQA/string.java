package SidhrthJavaProgramsQA;

import java.util.Scanner;

class string{

public static void main(String[] args) {
System.out.println("Enter String ");
Scanner sc = new Scanner(System.in);
String input = sc.nextLine();
System.out.println("Original String- " + input);
input = input.replaceAll("\\s", "");
System.out.println("Final String- " + input);
}
}