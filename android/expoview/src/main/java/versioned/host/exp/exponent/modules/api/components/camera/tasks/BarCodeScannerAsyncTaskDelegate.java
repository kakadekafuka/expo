package versioned.host.exp.exponent.modules.api.components.camera.tasks;

import versioned.host.exp.exponent.modules.api.components.camera.utils.ExpoBarCodeDetector;

public interface BarCodeScannerAsyncTaskDelegate {
  void onBarCodeRead(ExpoBarCodeDetector.Result barCode);
  void onBarCodeScanningTaskCompleted();
}
