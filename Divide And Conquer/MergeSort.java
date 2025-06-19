import java.nio.channels.Pipe;

public class MergeSort {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void mergeSort(int arr[], int si, int ei){
           
        if(si >= ei){
            return;
        }
        //kaam

        int mid = si + (ei-si)/2;
        mergeSort(arr, si, mid); // left part
        mergeSort(arr, mid+1, ei); //right part

        merge(arr,si,mid,ei);
    }

    public static void merge(int arr[],int si,int mid,int ei){
           int temp[] = new int[ei-si+1];// due to 0 based indexing +1 need to be added
           int i = si; // iterattor for left side
           int j = mid+1;// iterattor for right side
           int k = 0;// iterattor for temp arr

           while (i <= mid && j <= ei) {
             if(arr[i] <arr[j]){
                temp[k] = arr[i];
                i++;
               
             }else{ 
                temp[k] = arr[j];
               
                j++;
             }
              k++;
           }

           //left-over leftt part
           while (i <= mid) {
            temp[k++] = arr[i++];
           }

           //left-over right part
           while (j <= ei) {
            temp[k++] = arr[j++];
           }

           for ( k = 0, i =si; k < temp.length; k++,i++) {
            arr[i] = temp[k];
           }

    }

    public static void quickSort(int arr[], int si,int ei){
        if(si >= ei){
            return;
        }

        int pIdx = partition(arr,si,ei);

       
        quickSort(arr, si, pIdx-1);
        quickSort(arr, pIdx +1 , ei);
    }

    public static int partition(int arr[],int si,int ei){
        int pivot = arr[ei];
        int i = si-1;
        

        for (int j = si; j < ei; j++) {
            if(arr[j] <= pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++;
    int temp = arr[i];
    arr[i] = arr[ei];
    arr[ei] = temp;

        return i;

    }
    public static void main(String[] args) {
       int arr[] = {6,3,9,5,2,8,-2};
       quickSort(arr, 0, arr.length-1);
       printArr(arr);
    }
}
