import java.io.FileWriter;
import java.io.IOException;
public class Mainclass3 {
public static void main(String[] args) {
String path = "F:\\JavaFile2/File1.txt";
FileWriter fw=null;
try {
fw = new FileWriter(path);
fw.write("this is file handling classes");
fw.flush(); // without this method file is not write inside a file
System.out.println("writing data completed....");
}
catch (IOException e) {
System.out.println("error in writing data to file ");
e.printStackTrace();
}
finally //these blocks executed even exception is occured or not
{ //used to execute the code irrespective of occurance of exception
try {
fw.close();
}
catch (IOException e)
{
e.printStackTrace();
}
}}}