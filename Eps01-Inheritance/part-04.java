class Kendaraan {}
class Darat extends Kendaraan {}
class Udara extends Kendaraan {}

class Xenia extends Darat {
	public static void main(String[] args) {
		Kendaraan kendaraan = new Kendaraan();
		Darat darat = new Darat();
		Xenia xenia = new Xenia();


		System.out.println(darat instanceof Kendaraan);
		System.out.println(xenia instanceof Darat);
		System.out.println(xenia instanceof Kendaraan);
	}
}


/*
      * Compiler    :  Javac 1.8.0_292
                    :  openjdk 1.8.0_292
      * Materi      :  Dasar Inheritance (Multiple Inheritance)
      * OS          :  Linux Ubuntu
      * Text Editor :  Sublime Text
      * Sumber Ilmu :  https://www.tutorialspoint.com/index.htm
      * Pembuat     :  Anang Nur Prasetya
      * Tahun       :  2021
*/