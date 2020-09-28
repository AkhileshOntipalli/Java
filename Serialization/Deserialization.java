import java.io.*;
class Employee implements Serializable{
	String name;
	int age;
	public Employee(String name,int age){
		super();
		this.name = name;
		this.age = age;
	}
}
class Deserialization{
	public static void main(String[] args) throws ClassNotFoundException {
		File f1 = new File("F:\\Java File/File1.txt");
		try{
			FileInputStream fin = new FileInputStream(f1);
			ObjectInputStream in = new ObjectInputStream(fin);
			Object ob = in.readObject();
			Employee e1 = (Employee)ob;
			System.out.println(e1.name);
			System.out.println(e1.age);
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
	}
}