class Program
{
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("Hello");
		StringBuffer sb2 = new StringBuffer("Hello");

		int h1=sb1.hashCode();
		int h2=sb2.hashCode();

		System.out.println("h1 = "+h1);
		System.out.println("h2 = "+h2);

		System.out.println(sb2);

		Boolean b1=sb1.equals(sb2);
		System.out.println("b1 = "+b1);
	}
}