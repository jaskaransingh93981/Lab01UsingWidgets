package com.example.lab01usingwidgets;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView labelTextView;

    private EditText inputEditText;

    private Button updateTextButton;

    private CheckBox sampleCheckBox;

    private Switch sampleSwitch;

    private RadioGroup sampleRadioGroup;

    private ImageButton dimensionImageButton;

    private ImageView sampleImageView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find Views
        labelTextView = findViewById(R.id.labelTextView);
        inputEditText = findViewById(R.id.inputEditText);
        updateTextButton = findViewById(R.id.updateTextButton);
        sampleCheckBox = findViewById(R.id.sampleCheckBox);
        sampleSwitch = findViewById(R.id.sampleSwitch);
        sampleRadioGroup = findViewById(R.id.sampleRadioGroup);
        View dimensionradioButton = findViewById(R.id.radioButton1);
        sampleImageView = findViewById(R.id.sampleImageView);

        // Button to update TextView
        updateTextButton.setOnClickListener(v -> labelTextView.setText(inputEditText.getText().toString()));

        // Toast with the state of CheckBox, Switch, and RadioButton
        // dimensionImageButton.setOnClickListener(v -> {
        // int width = sampleImageView.getWidth();
        // int height = sampleImageView.getHeight();
        String checkboxState = sampleCheckBox.isChecked() ? "Checked" : "Unchecked";
        String switchState = sampleSwitch.isChecked() ? "On" : "Off";
        RadioButton selectedRadioButton = findViewById(sampleRadioGroup.getCheckedRadioButtonId());
        String radioState = selectedRadioButton != null ? selectedRadioButton.getText().toString() : "None";

        Toast.makeText(MainActivity.this,
                "Dimensions -> Width: " + 600 + ", Height: " + 600 + "\n" +
                        "Checkbox: " + checkboxState + "\n" +
                        "Switch: " + switchState + "\n" +
                        "Radio Button: " + radioState,
                Toast.LENGTH_SHORT).show();
    };

    // Optional: Add a TextWatcher to dynamically update TextView
    // inputEditText.addTextChangedListener(new TextWatcher() {

}

