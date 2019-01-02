public class MyArrayListDynamic{

	private int[] array;

  MyArrayListDynamic(int[] a){
    this.array = a;

  }

	public int[] update(int index, int value)
   {
      array[index] = value;
      return array;
   }

    public int[] add(int value)
   {
      int[] temp = new int[array.length+1];
      for (int i=0;i<array.length;i++)
        temp[i] = array[i];
      temp[array.length] = value;
      array = temp;
      return array;
   }

    public int[] insert(int index, int value)
   {
       int[] temp = new int[array.length+1];
       for(int i=0;i<index;i++)
         temp[i] = array[i];
       temp[index] = value;
       for(int i=index;i<array.length;i++)
         temp[i+1] = array[i];
       array = temp;
       return array;
   }

    public int[] delete(int index)
   {
       int[] temp = new int[array.length-1];
       for(int i=0;i<index;i++)
         temp[i] = array[i];
       for(int i=index+1;i<array.length;i++)
         temp[i-1] = array[i];
       array = temp;
       return array;
   }

    public void print()
   {
      for(int i=0;i<array.length;i++)
        System.out.println("array["+i+"]: "+array[i]);  
   }
   public void bubbleSort(){
    int temp;
    for(int i=0;i<array.length-1;i++){
      for(int j=i+1;j<array.length;j++){
        if(array[i]>array[j]){
          temp = array[i];
          array[i] = array[j];
          array[j] = temp;
        }
      }

    }
   }

}