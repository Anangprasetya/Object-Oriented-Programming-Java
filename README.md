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