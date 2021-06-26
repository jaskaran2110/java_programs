import java.util.Scanner;

public class Jaskaran_2015171_2
 {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a sentence : ");

		String s = input.nextLine();
		s = s.trim();       s = s.toUpperCase();

        if(s.charAt(s.length() - 1) != '.' && s.charAt(s.length() - 1) != '?' && s.charAt(s.length() - 1) != '!'){
            System.out.println("Wrong input");
        }
        else{
        	WordExample sent = new WordExample(s);
    		sent.countWord();
    		sent.placeWord();
        }

        input.close();
	}
}

class  WordExample
{
	private String strdata;
	WordExample(String s) {
		strdata = s;
	}
	public static boolean isVowel(char ch){
        if(ch == 'A' || ch == 'O' || ch == 'I' || ch == 'I' || ch == 'U'){
            return true;
        }
        else{
            return false;
        }
    }
	boolean checkWord(String s){
        if(isVowel(s.charAt(0)) && isVowel(s.charAt(s.length() - 1)))
        {
            return true;
        }
        return false;
    }
	void countWord(){
		int counter = 0;
		String word = new String();
        for(int i = 0; i < strdata.length(); i++){
            char ch = strdata.charAt(i);
            if(ch == ' ' || ch == '.' || ch == '?' || ch == '!'){
                if(word.length() > 0 && checkWord(word)){
                    counter++;
                }
                word = new String();				
            }
            else{
                word = word + ch;
            }
        }
        System.out.println("Number of words beginning and ending with a vowel : " + counter);
	}

	void placeWord(){
		int len = strdata.length();
		String word = new String();
		String vowels_word = new String();
        String not_vowels = new String();
        for(int i = 0; i < len; i++){
            char ch = strdata.charAt(i);
            if(ch == ' ' || ch == '.' || ch == '?' || ch == '!'){
                if(word.length() > 0 && checkWord(word)){
                	vowels_word = vowels_word + word + " ";
                }
                else{
                	not_vowels = not_vowels + word + " ";
                }
                word = new String();
            }
            else{
                word = word + ch;
            }
        }
        System.out.println("New Sentence : " + vowels_word + not_vowels);
	}
}