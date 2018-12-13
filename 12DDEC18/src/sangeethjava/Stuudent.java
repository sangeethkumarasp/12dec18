package sangeethjava;

public class Stuudent implements Comparable<Stuudent> {
	int id;
	String name;
	int age;
	
public	 Stuudent(int id,String name,int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
		
	}
	
//to sort based on integer

	//@Override
	/*public int compareTo(Stuudent k) {
		// TODO Auto-generated method stub
		
		if(age==k.age)
		return 0;
		else if(age>k.age)
			return 1;
		else 
		return -1;
		
	}*/
//to sort based on string
public int compareTo(Stuudent ki)
{
	return name.compareTo(ki.name);
	
}
}
