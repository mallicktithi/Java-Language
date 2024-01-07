
// <----------Basics of String------------------->
// import java.util.*;

// public class Strings {
// public static void main(String args[]) {

// // <---------
// // String name = "Tony";
// // String fullName = "Tony Stark";
// // String sentence = "My name is Tony Stark.";
// // System.out.println(sentence);------>

// // Scanner sc = new Scanner(System.in);
// // // String name = sc.next(); //To print a single word
// // String name = sc.nextLine(); //To print the fullname
// // System.out.println("Your name is: " + name);

// // Concatenation of a String

// // String firstName = "Tithi";
// // String lastName = "Mallick";
// // String fullName = firstName + " " + lastName;
// // System.out.println(fullName);

// // Length of a String
// // System.out.println(fullName.length());

// // To print letter by letter(charAt)

// // for (int i = 0; i < fullName.length(); i++) {
// // System.out.println(fullName.charAt(i));
// // }

// // Compare two String
// // String name1 = "Tithi";
// // String name2 = "Mithi";
// // if (name1.compareTo(name2) == 0) {
// // System.out.println("Equal");
// // } else {
// // System.out.println("Not Equal");
// // }

// // Substring

// // String sentence = "My name is Tithi";
// // String name = sentence.substring(11, sentence.length());
// // System.out.println(name);

// }
// }

// Q.1.Compare 2 string.
// import java.util.*;

// public class Strings {
// public static void main(String args[]) {
// String name1 = "Tithi";
// String name2 = "Tithi";
// if (name1.compareTo(name2) == 0) {
// System.out.println("Equal");
// } else {
// System.out.println("Different");
// }

// // Do not use = = to check for string equality

// //Gives correct ans here
// if (name1 == name2) {
// System.out.println("Equal");
// } else {
// System.out.println("Different");
// }

// // Gives incorrect ans here
// if (new String("Tithi") == new String("Tithi")) {
// System.out.println("Equal");
// } else {
// System.out.println("Different");
// }
// }
// }

// Example. Basics of String Builder.
// import java.util.*;

// public class Strings {
// public static void main(String args[]) {
// StringBuilder sb = new StringBuilder("Tony");
// System.out.println(sb);
// // Char at index
// System.out.println(sb.charAt(0));
// // Set any char at index
// sb.setCharAt(0, 'S');
// System.out.println(sb);
// // Insert a new index
// sb.insert(0, 'P');
// System.out.println(sb);
// // Delete any char
// sb.delete(1, 2);
// System.out.println(sb);
// // Append anything
// sb.append("tail");
// System.out.println(sb);
// // Length of String
// System.out.println(sb.length());
// }
// }

// Q.Reverse of a string.

// import java.util.*;

// public class Strings {

// public static void main(String args[]) {
// StringBuilder sb = new StringBuilder("hello");

// for (int i = 0; i < sb.length() / 2; i++) {
// int front = i;
// int back = sb.length() - 1 - i; // 5-1-0

// char frontChar = sb.charAt(front);
// char backChar = sb.charAt(back);

// sb.setCharAt(front, backChar);
// sb.setCharAt(back, frontChar);

// }
// System.out.println(sb);
// }
// }
