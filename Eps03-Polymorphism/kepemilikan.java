class SertifikatPemilik extends Kendaraan {
	private int kodeSertifikat;

	SertifikatPemilik(String nama, String alamat, int kodeSertifikat){
		super(nama, alamat);
		this.kodeSertifikat = kodeSertifikat;
	}

	public void dataPembeli(){
		System.out.println("  Atas nama: " + namaData() + ", alamat: " + alamatData());
		System.out.println("  Kode sah Sertifikat: " + this.kodeSertifikat);
	}
}