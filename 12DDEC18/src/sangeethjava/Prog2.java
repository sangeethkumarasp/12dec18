package sangeethjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Prog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Stuudent>li=new ArrayList<Stuudent>();
		li.add(new Stuudent(10,"sangeeth",14));
		li.add(new Stuudent(40,"ramesh",05));
		li.add(new Stuudent(30,"raju",13));
		li.add(new Stuudent(80,"kaju",141));
		li.add(new Stuudent(70,"teju",124));
		li.add(new Stuudent(780,"ara",134));
		li.add(new Stuudent(1450,"bora",144));
		li.add(new Stuudent(1560,"zaer",184));
		li.add(new Stuudent(1890,"tURA",194));
		Collections.sort(li);
		for(Stuudent se:li)
		{
			System.out.println(se.id+" "+se.name+""+se.age);
		}

	}

}
