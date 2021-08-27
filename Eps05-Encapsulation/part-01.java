class EncapTest {
	// Hak akses member class
	private String name;
	private String idNum;
	private int age;

	int getAge(){ return this.age; } 
	String getName(){ return this.name; } 
	String getIdNum(){ return this.idNum; } 
	void setAge(int x){ this.age = x; }
	void setName(String x){ this.name = x; }
	void setIdNum(String x){ this.idNum = x; }
}


class Main {
	public static void main(String[] args) {
		EncapTest en = new EncapTest();
		en.setName("Anang");
		en.setAge(20);
		en.setIdNum("123we");


		System.out.println("   Nama: " + en.getName() + ", Age: " + en.getAge() + ", Id: " + en.getIdNum());
	}
}


/*
      * Compiler    :  Javac 1.8.0_292
                    :  openjdk 1.8.0_292
      * Materi      :  Encapsulation (Basic)
      * OS          :  Linux Ubuntu
      * Text Editor :  Sublime Text
      * Sumber Ilmu :  https://www.tutorialspoint.com/index.htm
      * Pembuat     :  Anang Nur Prasetya
      * Tahun       :  2021
*/