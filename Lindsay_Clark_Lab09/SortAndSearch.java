import java.io.*;
import java.util.*;

public class SortAndSearch{
   
   public static void main(String[] args) throws IOException{
      int index;
      
      int[] small = readFile("SmallNumbers.txt");
      index = contains(small, 67);
      if (index >= 0)
         System.out.println("Small contains the number at index " + index);
      else 
         System.out.println("Small does not contain the number");
         
      mergeSort(small);
         
      index = binarySearch(small, 0, small.length, 67);
      if (index >= 0)
         System.out.println("Small contains the number at index " + index);
      else 
         System.out.println("Small does not contain the number");
         
      System.out.println("");  
         
      int[] large = readFile("LargeNumbers.txt");
      index = contains(large, 1959354);
      if (index >= 0)
         System.out.println("Large contains the number at index " + index);
      else 
         System.out.println("Large does not contain the number");
         
      mergeSort(large);
         
      index = binarySearch(large, 0, large.length, 1959354);
      if (index >= 0)
         System.out.println("Large contains the number at index " + index);
      else 
         System.out.println("Large does not contain the number");
   }
   
   public static int[] readFile(String path) throws IOException {
      
      String line;    
      
      FileReader file = new FileReader(path); 
         
      BufferedReader reader = new BufferedReader(file);
      
      line = reader.readLine();    
      reader.close();
      
      return Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();          
   } 
   
   public static int contains(int[] array, int number){
      int index = -1;
   	
      for (int i = 0; i < array.length; i++){
         if (array[i] == number) {
            index = i;
            break;
         }
      }
      return index;
   }

   public static void mergeSort(int[] a){
      int[] temp = new int[a.length];
      mergeSort(a, temp, 0, a.length - 1);
   }
   
   public static void mergeSort(int[] a, int[] temp, int left, int right){
      if (left < right){
         int center = (left + right) / 2;
         mergeSort(a, temp, left, center);
         mergeSort(a, temp, center + 1, right);
         merge(a, temp, left, center + 1, right);
      }  
   }
   
   public static void merge(int[] a, int[] temp, int left, int right, int rightEnd){
      int leftEnd = right - 1;
      int k = left;
      int num = rightEnd - left + 1;
      
      while (left <= leftEnd && right <= rightEnd){
         if (a[left] <= (a[right]))
            temp[k++] = a[left++];
         else
            temp[k++] = a[right++];
      }
            
      while (left <= leftEnd)
         temp[k++] = a[left++];
         
      while (right <= rightEnd)
         temp[k++] = a[right++];
         
      for (int i = 0; i < num; i++, rightEnd--)
         a[rightEnd] = temp[rightEnd];       
   }
   
   private static int binarySearch(int[] array, int first, int last, int number){
      int index;
      int mid = first + (last - first) / 2;
      
      if (first > last)
         index = -1;
      else if (number == array[mid])
         index = mid;
      else if (number < array[mid])
         index = binarySearch(array, first, mid - 1, number);
      else 
         index = binarySearch(array, mid + 1, last, number);
      
      return index;
   }
}