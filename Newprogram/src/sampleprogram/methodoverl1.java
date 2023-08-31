package sampleprogram;

 class methodoverl {
	 
		 public static int addition(int a, int b) {
		 return a + b;
		 }
		 public static float addition(float a, float b) {
		 return a + b;
		 }
		 public static float addition(int a, float b) {
		 return a + b;
		 }
		 public static float addition(float a, int b) {
		 return a + b;
		 }
		 public static String addition(String a, String b) {
		 return a + b;
		 }
		 
		 }
 		public class methodoverl1{
 		public static void main(String[]args)
 		 {
		 System.out.println(" Method Overloading ");
		 
		 System.out.println("Addition of two integers : " + 
		 methodoverl.addition(10, 2));
		 
		 System.out.println("Addition of two floating numbers :"); 
		 methodoverl.addition(20.0f, 2.3f);
		 
		 System.out.println("Addition of one integer and one float :" + 
	     methodoverl.addition(30, 32.2f));
		 
		 System.out.println("Addition of one float and one integer :"+ 
	     methodoverl.addition(50.0f, 50));
		 
		 System.out.println("Addition of two Strings : " + 
	     methodoverl.addition("Hello ", "Welcome"));
		 }

		

 		 }



