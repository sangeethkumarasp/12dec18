package sangeethjava;

import java.util.HashSet;
import java.util.Set;

public class Strdupp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String sa="sangeeth";

char[]cd=sa.toCharArray();

Set<Character>de=new HashSet<Character>();


for(char cr:cd)


{
if(	de.add(cr)==true)
{
	System.out.println("no duplicate values");
}else
{
	System.out.println("duplicate values foudS");
}
	
}
	}

}
