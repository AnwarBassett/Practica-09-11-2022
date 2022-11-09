package miercoles09112022;

public class Raices {
	private int a;
	private int b;
	private int c;
	private double disc;
	
	

	public double getDisc() {
		return disc;
	}
	public void setDisc(double disc) {
		this.disc = disc;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public void Discriminante(int a, int b, int c) {
		double disc=(Math.pow(b, 2))-(4*(a*c));
		System.out.println("El discriminante es="+disc);
	}
	public void ObtenerRaices(int a, int b, int c) {
		double raiz1=(-b+Math.sqrt(disc))/(2*a); 
		double raiz2=(-b-Math.sqrt(disc))/(2*a);
		System.out.println("x1="+raiz2);;
		System.out.println("x2="+raiz1);
	}
	

}
