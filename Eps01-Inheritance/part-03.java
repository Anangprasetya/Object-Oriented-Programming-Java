class Super_class {
	int num = 20;

	public void cetak(){
		System.out.println("   Cetak didalam class cuper_class");
	}
}

class Sub_class extends Super_class {
	int num = 10;

	public void cetak(){
		System.out.println("   Cetak didalam class Sub_class");
	}

	public void run(){
		Sub_class x = new Sub_class();
		x.cetak();
		super.cetak();


		System.out.println("   Num x     : " + x.num);
		System.out.println("   Num super : " + super.num);

	}


	public static void main(String[] args) {
		Sub_class objek = new Sub_class();
		objek.run();
	}

}


/*
      * Compiler    :  Javac 1.8.0_292
                    :  openjdk 1.8.0_292
      * Materi      :  Dasar Inheritance (Menggunakan Key Super untuk memanggil method overriding super class)
      * OS          :  Linux Ubuntu
      * Text Editor :  Sublime Text
      * Sumber Ilmu :  https://www.tutorialspoint.com/index.htm
      * Pembuat     :  Anang Nur Prasetya
      * Tahun       :  2021
*/