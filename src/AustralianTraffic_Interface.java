
public class AustralianTraffic_Interface implements CentralTraffic_Interface,Continental_Interface {
	
	public static void main(String[] args) {
		
		CentralTraffic_Interface ct=new AustralianTraffic_Interface();
		Continental_Interface ci=new AustralianTraffic_Interface();
		
		ct.green();
		ct.red();
		ci.blue();
		
	}

	@Override
	public void blue() {
		System.out.println("Please fly");
		
	}

	@Override
	public void green() {
		System.out.println("Please GO");
		
	}

	@Override
	public void red() {
		System.out.println("Please Stop");
		
	}

}
