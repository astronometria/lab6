package Lab6_Exercise2;

public class BusinessPhone extends Phone {
	protected int extension;

	public BusinessPhone(int areaCode, int digit, int extension) {
		super(areaCode, digit);
		this.extension = extension;
	}
	public long asDigit() {
		
	return super.asDigit()*1000 + extension;	
	}
	
	public String asString() {

		return super.asString() +"-"+ extension;
		
	}
	

}
