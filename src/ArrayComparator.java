class ArrayComparator {

    static boolean compare(int[] array1, int[] array2) {

        if (array1.length != array2.length) //gdy tablice mają różne wymiary
            return false;

        for (int i = 0; i < array1.length; i++){
            if (array1[i] != array2[i])
                return false;
        }

        return true;
    }

    static boolean compare(int[][] array1, int[][] array2){

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                if (array1[i][j] != array2[i][j])
                    return false;
            }
        }
        return true;
    }

    //boolean lengthComparition(int[][] array1, int[][] array2) {
        //return true;
    //}

}