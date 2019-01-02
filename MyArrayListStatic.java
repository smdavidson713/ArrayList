public class MyArrayListDynamic{

	private static int[] a = {2,8,5,4,6};

	public static void int[] update(int index, int value)
   {
      array[index] = value;
   }

    public void int[] add(int value)
   {
      int[] temp = new int[array.length+1];
      for (int i=0;i<array.length;i++)
        temp[i] = array[i];
      temp[array.length] = value;
      a = temp;
   }

    public void int[] insert(int index, int value)
   {
       int[] temp = new int[array.length+1];
       for(int i=0;i<index;i++)
         temp[i] = array[i];
       temp[index] = value;
       for(int i=index;i<array.length;i++)
         temp[i+1] = array[i];
       a = temp;
   }

    public void int[] delete(int index)
   {
       int[] temp = new int[array.length-1];
       for(int i=0;i<index;i++)
         temp[i] = array[i];
       for(int i=index+1;i<array.length;i++)
         temp[i-1] = array[i];
       a = temp;
   }

    public void print()
   {
      for(int i=0;i<array.length;i++)
        System.out.println("array["+i+"]: "+array[i]);  
   }

}