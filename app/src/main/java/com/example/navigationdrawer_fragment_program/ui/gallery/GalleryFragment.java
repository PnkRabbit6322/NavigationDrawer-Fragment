package com.example.navigationdrawer_fragment_program.ui.gallery;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.navigationdrawer_fragment_program.R;
import com.example.navigationdrawer_fragment_program.databinding.FragmentGalleryBinding;

public class GalleryFragment extends Fragment {

    private FragmentGalleryBinding binding;

    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDiv, buttonMul,
            buttonC, buttonEqual, buttonCE, buttonSign, buttonDecimal, buttonDelete;
    TextView answerView, equationView;
    float num1, num2, numAns;
    boolean funcAdd, funcSub, funcMul, funcDiv;

    @SuppressLint("SetTextI18n")
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentGalleryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        button0 = root.findViewById(R.id.button0);
        button1 = root.findViewById(R.id.button1);
        button2 = root.findViewById(R.id.button2);
        button3 = root.findViewById(R.id.button3);
        button4 = root.findViewById(R.id.button4);
        button5 = root.findViewById(R.id.button5);
        button6 = root.findViewById(R.id.button6);
        button7 = root.findViewById(R.id.button7);
        button8 = root.findViewById(R.id.button8);
        button9 = root.findViewById(R.id.button9);
        buttonAdd = root.findViewById(R.id.buttonAdd);
        buttonSub = root.findViewById(R.id.buttonSub);
        buttonMul = root.findViewById(R.id.buttonMul);
        buttonDiv = root.findViewById(R.id.buttonDiv);
        buttonC = root.findViewById(R.id.buttonC);
        buttonCE = root.findViewById(R.id.buttonCE);
        buttonEqual = root.findViewById(R.id.buttonEqual);
        buttonSign = root.findViewById(R.id.buttonSign);
        buttonDecimal = root.findViewById(R.id.buttonDecimal);
        buttonDelete = root.findViewById(R.id.buttonDelete);

        answerView = root.findViewById(R.id.answerView);
        equationView = root.findViewById(R.id.equationView);

        button1.setOnClickListener(v -> {
            if (equationView.getText().toString().contains("=")) {
                answerView.setText("1");
                equationView.setText("");
            } else {
                answerView.setText(answerView.getText() + "1");
            }
        });
        button2.setOnClickListener(v -> {
            if (equationView.getText().toString().contains("=")) {
                answerView.setText("2");
                equationView.setText("");
            } else {
                answerView.setText(answerView.getText() + "2");
            }
        });
        button3.setOnClickListener(v -> {
            if (equationView.getText().toString().contains("=")) {
                answerView.setText("3");
                equationView.setText("");
            } else {
                answerView.setText(answerView.getText() + "3");
            }
        });
        button4.setOnClickListener(v -> {
            if (equationView.getText().toString().contains("=")) {
                answerView.setText("4");
                equationView.setText("");
            } else {
                answerView.setText(answerView.getText() + "4");
            }
        });
        button5.setOnClickListener(v -> {
            if (equationView.getText().toString().contains("=")) {
                answerView.setText("5");
                equationView.setText("");
            } else {
                answerView.setText(answerView.getText() + "5");
            }
        });
        button6.setOnClickListener(v -> {
            if (equationView.getText().toString().contains("=")) {
                answerView.setText("6");
                equationView.setText("");
            } else {
                answerView.setText(answerView.getText() + "6");
            }
        });
        button7.setOnClickListener(v -> {
            if (equationView.getText().toString().contains("=")) {
                answerView.setText("7");
                equationView.setText("");
            } else {
                answerView.setText(answerView.getText() + "7");
            }
        });
        button8.setOnClickListener(v -> {
            if (equationView.getText().toString().contains("=")) {
                answerView.setText("8");
                equationView.setText("");
            } else {
                answerView.setText(answerView.getText() + "8");
            }
        });
        button9.setOnClickListener(v -> {
            if (equationView.getText().toString().contains("=")) {
                answerView.setText("9");
                equationView.setText("");
            } else {
                answerView.setText(answerView.getText() + "9");
            }
        });
        button0.setOnClickListener(v -> {
            if (equationView.getText().toString().contains("=")) {
                answerView.setText("0");
                equationView.setText("");
            } else {
                answerView.setText(answerView.getText() + "0");
            }
        });
        buttonDecimal.setOnClickListener(v -> answerView.setText(answerView.getText() + "."));

        buttonSign.setOnClickListener(v -> {
            String answerViewText = answerView.getText().toString();
            if (!answerViewText.isEmpty()) {
                if (answerView.getText().toString().contains("-")) {
                    answerView.setText(answerView.getText().toString().replace("-", ""));
                } else answerView.setText("-" + answerView.getText());
            }
        });

        buttonAdd.setOnClickListener(v -> {
            if (answerView.getText().toString().trim().length() != 0) {
                num1 = Float.parseFloat(answerView.getText() + "");
                funcAdd = true;
                equationView.setText(answerView.getText() + "+");
            }
            answerView.setText("");
        });

        buttonSub.setOnClickListener(v -> {
            if (answerView.getText().toString().trim().length() != 0) {
                num1 = Float.parseFloat(answerView.getText() + "");
                funcSub = true;
                equationView.setText(answerView.getText() + "-");
            }
            answerView.setText("");
        });

        buttonMul.setOnClickListener(v -> {
            if (answerView.getText().toString().trim().length() != 0) {
                num1 = Float.parseFloat(answerView.getText() + "");
                funcMul = true;
                equationView.setText(answerView.getText() + "*");
            }
            answerView.setText("");
        });

        buttonDiv.setOnClickListener(v -> {
            if (answerView.getText().toString().trim().length() != 0) {
                num1 = Float.parseFloat(answerView.getText() + "");
                funcDiv = true;
                equationView.setText(answerView.getText() + "/");
            }
            answerView.setText("");
        });

        buttonEqual.setOnClickListener(v -> {
            if (equationView.getText().toString().trim().length() != 0) {
                num2 = Float.parseFloat(answerView.getText() + "");

                if (funcAdd) {
                    numAns = num1 + num2;
                    equationView.setText(equationView.getText() + answerView.getText().toString() + "=");
                    funcAdd = false;
                }
                if (funcSub) {
                    numAns = num1 - num2;
                    equationView.setText(equationView.getText() + answerView.getText().toString() + "=");
                    funcSub = false;
                }
                if (funcMul) {
                    numAns = num1 * num2;
                    equationView.setText(equationView.getText() + answerView.getText().toString() + "=");
                    funcMul = false;
                }
                if (funcDiv) {
                    numAns = num1 / num2;
                    equationView.setText(equationView.getText() + answerView.getText().toString() + "=");
                    funcDiv = false;
                }
                String ans = String.valueOf(numAns).replaceAll("\\.0+$", "");
                answerView.setText(ans + "");
            } else if (answerView.getText().toString().trim().length() != 0) {
                num1 = Float.parseFloat(answerView.getText() + "");
                String ans = String.valueOf(num1).replaceAll("\\.0+$", "");
                answerView.setText(ans + "");
            }
        });

        buttonC.setOnClickListener(v -> {
            answerView.setText("");
            equationView.setText("");
            numAns = 0;
        });

        buttonCE.setOnClickListener(v -> {
            if (equationView.getText().toString().contains("=")) {
                answerView.setText("");
                equationView.setText("");
                numAns = 0;
            } else answerView.setText("");
        });

        buttonDelete.setOnClickListener(v -> {
            if (!answerView.getText().toString().isEmpty()) {
                String s = answerView.getText().toString();
                s = s.substring(0, s.length() - 1);
                answerView.setText(s);
            }
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}