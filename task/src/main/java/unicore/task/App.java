package unicore.task;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        
    	int r=0;
        String input;
        final String str1 = "Zadajte cislo od 1-9 a stlacte Enter";
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    	System.out.println(str1);

        try{
            input = br.readLine();
            r = Integer.parseInt(input);
            if(String.valueOf(r).length()>1) {
            	throw new Exception("Cislo nie je v rozsahu 1-9");
            }	

        	for(int i = 999; i > 110; i-- ) {
        		if(String.valueOf(i).contains("0")||String.valueOf(i).contains("2")||
        				String.valueOf(i).contains("3")||String.valueOf(i).contains("6")) {        			
        		} else if (i%r == 0) {
        			System.out.println(i);
        		}

        	}
        }
        catch(Exception e){      	
        	System.out.println("Chyba!");
        	System.out.println(e.getLocalizedMessage());
        	System.out.println("Nebolo zadane cislo 1-9");   
        	
        } 
    	
    }
}
