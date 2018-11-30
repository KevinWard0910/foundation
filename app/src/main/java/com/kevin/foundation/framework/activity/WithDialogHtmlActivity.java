package com.kevin.foundation.framework.activity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;

/**
 * Created by kevin on 2018/11/30.
 * descript：
 */

public class WithDialogHtmlActivity extends HtmlActivity {

    @Override
    public void onUpdate(Object... args) {
        super.onUpdate(args);

    }

    @Override
    protected void onResume() {
        super.onResume();
        hideLoading();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public void showDialog(String title, String message, String negative, String positive, DialogInterface.OnClickListener positiveListener){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(title)
                .setMessage(message)
                .setNegativeButton(negative,null)
                .setPositiveButton(positive,positiveListener)
                .create()
                .show();
    }

}
