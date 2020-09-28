import java.io.*;
class CreatingFolder{
	public static void main(String[] args) {
		File f1 = new File("F:\\JavaFile2");
		if(f1.exists()==false){
			f1.mkdir();
			System.out.println("File Created");
		}
		else
			System.out.println("Folder is already Created");
	}
}