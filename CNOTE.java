/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main(String[] args)throws IOException {
	    
	    try{
	    
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int PoetrySize = sc.nextInt();
            int currentPagesLeft = sc.nextInt();
            int budget = sc.nextInt();
            int numberOfNoteBooks = sc.nextInt();

            int [] pages = new int[numberOfNoteBooks];
            int [] price = new int[numberOfNoteBooks];

            for(int i=0; i<numberOfNoteBooks; i++){
                pages[i] = sc.nextInt();
                price[i] = sc.nextInt();
            }

            if(PoetrySize <= currentPagesLeft){
                System.out.println("LuckyChef");
                break;
            }

            String res = "UnluckyChef";

            int pagesRequired = PoetrySize - currentPagesLeft;

            for(int i=0; i<numberOfNoteBooks; i++){
                if(pages[i] >= pagesRequired && price[i] <= budget){
                    res= "LuckyChef";
                    break;
                }
            }

            System.out.println(res);
        }
	    }
	    catch(Exception e){
	        return;
	    }
    }
}
