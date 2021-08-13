class Main {
	public static void main(String[] args) {
		SertifikatPemilik objSatu = new SertifikatPemilik("Anang Nur Prasetya", "Mojokerto", 202012);

		// deklarasi objek polymorphism
		Kendaraan objDua = new SertifikatPemilik("Kevin Torento", "Makasar", 123215);

		objSatu.dataPembeli();
		System.out.println("  ----------------------------------");
		objDua.dataPembeli();


		// Polymorphism : membuat objek dengan class induk tetapi ingin menggunakan fitur class turunannya.
		//                bisa dikatakan kebalikan dari inheritance.
		//                tetapi tetap dalam artian objek yang memiliki berbagai bentuk.
		

		// Cara run program
		// ----------------
		// 1. javac kendaraan.java
		// 2. javac kepemilikan.java
		// 3. javac part-01.java
		// 4. java Main
	}
}


/*
      * Compiler    :  Javac 1.8.0_292
                    :  openjdk 1.8.0_292
      * Materi      :  Polymorphism (basic)
      * OS          :  Linux Ubuntu
      * Text Editor :  Sublime Text
      * Sumber Ilmu :  https://www.tutorialspoint.com/index.htm
      * Pembuat     :  Anang Nur Prasetya
      * Tahun       :  2021
*/