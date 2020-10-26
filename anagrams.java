import java.util.*;

public class anagrams {
	
	private ArrayList<String> dict;
	private ArrayList<String> output;
	private String word;
	private int max;
	
	public anagrams(ArrayList<String> d, String w, int m)
	{
		dict = new ArrayList<String>(d);
		output = new ArrayList<String>();
		word = w;
		max = m;
	}
	
	public void solve()
	{
		//Add shit here
	}
	
	public ArrayList<String> getOutput()
	{
		return output;
	}
}
