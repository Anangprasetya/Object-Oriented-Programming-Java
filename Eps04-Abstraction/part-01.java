abstract class Kendaraan {
	private String nama;
	private String alamat;

	Kendaraan(String nama, String alamat){
		this.nama = nama;
		this.alamat = alamat;
	}

	public void dataPembeli(){}

	public String namaData(){
		return this.nama;
	}

	public String alamatData(){
		return this.alamat;
	}
}

// Tidak bisa membuat objek dari class abstract, jika seperti dibawah ini
// maka akan error. Class abstract bisa digunakan dengan mengakses melalui
// class turunannya

/*

Error
-----
class Main {
	public static void main(String[] args) {
		Kendaraan obj = new Kendaraan("Anang Nur Prasetya", "Mojokerto");
		obj.dataPembeli();
	}
}

*/



class Mobil extends Kendaraan {
	private String jenisMobil;

	Mobil(String nama, String alamat, String jenisMobil){
		super(nama, alamat);
		this.jenisMobil = jenisMobil;
	}

	public void dataPembeli(){
		System.out.println("    Atas nama: " + namaData() + ", alamat: " + alamatData() + ", jenis: " + this.jenisMobil);
	}
}


class Main {
	public static void main(String[] args) {
		Mobil obj_satu = new Mobil("Anang Nur Prasetya", "Mojokerto", "lamborghini");

		// Bisa juga menggunakan teknik Polymorphism
		Kendaraan obj_dua = new Mobil("Dwi Alexia", "Kebumen", "Tesla");

		System.out.println("    Objek Satu ");
		obj_satu.dataPembeli();

		System.out.println("\n    Objek Dua ");
		obj_dua.dataPembeli();
	}
}


/*
      * Compiler    :  Javac 1.8.0_292
                    :  openjdk 1.8.0_292
      * Materi      :  Abstraction (basic dan memanfaatkan reference class inheritance (Polymorphism))
      * OS          :  Linux Ubuntu
      * Text Editor :  Sublime Text
      * Sumber Ilmu :  https://www.tutorialspoint.com/index.htm
      * Pembuat     :  Anang Nur Prasetya
      * Tahun       :  2021
*/