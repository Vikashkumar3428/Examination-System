import java.io.FileNotFoundException; 
import java.io.FileReader; 
import java.io.IOException;
import java.util.*;

import java.util.Date;
import java.io.File;

   class Question 
   {
      private String question;
      private ArrayList<String> choices;
      private String answer;
      public Question(String question,String[] choices, String answer)
      {
         this.question =question;
         this.choices = new ArrayList<String>();
         for(int i =-0; i<choices.length;i++)
         {
            this.choices.add(choices[i]);
         }
         Collections.shuffle(this.choices);
         this.answer =answer;
      }
      public String getQuestion()
      {
         return question;
      }
       public ArrayList<String> getChoices()
       {
         return choices;
       }
       public String getAnswer()
      {
         return answer;
      }

   }
   class Game
   {
      private ArrayList<Question> questionSet;
      public Game()
      {
         questionSet = new ArrayList<Question>();
         String q ="Which of the following is a valid long literal?                                                                               2 Marks";
         String []  a = {"0xnf029L","904423","L990023","ABH8097"};
         questionSet.add(new Question(q,a,"0xnf029L"));
         q = " What does the expression float a = 35 / 0 return?                                                                            2 Marks";
         a = new String [] {"0","Not a Number","Infinity","Run time Exception"};
         questionSet.add(new Question(q,a,"Infinity"));
         q = "Which of the following option leads to the portability and security of Java?                                                  2 Marks";
         a = new String [] {"Use of exception handling","Dynamic binding between objects","The applet makes the Java code secure and portable","Bytecode is executed by JVM"};
         questionSet.add(new Question(q,a,"Bytecode is executed by JVM"));
         q = "Which of the following is not a Java features?                                                                                2 Marks";
         a = new String [] {"Architecture Neutral","Dynamic","Object-oriented","Use of pointers"};
         questionSet.add(new Question(q,a,"Use of pointers"));
         q = "What is the return type of the hashCode() method in the Object class?                                                         2 Marks";
         a = new String [] {"Object","void","long","int"};
         questionSet.add(new Question(q,a,"int"));
         q = "_____ is used to find and fix bugs in the Java programs.                                                                      2 Marks";
         a = new String [] {"JVM","JDK","JRE","JDB"};
         questionSet.add(new Question(q,a,"JDB"));
         q = "Which of the following tool is used to generate API documentation in HTML format from doc comments in source code?            2 Marks";
         a = new String [] {"javah command","javadoc tool","javaw command","javap tool"};
         questionSet.add(new Question(q,a,"javadoc tool"));
         q = "Which of the following creates a List of 3 visible items and multiple selections abled?                                       2 Marks";
         a = new String [] {"new List(3, false)","new List(true, 3)","new List(3, true)","new List(false, 3)"};
         questionSet.add(new Question(q,a,"new List(3, true)"));
         q = "Which method of the Class.class is used to determine the name of a class represented by the class object as a String?         2 Marks";
         a = new String [] {"getClass()","getName()","intern()","toString()"};
         questionSet.add(new Question(q,a,"getName()"));
         q = "In which process, a local variable has the same name as one of the instance variables?                                        2 Marks";
         a = new String [] {"Serialization","Variable Shadowing","Abstraction","Multi-threading"};
         questionSet.add(new Question(q,a,"Variable Shadowing"));
         q = "Which of the following is true about the anonymous inner class?                                                               2 Marks";
         a = new String [] {"It has only methods","Objects can't be created","It has a fixed class name","It has no class name"};
         questionSet.add(new Question(q,a,"It has no class name"));

         Collections.shuffle(questionSet,new Random());
         
      }
      class Delay
      {  

         public void timeDelay10_sec(int numCorrect)
         {
            try
            {
               JavaProject j = new JavaProject();
               Thread.sleep(1000);
               System.out.println("\n\n                                                     ******************************************");
               System.out.println("                                                     *                                        *");
               System.out.println("                                                     * You got : "+numCorrect+"  correct answers           *");
               System.out.println("                                                     *                                        *");
               System.out.println("                                                     * Total Marks Acquired :"+ numCorrect*2+"               *");
               System.out.println("                                                     *                                        *");
               System.out.println("                                                     ******************************************");
            }
            catch(InterruptedException e)
            {
               System.err.println(e.getMessage());
            }
      }
      public void timeDelay5_sec()
         {
            try
            {
               Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
               System.err.println(e.getMessage());
            }
      }
      }
      public void start()
      {
         
         Date date = new Date();

      
         System.out.println("                                                                  LOVELY PROFESSIONAL UNIVERSITY                             "+date.toString()+"\n");
         System.out.println("**************************************************************************************************************************************************************");
         System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");
         System.out.println("                                                                        ******************    ");
         System.out.println("                                                                        || Best Of Luck ||       ");
         System.out.println("                                                                        ******************");
         System.out.print("Keep Patience.");
         
         for(int i =0; i<20;i++)
                     {
                        System.out.print(".");
                        try
                        {
                           Thread.sleep(500);
                        }
                        catch(InterruptedException e)
                        {
                           System.err.println(e.getMessage());
                        }

                     }
                     System.out.println("                                                                                                      Max. Marks : 22");
                     System.out.println("\n--------------------------------------------------------------------------------------------------------------------------------------------------------------");
                     System.out.print("\n\n");
         Scanner scan = new Scanner (System.in);
         int numCorrect =0;
         for (int i  = 0; i< questionSet.size();i++)
         {
            System.out.println(questionSet.get(i).getQuestion());
            int numChoices =questionSet.get(i).getChoices().size();
            for(int j =0 ;j<numChoices;j++)
            {
               System.out.println((j+1)+ ": "+ questionSet.get(i).getChoices().get(j));
            }
            int ans =scan .nextInt();
            ArrayList<String> choiceSet =questionSet.get(i).getChoices();
            String correctAnswer =questionSet.get(i).getAnswer();
            int correctAnswerIndex = choiceSet.indexOf(correctAnswer);
            if(ans == correctAnswerIndex +1)
            {
               numCorrect++;
            }
         }
         scan.close();
         Delay d =new Delay();
         System.out.print("\n"+"Wait");
         for(int i =0; i<20;i++)
         {
            System.out.print(".");
            try
            {
               Thread.sleep(250);
            }
            catch(InterruptedException e)
            {
               System.err.println(e.getMessage());
            }
         }
         d.timeDelay5_sec();
         System.out.print("\n\n"+"Checking");
         for(int i =0; i<16;i++)
         {
            System.out.print(".");
            try
            {
               Thread.sleep(250);
            }
            catch(InterruptedException e)
            {
               System.err.println(e.getMessage());
            }
         }
         d.timeDelay10_sec(numCorrect);
      }

} 
   

  
class JavaProject 
{    
   static boolean login ()
   {
      

      Scanner sc = new Scanner(System.in);
      long reg_n;
      
      System.out.print("\nEnter Your Registeration Number :");
      reg_n =sc.nextLong();
      System.out.println("\n\n");

      try {
         Scanner scanner = new Scanner(new File("reg_no.txt"));
      
      while (scanner.hasNextLine()) 
         {

            if(reg_n == scanner.nextLong()) 
               {
                  char cha ;
                  Scanner sca = new Scanner(System.in);
                  System.out.println("                                                            **********************************************");
                  System.out.print("                                                           ||Note : Each and every Question is Mandatory.||\n                                                           ||       Do not skip any question.            ||");
                  System.out.println("\n                                                            **********************************************\n\n");
                  System.out.print("Are you ready ? (Y or N)\n");

                  cha = sca.next().charAt(0);
                  if((cha == 'Y'))
                     {
                        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("**************************************************************************************************************************************************************");
                        return true;
                     }
                  else
                  {
                  if (cha == 'y')
                      {
                        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("**************************************************************************************************************************************************************");
                        return true;
                      }
                  else
                  {
                     System.out.println(" Try Again ");
                     for(int i =0; i<20;i++)
                     {
                        System.out.print(".");
                        try
                        {
                           Thread.sleep(1000);
                        }
                        catch(InterruptedException e)
                        {
                           System.err.println(e.getMessage());
                        }
                     }
                     return false;

                  }
               }
               }           
            else 
               {
                  System.out.println("Sorry: ! Invalid Credentials :");
                  
                  return false;
               }
               
         }
       
         scanner.close();
         } 
         catch (FileNotFoundException e) 
         {         
         e.printStackTrace();
         }
         return false ;
   }
     
   public static void main(String [] ar)
   {
      Game g= new Game();
      System.out.println("\n\n                                                                 WelCome to Examination System                              ");
      System.out.println("                                                                 ^*^*^*^*^*^*^*^*^*^*^*^*^*^*^                              ");
      if(login()==true)
         g.start();
      else 
      
      {
         System.out.println("\n\n                         Try Again. \n");
         if(login()==true)
           g.start();
         else 
            System.out.println("\n\n                         Try After Some Time..........");   
      }

   }
}