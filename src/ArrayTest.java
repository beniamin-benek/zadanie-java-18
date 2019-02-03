import java.util.Arrays;

class ArrayTest {

    public static void main(String[] args) {

        int[] array1 = {1,3,4,5,6};
        int[] array2 = {1,3,4,5,6};
        int[] array3 = {1,3,4,6,6};
        int[] array4 = {1,3,4};
        int[][] tab1 = {
                {1, 2, 3, 4},
                {2, 3, 4, 5},
                {3, 4, 5, 6},
                {4, 5, 6, 7}
        };
        int[][] tab2 = {
                {1, 2, 3, 4},
                {2, 3, 4, 5},
                {3, 4, 5, 6},
                {4, 5, 6, 7}
        };
        int[][] tab3 = {
                {1, 2, 3, 4},
                {2, 3, 4, 5},
        };

        System.out.println(ArrayComparator.compare(array1, array2)); //true
        System.out.println(ArrayComparator.compare(array2, array3)); //false
        System.out.println(ArrayComparator.compare(array1, array4)); //false

        System.out.println();
        System.out.println(ArrayComparator.compare(tab1, tab2)); //true
        System.out.println(ArrayComparator.compare(tab2, tab1)); //true

        System.out.println();
        //można też użyć metody equals
        //z https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Arrays.html#equals(int%5B%5D,int%5B%5D)
        System.out.println(Arrays.equals(array1, array2)); //true
        System.out.println(Arrays.equals(tab1, tab3)); //false
    }

}