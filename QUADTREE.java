import java.util.Scanner;

public class QUADTREE {
	static int iter;

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n;
		
		n = sc.nextInt();
		
		int i;
		
		for(i = 0; i < n; i++)
		{
			String s, result;
			
			s = sc.next();
			
			iter = -1;
			
			result = reverse_Q_tree(s);
			
			System.out.println(result);
		}
		
	}
	
	public static String reverse_Q_tree(String s)
	{
		String s1, s2, s3, s4;
		
		iter++;
		
		if(s.charAt(iter) == 'b')
		{
			return "b";
		}
		
		else if(s.charAt(iter) == 'w')
		{
			return "w";
		}
		
		else
		{
			s1 = reverse_Q_tree(s);
			s2 = reverse_Q_tree(s);
			s3 = reverse_Q_tree(s);
			s4 =reverse_Q_tree(s);
		}
		
		return "x"+s3+s4+s1+s2;
	}
}
