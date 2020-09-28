import java.io.*;
class CreatingFile{
	public static void main(String[] args) {
		File f4 = new File("F:\\JavaFile2/File1.txt");
		if(f4.exists()==false){
			try{
				f4.createNewFile();
			System.out.println("File Created");
			}
			catch(IOException ie){
				ie.printStackTrace();
			}
		}
		else
			System.out.println("File already Created");
	}
}