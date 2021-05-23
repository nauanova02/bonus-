import java.util.Scanner;

public class task {
    int firstIndex(int[] arr, int n) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] == n) {
                    if (mid - 1 >= 0 && arr[mid - 1] == n) {
                        end = mid - 1;
                        continue;
                    }
                    return mid;
                }
                 else if (arr[mid] < n)
                    start = mid + 1;
                else end = mid - 1;
            }
            return -1;
    }
    int secondIndex(int[] arr, int n){

        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == n){
                if(mid+1 < arr.length && arr[mid+1] == n){
                    start = mid +1;
                    continue;
                }
                return mid;
            }
            else if(arr[mid] <n)
                start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args){
        int first_index, sec_index, n;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        int[] arr = new int[10];
        System.out.println("enter");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }


        task t = new task();
        first_index = t.firstIndex(arr, n);
        sec_index = t.secondIndex(arr, n);
        if(first_index == -1 || sec_index == -1){
            System.out.println("does not exist");
        } else{
            System.out.println("first index: " + first_index);
           System.out.println("second index: " + sec_index);
       }
        t = null;
    }
}




/*
public class task {
public boolean hasItem(T item){
    return binSearch(item, 0, mid-1)
}
    private boolean binSearch(T item, int start, int end){
    int[] arr = new int[10];
        if(start > end)
            return false;
        int mid = (start + end)/2;
        int cmp = arr[mid].compareTo(item);
        if(cmp == 0){
            return mid;
        } else if(cmp>0){
            return binSearch(item, start, mid-1);
        } else{
            return binSearch(item, mid +1, end);
        }
    }
    public static void main(String args[]){
        task ob = new task();
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[10];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int t = arr.length;
        int x;
        Scanner  sc = new Scanner(System.in);
        x = sc.nextInt();
        int result = ob.binSearch(arr, 0, n-1, x);
        if(result == -1)
            System.out.println("element not found");
        else
            System.out.println("index: " + result);

    }
}

 */