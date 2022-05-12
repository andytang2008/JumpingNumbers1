import java.util.Stack;
import java.util.*;

class ljn //Largest jumping numbers
{
	static int print_sieve(ArrayList<Integer> result, int x)
		{
			int i,temp,digit;
			int check;
			
			ArrayList<Integer> localResult=result;
			
			for(i = 0; i <= x; i++)
			{
				if(i < 10)
				{
					//document.write(i," ");
					localResult.add(i);
					continue;
				}
				check = 1;
				temp = i;
				digit = temp % 10;
				temp = (int)Math.floor(temp / 10);
				while(temp!=0) //the resutls of while cycle is to go throught digit by digit for largenumber
					{
						
						System.out.print("i="+i+"   digit="+digit+"   temp="+temp);
						
						if(Math.abs(digit - temp % 10) != 1)
						{
							//System.out.println();
							System.out.print("  (Math.abs(digit-temp%10)="+" (Math.abs("+digit+" - "+temp+" % 10)="+(Math.abs(digit - temp % 10)));
							System.out.println();
							
							check = 0;
							break;
						}else
						{
							//System.out.println();
							System.out.print("   (Math.abs(digit - temp % 10)="+" (Math.abs("+digit+" - "+temp+" % 10)="+(Math.abs(digit - temp % 10)));
							System.out.println();
						}
							System.out.println();
						digit = temp % 10;  //go through to next digit
						temp = (int)Math.floor(temp / 10);
					}
				if(check!=0)
					localResult.add(i);
					//document.write(i," ");

					
			}
			System.out.println("The results = "+Arrays.toString(localResult.toArray()));  //Attention: arraylist is not array.
			for(int k = 0; k < localResult.size(); k++) {   //the alternative way to print the arraylist
					System.out.print(localResult.get(k)+"  ");
				}  
			
			return 0; 
		}
		
    public static void main(String[] args)
    {
		ArrayList<Integer> result = new ArrayList<Integer>();
			int x = 135;
			print_sieve(result, x);
    }


}