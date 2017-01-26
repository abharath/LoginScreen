package com.codepath.loginscreen;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by abharath on 1/25/17.
 */

public class DialogLogin extends DialogFragment {
    private Context context;
    @Override
    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public static DialogLogin newInstance(Context context) {
        DialogLogin dialogLogin = new DialogLogin();
        dialogLogin.setContext(context);
        return dialogLogin;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog loginDialog = new Dialog(getActivity(), R.style.DialogLoginTheme);
        loginDialog.setContentView(R.layout.dialog_login);
        Button loginBtn = (Button) loginDialog.findViewById(R.id.btnDialogLogin);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Login Successful", Toast.LENGTH_LONG).show();
            }
        });
        return loginDialog;
    }
}
