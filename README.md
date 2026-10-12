# TP4 DPBO 2025/2026 - PeopleData (Java Swing GUI)

## Janji
Saya Muhiban Fadlan Nursaid dengan NIM 2400382 mengerjakan evaluasi Tugas Praktikum 4 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahan-Nya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

## Deskripsi Program
Aplikasi desktop berbasis **Java Swing GUI** yang mengelola data orang/karyawan (`PeopleData`) dengan menerapkan fungsi CRUD (*Create, Read, Update, Delete*). Aplikasi ini dibangun memanfaatkan IntelliJ IDEA Swing UI Designer dengan arsitektur berorientasi objek yang rapi dan terstruktur.

## Fitur Utama & Pemenuhan Bonus (+20)
1. **Atribut Baru & Bonus Komponen Non-JTextField (+20 Poin)**:
    - Menambahkan atribut `jenisKelamin` pada kelas `Person.java`.
    - Menggunakan komponen **`JRadioButton`** (`Laki-laki` dan `Perempuan`) yang dikelompokkan ke dalam `ButtonGroup` pada form input.
2. **Pop-up Konfirmasi Hapus Data**:
    - Menampilkan dialog konfirmasi `JOptionPane.showConfirmDialog` bertipe `YES_NO_OPTION` saat tombol **Delete** ditekan sebelum data benar-benar dihapus.
3. **Validasi Input & Handling Error**:
    - Menolak eksekusi input jika ada field yang kosong.
    - Penanganan `NumberFormatException` jika input Tahun Lahir diisi selain angka.

## Struktur Repositori
```text
PeopleData/
├── src/
│   ├── Person.java
│   ├── PeopleMenu.java
│   └── PeopleMenu.form
├── Dokumentasi/
│   ├── add_data.png
│   ├── update_data.png
│   ├── confirm_delete.png
│   └── delete_data.png
├── .gitignore
└── README.md
