public class BubbleSort {

     public static void Bubble_Sort (int[] args){
         int arryLength = args.length;
         int temp;
         for(int i = 0; i < args.length; i++){

             boolean is_sorted = true;

             for(int j = 1; j < (args.length - i); j++){

                 if ((args[j - 1]) > args[j]) {

                     temp = args[j - 1];
                     args[j - 1] = args[j];
                     args[j] = temp;
                     is_sorted = false;

                 }
             }

             if (is_sorted) break;

             System.out.println(args[0]);
         }

     }

     public static void main(String[] args){
         int[] array = {70,61,72,83,38};
         Bubble_Sort(array);
     }
}
