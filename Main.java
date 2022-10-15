public class Main {
    public static void main( String[] args ) {

        int[] array = new int[]{1, 2, 3, 4, 5, 8, 11, 14, 30};
        String[] strarray = new String[]{"Omar", "Zeyad", "Karim", "Ahmed"};
        //get the average of integer array

        float sum = 0;
        int index = 0;
        while (index < array.length) {
            sum += array[index];
            index++;
        }
        float average = sum / array.length;
        System.out.println("Average : " + average);

        //get largest and smallest value of integer array


        {
            int large, small, i;
            int n = array.length;
            large = small = array[0];
            for (i = 1; i < n; ++i) {
                if (array[i] > large)
                    large = array[i];

                if (array[i] < small)
                    small = array[i];
            }

            System.out.print(“\nthe_smallest:  ”+small );
            System.out.print(“\nThe largest:   ”+large );
        }


        //Reverse the string array

        int size = strarray.length;


        static void reverseArray (strarray[],int size)
        {
            int i, k, temp;
            for (i = 0; i < size / 2; i++) {
                temp = strarray[i];
                strarray[i] = strarray[size - i - 1];
                strarray[size - i - 1] = temp;
            }

            //sort the both string and integer array

            int t;
            for (int i = 1; i < array.length; i++) {
                for (int j = i; j > 0; j--) {
                    if (array[j] < array[j - 1]) {
                        t = array[j];
                        array[j] = array[j - 1];
                        array[j - 1] = t;
                    }
                }
            }
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }


        }
    }
}
