package miercoles09112022;

public class Calculadora {

	public static void main(String[] args) {
		Raices r1=new Raices();
		r1.setA(3);
		r1.setB(4);
		r1.setC(3);
		r1.Discriminante(r1.getA(), r1.getB(), r1.getC());
		r1.ObtenerRaices(r1.getA(), r1.getB(), r1.getC());
	}

}
