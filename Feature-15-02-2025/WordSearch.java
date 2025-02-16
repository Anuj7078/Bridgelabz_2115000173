import java.util.Scanner;
public class WordSearch{
    public static String searchSentence(String[] sentences,String word){
        for(String sentence:sentences){
            if(sentence.toLowerCase().contains(word.toLowerCase())){ 
                return sentence;
            }
        }
        return "Not Found";
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] sentences={"Anuj is a smart boy.",
            "Anuj is a top-level coder.",
            "Anuj has 5-6 true friends.",
            "Anuj loves to eat and try new things.",
            "Anuj is ambitious."};
        System.out.print("Enter the word to search: ");
        String word = sc.nextLine();
        String result = searchSentence(sentences, word);
        System.out.println("Result: " + result);
        sc.close();
    }
}