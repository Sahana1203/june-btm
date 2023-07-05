class Flowers
{
	String name;
	double price;
	String type;
	boolean takeaway;

	Flowers(String name)
	{
		System.out.println("Running Flowers");
		this.name=name;
	}
	Flowers(String name,double price)
	{
		System.out.println("Running Flowers");
		this.name=name;
		this.price=price;
	}
	Flowers(String name,double price,String type)
	{
		System.out.println("Running Flowers");
		this.name=name;
		this.price=price;
		this.type=type;
	}
	Flowers(String name,double price,String type,boolean takeaway)
	{
		System.out.println("Running Flowers");
		this.name=name;
		this.price=price;
		this.type=type;
		this.takeaway=takeaway;
	}

}