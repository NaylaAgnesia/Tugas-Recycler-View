package www.smktelkommlg.tugasmyrecyclerview

object HeroesData {
    private val data = arrayOf(
        arrayOf(
            "Nasi Goreng",
            "Nasi Goreng merupakan sajian nasi yang digoreng dalam sebuah wajan atau penggorengan yang menghasilkan cita rasa berbeda karena dicampur dengan bumbu-bumbu seperti garam, bawang putih, bawang merah, merica, rempah-rempah tertentu dan kecap manis.",
            "https://upload.wikimedia.org/wikipedia/commons/8/8b/Nasi-Goreng.jpg"
        ),
        arrayOf(
            "Bakso",
            "Bakso adalah jenis bola daging yang lazim ditemukan pada masakan Indonesia umumnya dibuat dari campuran daging sapi giling dan tepung tapioka, tetapi ada juga bakso yang terbuat dari daging ayam, ikan, atau udang bahkan daging kerbau.",
            "https://upload.wikimedia.org/wikipedia/commons/2/28/Bakso_mi_bihun.jpg"
        ),
        arrayOf(
            "Mie Ayam",
            "Mi ayam adalah hidangan khas Indonesia yang terbuat dari mi gandum yang dibumbui dengan daging ayam yang biasanya dipotong dadu.",
            "https://upload.wikimedia.org/wikipedia/commons/8/82/Mi_ayam_jamur.JPG"
        ),
        arrayOf(
            "Soto Ayam",
            "Soto ayam adalah makanan khas Indonesia yang berupa sejenis sup ayam dengan kuah yang berwarna kekuningan.",
            "https://upload.wikimedia.org/wikipedia/commons/0/05/Soto_ayam.JPG"
        ),
        arrayOf(
            "Gudeg",
            "Gudeg adalah hidangan khas Provinsi Daerah Istimewa Yogyakarta yang terbuat dari nangka muda yang dimasak dengan santan.",
            "https://upload.wikimedia.org/wikipedia/commons/3/31/Nasi_Gudeg.jpg"
        ),
        arrayOf(
            "Nasi Pecel",
            "Nasi pecel atau sega pecel adalah hidangan nasi Indonesia dari Jawa yang disajikan dengan pecel. Pecel dalam hidangan nasi pecel biasanya dibuat dari kangkung, kacang panjang, daun singkong, daun pepaya, atau bunga turi.",
            "https://upload.wikimedia.org/wikipedia/commons/c/cc/Nasi_Pecel.jpg"
        ),
        arrayOf(
            "Nasi Padang",
            "Nasi padang adalah nasi putih yang disajikan dengan berbagai macam lauk-pauk khas Minangkabau, Indonesia.",
            "https://upload.wikimedia.org/wikipedia/commons/9/93/Nasi_padang.jpg"
        ),
        arrayOf(
            "Nasi Uduk",
            "Nasi uduk adalah hidangan yang dibuat dari nasi putih yang diaron dan dikukus dengan santan, serta dibumbui dengan pala, kayu manis, jahe, daun serai dan merica.",
            "https://upload.wikimedia.org/wikipedia/commons/a/a6/Nasi_uduk_netherlands.jpg"
        ),
        arrayOf(
            "Pempek",
            "Pempek atau empek-empek adalah makanan yang terbuat dari daging ikan yang digiling lembut yang dicampur tepung kanji atau tepung sagu, serta komposisi beberapa bahan lain seperti telur, bawang putih yang dihaluskan, penyedap rasa, dan garam.",
            "https://upload.wikimedia.org/wikipedia/commons/c/ca/Pempek_Kuah_Cuko.jpg"
        ),
        arrayOf(
            "Sate Ayam",
            "Sate ayam adalah makanan khas Indonesia. Sate Ayam dibuat dari daging ayam. Pada umumnya sate ayam dimasak dengan cara dipanggang dengan menggunakan arang dan disajikan dengan pilihan bumbu kacang atau bumbu kecap.",
            "https://upload.wikimedia.org/wikipedia/commons/8/8b/Sate_ayam-1.JPG"
        )
    )


    val listData: ArrayList<Hero>
        get() {
            val list = arrayListOf<Hero>()
            for (aData in data) {
                val hero = Hero()
                hero.name = aData[0]
                hero.from = aData[1]
                hero.photo = aData[2]


                list.add(hero)
            }


            return list
        }
}