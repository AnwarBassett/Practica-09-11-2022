package miercoles09112022;
public class Biblioteca {
	public static void main(String[] args) {
		Libro l1=new Libro();
		l1.setISBN(1693565641);
		l1.setTitulo("Viaje al centro de la tierra");
		l1.setAutor("Julio Verne");
		l1.setNPaginas(207);
		l1.MostrarDatos();
		
		Libro l2=new Libro();
		l2.setISBN(1075872898);
		l2.setTitulo("Niebla");
		l2.setAutor("Miguel de Unamuno");
		l2.setNPaginas(306);
		l2.MostrarDatos();
		
		if(l1.getNPaginas() > l2.getNPaginas()) {
			System.out.println("El libro "+l1.getTitulo()+" tiene mas paginas");
		} else {
			System.out.println("El libro "+l2.getTitulo()+" tiene mas paginas");
		}


	}
}
