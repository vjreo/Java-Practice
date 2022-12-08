import java.util.Arrays;

public class UpdatingArrays {
    public static void main(String[] args) {
        String[] menu = {"Espresso", "Iced Coffee", "Macchiato"};
        menu[2] = "Latte";
        System.out.println(Arrays.toString(menu));

        String[] newMenu = new String[5];

        for (int i = 0; i < menu.length; i++) {
            newMenu[i] = menu[i]; 
        }
        newMenu[3] = "House Blend";
        newMenu[4] = "Dark Roast";
        System.out.println(Arrays.toString(newMenu));

        // Quiz Questions
        String[] items = {"clock", "table", "ladder", "chair", "oven", "phone"};
        items[ 5%2 ] = "cup";
        System.out.println(Arrays.toString(items));

        // ---------------------------------------- // 
        String[] items1 = new String[5];
        items1[10%2] = "cup";
        int[] numbers = new int[3];
        numbers[5%1] = 3;
        System.out.println(items1[0]);
        System.out.println(items1[1]);
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);

        // ---------------------------------------- //
        String[] items2 = {"clock", "table", "ladder", "chair", "oven", "phone"};
        String[] moreItems = new String[6];

        // ---------------------------------------- // 
        for (int i = 0; i < 3; i++) {
            moreItems[i] = items2[i];
        }
        System.out.println(Arrays.toString(moreItems));

        // ---------------------------------------- // 
        String[] items3 = {"clock", "table", "ladder", "chair", "oven", "phone"};
        String[] moreItems1 = new String[6];
        for (int i = (moreItems1.length - 1); i >= 3; i--) {
            moreItems1[i] = items3[i];
        }
        System.out.println(Arrays.toString(moreItems1));

        // ---------------------------------------- //
        String[] items4 = {"clock", "table", "ladder", "chair", "oven", "phone"};
        String[] moreItems2 = new String[6];
 
        for (int i = (moreItems2.length - 1); i >= 1; i--) {
            if (i % 2 == 0) {
                moreItems2[i] = items4[i];
            }
        }
        System.out.println(Arrays.toString(moreItems2));

        // ----------------------------------------- // 
        String[] items5 = {"clock", "table", "ladder", "chair", "oven", "phone"};
        String[] moreItems3 = new String[6];
        for (int i = (moreItems3.length - 1); i >= 1; i--) {
            if (i % 2 != 0) {
                continue;
            } 
            moreItems3[i] = items5[i];
        }
        System.out.println(Arrays.toString(moreItems3));
    }
}
