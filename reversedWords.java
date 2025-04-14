import  java.util.*;

public class reversedWords {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
         String Words="this army ok";
         String output=" ";
    String spiltWords[]=Words.split(" ");
  //  for(String words:spiltWords){
    String revWords= " ";

    for(String word:spiltWords){
        for( int j=word.length()-1;j>=0; j--){
           revWords=revWords + word.charAt(j);

        }
        revWords= revWords+ " ";


    }
        System.out.println(revWords);

//    for(int j=spiltWords.length-1;j>=0; j--){
//        revWords=revWords+ spiltWords[j];
//
//       // revWords=revWords+words.charAt(j);
//      //  System.out.println(revWords);
//    }
//        System.out.println(revWords);
   // output=output+revWords;
   // }
    }
}