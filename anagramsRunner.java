import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;
public class anagramsRunner {
	
	public String out;
	
	public void run() throws Exception
	{
		System.out.println("Anagrams- A Project by Chris and Sean");
		out="";
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
		ArrayList<String> letters = new ArrayList<String>();
		for(int i=0;i<word.length();i++)
			if(!word.substring(i).equals(" "))
				letters.add(word.substring(i));
		recur(letters, dictionary);
	}
	
	public void recur(ArrayList<String> l, ArrayList<String> dic)//add max
	{
		ArrayList<String> let=l;
		boolean check=true;
		if(l.size()!=0&&dic.size()!=0)
		{
			ListIterator<String> i=dic.listIterator();
			while(i.hasNext())
			{
				String word=i.next();
				for(int j=0;j<word.length();j++)
				{
					if(l.indexOf(word.substring(j))==-1)
					{
						check=false;
						i.remove();
					}
				}
				if(check)
				{
					for(int j=0;j<word.length();j++)
					{
						let.remove(let.indexOf(word.substring(j)));
					}
					out=out+word;
					recur(let, dic);
				}
			}
		}
	}
	
	//Start game
	public static void main(String[] args) throws Exception
	{				
		new anagramsRunner().run();
	}	

}
