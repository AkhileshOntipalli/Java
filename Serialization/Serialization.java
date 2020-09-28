import java.io.*;
class Employee implements Serializable{
	String name;
	int age;
	public Employee(String name,int age){
		this.name = name;
		this.age = age;
	}
}
class Serialization {
	public static void main(String[] args) throws ClassNotFoundException {
		Employee e1 = new Employee("Akhil",23);
		File f1 = null;
		FileWriter fw = null;
		FileOutputStream fout = null;
		ObjectOutputStream out = null;
		
			try{
			f1 = new File("F:\\Java File/File1.txt");
			f1.createNewFile();
			System.out.println("File Created");
			fw = new FileWriter(f1);
			fw.write("This Is file Handling class");
			fw.flush();
			System.out.println("Wriiten into File");
			fout = new FileOutputStream(f1);
			out = new ObjectOutputStream(fout);
			out.writeObject(e1);
		}
		catch(IOException e){
			e.printStackTrace();
		}
		finally{
			try{
				
				if (fw!=null) {
					fw.close();
				}
				if(fout!=null){
					fw.close();
				}
				if(out!=null){
					out.close();
				}

			}
			catch(IOException ie){
				ie.printStackTrace();
			}
		}
		
		
		
		
	}
}