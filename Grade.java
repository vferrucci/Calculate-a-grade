/**
*@author: Veranika Tolkach
*Assignment 2
*Problem 4 page 181
* This program takes three test scores, and displays their average, 
and a grade. 
**/
import javax.swing.JOptionPane;
public class Grade //creates a grade class
{
   public static void main(String[] args)
   {
   double num1, num2, num3, avg;//variables to hold test scores and average
   String grade;//variable for a grade
   num1=Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the first score"));
   num2=Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the second score"));
   num3=Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the third score"));
   avg=(num1 + num2 + num3) / 3;
   if(avg<60)
   {
      JOptionPane.showMessageDialog(null, "Your average score is " + avg +"\n" +
      "Your grade is F");
   }
   else if(avg>=60 && avg<=69)
   {
      JOptionPane.showMessageDialog(null, "Your average score is " + avg +"\n" +
      "Your grade is D");
   }
   else if(avg>=70 && avg<=79)
   {
      JOptionPane.showMessageDialog(null, "Your average score is " + avg +"\n" +
      "Your grade is C");
   }
   else if(avg>=80 && avg<=89)
   {
      JOptionPane.showMessageDialog(null, "Your average score is " + avg +"\n" +
      "Your grade is B");
   }
   else
   {
      JOptionPane.showMessageDialog(null, "Your average score is " + avg +"\n" +
      "Your grade is A");
   }
   
   }//end main
}//end class Grade

