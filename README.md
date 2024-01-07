# Java-Functions
import java.util.*;

//Q.1. Print a given name in a function.
public class Main {
public static void PrintMyName(String name) {
System.out.println(name);
return;
}

public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
String name = sc.next();

PrintMyName(name); // function call
}
}


//Q.2.Make a function to add 2 numbers and return the sum
public class Main {
public static int Add(int a, int b) {
int sum = a + b;
return sum;
}

public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();

int sum = Add(a, b);
System.out.println("Sum = " + sum);
}
}

//Q.3.Make a function to multiply 2 numbers and return the product.

public class Main {
public static int Mul(int a, int b) {
int mul = a * b;
return mul;
}

public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
int mul = Mul(a, b);
System.out.println("Multiplication is:" + mul);

}

}

//Q.4.Factorial of number.

public class Main {
public static void Factorial(int num) {
if (num < 0) {
System.out.println("Invalid number");
return;
}
int factorial = 1;
for (int i = num; i >= 1; i--) {
factorial = factorial * i;
}
System.out.println(factorial);
return;
}

public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
Factorial(num);

}
}
