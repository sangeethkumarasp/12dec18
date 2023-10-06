package sangeethjava;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int temp;
		int n1=0;
		int n2=1;
		
		for(int i=0;i<20;i++)
		{
			temp=n1+n2;
			System.out.println(temp);
			n1=n2;
			n2=temp;
		}

	}

}
