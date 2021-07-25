class Super_class{
	int usia;

	Super_class(int u){
		this.usia = u;
	}

	public void cetak(){
		System.out.println("    Umur adalah : " + this.usia);
	}
}


class Sub_class extends Super_class {
	Sub_class(int u){
		super(u);
	}

	public static void main(String[] args) {
		Sub_class anang = new Sub_class(20);
		anang.cetak();
	}
}


/*
      * Compiler    :  Javac 1.8.0_292
                    :  openjdk 1.8.0_292
      * Materi      :  Dasar Inheritance (Memanggil Constructor Super Class)
      * OS          :  Linux Ubuntu
      * Text Editor :  Sublime Text
      * Sumber Ilmu :  https://www.tutorialspoint.com/index.htm
      * Pembuat     :  Anang Nur Prasetya
      * Tahun       :  2021
*/