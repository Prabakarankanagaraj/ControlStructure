
public class canara extends BBank{
	int rateofinterest()
	{
		return 18;
	}
	public static void main(String[] args) {
		
		BBank get=new BBank();
		get.rateofinterest();
		System.out.println("BBank bank :"+get.rateofinterest());
		BBank set=new HHdfc();
		System.out.println("HHdfc Bank :"+set.rateofinterest());
		BBank obj=new axis();
		System.out.println("axis Bank:"+obj.rateofinterest());
		
	}

}

