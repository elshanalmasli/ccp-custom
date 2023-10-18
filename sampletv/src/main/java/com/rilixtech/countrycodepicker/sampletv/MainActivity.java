package com.rilixtech.countrycodepicker.sampletv;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends Activity {

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    com.hbb20.CountryCodePicker
            ccp = findViewById(R.id.ccp);
    EditText edtPhone = findViewById(R.id.phone_number_edt);

    ccp.registerCarrierNumberEditText(edtPhone);
  }
}
