import java.util.*;

public class JavaCoding {
    public static void main(String[] args) {
        validateWords();
    }


    public static void validateWords(){
            String s1 ="listen", s2 ="silent";
            char[] ac1= s1.toCharArray(),ac2= s2.toCharArray();
            boolean matching = false;
        for (char c : ac1) {
            for (char value : ac2) {
                if (c == value) {
                    matching = true;
                    break;
                } else {
                    matching = false;
                }
            }
        }
        System.out.println(matching);
        }

    /**
     * Input-A1B2C3
     * Output -ABBCCC
     */
    public static void charManupulation() {
        String s = "A1B2C3";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char cr = s.charAt(i);
            if (Character.isLetter(cr)) {
                count = s.charAt(i + 1) - '0';
                for (int j = 0; j < count; j++) {
                    System.out.print(s.charAt(i));
                }
            }

        }

    }

    /**
     * bobbleShort
     *
     * @param args
     */
    public static void bobbleShort(String[] args) {
        int[] arr = {5557, 533, 468, 865, 2, 45, 67, 1};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    /**
     * reverse String and palindrome
     */
    public static void reverseString() {
        Scanner s = new Scanner(System.in);
        System.out.println("Give the string value --");
        String s1 = s.nextLine();
        System.out.println(reverseString(s1));
        boolean palindrome = s1.equals(reverseString(s1));
        System.out.println("palindrome -- " + palindrome);

    }

    public static String reverseString(String s) {
        StringBuilder temp = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            temp.append(s.charAt(i));
        }
        return temp.toString();
    }
}
