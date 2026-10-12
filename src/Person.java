public class Person {
    private String id;
    private String nama;
    private int tahunLahir;
    private String kategori;
    private String jenisKelamin; // Atribut Baru (Bonus +20 - JRadioButton)

    // Constructor Kosong
    public Person() {
        this.id = "";
        this.nama = "";
        this.tahunLahir = 0;
        this.kategori = "";
        this.jenisKelamin = "";
    }

    // Constructor Parameter
    public Person(String id, String nama, int tahunLahir, String kategori, String jenisKelamin) {
        this.id = id;
        this.nama = nama;
        this.tahunLahir = tahunLahir;
        this.kategori = kategori;
        this.jenisKelamin = jenisKelamin;
    }

    // Getter & Setter
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public int getTahunLahir() { return tahunLahir; }
    public void setTahunLahir(int tahunLahir) { this.tahunLahir = tahunLahir; }

    public String getKategori() { return kategori; }
    public void setKategori(String kategori) { this.kategori = kategori; }

    public String getJenisKelamin() { return jenisKelamin; }
    public void setJenisKelamin(String jenisKelamin) { this.jenisKelamin = jenisKelamin; }
}