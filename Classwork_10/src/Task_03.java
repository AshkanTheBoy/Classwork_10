public class Task_03 {
    public static void main(String[] args) {
        int[] arr = {2,3,1,4,2,5,1};

        int max = arr[0];
        for (int elem:arr)
            if (max>elem) max = elem;

        //System.out.println(max);

        //Является ли 1-я точка локальным минимумом
        if (arr[0]<arr[1] && arr[0]>max)
            max = arr[0];

        //Является ли последняя точка локальным минимумом
        int n = arr.length;
        if (arr[n-1]<arr[n-2] && arr[n-1]>max)
            max = arr[n-1];

        for (int i=1; i<n-1; i++) {
            if (arr[i]<arr[i-1] && arr[i]<arr[i+1] && arr[i]>max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
