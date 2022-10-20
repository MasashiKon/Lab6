public class App {
    public static void main(String[] args) throws Exception {

        Integer[] arr_i = {2,8,20,3,4};
        int arr_i_size = arr_i.length;

        Double[] arr_d = {2.7,3.8,5.5,6.7,9.7};
        int arr_d_size = arr_d.length;

        System.out.println(findMax.array_max(arr_i, arr_i_size));

        System.out.println(findMax.array_max(arr_d, arr_d_size));
    }

    
}