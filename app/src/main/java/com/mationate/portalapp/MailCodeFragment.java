package com.mationate.portalapp;


import android.app.AlertDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class MailCodeFragment extends Fragment {


    public MailCodeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mail_code, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final EditText codeEt = view.findViewById(R.id.codeInput);
        final Button setCodeBtn = view.findViewById(R.id.toSetCodeBtn);
        final Button myMailBtn = view.findViewById(R.id.myMailBtn);
        final TextView codeAlertText = view.findViewById(R.id.codeAlertText);
        final Button registerBtn = view.findViewById(R.id.registerBtn);


        setCodeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myMailBtn.setVisibility(View.GONE);
                setCodeBtn.setVisibility(View.GONE);
                codeEt.setVisibility(View.VISIBLE);
                codeAlertText.setVisibility(View.VISIBLE);
            }

        });

        myMailBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getActivity().getPackageManager().getLaunchIntentForPackage("com.google.android.gm");
                startActivity(intent);
            }
        });
        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (codeEt.getText().toString().trim().length() == 5) {
                    AlertDialog.Builder alertDialog = new AlertDialog.Builder(getActivity());
                    alertDialog.setMessage("Felicidades, tu cuenta ha sido creada");
                    alertDialog.show();
                    /*Toast.makeText(getContext(), "Felicidades, tu cuenta ha sido creada !", Toast.LENGTH_SHORT).show();*/
                } else {
                    Toast.makeText(getContext(), "Tu código es incorrecto.", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }


}

/**/
