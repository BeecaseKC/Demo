import java.util.HashSet;
import java.util.Set;

public class Assignment3 {
	public static void main(String[] args) {
	generatePerm("apple");
	/*for(String s: result){
		System.out.println(s);
	}*/
	}
	public static Set<String> generatePerm(String input)
	{
	    Set<String> set = new HashSet<String>();
	    if (input == "")
	        return set;

	    char a = input.charAt(0);

	    if (input.length() > 1)
	    {
	        input = input.substring(1);
System.out.println(input);
	        Set<String> permSet = generatePerm(input);
	        for(String b : permSet)
	        	System.out.println(b);
	        	

	        for (String x : permSet)
	        {
	            for (int i = 0; i <= x.length(); i++)
	            {
	                set.add(x.substring(0, i) + a + x.substring(i));
	                System.out.println(set);
	            }
	            
	        }
	    }
	    else
	    {
	        set.add(a + "");
	    }
	    return set;
	}

}
