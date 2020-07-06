package com.example.cameraandgallery;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {

    Button b_camera, b_gallery;
    ImageView iv;
    public static final int CAMERA_REQUEST_CODE = 25;
    public static final int GALLERY_REQUEST_CODE = 35;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b_camera = findViewById(R.id.camera_button);
        b_gallery = findViewById(R.id.gallery_button);
        iv = findViewById(R.id.imageview);
        b_camera.setOnClickListener(this);
        b_gallery.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.camera_button:
                openCamera();
                break;
            case R.id.gallery_button:
                openGallery();
                break;
        }
    }

    private void openGallery() {
    }

    private void openCamera() {
        Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(i, CAMERA_REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==CAMERA_REQUEST_CODE){
            if (resultCode == RESULT_OK){
                Bitmap b = (Bitmap) data.getExtras().get("data");
                iv.setImageBitmap(b);
            }
        }
    }
}