public class findMax {
    public static <T extends Comparable<T>> T array_max(T[] array, int size) {
        T max = array[0];

        for (int i = 1; i < size; i++) {

            if(array[i].compareTo(max) > 0){
                max = array[i];
            }

        }

        return max;
    }
}
