package com.ride;

import com.facebook.react.ReactActivity;

// Added for FB Auth
import android.content.Intent;

public class MainActivity extends ReactActivity {
  
  // Added for FB Auth
  @Override
  public void onActivityResult(int requestCode, int resultCode, Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    MainApplication.getCallbackManager().onActivityResult(requestCode, resultCode, data);
  }

  /**
   * Returns the name of the main component registered from JavaScript.
   * This is used to schedule rendering of the component.
   */
  @Override
  protected String getMainComponentName() {
    return "ride";
  }
}
