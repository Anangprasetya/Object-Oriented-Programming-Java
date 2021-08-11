class Mobil {
	public void cetak(){
		System.out.println("  Mobil bewarna merah");
	}
}

class Avanza extends Mobil {
	public void cetak(){
		System.out.println("  Mobil bewarna hijau");
	}

	public void kecepatan(){
		System.out.println("  Kecepantan mobil 80 km/jam");
	}
}

class Main {
	public static void main(String[] args) {
		Mobil m = new Mobil();
		Mobil av = new Avanza(); // mereference ke Avanza

		m.cetak();
		av.cetak();
		av.kecepatan(); // Menghasilkan program error

	}
}


		/*
		  Penjelasan singkat
		  semua objek adalah Mobil.
		  av.kecepatan error, terjadi karena objek av, pertama mencari method kecepatan didalam class Mobil.
		  jika method tidak ditemukan maka error, karena bukan dari anggota asli class objek.
		  jika method ditemukan, maka objek juga mengecek class yang mereference nya, jika di kelas reference nya
		  tidak ditemukan, maka mengambil method asli, dan jika ditemukan maka objek mengambil method yang berada di referencennya.


		  Kesimpulan
		  class utama objek menjadi penentu ada atau tidak adanya method yang dtuju.
		  class reference objek menjadi penentu pengambilkan method yang dituju.
		*/


/*
      * Compiler    :  Javac 1.8.0_292
                    :  openjdk 1.8.0_292
      * Materi      :  Overriding (Menimpa method dengan pengecekan method)
      * OS          :  Linux Ubuntu
      * Text Editor :  Sublime Text
      * Sumber Ilmu :  https://www.tutorialspoint.com/index.htm
      * Pembuat     :  Anang Nur Prasetya
      * Tahun       :  2021
*/