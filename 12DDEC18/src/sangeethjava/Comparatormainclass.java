package sangeethjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Comparatormainclass {

	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ls=new ArrayList();
		ls.add(new Studentcomparator(14,"sangeth",25));
		ls.add(new Studentcomparator(07,"rangeth",25));
		ls.add(new Studentcomparator(141,"angeth",25));
		ls.add(new Studentcomparator(214,"th",25));
		ls.add(new Studentcomparator(914,"eth",25));
		ls.add(new Studentcomparator(714,"Geth",75));
		
		Collections.sort(ls,new Namecomparator());
		
		
		Iterator it=ls.iterator();
		while(it.hasNext())
		{
			Studentcomparator se =(Studentcomparator)it.next();
			System.out.println(se.age+ " "+se.id+" "+se.name);
		}
		
		
		
		
	}

}
