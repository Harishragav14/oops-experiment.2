import java.util.*;
public class SumEvenOdd {
public static void main(String[] args) { Scanner sc = new Scanner(System.in); System.out.print("Enter the numbers: "); String input = sc.nextLine();
String[] parts = input.split(" ");
int[] numbers = new int[parts.length]; for (int i = 0; i < parts.length; i++) {
numbers[i] = Integer.parseInt(parts[i]);
}
int evenSum = 0, oddSum = 0; for (int num : numbers) {
if (num % 2 == 0) evenSum += num;
else
oddSum += num;
}
System.out.println("Even = " + evenSum); System.out.println("Odd = " + oddSum);
}
