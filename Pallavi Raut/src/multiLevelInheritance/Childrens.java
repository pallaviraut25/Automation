package multiLevelInheritance;

public class Childrens extends Parents {

	int age2 = 25;

	public void childrensname() {

		System.out.println("Vaishnavi Raut");

		System.out.println("Pallavi Raut");

	}

	public static void main(String[] args) {

		Childrens r = new Childrens();

		System.out.println(r.age);
		r.grandparentsname();
		System.out.println(r.age1);
		r.parentsname();
		System.out.println(r.age2);
		r.childrensname();

	}

}
