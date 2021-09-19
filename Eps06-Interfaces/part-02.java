import java.util.Scanner;
class ConsoleUser {
	private GameConsole gc;


	ConsoleUser(GameConsole gc){
		this.gc = gc;
	}


	void tombolSilang(){
		this.gc.silang();
	}

	void tombolKotak(){
		this.gc.kotak();
	}

	void tombolKanan(){
		this.gc.kanan();
	}

	void tombolKiri(){
		this.gc.kiri();
	}
}



class Console implements GameConsole {
	public void silang(){
		System.out.println("  Mobil User sedang berjalan kencang");
	}

	public void kotak(){
		System.out.println("  Mobil User sedang mengurangi kecepatan hingga berhenti");
	}

	public void kanan(){
		System.out.println("  Mobil User sedang diarahkan ke kanan");
	}

	public void kiri(){
		System.out.println("  Mobil User sedang diarahkan ke kiri");
	}
}


class Run {
	public static void main(String[] args) {
		GameConsole sony = new Console();
		ConsoleUser anang = new ConsoleUser(sony);
		Scanner cin = new Scanner(System.in);

		int p;

		System.out.println("  ========== PERMAINAN MOBIL ==========");
		System.out.println("  ==========      PILIH      ==========");
		System.out.println("   1) Jalan");
		System.out.println("   2) Rem");
		System.out.println("   3) Kanan");
		System.out.println("   4) Kiri");
		System.out.println("   *) Exit");
		System.out.println("  ==========    BY ANANG     ==========");


		while(true){
			System.out.print("  Pilih: ");
			p = cin.nextInt();
			if (p == 1) {
				anang.tombolSilang();
			}
			else if (p == 2){
				anang.tombolKotak();
			}
			else if (p == 3){
				anang.tombolKanan();
			}
			else if (p == 4){
				anang.tombolKiri();
			}
			else{
				break;
			}
			System.out.println();
		}



	}
}


/*
      * Compiler    :  Javac 1.8.0_292
                    :  openjdk 1.8.0_292
      * Materi      :  Interfaces (Sedikit Kompleks)
      * OS          :  Linux Ubuntu
      * Text Editor :  Sublime Text
      * Sumber Ilmu :  https://www.tutorialspoint.com/index.htm
      * Pembuat     :  Anang Nur Prasetya
      * Tahun       :  2021
*/