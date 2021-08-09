class Kendaraan {
	public void info(){
		System.out.println("  Method info kendaraan");
	}
}

class Avanza extends Kendaraan {
	public void info(){
		System.out.println("  Method info avanza");
	}
}

class Main {
	public static void main(String[] args) {
		Kendaraan a = new Kendaraan();
		Kendaraan b = new Avanza(); // Mereference ke Avanza

		a.info();
		b.info();  // Penerapan overriding
	}
}


/*
      * Compiler    :  Javac 1.8.0_292
                    :  openjdk 1.8.0_292
      * Materi      :  Overriding (Menimpa method dengan mereference)
      * OS          :  Linux Ubuntu
      * Text Editor :  Sublime Text
      * Sumber Ilmu :  https://www.tutorialspoint.com/index.htm
      * Pembuat     :  Anang Nur Prasetya
      * Tahun       :  2021
*/