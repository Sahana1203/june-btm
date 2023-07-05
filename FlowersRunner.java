class FlowersRunner
{
	public static void main(String[] args)
	{
		System.out.println("running Flowers main");

		Flowers ref=new Flowers("Lilies");
		System.out.println("name is:"+ref.name);
		System.out.println("price is"+ref.price);
		System.out.println("type is"+ref.type);
		System.out.println("takeaway is"+ref.takeaway);

		Flowers ref1=new Flowers("Lilies",500);
		System.out.println("name is:"+ref1.name);
		System.out.println("price is"+ref1.price);
		System.out.println("type is"+ref1.type);
		System.out.println("takeaway is"+ref1.takeaway);

		Flowers ref2=new Flowers("Lilies",500,"rum");
		System.out.println("name is:"+ref2.name);
		System.out.println("price is"+ref2.price);
		System.out.println("type is"+ref2.type);
		System.out.println("takeaway is"+ref2.takeaway);

		Flowers ref3=new Flowers("Lilies",500,"rum",true);
		System.out.println("name is:"+ref3.name);
		System.out.println("price is"+ref3.price);
		System.out.println("type is"+ref3.type);
		System.out.println("takeaway is"+ref3.takeaway);
	}
}