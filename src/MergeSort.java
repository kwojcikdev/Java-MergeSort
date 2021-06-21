public class MergeSort {

    public static void main (String [] args){
        System.out.println("Merge Sort");

        int [] arr = {38,27,43,3,9,92,10};

        printArr(arr);
        mergeSort(arr, 0, arr.length-1);

        printArr(arr);
    }


    static void mergeSort(int [] arr, int start, int end){

        int mid;
        if (end > start){
            mid = start + (end-start)/2;

            mergeSort(arr, start, mid);
            mergeSort(arr, mid+1, end);

            merge(arr, start, mid, end);

        }

    }


    static void merge(int [] arr, int start, int mid, int end){

        int s1 = mid - start + 1;
        int s2 = end - mid;

        int [] left = new int[s1];
        int [] right = new int[s2];

        for (int i = 0; i < s1; i++)   left[i] = arr[start+i];
        for (int i = 0; i < s2; i++)   right[i] = arr[mid+i+1];

        int i=0, j=0;

        int k = start;

        while( i < s1 && j < s2)
        {
            if(left[i] <= right[j]){
                arr[k] = left[i];
                i++;
            }
            else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < s1)
        {
            arr[k] = left[i];
            i++;
            k++;
        }

        while (j < s2)
        {
            arr[k] = right[j];
            j++;
            k++;
        }

    }

    static void printArr(int [] arr){
        System.out.println();
        for( int i : arr){
            System.out.print( i + ", ");
        }
        System.out.println();

    }
}
