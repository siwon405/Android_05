package com.on.myapplication;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class NewToast extends Toast {
    /**
     * Construct an empty Toast object.  You must call {@link #setView} before you
     * can call {@link #show}.
     *
     * @param context The context to use.  Usually your {@link Application}
     *                or {@link Activity} object.
     */
    public NewToast(Context context) {
        super(context);
    }
    public static Toast makeText(Context context, String message, int duration){
        Toast toast = new Toast(context);

        View customView = LayoutInflater.from(context).inflate(R.layout.layout_toast,null);

        TextView textView = customView.findViewById(R.id.message);
        textView.setText("message");

        toast.setView(customView);
        toast.setDuration(Toast.LENGTH_SHORT);

        toast.setGravity(Gravity.CENTER,0,250);
        return toast;
    }
}
