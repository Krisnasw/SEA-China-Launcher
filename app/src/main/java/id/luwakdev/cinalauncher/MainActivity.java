package id.luwakdev.cinalauncher;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("SEA CHINA LAUNCHER");

        ImageView jancok = (ImageView) findViewById(R.id.btCino);

        jancok.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
            //TODO Auto generated method-stub
                Intent coli = new Intent(MainActivity.this, ScreenSlideActivity.class);
                startActivity(coli);
            }
        });
    }

    public void onBackPressed() {
        exit();//Pergi ke method exit
    }
    private void exit() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Are you sure want to exit?")
                .setCancelable(false)//tidak bisa tekan tombol back
                //jika pilih yes
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        finish();
                    }
                })
                //jika pilih no
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                }).show();

    }
}
