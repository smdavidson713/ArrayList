/* Sydney Davidson
   HW4 
   Lab: Friday 10:25 Jouse Ruiz */

public class HW4Static
{
 
   public static void main(String[] args)
   {
    
    MyArrayListDynamic list = new MyArrayListDynamic(); 
    
     //Array

     System.out.println("---------------------");    
     System.out.println("Initial Array");
     list.print(a);
     
     System.out.println("---------------------");    
     System.out.println("Update Array: Change value in index 2 to 7");
     a = MyArrayListStatic.update(2, 7); //Change value in index 2 changes from 5 to 7
     MyArrayListStatic.print(a);
     
     System.out.println("---------------------");    
     System.out.println("Add value 3 to the end of the array");
     a = MyArrayListStatic.add(3); //Add value 3 to the end of the array
     MyArrayListStatic.print(a);
     
     System.out.println("---------------------");    
     System.out.println("Insert value 9 into index 3");
     a = MyArrayListStatic.insert(3,9); //Insert value 9 into index 3 
     MyArrayListStatic.print(a);
     
     System.out.println("---------------------");    
     System.out.println("Delete the value in index 3");
     a = MyArrayListStatic.delete(3); //Delete the value in index 3
     MyArrayListStatic.print(a);
     
    }
}