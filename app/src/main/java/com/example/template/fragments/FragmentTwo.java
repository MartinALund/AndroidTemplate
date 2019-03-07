package com.example.template.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.template.R;

public class FragmentTwo extends BaseFragment {

    private Button btnHelloToast;

    @Nullable
    @Override
    //Oprettelse af view --> Sker før view er oprettet
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //Inflate view ("pust" view ind i container og vis det frem)
        return inflater.inflate(R.layout.fragment_two, container, false);
    }

    @Override
    //Når view er oprettet og man kan arbejde med elementer
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        btnHelloToast = getMainActivity().findViewById(R.id.btn_hello_second_toast);

        btnHelloToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Hej fra toast", Toast.LENGTH_SHORT).show();
            }
        });
        super.onViewCreated(view, savedInstanceState);
    }


}
