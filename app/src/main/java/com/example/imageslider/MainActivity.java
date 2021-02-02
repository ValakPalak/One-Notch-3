package com.example.imageslider;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    SliderView sliderView;
    SliderView sliderView2;
    SliderView sliderView3;
    List<ImageSliderModel> imageSliderModelList, imageSliderModelList2, imageSliderModelList3;
    private Bundle savedInstanceState;
    DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageSliderModelList = new ArrayList<>();
        sliderView = findViewById(R.id.imageSlider);

        imageSliderModelList.add(new ImageSliderModel(R.drawable.a));
        imageSliderModelList.add(new ImageSliderModel(R.drawable.b));
        imageSliderModelList.add(new ImageSliderModel(R.drawable.c));

        sliderView.setSliderAdapter(new ImageSliderAdapter(this, imageSliderModelList));

        imageSliderModelList2 = new ArrayList<>();
        sliderView2 = findViewById(R.id.imageSlider2);

        imageSliderModelList2.add(new ImageSliderModel(R.drawable.a));
        imageSliderModelList2.add(new ImageSliderModel(R.drawable.b));
        imageSliderModelList2.add(new ImageSliderModel(R.drawable.c));

        sliderView2.setSliderAdapter(new ImageSliderAdapter(this, imageSliderModelList2));

        imageSliderModelList3 = new ArrayList<>();
        sliderView3 = findViewById(R.id.imageSlider3);

        imageSliderModelList3.add(new ImageSliderModel(R.drawable.a));
        imageSliderModelList3.add(new ImageSliderModel(R.drawable.b));
        imageSliderModelList3.add(new ImageSliderModel(R.drawable.c));

        sliderView3.setSliderAdapter(new ImageSliderAdapter(this, imageSliderModelList3));

        drawerLayout = findViewById(R.id.drawer_layout);
    }

    public void ClickMenu(View view){
        openDrawer(drawerLayout);
    }

    private void openDrawer(DrawerLayout drawerLayout) {
        drawerLayout.openDrawer(GravityCompat.START);
    }

    public void ClickLogo(View view){
        closeDrawer(drawerLayout);
    }

    private void closeDrawer(DrawerLayout drawerLayout) {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
    }

    public void ClickItem1(View view){
        Intent intent = new Intent(this, Tab.class);

        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

        startActivity(intent);
    }
    public void ClickItem2(View view){
        Intent intent = new Intent(this, MainActivity.class);

        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

        startActivity(intent);
    }

//    private static void redirectActivity(Activity activity, Class aClass) {
//
//
//    }


}