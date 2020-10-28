import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class anagramsRunner {
	
	public String out;
	
	public void run() throws Exception
	{
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
		recur(word, max, dictionary);
	}
	
	public void recur(String word, int max, ArrayList<String> dic)
	{
		
	}
	
	//Start game
	public static void main(String[] args) throws Exception
	{				
		new anagramsRunner().run();
	}	

}
