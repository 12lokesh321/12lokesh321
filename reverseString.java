public class reverseString {
  //  public class StringReverser {

        // Instance method (non-static)
        public String reversString(String input) {
            String reversed = "";

            // Loop through the string backwards
            for (int i = input.length() - 1; i >= 0; i--) {
                reversed += input.charAt(i);
            }

            return reversed;
        }

        public static void main(String[] args) {
            // Create an object (non-static context)
            reverseString reverser = new reverseString();

            String original = "hello";
            String reversed = reverser.reversString(original);

            System.out.println("Original: " + original);
            System.out.println("Reversed: " + reversed);
        }
    }


