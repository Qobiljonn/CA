public class MergeSort {
    public static void sort(int[] array, int l, int r){
        if (l < r){
            int m = l + ((r - l) / 2);
            sort(array, l, m);
            sort(array,m + 1, r);

            merge(array, l , m, r);
        }
    }
    public static void merge(int[] array, int l, int m, int r){
        final int SIZE_L = m - l + 1;
        final int SIZE_R = r - m;

        // temp arrays R - right half, L - left half
        int[] L = new int[SIZE_L];
        int[] R = new int[SIZE_R];

        for (int i = 0; i < SIZE_L; i++) {
            L[i] = array[l + i];
        }
        for (int j = 0; j < SIZE_R; j++) {
            R[j] = array[m + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = l;

        while (i < SIZE_L && j < SIZE_R){
            if(L[i] < R[j]){
                array[k] = L[i];
                i++;
            }
            else {
                array[k] = R[j];
                j++;
            }
            k++;
        }
        while(i < SIZE_L){
            array[k] = L[i];
            i++;
            k++;
        }
        while(j < SIZE_R)
        {
            array[k] = R[j];
            j++;
            k++;
        }
    }
}
