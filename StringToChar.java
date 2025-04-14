public class StringToChar {
    //public class StringToChar {

        public static char[] getCharArray(String input) {
            //input=input.toCharArray();
            return input.toCharArray();
        }

        public static void main(String[] args) {
            String myString = "Hello";
            char[] charArray = getCharArray(myString);

            // Print the char array
            for (int i=0; i<=charArray.length-1;i++){
                char c=charArray[i];
            //for (char c : charArray) {
                System.out.print(c + " ");
            }
            System.out.println(); // Newline for clarity

            // Example: Accessing a specific character
            System.out.println("First character: " + charArray[0]);

            // Example: Converting back to a String
            String convertedString = new String(charArray);
            System.out.println("Converted string: " + convertedString);
        }
    }

