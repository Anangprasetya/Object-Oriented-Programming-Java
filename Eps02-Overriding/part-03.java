class Mobil {
	public void cetak(){
		System.out.println("  Mobil bewarna merah");
	}
}

class Tesla extends Mobil {
	public void cetak(){
		super.cetak();
		System.out.println("  Mobil bewarna hijau");
	}
}

class Main {
	public static void main(String[] args) {
		Mobil mo = new Tesla();

		mo.cetak();

		// super : digunakan untuk memanggil method yang berada di class induk.
		//         dapat juga di gunakan untuk memanggil constructor dari class induk.
	}
}


/*
      * Compiler    :  Javac 1.8.0_292
                    :  openjdk 1.8.0_292
      * Materi      :  Overriding (Keyword Super)
      * OS          :  Linux Ubuntu
      * Text Editor :  Sublime Text
      * Sumber Ilmu :  https://www.tutorialspoint.com/index.htm
      * Pembuat     :  Anang Nur Prasetya
      * Tahun       :  2021
*/