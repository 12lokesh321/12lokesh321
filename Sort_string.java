public class Sort_string {
    public static void main( String[] args) {
        String str = "abzxcklmo";
        char temp;
        char strArray[] = str.toCharArray();
        //char tempArray[]=str.toCharArray();
        for(int i=0;i<strArray.length;i++){
           // System.out.print(strArray[i]+ " ");

            for(int j=i+1; j<strArray.length;j++) {
                if (strArray[i] > strArray[j]) {
                    temp = strArray[i];
                    strArray[i] = strArray[j];
                    strArray[j] = temp;
                }
            }
        }
 System.out.println(new String(strArray));
    }
}
