package hewan;

class Karnivora implements Hewan {
	public void makan(){
		System.out.println("   Sedang memakan daging");
	}

	public void lari(){
		System.out.println("   Berlari sangat cepat");
	}


	public static void main(String[] args) {
		Karnivora singa = new Karnivora();
		singa.makan();
		singa.lari();
	}
}


/*
      * Compiler    :  Javac 1.8.0_292
                    :  openjdk 1.8.0_292
      * Materi      :  Package (create)
      * OS          :  Linux Ubuntu
      * Text Editor :  Sublime Text
      * Sumber Ilmu :  https://www.tutorialspoint.com/index.htm
      * Pembuat     :  Anang Nur Prasetya
      * Tahun       :  2021
*/