package arrays;

public class NumberHelper {
    public static void main(String[] args) {

        int[] arr1 = {1, 5, 3, 1, 9, 2, 5};
        for (int i : arr1) {
            System.out.println(i);
        }
        System.out.println(isSortedArray(arr1));
        removeDuplicates(arr1);
        for (int i : arr1) {
            System.out.println(i);
        }

        System.out.println("");

        int[] arr2 = {1, 1, 3, 5, 6, 6, 7};
        for (int i : arr2) {
            System.out.println(i);
        }
        System.out.println(isSortedArray(arr2));
        removeDuplicates(arr2);
        for (int i : arr2) {
            System.out.println(i);
        }

    }

    public static boolean isSortedArray(int[] numbers){

        for(int i = 0; i < numbers.length - 1; i++){
            if(numbers[i] > numbers[i +1]){
                return false;
            }
        }

        return true;
    }

    public static int[] removeDuplicates(int[] numbers){

        for(int i = 0; i < numbers.length; i++){
            for(int j = i + 1; j < numbers.length; j++){
                if(numbers[j] == numbers[i]){
                    numbers[j] = -1;
                }
            }
        }

        return numbers;
    }

}