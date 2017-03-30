package com.example.colin.uiwidegettest;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.*;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;
import android.content.DialogInterface;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private ImageView imageView;
    private ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button) findViewById(R.id.button);
        editText=(EditText) findViewById(R.id.edit_text);
        imageView=(ImageView) findViewById(R.id.image_view);
        progressBar=(ProgressBar) findViewById(R.id.progress_bar);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //在此添加逻辑
                switch (v.getId()) {
                    case R.id.button:
                       /*String inputText =editText.getText().toString();
                        Toast.makeText(MainActivity.this,inputText,Toast.LENGTH_SHORT).show();*/
                      /* imageView.setImageResource(R.drawable.img_2);*/
                     /* if(progressBar.getVisibility()==View.GONE)
                          progressBar.setVisibility(View.VISIBLE);
                        else
                            progressBar.setVisibility(View.GONE);*/
                    /* int progress=progressBar.getProgress();
                        progress+=10;
                        progressBar.setProgress(progress);*/
                       /* AlertDialog.Builder dialog=new AlertDialog.Builder(MainActivity.this);
                        dialog.setTitle("This is a alterDialog");
                        dialog.setMessage("Something Important.");
                        dialog.setCancelable(false);
                        dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                            }
                        });
                        dialog.setNegativeButton("Cancle",new DialogInterface.OnClickListener()
                    {
                            @Override
                            public void onClick(DialogInterface dialog, int which)  {
                            }
                    });
                        dialog.show();*/
                        ProgressDialog progressDialog=new ProgressDialog(MainActivity.this);
                        progressDialog.setTitle("This is ProgressDialog");
                        progressDialog.setMessage("Loading...");
                        progressDialog.setCancelable(true);
                        progressDialog.show();
                        break;
                    default:
                        break;
                }
            }
        });
    }
}
