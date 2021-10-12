/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator_riley;

import static javafx.application.Platform.exit;
import javax.swing.JOptionPane;

/**
 *
 * @author HOME
 */
public class Calculator_Riley {

    public static int numberOne = 0 ; 
    public static int numberTwo = 0 ; 
    public static int numberThree = 0 ; 
    public static int numberFour = 0 ; 
    public static int numberFive = 0 ; 
    public static int numberSix = 0 ; 
    public static int numberSeven = 0 ; 
    public static int numberEight = 0 ; 
    public static int numberNine = 0 ; 
    public static int numberTen = 0 ; 
    public static int numberEleven= 0 ; 
    public static int numberTwelve = 0 ; 
    public static int numberThriteen = 0 ; 
    public static int numberFourteen = 0 ; 
    public static int numberFifteen = 0 ; 
    public static int numberSixteen = 0 ; 
    public static int numberSeventeen = 0 ; 
    public static int numberEighteen = 0 ; 
    public static int numberNineteen = 0 ; 
    public static int numberTwenty = 0 ; 
    
    public static void main(String[] args) {
        //CTS 285
        //M1HW1
        //Derek Riley
        // 08/20/21
        
        // Calling Method
        calculatorProgram();
    }
    public static void calculatorProgram()
    {
     // variables
     String calculatorQuestion;
     String Number1;
     int menuChoice;
     
     // Main Menu 
     calculatorQuestion = JOptionPane.showInputDialog("Welcome to the calculator program." + "\n"
             + "1.Add" + "\n" + "2.Subtract" + "\n" + "3.Multiply" + "\n" + "4.Divide" + "\n" + "5. Exit" );
     
     // Parsing interger to string
     menuChoice = Integer.parseInt(calculatorQuestion);
     
     // Switch statements to go through all steps depending on the user 
     switch (menuChoice)
     {
       case 1:
       addingProgram(); 
       break;
       case 2:
       subtractingProgram();
       break;
       case 3:     
       multiplyProgram();
       break;
       case 4:
       divideProgram();
       break;
       case 5:
       JOptionPane.showMessageDialog(null, "Goodbye.");
       exit();
       break;
       default:
       JOptionPane.showMessageDialog(null, "Please choose numbers 1 - 5");  
       calculatorProgram();  
       break;
     }
     
           
     
    }
    public static void addingProgram()
     {
      // Variables
      String numberOne;
      String numberTwo;
      String endQuestion;
      String yourAnswer;
      int numberOneInt;
      int numberTwoInt;
      int oneOrTwo;
      int addTotal;
      int yourAnswerInt;
      
      
      //Asking user for the first number
      numberOne = JOptionPane.showInputDialog("Enter the First Number:");
      
      //Parsing number to be used in addition
      numberOneInt = Integer.parseInt(numberOne);
      
      //Asking user for the second number
      numberTwo = JOptionPane.showInputDialog("Enter the Second Number:");
      
      //Parsing second number to be used in addition
      numberTwoInt = Integer.parseInt(numberTwo);
      
      // Formula to get answer
      addTotal = numberOneInt + numberTwoInt;
      
      yourAnswer = JOptionPane.showInputDialog("Enter Your Answer: ");
      
      yourAnswerInt = Integer.parseInt(yourAnswer);
      
      if (yourAnswerInt == addTotal)
      {
         JOptionPane.showMessageDialog(null, "Your Answer is Correct " + 
                 numberOneInt + " + " + numberTwoInt + " = " + addTotal);
      }
      else 
      {
       JOptionPane.showMessageDialog(null, "Your Answer is Incorrect " + 
                 numberOneInt + " + "+ numberTwoInt + " = " + addTotal);
      }
//      // Diplaying math done 
//      JOptionPane.showMessageDialog(null, numberOneInt + " + " + numberTwoInt + " = " + addTotal);
      
      // Asking user what they want to do next
      endQuestion = JOptionPane.showInputDialog(null, "1. Repeat" + "\n" + "2.Main Menu");
      
      // parsing oneOrTwo to string
      oneOrTwo = Integer.parseInt(endQuestion);
      
      // switch statement to determine where the user will go
      switch (oneOrTwo)
      {
          case 1:
              addingProgram();
              break;
          case 2:
           calculatorProgram();
           break;
          default:
          JOptionPane.showMessageDialog(null, "This is not a choice and you will return to the "
                  + "main menu");
          calculatorProgram();
           
      }
      
      
      
     }
    public static void subtractingProgram()
     {
      // Variables
      String numberOne;
      String numberTwo;
      String endQuestion;
      String yourAnswer;
      int numberOneInt;
      int numberTwoInt;
      int subtractTotal;
      int oneOrTwo;
      int yourAnswerInt;
      
      //Asking user for the first number
      numberOne = JOptionPane.showInputDialog("Enter the First Number:");
      
      //Parsing number to be used in addition
      numberOneInt = Integer.parseInt(numberOne);
      
      //Asking user for the second number
      numberTwo = JOptionPane.showInputDialog("Enter the Second Number:");
      
      //Parsing second number to be used in addition
      numberTwoInt = Integer.parseInt(numberTwo);
      
      // Formula to get answer
      subtractTotal = numberOneInt - numberTwoInt;
      
      yourAnswer = JOptionPane.showInputDialog("Enter Your Answer:");
      
      yourAnswerInt = Integer.parseInt(yourAnswer);
      
       if (yourAnswerInt == subtractTotal)
      {
         JOptionPane.showMessageDialog(null, "Your Answer is Correct " + 
                 numberOneInt + " - " + numberTwoInt + " = " + subtractTotal);
      }
      else 
      {
       JOptionPane.showMessageDialog(null, "Your Answer is Incorrect " + 
                 numberOneInt + " - "+ numberTwoInt + " = " + subtractTotal);
      }
      
       // Diplaying math done 
//      JOptionPane.showMessageDialog(null, "The total is: " + subtractTotal);
      
      // Asking user what they want to do next
      endQuestion = JOptionPane.showInputDialog(null, "1. Repeat" + "\n" + "2.Main Menu");
      
      // parsing oneOrTwo to string
      oneOrTwo = Integer.parseInt(endQuestion);
      
      // switch statement to determine where the user will go
      switch (oneOrTwo)
      {
          case 1:
              subtractingProgram();
              break;
          case 2:
           calculatorProgram();
           break;
          default:
          JOptionPane.showMessageDialog(null, "This is not a choice and you will return to the "
                  + "main menu");
          calculatorProgram();
           
      }
      
     }
    public static void multiplyProgram()
     {
      // Variables
      String numberOne;
      String numberTwo;
      String endQuestion;
      String yourAnswer;
      int numberOneInt;
      int numberTwoInt;
      int multiplyTotal;
      int oneOrTwo;
      int yourAnswerInt;
      
      //Asking user for the first number
      numberOne = JOptionPane.showInputDialog("Enter the First Number:");
      
      //Parsing number to be used in addition
      numberOneInt = Integer.parseInt(numberOne);
      
      //Asking user for the second number
      numberTwo = JOptionPane.showInputDialog("Enter the Second Number:");
      
      //Parsing second number to be used in addition
      numberTwoInt = Integer.parseInt(numberTwo);
      
      yourAnswer = JOptionPane.showInputDialog("Enter Your Answer: ");
      
      yourAnswerInt = Integer.parseInt(yourAnswer);
      
       // Diplaying math done 
      multiplyTotal = numberOneInt * numberTwoInt;
      
       if (yourAnswerInt == multiplyTotal)
      {
         JOptionPane.showMessageDialog(null, "Your Answer is Correct " + 
                 numberOneInt + " * " + numberTwoInt + " = " + multiplyTotal);
      }
      else 
      {
       JOptionPane.showMessageDialog(null, "Your Answer is Incorrect " + 
                 numberOneInt + " * "+ numberTwoInt + " = " + multiplyTotal);
      }
      
//      // Formula to get answer
//      JOptionPane.showMessageDialog(null, "The total is: " + multiplyTotal);
      
      // Asking user what they want to do next
      endQuestion = JOptionPane.showInputDialog(null, "1. Repeat" + "\n" + "2.Main Menu");
      
      // parsing oneOrTwo to string
      oneOrTwo = Integer.parseInt(endQuestion);
      
      // switch statement to determine where the user will go
      switch (oneOrTwo)
      {
          case 1:
              multiplyProgram();
              break;
          case 2:
           calculatorProgram();
           break;
          default:
          JOptionPane.showMessageDialog(null, "This is not a choice and you will return to the "
                  + "main menu");
          calculatorProgram();
           
      }
      
     }
    public static void divideProgram()
     {
      // Variables
      String numberOne;
      String numberTwo;
      String endQuestion;
      String yourAnswer;
      int numberOneInt;
      int numberTwoInt;
      int divideTotal;
      int oneOrTwo;
      int yourAnswerInt;
      
      //Asking user for the first number
      numberOne = JOptionPane.showInputDialog("Enter the First Number:");
      
      //Parsing number to be used in addition
      numberOneInt = Integer.parseInt(numberOne);
      
      //Asking user for the second number
      numberTwo = JOptionPane.showInputDialog("Enter the Second Number:");
      
      //Parsing second number to be used in addition
      numberTwoInt = Integer.parseInt(numberTwo);
      
      // Formula to get answer
      divideTotal = numberOneInt / numberTwoInt;
      
      yourAnswer = JOptionPane.showInputDialog("Enter Your Answer: ");
      
      yourAnswerInt = Integer.parseInt(yourAnswer);
      
       if (yourAnswerInt == divideTotal)
      {
         JOptionPane.showMessageDialog(null, "Your Answer is Correct " + 
                 numberOneInt + " \\ " + numberTwoInt + " = " + divideTotal);
      }
      else 
      {
       JOptionPane.showMessageDialog(null, "Your Answer is Incorrect " + 
                 numberOneInt + " \\ "+ numberTwoInt + " = " + divideTotal);
      }
      
       // Diplaying math done 
      JOptionPane.showMessageDialog(null, "The total is: " + divideTotal);
      
      // Asking user what they want to do next
      endQuestion = JOptionPane.showInputDialog(null, "1. Repeat" + "\n" + "2.Main Menu");
      
      // parsing oneOrTwo to string
      oneOrTwo = Integer.parseInt(endQuestion);
      
      // switch statement to determine where the user will go
      switch (oneOrTwo)
      {
          case 1:
              divideProgram();
              break;
          case 2:
           calculatorProgram();
           break;
          default:
          JOptionPane.showMessageDialog(null, "This is not a choice and you will return to the "
                  + "main menu");
          calculatorProgram();
           
      }
      
     }
    public static void testingknowledgeaddition()
    {
     String introMessage;
     String questionOne;
     String questionTwo;
     String questionThree;
     String questionFour;
     String questionFive;
     String questionSix;
     String questionSeven;
     String questionEight;
     String questionNine;
     String questionTen;
     int questionOneAnswer;
     int questionTwoAnswer;
     int questionThreeAnswer;
     int questionFourAnswer;
     int questionFiveAnswer;
     int questionSixAnswer;
     int questionSevenAnswer;
     int questionEightAnswer;
     int questionNineAnswer;
     int questionTenAnswer;
     
     questionOne = JOptionPane.showInputDialog("Enter the first number");
     
     questionTwo = JOptionPane.showInputDialog("Enter the second number");
     
     numberOne = Integer.parseInt(questionOne);
     numberTwo = Integer.parseInt(questionTwo);
     
     questionOneAnswer = numberOne + numberTwo; 
    }
    public static void testingknowledgesubtraction()
    {
          String introMessage;
     String questionOne;
     String questionTwo;
     String questionThree;
     String questionFour;
     String questionFive;
     String questionSix;
     String questionSeven;
     String questionEight;
     String questionNine;
     String questionTen;
     int questionOneAnswer;
     int questionTwoAnswer;
     int questionThreeAnswer;
     int questionFourAnswer;
     int questionFiveAnswer;
     int questionSixAnswer;
     int questionSevenAnswer;
     int questionEightAnswer;
     int questionNineAnswer;
     int questionTenAnswer;
     
     questionOne = JOptionPane.showInputDialog("Enter the first number");
     
     questionTwo = JOptionPane.showInputDialog("Enter the second number");
     
     numberOne = Integer.parseInt(questionOne);
     numberTwo = Integer.parseInt(questionTwo);
     
     questionOneAnswer = numberOne - numberTwo; 
    }
    public static void testingknowledgemultiplcation()
    {
          String introMessage;
     String questionOne;
     String questionTwo;
     String questionThree;
     String questionFour;
     String questionFive;
     String questionSix;
     String questionSeven;
     String questionEight;
     String questionNine;
     String questionTen;
     int questionOneAnswer;
     int questionTwoAnswer;
     int questionThreeAnswer;
     int questionFourAnswer;
     int questionFiveAnswer;
     int questionSixAnswer;
     int questionSevenAnswer;
     int questionEightAnswer;
     int questionNineAnswer;
     int questionTenAnswer;
     
     questionOne = JOptionPane.showInputDialog("Enter the first number");
     
     questionTwo = JOptionPane.showInputDialog("Enter the second number");
     
     numberOne = Integer.parseInt(questionOne);
     numberTwo = Integer.parseInt(questionTwo);
     
     questionOneAnswer = numberOne * numberTwo; 
    }
    public static void testingknowledgedivision()
    {
          String introMessage;
     String questionOne;
     String questionTwo;
     String questionThree;
     String questionFour;
     String questionFive;
     String questionSix;
     String questionSeven;
     String questionEight;
     String questionNine;
     String questionTen;
     int questionOneAnswer;
     int questionTwoAnswer;
     int questionThreeAnswer;
     int questionFourAnswer;
     int questionFiveAnswer;
     int questionSixAnswer;
     int questionSevenAnswer;
     int questionEightAnswer;
     int questionNineAnswer;
     int questionTenAnswer;
     
     questionOne = JOptionPane.showInputDialog("Enter the first number");
     
     questionTwo = JOptionPane.showInputDialog("Enter the second number");
     
     numberOne = Integer.parseInt(questionOne);
     numberTwo = Integer.parseInt(questionTwo);
     
     questionOneAnswer = numberOne / numberTwo; 
    }
       
    }
    

