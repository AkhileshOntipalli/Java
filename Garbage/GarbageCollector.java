class Student{
	String name ="Akhilesh";
	int id = 294;
	@Override
	protected void finalize(){
		System.out.println("Object Removed");
	}
}
class GarbageCollector{
	public static void main(String[] args) {
		Student s1 =  new Student();
		System.out.println(s1.name+" "+s1.id);
		s1 = null;
		System.gc();
		System.out.println(s1.name+" "+s1.id);
		for (int i=1;i<5;i++ ) {
			System.out.println(i);
		}
	}
}