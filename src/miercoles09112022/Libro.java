package miercoles09112022;

public class Libro {

private int ISBN;
private String Titulo;
private String Autor;
private int NPaginas;

   
   public int getISBN() {
	return ISBN;
   }
   public void setISBN(int iSBN) {
	ISBN = iSBN;
   }
   public String getTitulo() {
	return Titulo;
   }
   public void setTitulo(String titulo) {
	Titulo = titulo;
   }
   public String getAutor() {
	return Autor;
   }
   public void setAutor(String autor) {
	Autor = autor;
   }
   public int getNPaginas() {
	return NPaginas;
   }
   public void setNPaginas(int nPaginas) {
 	NPaginas = nPaginas;
   }
	public void MostrarDatos() {
		System.out.println("=====================================");
		System.out.println("El libro "+getTitulo()+" con su ISBN "+getISBN()+" creado por el autor "+getAutor()+" tiene "+getNPaginas()+" Paginas");
		System.out.println("=====================================");
	}




}
