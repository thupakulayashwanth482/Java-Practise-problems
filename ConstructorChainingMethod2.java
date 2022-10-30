// Java program to illustrate Constructor Chaining to
// other class using super() keyword
class ConstructorChainingMethod2
{
	String name;

	// constructor 1
	ConstructorChainingMethod2()
	{
		this("");
		System.out.println("No-argument constructor of" +
										" base class");
	}

	// constructor 2
	ConstructorChainingMethod2(String name)
	{
		this.name = name;
		System.out.println("Calling parameterized constructor"
											+ " of base");
	}
}

class Derived extends ConstructorChainingMethod2
{
	// constructor 3
	Derived()
	{
		System.out.println("No-argument constructor " +
						"of derived");
	}

	// parameterized constructor 4
	Derived(String name)
	{
		// invokes base class constructor 2
		super(name);
		System.out.println("Calling parameterized " +
						"constructor of derived");
	}

	public static void main(String args[])
	{
		// calls parameterized constructor 4
		Derived obj = new Derived("yashwanth");

		// Calls No-argument constructor
		// Derived obj = new Derived();
	}
}

