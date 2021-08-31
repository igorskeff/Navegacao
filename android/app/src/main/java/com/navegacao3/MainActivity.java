package com.navegacao3;

import com.facebook.react.ReactActivity;
import android.os.Bundle; // Adicionado segundo a documentação do React Navigation

public class MainActivity extends ReactActivity {

  /**
   * Returns the name of the main component registered from JavaScript. This is used to schedule
   * rendering of the component.
   */
  @Override
  protected String getMainComponentName() {
    return "Navegacao3";
  }

  // Adicionado segundo a documentação do React Navigation
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(null);
  }
}
