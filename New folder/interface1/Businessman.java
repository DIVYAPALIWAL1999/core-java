package in.co.interface1;

public class Businessman implements Richman,SocialWorker{
	

	@Override
	public void helpToOthers() {
		System.out.println(" Help to others");
		
	}

	@Override
	public void earnMoney() {
		System.out.println("Earnmoney");
		
	}

	@Override
	public void donation() {
		System.out.println("Donation");
		
	}

	@Override
	public void party() {
		System.out.println("Party");
		
	}
	public static void main(String[] args) {
		SocialWorker  s=new Businessman();
		s.helpToOthers();
		
		Richman r = new Businessman();
		r.earnMoney();
		r.donation();
		r.party();
		
	}
	

}
