import java.util.Arrays;

public class qwer {
    public static void main(String[] args) {
        //Объявление и инициализация
        int[] arr = {-1, 1, 0, -3, 2,3, 4, -5,5,5,-5,5};
        int sequenceCount = 0;
        int count = 0;
        for (int i = 0; i< arr.length; i++){
            if (arr[i]>0) {
                sequenceCount++;
                for (int j = i; j < arr.length; j++) {
                    if (arr[j]<=0) {
                        i=j;
                        break;
                    } else {
                        count++;
                    }
                }
            }
        }

        int[] sequences = new int[sequenceCount];
        int k = 0;

        for (int i = 0; i< arr.length; i++){
            count = 0;
            if (arr[i]>0) {
                for (int j = i; j < arr.length; j++) {
                        if (arr[j]<=0) {
                            i=j;
                            break;
                        } else {
                            count++;
                            sequences[k] = count;
                        }
                }
                k++;
            }
        }

        System.out.println(sequenceCount);
        System.out.println(Arrays.toString(sequences));
        System.out.println(Arrays.stream(sequences).max().orElse(0));
    }
}
