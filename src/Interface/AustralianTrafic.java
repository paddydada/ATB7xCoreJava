package Interface;

public class AustralianTrafic implements CentralTraffic, ContinentalTraffic {

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println(" greenGo implementation");

	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println(" redstop implementation");
	}

	@Override
	public void FlashYellow() {
		// TODO Auto-generated method stub
		System.out.println(" FlashYellow implementation");
	}

	public static void main(String[] args) {
		CentralTraffic a = new AustralianTrafic();

		a.FlashYellow();
		a.greenGo();
		a.redStop();
		AustralianTrafic at = new AustralianTrafic();
		ContinentalTraffic ct = new AustralianTrafic();
		at.walkonsymbol();
		ct.Trainsymbol();

	}

	public void walkonsymbol() {
		System.out.println("walking");
	}

	@Override
	public void Trainsymbol() {
		// TODO Auto-generated method stub

	}

}
