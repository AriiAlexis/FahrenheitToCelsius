import java.util.Scanner;
public class FahrenheitToCelsius{ 
public static void main(String[] args){ 
//define variables 
int intFar, number1; 
double number2, answer; 
number1 = 32;
number2 = .5556;    
Scanner S1 = new Scanner(System.in); 
//Prompt a auder to enter an temperature 
System.out.print("Enter the temperauture in Fahrenheit: ");
intFar = S1.nextInt(); 
System.out.println("The temperature in Fahrenheit is: " + intFar + "  degrees Fahrenheit."); 
answer = (intFar - number1) * number2;
System.out.println("The temperature in Celsius is: " + answer + "  degrees Celsius."); 
answer = S1.nextDouble();  
System.out.println(intFar + "-" + number1 + "*" + number2 + " = " + answer); 
}
}