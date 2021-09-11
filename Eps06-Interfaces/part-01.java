class Anak implements OrangTua {
	public void sapa(){
		System.out.println("  Selamat Datang di Interface Java");
	}

	public void versi(){
		System.out.println("  Version 2.0");
	}
}

class Main {
	public static void main(String[] args) {
		Anak obj1 = new Anak();
		obj1.sapa();

		OrangTua obj2 = new Anak();
		obj2.versi();		

		// cara kerja interface mirip seperti Polymorphism dan Abstraction
	}
}


/*
      * Compiler    :  Javac 1.8.0_292
                    :  openjdk 1.8.0_292
      * Materi      :  Interfaces (Basic)
      * OS          :  Linux Ubuntu
      * Text Editor :  Sublime Text
      * Sumber Ilmu :  https://www.tutorialspoint.com/index.htm
      * Pembuat     :  Anang Nur Prasetya
      * Tahun       :  2021
*/