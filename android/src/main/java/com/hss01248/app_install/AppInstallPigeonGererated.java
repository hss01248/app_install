// Autogenerated from Pigeon (v1.0.19), do not edit directly.
// See also: https://pub.dev/packages/pigeon

package com.hss01248.app_install;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

/** Generated class from Pigeon. */
@SuppressWarnings({"unused", "unchecked", "CodeBlock2Expr", "RedundantSuppression"})
public class AppInstallPigeonGererated {

  public interface Result<T> {
    void success(T result);
    void error(Throwable error);
  }
  private static class AppInstallerCodec extends StandardMessageCodec {
    public static final AppInstallerCodec INSTANCE = new AppInstallerCodec();
    private AppInstallerCodec() {}
  }

  /** Generated interface from Pigeon that represents a handler of messages from Flutter.*/
  public interface AppInstaller {
    void install(String filePath, Result<Map<String, Object>> result);

    /** The codec used by AppInstaller. */
    static MessageCodec<Object> getCodec() {
      return AppInstallerCodec.INSTANCE;
    }

    /** Sets up an instance of `AppInstaller` to handle messages through the `binaryMessenger`. */
    static void setup(BinaryMessenger binaryMessenger, AppInstaller api) {
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.AppInstaller.install", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              ArrayList<Object> args = (ArrayList<Object>)message;
              String filePathArg = (String)args.get(0);
              if (filePathArg == null) {
                throw new NullPointerException("filePathArg unexpectedly null.");
              }
              Result<Map<String, Object>> resultCallback = new Result<Map<String, Object>>() {
                public void success(Map<String, Object> result) {
                  wrapped.put("result", result);
                  reply.reply(wrapped);
                }
                public void error(Throwable error) {
                  wrapped.put("error", wrapError(error));
                  reply.reply(wrapped);
                }
              };

              api.install(filePathArg, resultCallback);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
              reply.reply(wrapped);
            }
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
    }
  }
  private static Map<String, Object> wrapError(Throwable exception) {
    Map<String, Object> errorMap = new HashMap<>();
    errorMap.put("message", exception.toString());
    errorMap.put("code", exception.getClass().getSimpleName());
    errorMap.put("details", "Cause: " + exception.getCause() + ", Stacktrace: " + Log.getStackTraceString(exception));
    return errorMap;
  }
}
