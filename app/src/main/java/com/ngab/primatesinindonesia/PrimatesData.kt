package com.ngab.primatesinindonesia

object PrimatesData {
    private val primateNames = arrayOf(
            "Beruk Mentawai",
            "Kukang Jawa",
            "Luttung Kedih",
            "Monyet Ekor Panjang",
            "Owa Lengan Putih",
            "Siamang",
            "Simpai",
            "Surili",
            "Tarsius Bangka",
            "Tarsius Siau"
    )

    private val latinNames = arrayOf(
            "Macaca pagensis",
            "Nycticebus javanicus",
            "Presbytis thomasi",
            "Macaca fascicularis",
            "Hylobates lar",
            "Symphalangus syndactylus",
            "Presbytis comata",
            "Presbytis melalophos",
            "Tarsius bancanus",
            "Tarsius tumpara"
    )

    private val primateImages = intArrayOf(
            R.drawable.beruk_mentawai,
            R.drawable.kukang_jawa,
            R.drawable.lutung_kedih,
            R.drawable.monyet_ekor_panjang,
            R.drawable.owa_lengan_putih,
            R.drawable.siamang,
            R.drawable.simpai,
            R.drawable.surili,
            R.drawable.tarsius_bangka,
            R.drawable.tarsius_siau
    )

    private val primateDetails = arrayOf(
            "Bokoi atau bokkoi (Macaca pagensis) adalah sejenis monyet yang menyebar terbatas (endemik) di Kepulauan Mentawai, lepas pantai barat Sumatra. " +
                    "Nama itu adalah sebutan yang sering digunakan oleh penduduk Kepulauan Mentawai untuk menyebut hewan tersebut. Nama lainnya adalah beruk mentawai, sedangkan dalam Bahasa Inggris disebut dengan nama Pagai Island Macaque. " +
                    "Epitet spesifiknya, yaitu pagensis, berarti \"berasal dari Pagai\"; merujuk kepada pulau-pulau Pagai di Kepulauan Mentawai sebagai habitat asal beruk ini.",
            "Kukang jawa (Nycticebus javanicus) adalah primata Strepsirrhini dan spesies kukang asli yang menyebar di bagian barat dan tengah Pulau Jawa, Indonesia. " +
                    "Meskipun awalnya dideskripsikan sebagai spesies yang tersendiri, selama bertahun-tahun kukang jawa dianggap sebagai anak-jenis dari kukang sunda (N. coucang), " +
                    "sampai kemudian dilakukan kajian ulang morfologi dan genetika terhadap takson ini pada tahun 2000-an, yang mengakibatkan peningkatan statusnya sebagai spesies penuh. " +
                    "Kukang jawa berkerabat dekat dengan kukang sunda dan kukang benggala (N. bengalensis). Spesies ini memiliki dua bentuk, yang dibedakan berdasarkan panjang rambut dan, pada tingkat yang lebih rendah, warna tubuhnya.",
            "Kedih (Presbytis thomasi) adalah spesies primata yang tergolong dalam famili Cercopithecidae. Hewan ini merupakan hewan endemik di utara Sumatra, Indonesia. Habitat alaminya adalah hutan tropis kering atau subtropis. " +
                    "Hewan ini terancam oleh pengrusakan habitat. Nama aslinya adalah reungkah di Aceh dan kedih di Alas.",
            "Monyet kra (Macaca fascicularis) adalah monyet asli Asia Tenggara namun sekarang tersebar di berbagai tempat di Asia. " +
                    "Nama lokalnya dalam bahasa Melayu, kra atau kera, adalah tiruan bunyi yang dikeluarkan oleh hewan ini[7]. " +
                    "Dalam literatur-literatur lama, spesies ini acap disebut sebagai kera ekor panjang atau monyet ekor panjang (dari bahasa Inggris, long-tailed macaque), monyet pemakan kepiting (Ingg., crab-eating monkey), atau monyet saja.",
            "Owa serudung (Hylobates lar) atau dalam bahasa Inggris disebut white-handed gibbon adalah kera yang termasuk ke dalam famili Hylobatidae. Owa serudung tersebar mulai dari Laos, Myanmar, Thailand, Semenanjung Malaysia, hingga Indonesia tepatnya Sumatera bagian utara. " +
                    "Oleh karena itu, terdapat 5 subspeses owa serudung yang tersebar di daera tersebut.",
            "Owa siamang (Symphalangus syndactylus) adalah kera hitam yang berlengan panjang, dan hidup pada pohon-pohon. Pada umumnya, siamang sangat tangkas saat bergerak di atas pohon, sehingga tidak ada predator yang bisa menangkap mereka. " +
                    "Siamang merupakan spesies terancam, karena deforestasi habitatnya cepat. Siamang tidak memliki ekor dan memiliki postur tubuh yang kurang tegak. Siamang juga memiliki perkembangan otak yang tinggi. " +
                    "Siamang berwarna hitam agak cokelat kemerahan. Kera ini memiliki anyaman antara jari kedua dan ketiga.",
            "Surili adalah grup monyet Dunia Lama dan membuat genus Presbytis. Mereka hidup di bagian selatan semenanjung Malaya, di Sumatra, Borneo, Jawa, dan pulau kecil di sekitarnya. " +
                    "Umumnya warna tubuh Surili dewasa mulai dari kepala sampai bagian punggung hitam atau coklat dan keabuan, sedangkan warna rambut jambul dan kepala berwarna hitam. " +
                    "Rambut yang tumbuh di bawah dagu, dada dan perut, bagian dalam lengan kaki dan ekor, berwarna putih. Warna kulit muka dan telinga hitam pekat agak kemerahan. " +
                    "Anak yang baru lahir berwarna putih dan memiliki garis hitam mulai dari kepala hingga bagian ekor.",
            "Simpai (Presbytis melalophos) adalah spesies primata di family Cercopithecidae. Hewan ini merupakan satwa endemik di pulau Sumatra, Indonesia. Habitat alaminya adalah hutan tropis kering atau subtropis. " +
                    "Hewan ini terancam punah akibat hilangnya habitat",
            "Tarsius bancanus atau mentilin merupakan salah satu spesies tarsius. Primata endemik Sumatra dan Kalimantan, Indonesia ini ditetapkan sebagai fauna identitas provinsi Bangka Belitung." +
                    "Tarsius bancanus dalam bahasa Inggris sering disebut sebagai Horsfield’s Tarsier atau Western Tarsier. " +
                    "Tarsius bancanus tersebar di Indonesia (Kalimantan, Sumatra, dan pulau-pulau sekitar seperti Bangka, Belitung, dan Karimata), Malaysia Timur (Sabah dan Serawak), dan Brunei Darussalam.",
            "Tarsius tumpara, tarsius siau, atau tumpara (Tarsius tumpara) adalah primata nokturnal dalam famili Tarsiidae. Primata ini endemik di Pulau Siau, Kabupaten Kepulauan Sitaro. Nama tumpara merupakan nama yang digunakan masyarakat di Pulau Siau untuk primata ini." +
                    "Tarsius tumpara disebut sebagai satu di antara 25 spesies primata paling terancam punah oleh IUCN Species Survival Commission Primate Specialist Group. Ancaman utama untuk primata ini adalah persebarannya yang hanya terbatas pada satu pulau kecil vulkanik yaitu Pulau Siau, " +
                    "populasi manusia yang terus bertambah, dan juga perburuan."
    )

    val listData: ArrayList<Primate> get() {
        val list = arrayListOf<Primate>()
        for (position in primateNames.indices) {
            val primate = Primate()
            primate.name = primateNames[position]
            primate.latinName = latinNames[position]
            primate.photo = primateImages[position]
            primate.detail = primateDetails[position]
            list.add(primate)
        }
        return list
    }
}

