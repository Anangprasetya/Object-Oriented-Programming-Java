# Object Oriented Programming Java
Mempelajar materi konsep OOP atau PBO bahasa pemrograman Java

Banyak manfaat yang dapat diambil dari mempelajari konsep Pemrograman Berorientasi Objek. Materi yang diupload adalah bahan pembelajar saya pribadi untuk mempelajari dan memahami OOP pada bahasa Pemrograman Java, Semoga materi dan code bahasa Java mudah dipahami bagi yang ingin belajar !


# Cara Menjalankan File Java Terpisah
_Catatan:_ Pastikan dua file java tersebut terdapat di `folder yang sama`


### Buat file hewan.java
Lalu tulis seperti dibawah

```java
class Binatang {
	private String makanan;

	Binatang(String makanan){
		this.makanan = makanan;
	}

	void cek(){
		System.out.println("  Makanan adalah " + this.makanan);
	}
}
```

### Buat file demo.java
Lalu tulis seperti dibawah
```java
class Main{
	public static void main(String[] args) {
		Binatang singa = new Binatang("Daging");
		singa.cek();
	}
}
```

### Masuk ke folder yang telah dibuat
Lalu tulis perintah di terminal seperti ini
```sh
javac hewan.java
```

```sh
javac demo.java
```
Usahakan class yang terdapat method main, di compile paling akhir. Lalu jalankan class dengan method main seperti dibawah

```sh
java Main
```



# Membuat Pakcage Java
Buat folder terlebih dahulu dengan perintah
```sh
mkdir program
```
Lalu masuk ke folder

```sh
cd program/
```

Didalam folder program buat file dengan nama `coba.java` dan `main.java`. Lalu ketikkan kode dibawah untuk file **coba.java**
```java
package projectsaya;


class Mahasiswa {
	protected String nama;
	protected String no;
}
```

Lalu ketikkan kode dibawah ini juga untuk file **main.java**
```java
package projectsaya;

class Run extends Mahasiswa {
	Run(String nama, String no){
		this.nama = nama;
		this.no = no;
	}
	void sapa(){
		System.out.println("   Hello " + this.nama + " dengan no - " + this.no);
	}

	public static void main(String[] args) {
		Run obj = new Run("nama kamu", "20");
		obj.sapa();
	}
}
```

Lalu compile kedua file tersebut dengan perintah berikut
```sh
javac -d . coba.java
```
- -d -> untuk memberitahu compiler bahwa terdapat package
- .  -> path folder (letak folder hasil compile kita nanti)

lalu compile file main.java sama seperti diatas
```sh
javac -d . main.java
```