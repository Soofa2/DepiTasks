public class seconedLargest {
    public static void main(String[] args) {


        int[] arrTwo = {5, 10, 2, 7, 8};

        int max = arrTwo[0];
        int secondMax = arrTwo[0];
        int min = arrTwo[0];
        int secondMin = arrTwo[0];

        for (int i = 1; i < arrTwo.length; i++) {
            if (arrTwo[i] > max) {
                secondMax = max;
                max = arrTwo[i];
            } else if (arrTwo[i] > secondMax && arrTwo[i] != max) {
                secondMax = arrTwo[i];
            }

            if (arrTwo[i] < min) {
                secondMin = min;
                min = arrTwo[i];
            } else if (arrTwo[i] < secondMin && arrTwo[i] != min) {
                secondMin = arrTwo[i];
            }
        }

        System.out.println("Second largest: " + secondMax);
        System.out.println("Second smallest: " + secondMin);
    }
    }

