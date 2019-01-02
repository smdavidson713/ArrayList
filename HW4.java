public class HW4
{
 
   public static void main(String[] args)
   {
     
     //Array
     int[] a = {2,8,5,4,6};      
  
     System.out.println("---------------------");    
     System.out.println("Initial Array");
     MyArrayListStatic.print(a);
     
     System.out.println("---------------------");    
     System.out.println("Update Array: Change value in index 2 to 7");
     a = update(a, 2, 7); //Change value in index 2 changes from 5 to 7
     MyArrayListStatic.print(a);
     
     System.out.println("---------------------");    
     System.out.println("Add value 3 to the end of the array");
     a = add(a,3); //Add value 3 to the end of the array
     MyArrayListStatic.print(a);
     
     System.out.println("---------------------");    
     System.out.println("Insert value 9 into index 3");
     a = insert(a,3,9); //Insert value 9 into index 3 
     MyArrayListStatic.print(a);
     
     System.out.println("---------------------");    
     System.out.println("Delete the value in index 3");
     a = delete(a,3); //Delete the value in index 3
     MyArrayListStatic.print(a);
     
   }