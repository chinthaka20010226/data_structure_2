import java.util.*;

public class Test{
   public static void main(String args[]){
         int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
         int[] arrMax = null;
         int max = Integer.MIN_VALUE;

         for(int i=0;i<arr.length;i++){
            int l = 0;
            for(int j=i;j<arr.length;j++){
               int[] arrSub = new int[++l];
               int sum = 0;
               int s = 0;
               for(int k=i;k<=j;k++){
                  arrSub[s] = arr[k];
                  sum += arrSub[s];
                  s++;
               }
               if(sum > max){
                  arrMax = arrSub;
                  max = sum;
               }
            }
            break;
         }

         System.out.println(Arrays.toString(arrMax));
   }
}