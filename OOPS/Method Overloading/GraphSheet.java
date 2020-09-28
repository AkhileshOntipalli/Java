class GraphSheet{
	public static void parabola(int x,int y){
		System.out.println("Draw parabola at "+x+" "+y );
	}
	private void parabola(int x,double y){
		System.out.println("Draw parabola at "+x+" "+y );
	}
	private int parabola(int x,char y){
		System.out.println("Draw parabola at "+x+" "+y );
		return x;
	}
	public static void parabola(int x,float y){
		System.out.println("Draw parabola at "+x+" "+y );
	}
	public static void main(String[] args) {
		GraphSheet g = new GraphSheet();
		g.parabola(10,20);
		g.parabola(10,20.0);
		g.parabola(10,'A');
		g.parabola(30,1.5f);
	}
}