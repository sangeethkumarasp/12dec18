package sangeethjava;

public class Strduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s="sangeeth is sangeeth";
		String k[]=s.split(" ");
		
		for(int i=0;i<k.length;i++)
		{
			for(int j=i+1;j<k.length;j++)
			{
				if(k[i].equals (k[j]))
				{
					System.out.println(k[i]);
				}
			}
		}

	}

}
