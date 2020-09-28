class Attachment{
	String filename;
	int filesize;
	String filetype;
public Attachment(String filename,int filesize,String filetype){
		this.filename = filename;
		this.filesize = filesize;
		this.filetype = filetype;
}
public void showFileDetails(){
	System.out.println("File Name : "+filename);
	System.out.println("File Size : "+filesize+" kb");
	System.out.println("File Type : "+filetype);
}
}
class Email{
	 Attachment a1 = new Attachment("Resume",2,"pdf");
	  String sender;
	  String subject;
	  String message;
	public  Email(String sender,String subject,String message){
		this.sender  = sender;
		this.subject = subject;
		this.message = message;
	}
	public  void openEmail(){
		System.out.println("Sender  : "+sender);
		System.out.println("Subject : "+subject);
		System.out.println("Message : "+message);
	}
}
class Aggregation{
	public static void main(String[] args) {
		Email e1 = new Email("ontipalliakhilesh@gmail.com","Resume","For the post of java Developer");
		e1.openEmail();
		e1.a1.showFileDetails();
		
	}
}