import java.util.*;
class Frequency{
  public static void main(String[] args) {
  	String s1 = "SATYA DURGA AKHILESH";
  	int [] a1 = new int[s1.length()];
  	char[] c1 = s1.toCharArray();
  	for (int i=0;i<c1.length;i++ ) {
  		a1[i]=1;
  		for (int j=i+1;j<c1.length;j++) {
  			if (c1[i]==c1[j] ) {
  				a1[i]++;
  				c1[j]='0';
  			}
  		}
  	}
  	for (int i=0;i<a1.length;i++ ) {
  		if (c1[i]!=' '&& c1[i]!='0') {
  			System.out.println(c1[i]+" "+a1[i]);
  		}
  	}
  }
}