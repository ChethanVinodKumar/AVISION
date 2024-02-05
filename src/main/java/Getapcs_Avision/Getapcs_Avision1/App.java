package Getapcs_Avision.Getapcs_Avision1;

public class App 
{
public static void main(String[] args) {
	String s = "PP-133 - Test Description";

    // Find the index of the first occurrence of "-"
    String n= s.split(" -", 2)[0];

//    // Extract the substring from the start till that index (excluding)
//    String part1 = s.substring(0, index);
//
//    // Trim any extra spaces
//    part1 = part1.trim();
    
    

    System.out.println(n);
}
      
}
