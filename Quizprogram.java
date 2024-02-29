import java.util.Scanner; 
 
public class Quizprogram { 
  public static void main(String[] args) { 
    Scanner input = new Scanner(System.in); 
    int score = 0; 
     
    System.out.println("Welcome to the Quiz Program!"); 
     
    // Question 1 
    System.out.println("Question 1: What is the national flower of India?"); 
    System.out.println("a. Jasmine"); 
    System.out.println("b. Lotus"); 
    System.out.println("c. Rose"); 
    String answer1 = input.nextLine().toLowerCase(); 
    if (answer1.equals("b")) { 
      System.out.println("Correct!"); 
      score++; 
    } else { 
      System.out.println("Sorry, the correct answer is Lotus."); 
    } 
     
    // Question 2 
    System.out.println("Question 2: What is largest planet in solar system?"); 
    System.out.println("a. Jupiter"); 
    System.out.println("b. Earth"); 
    System.out.println("c. Mars"); 
    String answer2 = input.nextLine().toLowerCase(); 
    if (answer2.equals("a")) { 
      System.out.println("Correct!"); 
      score++; 
    } else { 
      System.out.println("Sorry, the correct answer is Jupiter."); 
    } 
     
    
  
   // Question 3 
    System.out.println("Question 3: Which country has highest population in the world"); 
    System.out.println("a. China"); 
    System.out.println("b. India"); 
    System.out.println("c. America"); 
    String answer3 = input.nextLine().toLowerCase(); 
    if (answer3.equals("b")) { 
      System.out.println("Correct!"); 
      score++; 
    } else { 
      System.out.println("Sorry, the correct answer is India."); 
    } 
     
    // Display final score 
    System.out.println("Your final score is: " + score); 
  } 
    














} 
