import java.util.*;
import java.io.*;
class PropertieRead{
	public static void readProperty(){
		String path = "F:\\Java File/DB.prop";
		Properties p1 = new Properties();
		try{
			FileInputStream fin = new FileInputStream(path);
			p1.load(fin);
			String username = p1.getProperty("UserName");
			String password = p1.getProperty("PassWord");
			System.out.println(username);
			System.out.println(password);
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		System.out.println("Program Starts");
		readProperty();
		System.out.println("Program Ends");
	}
}