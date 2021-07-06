public class QuickSort {

    public static void quickSortf(int[] a,int l,int r)
    {
        if(l<r)
        {
            int pivot = a[l];
            int i = l;
            int j = r;

            while(i<j) {
                i += 1;
                while(i<=r && pivot > a[i] )
                    i++;
                while(j>=l && pivot > a[j] )
                    j--;

                if(i<j && i<=r)
                    swap(a, i,j);
            }

            swap(a, l,j);
            quickSortf(a, l, j-1);
            quickSortf(a, j+1, r);

        }
    }

    public static void swap(int[] a, int x, int y) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }


}
