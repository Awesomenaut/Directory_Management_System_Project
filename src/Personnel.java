import java.util.*;
public class Personnel {

	private ArrayList<Person> personList;

	public ArrayList<Person> getPersonList(){
		return personList;
	}

	public Personnel() {
	   personList = new ArrayList<Person>();
	}

	public void addPersonnel(Person p)
	{
		personList.add(p);
	}


}