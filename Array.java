// Example-->1

// public class Array {
// public static void main(String args[]) {
// int[] marks = new int[5];
// marks[0] = 80; // phy
// marks[1] = 89; // chem
// marks[2] = 90; // math
// marks[3] = 95; // bio
// marks[4] = 93; // eng
// // System.out.println(marks[0]);
// // System.out.println(marks[1]);
// // System.out.println(marks[2]);

// for (int i = 0; i < 5; i++) {
// System.out.println(marks[i]);
// }
// }
// }

// 2.Taking array input.
// import java.util.*;

// public class Array {
// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// int size = sc.nextInt();
// int numbers[] = new int[size];

// for (int i = 0; i < size; i++) {
// numbers[i] = sc.nextInt();
// }
// for (int i = 0; i < size; i++) {
// System.out.println(numbers[i]);
// }
// }
// }

// 3.Take an array as input from the user. Search for a given
// number x and print the index at which it occurs.

// import java.util.*;

// public class Array {
// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// int size = sc.nextInt();
// int arr[] = new int[size];

// for (int i = 0; i < size; i++) {
// arr[i] = sc.nextInt();
// }
// int x = sc.nextInt();
// for (int i = 0; i < arr.length; i++) {
// if (arr[i] == x) {
// System.out.println("x found at index: " + i);
// }
// }

// }
// }

// Homework Problems.
// Q.1. Take an array of names as input from the user and print them on the
// screen.

// import java.util.*;

// public class Array {
// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// int size = sc.nextInt();
// String name[] = new String[size];

// // input
// for (int i = 0; i < size; i++) {
// name[i] = sc.next();
// }

// // output
// for (int i = 0; i < name.length; i++) {
// System.out.println("Name " + (i + 1) + " is: " + name[i]);
// }

// }
// }

// Q.2. Find the maximum & minimum number in an array of integers.
// import java.util.*;

// public class Array {
// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// int size = sc.nextInt();
// int arr[] = new int[size];
// for (int i = 0; i < size; i++) {
// arr[i] = sc.nextInt();
// }
// int max = Integer.MIN_VALUE;
// int min = Integer.MAX_VALUE;

// for (int i = 0; i < arr.length; i++) {
// if (arr[i] < min) {
// min = arr[i];
// }
// if (arr[i] > max) {
// max = arr[i];
// }
// }
// System.out.println("Maximum value is: " + max);
// System.out.println("Minimum value is: " + min);
// }
// }

// 3. Take an array of numbers as input and check if it is an array sorted in
// ascending order.
// import java.util.*;

// public class Array {
// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// int size = sc.nextInt();
// int num[] = new int[size];
// for (int i = 0; i < size; i++) {
// num[i] = sc.nextInt();
// }
// boolean isAscending = true;

// for (int i = 0; i < num.length - 1; i++) {
// if (num[i] > num[i + 1]) {
// isAscending = false;
// }
// }
// if (isAscending) {
// System.out.println("The array is sorted in Ascending order");
// } else {
// System.out.println("The array is not sorted in Ascending order");
// }
// }
// }