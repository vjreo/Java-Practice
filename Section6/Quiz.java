public class Quiz {
    public static void main(String[] args) {
        char[] array = { 'q', 'u', 'i', 'z', '6', '2'};
        
        // System.out.println(array[array.length]);
        // System.out.println(array[array.length-1]);
        
        // for (int i = 0; i < array.length; i++) {
        //     System.out.println(array[i]);
        // }

        // for (int i = 0; i <= array.length; i++) {
        //     System.out.println(array[i]);
        // }

        // for (int i = array.length; i >= 0 ; i--) {
        //     System.out.println(array[i]);
        // }

        for (int i = array.length - 1; i >= 0 ; i--) {
            System.out.println(array[i]);
        }

    }
}
