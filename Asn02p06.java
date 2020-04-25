import java.io.*;
import java.util.Scanner;
public class Asn02p06 
{
	static long length(long len) 
	{
		int count = 0;
        while (len != 0) 
        {
        	len = len / 10;
            count++;
        }
        return count;
	}
	public static void mul(long x,long y)
	{
		long len1 = length(x);
        	long len2 = length(y);
        	long maxi = Math.max(len1, len2);
       		 maxi = (maxi / 2) + (maxi % 2);
        	long power = (long) Math.pow(10, maxi);
       		long b = x / power;
        	long a = x % power;
        	long d = y / power;
        	long c = y % power;
        	long exp1 = a * c;
        	long exp2 = b * d;
        	long exp3 = (a + b) * (c + d);
        	long exp4 = exp3 - exp1 - exp2;
        	long exp5 = exp1 + (exp4 * power) + (exp2 * (long) (Math.pow(10, 2 * maxi)));
        	System.out.println("Result of multiplication=" + exp5);
	}
	public static void main(String[] args) throws IOException
	{
		long x, y;
        	long[] arr = new long[2];
        	Scanner Sc = new Scanner(new File(args[0]));
        	int i = 0;
        	String line;
        	BufferedReader in=new BufferedReader(new FileReader(args[0]));
        	if((line=in.readLine())==null) 
        	{
        		System.out.println("File does not contain data,Error in opening file");
        		System.exit(0);
        	}
        	while(Sc.hasNextLong())
        	{
			arr[i++] = Sc.nextLong();
        	}
        	x = arr[0];
            	y = arr[1];
            	mul(x,y);
	}
}