interface Run{
	public void draw();
}
class ShapeDrawer{
	public static void drawAnyThing(Run e){
		e.draw();
	}
}
class Test2{
	public static void main(String[] args) {
		Run r = ()->{
			System.out.println("Draw Rectangle");
		};
		Run r1=()->{
			System.out.println("Draw Triangle");
		};
		ShapeDrawer.drawAnyThing(r);
		ShapeDrawer.drawAnyThing(r1);
	}
}