
package com.civic.identity.rn.sdk;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import android.widget.Toast;

public class RNHelloLibraryModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNHelloLibraryModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNHelloLibrary";
  }

  @ReactMethod
  public void show(String message) {
    Toast.makeText(getReactApplicationContext(), message, Toast.LENGTH_SHORT).show();
        // successCallback.invoke("Callback $message popped")
        // //alternative send an event if we don't want to use a callback
        // val params = Arguments.createMap()
        // params.putString("message","Hello from the otherside \uD83D\uDC7D")
        // sendEvent(reactApplicationContext, "onToasterPop", params)
  }

}