package ENUM;

public class Test {
	
	public static void main(String[] args) {
		Person[] persons = new Person[4];
		persons[0]= new Person();
		persons[1]= new Person();
		persons[2]= new Person();
		persons[3]= new Person();
		Person myPerson = null;
		Person myPerson2 = new Person();
		final Person[] persons2 = {persons[2], myPerson, myPerson2};
	}

}
