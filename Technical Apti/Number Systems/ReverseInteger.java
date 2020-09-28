class ReverseInteger{
		public static void main(String[] args) {
				int number = 1001;
				int remainder,output=0;
				while (number!=0) {
					remainder = number%10;
					output = (output*10)+remainder;
					number=number/10;
				}
				System.out.println(number>output?number:output); 
			}	
}