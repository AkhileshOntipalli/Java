class Program15
{
public static void circumferance(int rad) 
{
	double circumferance;
	circumferance = 2*3.146*rad;
	System.out.println(circumferance);
	return;
}
public static void trianglearea(int b,int h) 
{
    double trianglearea;
    trianglearea = b*h/2;
    System.out.println(trianglearea);
    return;
}
public static void rhombusarea(int p,int q) 
{
	double  rhombusarea;
	rhombusarea = p*q/2;
	System.out.println(rhombusarea);
	return;
}
public static void cylindervolume(int r,int h) 
{
    double	cylindervolume;
    cylindervolume = 3.146*r*r*h;
    System.out.println(cylindervolume);
    return;
}
public static void spherearea(int r) 
{
	double spherearea;
	spherearea = 4*3.146*r*r;
	System.out.println(spherearea);
	return;
}
public static void main(String[] args) 
{
  circumferance (10);
  trianglearea	(5,6);
  rhombusarea (4,5);
  cylindervolume (4,8);
  spherearea (6);
}
}