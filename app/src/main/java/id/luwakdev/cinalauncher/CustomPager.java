package id.luwakdev.cinalauncher;

/**
 * OutAttacker
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomPager extends Fragment{

    public static final String PAGE = "page";
    ViewGroup viewGroup;
    ImageView imageView;

    public CustomPager() {
// TODO Auto-generated constructor stub
    }

    public static CustomPager create(int page) {

        CustomPager customPager = new CustomPager();
        Bundle data = new Bundle();
        data.putInt(PAGE, page);
        customPager.setArguments(data);
        return customPager ;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        viewGroup = (ViewGroup) inflater.inflate(R.layout.slide_layout, container, false);
        imageView = (ImageView) viewGroup.findViewById(R.id.imageView);
        TextView textView = (TextView) viewGroup.findViewById(R.id.textView);

        switch (getArguments().getInt(PAGE)) {

            case 0:
                imageView.setImageResource(R.drawable.kesatu);
                textView.setText("Lulus Sekolah : \n" +
                        "SMA \n" +
                        "SMK \n" +
                        "MA");
                break;
            case 1:
                imageView.setImageResource(R.drawable.kedua);
                textView.setText("Mendaftar ke Koordinator terdekat");
                break;
            case 2:
                imageView.setImageResource(R.drawable.ketiga);
                textView.setText("Test minat dan pendaftaran : \n" +
                        "Batch 1 = 20 Maret \n" +
                        "Batch 2 = 17 April \n" +
                        "Batch 3 = 15 Mei \n" +
                        "Batch 4 = 12 Juni");
                break;
            case 3:
                imageView.setImageResource(R.drawable.keempat);
                textView.setText("Pengumuman Hasil Test");
                break;
            case 4:
                imageView.setImageResource(R.drawable.kelima);
                textView.setText("Kursus Online Bahasa China : \n" +
                        "Durasi = 1 Bulan \n" +
                        "Pengajar = Native Chinese");
                break;
            case 5:
                imageView.setImageResource(R.drawable.keenam);
                textView.setText("Mendapatkan SERTIFIKAT Bahasa China dasar");
                break;
            case 6:
                imageView.setImageResource(R.drawable.ketujuh);
                textView.setText("Mengumpulkan DOKUMEN");
                break;
            case 7:
                imageView.setImageResource(R.drawable.kewolu);
                textView.setText("Proses Pengurusan");
                break;
            case 8:
                imageView.setImageResource(R.drawable.kesongo);
                textView.setText("Mendapatkan LoA");
                break;
            case 9:
                imageView.setImageResource(R.drawable.kesepolo);
                textView.setText("Pre Departure dan Pengurusan VISA");
                break;
            case 10:
                imageView.setImageResource(R.drawable.kesewelas);
                textView.setText("Durasi : 2 Minggu \n" +
                        "Tempat : SEAMOLEC Komp. Univ Terbuka \n" +
                        "Jl. Cabe Raya Pamulang, Banten");
                break;
            case 11:
                imageView.setImageResource(R.drawable.kerolas);
                textView.setText("Mendapatkan VISA");
                break;
            case 12:
                imageView.setImageResource(R.drawable.ketelulas);
                textView.setText("Pelepasan oleh Direktur PSMK KEMENDIKBUD");
                break;
            case 13:
                imageView.setImageResource(R.drawable.keri);
                textView.setText("Pemberangkatan Mahasiswa");
                break;

            default:
                break;
        }

        return viewGroup;
    }

}