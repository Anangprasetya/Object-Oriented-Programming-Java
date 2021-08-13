class Kendaraan {
	private String nama;
	private String alamat;

	Kendaraan(String nama, String alamat){
		this.nama = nama;
		this.alamat = alamat;
	}

	public void dataPembeli(){
		System.out.println("  Atas nama: " + this.nama + ", alamat: " + this.alamat);
	}

	public String namaData(){
		return this.nama;
	}

	public String alamatData(){
		return this.alamat;
	}
}