import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class anagramsRunner {

	public static void main(String[] args) throws FileNotFoundException {
		
		System.out.println("Anagrams- A Project by Chris and Sean");
		
		//Begin file input
		Scanner file = new Scanner(new File("dictionary.txt"));
		ArrayList<String> dictionary = new ArrayList<String>();
		while(file.hasNext()) 
		{
			dictionary.add(file.next().toLowerCase());
		}
		
		//Begin user input
		Scanner ui = new Scanner(System.in);
		System.out.println("What is your word?");
		String word = ui.next();
		System.out.println("What is the maximum words to include?");
		int max = ui.nextInt();
		
		//Start game
		anagrams anagram = new anagrams(dictionary, word, max);
		anagram.solve();
		System.out.println(anagram.getOutput());
	}

}
