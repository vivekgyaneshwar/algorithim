package challenges.arraysAndStrings;

class Main {
    public static void main(String[] args) {

        // create an array
        int[] age = {12, 4, 5, 2, 5};

        // access each array elements
        System.out.println("Accessing Elements of Array:");
        System.out.println("First Element: " + age[0]);
        System.out.println("Second Element: " + age[1]);
        //loopOnArray(age);

        sumAverageArray();
        create2DArray();
    }

    private static void create2DArray() {
        // create a 2d array
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6, 9},
                {7},
        };

        // calculate the length of each row
        System.out.println("Length of row 1: " + a[0].length);
        for (int i = 0; i < a.length; ++i) {
            for(int j = 0; j < a[i].length; ++j) {
                System.out.println(a[i][j]);
            }
        }
    }

    private static void sumAverageArray() {
        int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
        int sum = 0;
        Double average;

        // access all elements using for each loop
        // add each element in sum
        for (int number: numbers) {
            sum += number;
        }

        // get the total number of elements
        int arrayLength = numbers.length;

        // calculate the average
        // convert the average from int to double
        average =  ((double)sum / (double)arrayLength);

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }

    private static void loopOnArray(int[] age) {
        // loop through the array
        // using for loop
        System.out.println("Using for Loop:");
        for(int i = 0; i < age.length; i++) {
            System.out.println(age[i]);
        }

        // loop through the array
        // using for loop
        System.out.println("Using for-each Loop:");
        for(int a : age) {
            System.out.println(a);
        }
    }
}
