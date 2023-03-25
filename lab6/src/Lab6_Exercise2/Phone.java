package Lab6_Exercise2;

public class Phone {
	protected int areaCode;
	protected int digit;
	
	//renvoie l'indicatif régional et le numéro sous la forme d'une séquence de 10 chiffres (une valeur de type Long).
	public long asDigit() {
		
		 long number;
		 number = areaCode * 10000000L;
		 number = number + digit;
		 return number;
	}
	
	//renvoie l'indicatif régional, le trait d'union, les trois premiers chiffres du numéro, le trait d'union, et les quatre derniers chiffres du numéro
	public String asString() {
//		String stringArea  = areaCode+"";
		int stringDigit3 = digit/10000;
		int stringDigitLast = digit%10000;
		String stringFullNumber = areaCode + "-" + stringDigit3 + "-" + stringDigitLast ;
		return stringFullNumber;
		
	}
	
	public boolean equals (Phone numberPhone) {
		if(this.asDigit() == numberPhone.asDigit())
			return true;
		return false;
		
	}
//
	public Phone(int areaCode, int digit) {
	
		this.areaCode = areaCode;
		this.digit = digit;
	}

	@Override
	public String toString() {
		return "Phone [areaCode=" + areaCode + ", digit=" + digit + "]";
	}
	

}
