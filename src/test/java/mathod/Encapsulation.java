package method;

public class Encapsulation {

	public static void main(String[] args) {
		
		gAtter ga=new gAtter();
		ga.setAcc_no(100);
		ga.setName("sabina");
		ga.setAmount(12.6);
		int  a=ga.getAcc_no();
		String b=ga.getName();
		double c=ga.getAmount();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}

}
