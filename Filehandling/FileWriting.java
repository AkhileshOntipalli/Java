import java.io.*;
class FileWriting{
	public static void main(String[] args) {
		FileWriter fw = null;
		String path = "F:\\Java File/File1.txt";
		try{
			fw = new FileWriter(path);
			fw.write("This is file Writing Class");
			fw.flush();
			System.out.println("Writing data completed");
		}
		catch(IOException ie){
			System.out.println("Error Writing Data in File");
			ie.printStackTrace();
		}
		finally{
			try{
				fw.close();
			}
			catch(IOException ie){
				ie.printStackTrace();
			}
		}
	}
}