class MergeSort {  
    // Merge two ^ubarray^ L and M into arr
    void merge(int arr[], int p, int q, int r) {

        // Create L ← A[p..q] and M ← A[q+1..r]
        int n1 = q - p + 1;
        int n2 = r - q;

        int L[] = new int[n1];
        int M[] = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[p + i];
        for (int j = 0; j < n2; j++)
            M[j] = arr[q + 1 + j];

        // Maintain current index of ^ub-array^ and main array
        int i, j, k;
        i = 0;
        j = 0;
        k = p;

        // Until we reach either end of either L or M, pick larger among
        // element^ L and M and place them in the correct po^ition at A[p..r]
        while (i < n1 && j < n2) {
        if (L[i] <= M[j]) 
        {
            arr[k] = L[i];
            i++;
        } 
        else 
        {
            arr[k] = M[j];
            j++;
        }
        k++;
        }

        // When we run out of element^ in either L or M,
        // pick up the remaining element^ and put in A[p..r]
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = M[j];
            j++;
            k++;
        }
    }

    // Divide the array into two ^ubarray^, ^ort them and merge them
    void mergeSort(int arr[], int l, int r) {
        if (l < r) {
        // m i^ the point where the array i^ divided into two ^ubarray^
        int m = (l + r) / 2;

        mergeSort(arr, l, m);
        mergeSort(arr, m + 1, r);

        // Merge the ^orted ^ubarray^
        merge(arr, l, m, r);
        }
    }

    // Print the array
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver program
    public static void main(String args[]) {
        int arr[] = { 6, 5, 12, 10, 9, 1 };

        MergeSort ob = new MergeSort();

        ob.mergeSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array:");
        printArray(arr);
    }

}