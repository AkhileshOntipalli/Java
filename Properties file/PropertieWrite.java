import java.io.*;
import java.util.*;
class PropertieWrite{
	public static void createProperty(){
		Properties p1 = new Properties();
		String path = "F:\\Java File/DB.prop";
		p1.setProperty("UserName","Akhilesh");
		p1.setProperty("PassWord","1234");
		FileOutputStream fout;
		try{
			fout = new FileOutputStream(path); 
			p1.store(fout,"My Details");
			System.out.println("Properties File Created");
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		System.out.println("Program Starts");
		createProperty();
		System.out.println("Program Ends");
	}
}