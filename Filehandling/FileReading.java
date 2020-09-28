import java.io.*;
class FileReading{
	public static void main(String[] args) {
		String path = "F:\\Java File/File1.txt";
		File f1 = new File(path);
		FileReader fr = null;
		try{
			fr = new FileReader(path);
			int size  = (int)f1.length();
			char[] c1 = new char[size];
			fr.read(c1);
			System.out.println("Reading File Completed");
		}
		catch(IOException ie){
			System.out.println("Error in Reading File");
			ie.printStackTrace();
		}
		finally{
			try{
				fr.close();
			}
			catch(IOException ie){
				ie.printStackTrace();
			}
		}
	}
}