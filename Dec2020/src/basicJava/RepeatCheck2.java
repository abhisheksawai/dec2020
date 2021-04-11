package basicJava;

public class RepeatCheck2 {
	
	public static String lcp(String str){
		
		if (str.length() == 1)
			{
				return "-1";
			}

			String substring = "";
			String result = "";
			int current = 0;

			// Loop to traverse input string and compare substring
			while (current < str.length() / 2)
			{
				boolean valid = true; // signal checking if the substring can complete the input string after repetitions
				substring += str[current]; // With each iteration the substring to check will increase

				for (int x = current + 1; x < (str.length()-1); x+=substring.length())
				{
					// condition comparing the current substring to substring in our input string
					// If is not equal than this current substring is invalid
					if (substring != str.substring(x, substring.length()))
					{
						valid = false;
						break;
					}
				}

				// Will update the largest substring that is valid
				if (valid && substring.length() > result.length())
				{
					result = substring;
				}

				current++;
			}

			if (result.length() >= 1)
			{
				return result;
			}
			else
			{
				return "-1";
			}
		}
		
	  
	public static void main(String[] args) {
		
		String str = "abcasdadabc";  
        String lrs="";  
        int n = str.length();  
        for(int i = 0; i < n; i++){  
            for(int j = i+1; j < n; j++){  
                //Checks for the largest common factors in every substring  
                String x = lcp(str);  
                //If the current prefix is greater than previous one  
                //then it takes the current one as longest repeating sequence  
                if(x.length() > lrs.length()) lrs=x;  
            }  
        }  
        System.out.println("Longest repeating sequence: "+lrs);  
    }  
		
	}


