public class Sorting {
    public static void main(String[] args){
        int[] arrOne = {5, 10, 2, 7, 8};
        int [] arrTwo = {5, 10, 2, 7, 8};

        for (int i = 0; i < arrOne.length - 1; i++) {
            for (int j = 0; j < arrOne.length - 1 - i; j++) {
                if (arrOne[j] < arrOne[j + 1]) {
                    // Swap arrOne[j] and arrOne[j + 1]
                    int temp = arrOne[j];
                    arrOne[j] = arrOne[j + 1];
                    arrOne[j + 1] = temp;
                }
            }
        }

        // Print sorted array
        System.out.print("Sorted array: ");
        for (int num : arrOne) {
            System.out.print(num + " ");
        }

    }
}
