# Warung_Madura_Mobile

## File
`ManajemenWarung` : Main file yang berisi gambaran kasar keseluruhan kode berjalan tanpa framework Spring boot
`spring-boot-demo` : Framework file mentah hasil generate
`warung_madura-system` : Framework file yang hampir selesai, tetapi masih ada masalah di servicenya 
## FILE CLASS and FUNCTION
- `Main`
- `Admin`
- `Cashier`
- `InventoryManager`
- `Product`
- `Report`
- `ReportGenerator`
- `SalesManager`
- `Transaction`
- `User`
- `UserManager`


## ALUR
### ADMIN
1. admin pencet tombol login 
2. masukkan username dan password yang sudah ada di database
3. masuk ke menu

### MENU (khusus admin)
- isinya ada tombol transaksi penjualan
- Laporan Penjualan
- Produk
- Pengguna (Kasir/Mitra)

### TRANSAKSI PENJUALAN
- Terdapat cari produk untuk mencari produk yang dibeli
- isinya ada menampilkan nama produk beserta harga satuannya, dan juga pilihan increment dan decrement produk, dan langsung menampilkan total harga per produknya dari jumlah antara harga satuan dikali banyaknya barang   
- di paling terakhir, ada total semua barang, dengan menampilkan output jumlah dibayar
- lalu memilih jenis pembayarannya antara menggunakan tunai atau QRIS
- kalau tunai langsung munculin inputan uang yang dikasih pembeli, kalau qris, berikan barcode serta total pembayaran (dalam kasus ini, kasih aja aku kode random untuk coba-coba)
- ada tombol proses transaksi
- kalau sudah berhasil, akan memunculkan kalimat transaksi telah sukses !!, dan tombol selesai yang akan kembali ke page transaksi penjualan
- lalu, kurangi kuantitas barang yang sudah terjual dengan barang dari `Product`
- dan masukkan data transaksi penjualan ke laporan penjualan

### PRODUK
- Menampilkan tulisan semua list nama barang serta stok yang tersedia , dan di sort berdasarkan stok secara ascending
-  di setiap produk, ada tombol pilihan ubah stok, yang tampilannya menampilkan nama stok tapi bisa diubah dengan cara diketik, harga jual tapi bisa diubah dengan cara diketik, stok tapi bisa diubah dengan cara diketik, satuan tapi bisa diubah dengan cara diketik, dan ada tombol simpan dan batal.
- jika menekan tombol simpan, maka akan menampilkan output "ubah stok berhasil" dengan tombol kembali yang akan kembali ke page produk
- di paling bawah, terdapat tombol untuk tambah barang, yang bentuknya sama seperti ubah stok, tetapi sebelumnya apabila sudah ditekan simpan akan di cek terlebih dahulu apakah nama stok barang sudah ada atau belum, jika sudah ada, maka akan memunculkan tulisan "nama produk sudah tersedia", jika berhasil, maka akan memunculkan tulisan "tambah produk berhasil"

### LAPORAN PENJUALAN
- isinya history dari transaksi penjualan lengkap dengan tanggal yang terinput secara automatis, jadi tampilannya hari, tanggal, bulan, dan tahun, total penjualan pada hari itu (dengan menjumlahkan semua total penjualan), dibawahnya ada list barang yang dibeli, lengkap denga berapa banyak stok yang dibeli, serta harga total barang setelah mengkalikan antara jumlah stok dan harga satuan pada setiap barangnya
