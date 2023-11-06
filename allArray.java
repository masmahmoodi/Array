
import java.util.Scanner;

public class Insertion {
    
    
     public static void main(String[] args) {


   Scanner sc = new Scanner(System.in);
   System.out.print("please enter the size of your array: ");
   int size = sc.nextInt();
   
   int firstArray [] = new int[size];
   
   System.out.println("Now enter the element for your array: ");
   
   for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = sc.nextInt();

   }
   
   
   
   System.out.println("This is your array: ");
   for (int i = 0; i < firstArray.length; i++) {
             System.out.println(firstArray[i]);
   }
   
   
   
          System.out.println("for inserting element at 1\n for deleting the  element at specific index enter 2\n ");
          int option = sc.nextInt();
         if(option == 1) {
         int newArray[] = new int[firstArray.length+1];
         System.out.println("now tell me  what element you wanna insert into: ");
         int element = sc.nextInt();
         System.out.println("for inserting element at beginning enter 1\n for inserting element at the end  enter 2\n for inserting element at specific index enter 3\n  for deleting the  element at specific index enter 3\n ");
         int op = sc.nextInt();
         
         if(op ==1){
             newArray[0] = element;
             for (int i = 1; i < newArray.length; i++) {
                newArray[i] = firstArray[i-1];
                        
                 
             }
         }
         
         else if(op ==2){
             newArray[newArray.length-1] = element;
              for (int i = 0; i < newArray.length-1; i++) {
                 newArray[i] = firstArray[i];
                        
                         
                  
              }
         }
                 
         
         
          else if(op ==3){
              
               System.out.println("Where do you wanna insert the element give me the index: ");
               int index = sc.nextInt();
               
               for (int i = 0; i < index; i++) {
                   newArray[i] = firstArray[i];   
               }

               newArray[index] = element;
               for(int i = ++index;i <newArray.length;i++){
                   newArray[i] = firstArray[i-1];
               }
         }
          System.out.println("array elements extended to: ");
         for (int i = 0; i < newArray.length; i++) {
             System.out.println(newArray[i]);
                     
             
         }
      
         }
          // Remove arrray element  1 2 3 4 5
    else if (option == 2) {
      int[] newArray = new int[firstArray.length - 1];
      System.out.println("Enter the index to delete element: ");
      int index = sc.nextInt();
      for (int i = 0; i < firstArray.length; i++) {
        if (i < index) {
          newArray[i] = firstArray[i];
        } else if (i > index) {
          newArray[i - 1] = firstArray[i];
        }
      }
      System.out.println("Element Deleted");
      for (int i = 0; i < newArray.length; i++) {
        System.out.println(newArray[i]);
      }
    }
          
             
         
    }
}
