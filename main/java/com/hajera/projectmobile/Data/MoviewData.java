package com.hajera.projectmobile.Data;

import com.hajera.projectmobile.Model.Movie;
import com.hajera.projectmobile.R;

import java.util.ArrayList;

public class MoviewData {
    public static String[][] data = new String[][]{
            {
                    "Catatan harian menantu sinting",
                    "Kehidupan pasangan baru Minar (Ariel Tatum) dan Sahat (Raditya Dika) yang barumenikah dan tinggal bersama ibu Sahat yang dominan. Konflik muncul ketika ibunya mendesak mereka untuk segera memiliki anak laki-laki. Meskipun berusaha menikmati hidup pernikahan,banyak hal lucu dan penuh drama yang terjadi karena adanya perbedaan budaya Batak dan tuntutan ibu mertua.",
                    "Indonesia, Drama komedi, 2024",
                    String.valueOf(R.drawable.catatan)
            },
            {
                    "Sekawan limo",
                    "Film ini menggabungkan elemen horor dan komedi, mengikuti empat sahabat yang terjebak dalam kejadian mistis yang menegangkan namun dibalut dengan humor",
                    "Indonesia, Drama, 2024",
                    String.valueOf(R.drawable.sekawan)
            },
            {
                    "Ipar adalah maut",
                    "Film ini bercerita tentang hubungan tegang antara dua saudara ipar yang saling bersaing. Konflik ini berkembang menjadi permasalahan serius yang melibatkan keluarga",
                    "Indonesia, Drama, 2024",
                    String.valueOf(R.drawable.ipar)
            },
            {
                    "Flash",
                    "Film ini berfokus pada karakter Barry Allen (The Flash) yang harus menghadapi tantangan besar ketika berusaha menyelamatkan dunia dari ancaman yang dapat merusak aliran waktu dan masa depan",
                    "Amerika, Fiksi Ilmiah, 2024",
                    String.valueOf(R.drawable.flash)
            },
            {
                    "The cursed land ",
                    "Sebuah film horor yang mengikuti kisah kelam sebuah desa yang dihantui oleh kekuatan mistis. Para karakter utama berusaha mengungkap misteri yang ada untuk bisa menyelamatkan diri dari kutukan yang mengancam",
                    "Thailand, Horor, 2024",
                    String.valueOf(R.drawable.thecursed)
            },
            {
                    "The spellbound",
                    "Drama musikal yang mengisahkan petualangan anak-anak yang menemukan dunia magis di balik sebuah buku ajaib, sambil belajar tentang keberanian dan persahabatan",
                    "Drama musikal anak-anak, 2024",
                    String.valueOf(R.drawable.thespellbound)
            },
            {
                    "Gtmax",
                    "Drama kriminal yang menceritakan perjalanan seorang detektif dalam memecahkan kasus pembunuhan yang kompleks, mengungkap konspirasi besar yang berakar pada kekuasaan dan korupsi",
                    "Prancis, Drama kriminal, 2024",
                    String.valueOf(R.drawable.gtmax)
            },
            {
                    "Takluk lahad datu",
                    "Film ini berdasarkan peristiwa nyata tentang operasi militer Malaysia di Lahad Datu, Sabah, menghadapi ancaman dari kelompok bersenjata. Fokus pada perjuangan para tentara dan pengorbanan mereka dalam mempertahankan kedaulatan negara",
                    "Malaysia, Drama militer, 2024",
                    String.valueOf(R.drawable.takluk)
            },
            {
                    "When the phone rings ",
                    "Baek Sa Eon, seorang juru bicara presiden termuda di Korea Selatan. Sebelumnya, ia pernah bekerja sebagai koresponden perang, negosiator sandera, dan penyiar berita utama. Di balik kesuksesan kariernya, Baek Sa Eon terjebak dalam pernikahan pura-pura dengan Hong Hui Ju, seorang penerjemah bahasa isyarat yang mengalami mutisme akibat kecelakaan masa kecil. Selama tiga tahun, mereka menjalani hubungan tanpa komunikasi dan penuh kepura-puraan.",
                    "Korea, Drama, eps 2024",
                    String.valueOf(R.drawable.when)
            },
            {
                    "The story of pearl girl ",
                    "Perjalanan Duan Wu, seorang penyelam mutiara dari Hepu. Ia bertemu dengan Yan Zi Jing, seorang pengusaha dari Xiyu, dan Zhang Jin Ran , seorang pria sederhana. Kisahnya dimulai ketika Duan Wu bergabung dengan kelompok Yan Zi Jing dan memulai perjalanan ke dunia perhiasan yang penuh perjuangan.",
                    "Tiongkok, Drama, 40 eps, 2024",
                    String.valueOf(R.drawable.thestory)
            }
    };

    public static ArrayList<Movie> getListData(){
        ArrayList<Movie> list = new ArrayList<>();
        for (String[] aData : data) {
            Movie movie = new Movie();
            movie.setTitle(aData[0]);
            movie.setDeskripsi(aData[1]);
            movie.setTahun(aData[2]);
            movie.setPhoto(aData[3]);
            list.add(movie);
        }

        return list;
    }
}

