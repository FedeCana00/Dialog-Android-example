package com.mobdevfc.dialogandroidexample;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // set on click listener fo the custom dialog button
        findViewById(R.id.btnShowCustomDialog).setOnClickListener(view -> {
            Dialog dialog = new Dialog(this, R.style.DialogStyle);
            //set layout element to dialog
            dialog.setContentView(R.layout.layout_custom_dialog);
            //set the background shape of the pop-up
            dialog.getWindow().setBackgroundDrawableResource(R.drawable.background_custom_dialog);
            //set the listener to the components
            dialog.findViewById(R.id.btnOK).setOnClickListener(v -> dialog.dismiss());
            // show dialog
            dialog.show();
        });

        // set on click listener fo the default dialog button
        findViewById(R.id.btnShowDefaultDialog).setOnClickListener(view -> {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            // add positive button
            builder.setPositiveButton(R.string.ok, (dialog, id) -> dialog.dismiss());
            // create and show the AlertDialog
            builder.setTitle(R.string.titleDefaultDialog).create().show();
        });
    }
}