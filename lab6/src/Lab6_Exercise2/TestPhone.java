package Lab6_Exercise2;

public class TestPhone {

	public static void main(String[] args) {

//		Phone myPhone1 = new Phone(514 , 5555555);
//		Phone myPhone2 = new Phone(514 , 5555555);
//		Phone myPhone3 = new Phone(438 , 1234567);
//		System.out.println(myPhone1.asDigit());
//		System.out.println(myPhone1.asString());
//		
//		System.out.println(myPhone1.equals(myPhone2));
//		System.out.println(myPhone1.equals(myPhone3));
		Phone myBusPhone1 = new BusinessPhone(514 , 5555555, 111);
		System.out.println(myBusPhone1.asDigit());
		System.out.println(myBusPhone1.asString());
	}

}
