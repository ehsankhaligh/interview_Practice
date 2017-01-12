public class QuickSort {
     
    private int array[];
    private int length;
 
    public void sort(int[] inputArr) {
         
        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        this.array = inputArr;
        length = inputArr.length;
        quickSort(0, length - 1);
    }
 
    private void quickSort(int lowerIndex, int higherIndex) {
         
        int i = lowerIndex;
        int j = higherIndex;
        // calculate pivot number, I am taking pivot as middle index number
        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
        // Divide into two arrays
        while (i <= j) {
            /**
             * In each iteration, we will identify a number from left side which
             * is greater then the pivot value, and also we will identify a number
             * from right side which is less then the pivot value. Once the search
             * is done, then we exchange both numbers.
             */
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (lowerIndex < j)
            quickSort(lowerIndex, j);
        if (i < higherIndex)
            quickSort(i, higherIndex);
    }
 
    private void exchangeNumbers(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
     
    public static void main(String a[]){
         
        QuickSort sorter = new QuickSort();
        int[] input = {24,2,45,20,56,75,2,56,99,53,12};
        sorter.sort(input);
        for(int i:input){
            System.out.print(i);
            System.out.print(" ");
        }
    }
}

//http://www.mathcs.emory.edu/~cheung/Courses/171/Syllabus/7-Sort/quick-sort1.html

/*
 public static void sort( double[] a )
   {
      double[] left = null, right = null;
      int      nleft, nright; // Length of left[] and right[
      double   pivot;
      int      i, j, k;


      if ( a.length <= 1 )
      {
       	 // Array of 1 element is sorted....

	 return;
      }

      /* ========================================================
	 Select the "pivot"
	 ======================================================== */
      //pivot = a[a.length-1];   // Use last element as pivot
                               // This is the default choice...


      /* ========================================================
	 Find out how many elements are <= and > than pivot
	 ======================================================== */
  /*    nleft = nright = 0;
      for ( i = 0; i < a.length-1; i++ )
	 if ( a[i] <= pivot )
            nleft++;
	 else
            nright++;

      /* =================================================
	 Make the left and right array of the proper size
	 ================================================= */
   /*   left  = new double[nleft];
      right = new double[nright];

      /* =================================================
	 Partition array into 2 halves:

             all values <= pivot to left[ ] array
             all values >  pivot to right[ ] array
	 ================================================= */
  /*    i = 0;
      j = 0;
      for ( k = 0; k < a.length-1; k++ )
	 if ( a[k] <= pivot )
            left[i++] = a[k];
	 else
            right[j++] = a[k];

      /* =================================================
	 Sort each half
       	 ================================================= */
    //  BubbleSort.sort(left);
      //BubbleSort.sort(right);

      /* =================================================
       	 Concatenate the pieces back
	 ================================================= */             
   /*   k = 0;

      for ( i = 0; i < left.length; i++ )
         a[k++] = left[i];

      a[k++] = pivot;

      for ( j = 0; j < right.length; j++ )
         a[k++] = right[j];
   }*/

