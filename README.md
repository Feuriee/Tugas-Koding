# Tugas-Koding

Tugas MKU Komputer dan Pemrograman 

1. Buat program JAVA perulangan hingga 100 dengan output sbb :
   1
   2
   3
   4
   5
   6
   7
   8
   9
   (YourName)
   (YourName)

2. Buat program JAVA bebas dengan menggunakan if else dalam perulangan while
3. Buatlah program zodiac dengan menggunakan fitur input dengan hasil menampilkan zodiac sesuai dengan tanggal lahir yang diinputkan
4. Buatlah sebuah variabel dengan tipe data array, kemudian tampilkan semua nilai dalam variabel tersebut menggunakan perulangan for

# Penjelasan

1. Pada program yang dilampirkan pada folder ini dengan nama file loop.java. Saya menggunakan perulangan FOR untuk membuat looping dalam program.
   Kemudian untuk membatasi antara angka 1 sampai dengan 9 adalah dengan menggunakan IF, if (i <= 9) itu artinya jika kurang dari sama dengan 9 maka akan mengeluarkan output dari angka 1 -9
   Kemudian kode ELSE IF untuk membatasi antara itu, misal seperti diprogram saya, else if (i == 10) {sout(panggil variabel)}, itu artinya jika nilai lebih dari 10 maka akan mengeluarkan output yang ada pada           variabel.
2. Pada program ini saya membuat perulangan simbol "^" dari 10 yang turut menurut berkurang hingga menjadi 1, sehingga berbentuk menjadi segitiga siku-siku terbalik.
3. Program ini saya buat supaya pengguna dapat memasukkan input tanggal dan bulan dan setelah menekan enter pada keyboard akan muncul hasil dari zodiac yang dia cari sesuai dengan tanggal kelahiran. Setelah memasukkan input, program memanggil fungsi findZodiacSign dengan memberikan nilai bulan dan tanggal kelahiran sebagai argumen. Hasilnya disimpan dalam variabel zodiacSign.
4. Kode ini adalah contoh program dalam bahasa pemrograman Java yang mencetak elemen-elemen dari sebuah array string ke layar.

* String[] mobil = {"Rush, ", "Fortuner, ", "Cayla, ", "Avanza, ", "Innova, ", "dan Supra."}; : Ini adalah deklarasi dan inisialisasi array string bernama mobil yang berisi beberapa merk mobil.
* for (int i = 0; i < mobil.length; i++) { }: Ini adalah loop for yang digunakan untuk mengiterasi melalui setiap elemen dalam array mobil.
* int i = 0;: Inisialisasi variabel i dengan nilai 0.
* System.out.println(mobil[i]);: Di dalam loop, pernyataan ini mencetak elemen array pada indeks ke-i ke layar.
