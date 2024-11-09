package overloading;
//	Write a class with the name volume using function overloading that 
//	computes the volume of a cube, a sphere and a cuboid. 
//	Formula: volume of a cube (vc) = s*s*s 
//	volume of a sphere (vs) = 4/3 * pi * r * r * r 
//	(where pi = 3.14 or 22/7) 
//Volume of a cuboid (vcd) = l * b * h
public class Volume {
	public int volume(int s) {
		return s*s*s;
	}
	public float volume(float r) {
		float pi = 9.14f;
		return (4/3)*pi*r*r*r;
		
	}
	public int volume(int l, int b, int h) {
		return l*b*h;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Volume v = new Volume();
		System.out.println("Volume of Square: "+v.volume(5));
		System.out.println("Volume Sphere: "+v.volume(2.5f));
		System.out.println("Volume of Cuboid: "+v.volume(2,4,6));
		
	}

}
