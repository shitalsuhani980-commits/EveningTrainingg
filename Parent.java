class Parent
{
    void print()
	{
	    System.out.println("parent child");
	}
}
class Subclass1 extends Parent
{
    void print()
	{
	    System.out.println("Subclass1");
	}
}
class Subclass2 extends Parent 
{
    void print()
	{
	    System.out.println("Subclass2");
	}
}
class TestPolymorphism
{
    public static void main(String args[])
	{
	    Parent a;
		a= new Subclass1();
		a.print();
		a= new Subclass2();
		a.print();
	}
}