package com.exapmle.rajan.allertdialouge;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;

/**
 * Created by rajan on 04-08-2017.
 */

public class AlertDialugeFragment extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Context context=getActivity();
        AlertDialog.Builder builder=new AlertDialog.Builder(context)
                .setTitle("opps sorry")
                .setMessage("Error occured ")
                .setPositiveButton("ok",null);
        AlertDialog dialog=builder.create();
        return dialog;
    }
}
