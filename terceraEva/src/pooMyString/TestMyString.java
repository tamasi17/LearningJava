package pooMyString;

public class TestMyString {

	public static void main(String[] args) {


		        MyString s1 = new MyString("Hola");
		        MyString s2 = new MyString(" Mundo"); // pongo un espacio para que quede mejor

		        // Mostrar contenido original
		        System.out.print("s1: ");
		        s1.imprimir();  // Hola
		        System.out.print("s2: ");
		        s2.imprimir();  //  Mundo

		        // Concatenar
		        s1.myConcat(s2);
		        System.out.print("Concatenado: ");
		        s1.imprimir();  // Hola Mundo

		        // Comparar
		        MyString s3 = new MyString("hola mundo");
		        System.out.println("myCompareTo(s3): " + s1.myCompareTo(s3));  // mayúsculas vs minúsculas
		        System.out.println("myCompareToIgnoreCase(s3): " + s1.myCompareToIgnoreCase(s3));  // debería ser 0

		        // IndexOf
		        System.out.println("myIndexOf('o'): " + s1.myIndexOf('o'));  // 1
		        System.out.println("myLastIndexOf('o'): " + s1.myLastIndexOf('o'));  // 7

		        // Replace
		        MyString reemplazado = s1.myReplace('o', '0');
		        System.out.print("Reemplazado 'o' por '0': ");
		        reemplazado.imprimir();  // H0la Mund0

		        // ToUpperCase
		        MyString upper = s1.myToUpperCase();
		        System.out.print("Mayúsculas: ");
		        upper.imprimir();  // HOLA MUNDO

		        // ToLowerCase
		        MyString lower = s1.myToLowerCase();
		        System.out.print("Minúsculas: ");
		        lower.imprimir();  // hola mundo

		        // Trim (espacios al principio y fin)
		        MyString conEspacios = new MyString("  hola  ");
		        MyString sinEspacios = conEspacios.myTrim();
		        System.out.print("Trim: [\n");
		        sinEspacios.imprimir();  // [hola]
		        System.out.println("]");

		        // Longitud
		        System.out.println("Longitud de s1: " + s1.myLength());

		        // Mostrar con myToString()
		        System.out.println("s1 como String: " + s1.myToString());
		
	}

}
