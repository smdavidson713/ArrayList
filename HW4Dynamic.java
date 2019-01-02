public class HW4Dynamic
{
 
   public static void main(String[] args)
   {
    int[] a = {2,8,5,4,6};      

    MyArrayListDynamic list = new MyArrayListDynamic(a); 


     //Array

     System.out.println("---------------------");    
     System.out.println("Initial Array");
     list.print();
     
     System.out.println("---------------------");    
     System.out.println("Update Array: Change value in index 2 to 7");
     a = list.update(2, 7); //Change value in index 2 changes from 5 to 7
     list.print();
     
     System.out.println("---------------------");    
     System.out.println("Add value 3 to the end of the array");
     a = list.add(3); //Add value 3 to the end of the array
     list.print();
     
     System.out.println("---------------------");    
     System.out.println("Insert value 9 into index 3");
     a = list.insert(3,9); //Insert value 9 into index 3 
     list.print();
     
     System.out.println("---------------------");    
     System.out.println("Delete the value in index 3");
     a = list.delete(3); //Delete the value in index 3
     list.print();
     
     System.out.println("---------------------");    
     System.out.println("Sorts the values of the array");
     list.bubbleSort();
     list.print();

   }
 }