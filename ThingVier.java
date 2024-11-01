public class ThingVier{
    public static void main(String[] args){
       /* float[] arr = new float[3];
         arr[0] = 9.1f;
        System.out.println(arr[0]); */
        
        //Manipulation
        int[] arrz = {1,2,3, 4, 5, 6};
        /*int i = 0;
        while (i < arrz.length){
            System.out.print(arrz[i] + ", ");
            i++;
        }
        */
        //For loops
        System.out.print("[");
        for (int j = 0; j < arrz.length; j++){
            System.out.print(arrz[j] + ",");
        }
        System.out.print("]\n");
        
        //cool thing
        int counterEven = 0;
        System.out.print("[");
        for (int j = 0; j < arrz.length; j++){
            if (arrz[j] % 2 == 0){
                System.out.print(arrz[j] + ",");
                counterEven++;
            }
        }
        System.out.print("]\n");
        System.out.println(counterEven + " even Numbers.");
        
    }
}
/*
arr.length() gets length
*/