abstract class Mahasiswa {
	private String nama;
	private int nim;

	Mahasiswa(String nama, int nim){
		this.nama = nama;
		this.nim = nim;
	}

	String datanama(){
		return this.nama;
	}

	int datanim(){
		return this.nim;
	}

	abstract void ipk();
}

// Abstract method di java, mirip seperti virtual method C++


class KelasA extends Mahasiswa {
	private double nilai;

	KelasA(String nama, int nim, double nilai){
		super(nama, nim);
		this.nilai = nilai;
	}

	void ipk(){
		System.out.println("    Data Mahasiswa ! ");
		System.out.println("    Atas nama: " + datanama() + " - " + datanim() + ", IPK: " + this.nilai);
	}
}

class Main {
	public static void main(String[] args) {
		Mahasiswa objek = new KelasA("Anang Nur Prasetya", 47, 3.9);
		objek.ipk();
	}
}


/*
      * Compiler    :  Javac 1.8.0_292
                    :  openjdk 1.8.0_292
      * Materi      :  Abstraction (Abstract method)
      * OS          :  Linux Ubuntu
      * Text Editor :  Sublime Text
      * Sumber Ilmu :  https://www.tutorialspoint.com/index.htm
      * Pembuat     :  Anang Nur Prasetya
      * Tahun       :  2021
*/