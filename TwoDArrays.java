// Q.1.Make a 2D array.
// import java.util.Scanner;

// public class TwoDArrays {
// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// int rows = sc.nextInt();
// int cols = sc.nextInt();

// int nums[][] = new int[rows][cols];

// // Input
// // rows
// for (int i = 0; i < rows; i++) {
// // columns
// for (int j = 0; j < cols; j++) {
// nums[i][j] = sc.nextInt();
// }
// }

// // Output
// // rows
// for (int i = 0; i < rows; i++) {
// // columns
// for (int j = 0; j < cols; j++) {
// System.out.print(nums[i][j] + " ");
// }
// System.out.println();
// }
// }
// }

// Q.2.Take a matrix as input from the user.Search for a given number x
// and print the indices(i,j) at which it occurs.

// import java.util.Scanner;

// public class TwoDArrays {
// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// int rows = sc.nextInt();
// int cols = sc.nextInt();

// int nums[][] = new int[rows][cols];

// // Input
// // rows
// for (int i = 0; i < rows; i++) {
// // columns
// for (int j = 0; j < cols; j++) {
// nums[i][j] = sc.nextInt();
// }
// }

// int x = sc.nextInt();

// for (int i = 0; i < rows; i++) {
// for (int j = 0; j < cols; j++) {
// // compare with x
// if (nums[i][j] == x) {
// System.out.println("x found at loaction (" + i + "," + j + ")");
// }
// }
// }
// }
// }

// <-------------------Homework Problem-------------------------->

// Q.1. For a given matrix of N x M, print its transpose.
// import java.util.*;

// public class TwoDArrays {
// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int m = sc.nextInt();
// int matrix[][] = new int[n][m];
// // Input
// for (int i = 0; i < n; i++) {
// for (int j = 0; j < m; j++) {
// matrix[i][j] = sc.nextInt();
// }
// }
// // Output
// for (int i = 0; i < n; i++) {
// for (int j = 0; j < m; j++) {
// System.out.print(matrix[i][j] + " ");
// }
// System.out.println();
// }
// // Transpose
// for (int j = 0; j < m; j++) {
// for (int i = 0; i < n; i++) {
// System.out.print(matrix[i][j] + " ");
// }
// System.out.println();
// }
// }
// }

// Q.1. Print the spiral order matrix as output for a given matrix of numbers.

// import java.util.*;

// public class TwoDArrays {
// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int m = sc.nextInt();
// int matrix[][] = new int[n][m];
// for (int i = 0; i < n; i++) {
// for (int j = 0; j < m; j++) {
// matrix[i][j] = sc.nextInt();
// }
// }
// System.out.println("The Spiral Order Matrix is : ");
// int rowStart = 0;
// int rowEnd = n - 1;
// int colStart = 0;
// int colEnd = m - 1;
// // To print spiral order matrix
// while (rowStart <= rowEnd && colStart <= colEnd) {
// // 1
// for (int col = colStart; col <= colEnd; col++) {
// System.out.print(matrix[rowStart][col] + " ");
// }
// rowStart++;
// // 2
// for (int row = rowStart; row <= rowEnd; row++) {
// System.out.print(matrix[row][colEnd] + " ");
// }
// colEnd--;
// // 3
// for (int col = colEnd; col >= colStart; col--) {
// System.out.print(matrix[rowEnd][col] + " ");
// }
// rowEnd--;
// // 4
// for (int row = rowEnd; row >= rowStart; row--) {
// System.out.print(matrix[row][colStart] + " ");
// }
// colStart++;
// System.out.println();
// }
// }
// }