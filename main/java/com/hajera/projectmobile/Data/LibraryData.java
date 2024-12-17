package com.hajera.projectmobile.Data;

import com.hajera.projectmobile.Model.Library;
import com.hajera.projectmobile.R;

import java.util.ArrayList;

public class LibraryData {
    private static String [] libraryname = {
            "MARRY YOU",
            "MR.PLANKTON",
            "SECOND ACCOUNT",
            "PAY LATER",
            "ARCANE",
            "DANDADAN",
            "BLUELOCK",
            "THE EMPRESS",
            "KAIJUU NO.8",
            "THAT TIME I GOT (SEASON 3)"
    };

    private static String[] librarydeskripsi = {
            "Jung Ha Na, seorang wanita yang bekerja di sebuah tim khusus bernama Pendorong Pernikahan. Tugasnya adalah membantu individu yang kesulitan menemukan pasangan untuk menikah. Dalam cerita ini, ia ditugaskan untuk membantu Bong Cheol Hui, seorang pria polos yang berjuang menemukan jodohnya.",
            "Seorang pria bernama Hae Jo, yang merasa hidupnya tanpa arah seperti plankton yang mengambang. Dalam perjalanan hidupnya, ia bertemu kembali dengan Jae Mi, mantan kekasihnya. Jae Mi, yang berencana menikah dengan pewaris kaya Eo Heung, berada dalam hubungan yang penuh tekanan karena keluarga Eo Heung tidak menyukainya. Di tengah kebimbangannya, Jae Mi memutuskan untuk kabur dari pernikahannya dan bergabung dengan Hae Jo.",
            "Rini, seorang wanita muda yang berusaha mencari keadilan setelah kehidupannya terbalik akibat tindak kejahatan online. Kisah dimulai ketika Rini menjadi korban perundungan siber, yang mengubah hidupnya secara drastis. Dalam perjalanan ini, Rini mencoba untuk membongkar kebenaran di balik akun palsu yang membuat hidupnya kacau.",
            "Tika, seorang wanita yang terjebak dalam lingkaran hutang akibat kebiasaan compulsive buying. Tika awalnya bekerja di kantor pajak, tetapi setelah posisinya diambil oleh temannya, ia beralih pekerjaan ke sebuah kantor pinjaman online (pinjol). Meskipun bekerja di bidang tersebut, Tika terus mengaku kepada keluarganya bahwa ia masih bekerja di kantor pajak. Drama ini menggambarkan tantangan yang dihadapi Tika, mulai dari masalah pribadi hingga dilema yang muncul akibat ketergantungan pada paylater.",
            "Piltover dan Zaun, dua kota yang terpisah oleh status sosial. Cerita mengikuti dua saudari, Vi dan Powder, yang terperangkap dalam konflik besar antara kekayaan Piltover dan kemiskinan Zaun. Ketika Powder mencuri kristal yang mengandung teknologi sihir, bencana besar terjadi, memicu ketegangan yang mengarah pada perang saudara dan perjuangan pribadi yang mendalam.",
            "Momo Ayase dan Okarun, yang terlibat dalam pertemuan aneh dengan hantu dan alien. Momo adalah gadis yang percaya pada hantu dan hal gaib, sementara Okarun adalah anak laki-laki yang tertarik pada dunia okultisme. Mereka berdua bertemu dan terlibat dalam petualangan untuk menghadapi berbagai makhluk supernatural yang mengganggu kehidupan mereka, termasuk seorang nenek tua bernama Turbo Granny yang mengancam mereka dengan kutukannya.",
            "Anime ini berawal dari proyek bernama Blue Lock, yang dirancang oleh Ego Jinpachi, di mana 300 pemain muda sepak bola dari berbagai sekolah SMA dipilih untuk mengikuti seleksi yang sangat ketat. Tujuannya adalah untuk menemukan striker terbaik yang akan mewakili Jepang dalam Piala Dunia.",
            "Kaisar Franz Joseph dan sang Permaisuri Elisabeth dari Austria, lebih dikenal sebagai Sisi. Berlatar belakang pada abad ke-19, cerita ini dimulai ketika Elisabeth, yang awalnya bukan pilihan utama untuk menikah dengan Franz, akhirnya terpilih setelah keputusan mendalam dari sang Kaisar. Sisi, yang datang dari keluarga biasa di Bavaria, kemudian dihadapkan dengan kehidupan istana yang penuh intrik politik dan konflik keluarga.",
            "Menceritakan kisah Kafka Hibino yang berusaha menjadi bagian dari pasukan militer yang melawan monster berbahaya, kaiju. Anime ini telah mendapatkan popularitas dengan tema aksi dan militer yang kuat",
            "Anime isekai yang melanjutkan petualangan Rimuru Tempest, yang kembali berjuang untuk menjaga perdamaian dan menghadapi ancaman baru"

    };

    private static int[] libraryimages = {
            R.drawable.marry,
            R.drawable.mr,
            R.drawable.second,
            R.drawable.paylater,
            R.drawable.arcane,
            R.drawable.dandadan,
            R.drawable.blue,
            R.drawable.theempress,
            R.drawable.kaijuu,
            R.drawable.that,
    };

    public static ArrayList<Library> getListData(){
        ArrayList<Library> list = new ArrayList<>();
        for (int position = 0; position < libraryname.length; position++){
            Library library = new Library();
            library.setName(libraryname[position]);
            library.setDeskripsi(librarydeskripsi[position]);
            library.setPhoto(libraryimages[position]);
            list.add(library);

        }
        return list;
    }
}
