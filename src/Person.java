public class Person {
	private String last;
	private String first;
	private String middle;

	public String getFirst() {
		return first;
	}
	public String setMiddle(String first) {
		return middle;
	}
	public String getLast() {
		return last;
	}


	public Person(String last, String first, String middle) {
		this.last = last;
		this.first = first;
		this.middle = middle;

	}


	public void printName(int order)
	{

	   if(order == 0)
	   {
	      printFirst();printMiddle();printLast();System.out.println("");

	   }else if(order == 1)
	       {
			   printLast();printMiddle();printFirst();System.out.println("");
	       }
	       else if(order == 2)
		   	       {
						  printLast();printFirst();printMiddle();System.out.println("");
	       }
	}

	public void printFirst(){
		System.out.print(first + " ");
	}
	public void printMiddle(){
		System.out.print(middle + " ");
	}
	public void printLast(){
		System.out.print(last + " ");
	}


}
