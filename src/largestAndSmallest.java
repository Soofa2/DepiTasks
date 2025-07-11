//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class largestAndSmallest {
    public static void main(String[] args) {

        int[] arrOne = {5, 10, 2, 7, 8};
        int [] arrTwo = {5, 10, 2, 7, 8};

        int max = arrOne[0];
        int min = arrOne[0];

        for (int i = 1; i < arrOne.length; i++) {
            if (arrOne[i] > max) {
                max = arrOne[i];
            }
            if (arrOne[i] < min) {
                min = arrOne[i];
            }
        }

        System.out.println("Largest number: " + max);
        System.out.println("Smallest number: " + min);
    }
}