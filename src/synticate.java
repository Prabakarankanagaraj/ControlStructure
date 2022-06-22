
public class synticate extends Bank {
	int rateofinterest() {
		return 10;
		
	}
	public static void main(String[] args) {
		Bank get=new synticate();
		System.out.println(get.rateofinterest());
		System.out.println("synticate interest is :"+get.rateofinterest());
		
	}

}
