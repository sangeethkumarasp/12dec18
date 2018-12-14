package sangeethjava;

import java.util.Comparator;

public class Namecomparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Studentcomparator s1=(Studentcomparator) o1;
		Studentcomparator s2=(Studentcomparator) o2;
		
		
		return s1.name.compareTo(s2.name);
	}

}
