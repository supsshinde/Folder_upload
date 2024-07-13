//
public class VarargsExample
{ public static void displayNames(String... names)
 { for (String mynames:names)
 { 
 System.out.print(mynames + “ “);
 }
}
public static void main(String args[])
 { 
 displayNames("Alex","Richard","John");
 }
}

Question4: Which of the following statements are true based on the use of modifiers?
A. Local variables can be declared either static or transient.
B. The visibility of the local variables cannot be specified.
C. By default the variable is accessible within the same class and subclass of the super class.
D. The visibility of the local variables is default.

Question5. Which of the following are valid declarations of the main () method?
A. static main(String args[]){ } B. public static String main(String args[]) {… }
C. public static void main(String args[]) {….} D. final static void main(String args[]) {….}

Question6. Which of the following is the correct higher to lower order of restrictiveness for access 
specifies?
A. public> default(within the package)> protected> private
B. private> default(within the package)> protected> public
C. private> protected> default(within the package)> public
D. protected> default(within the package)> private> public

