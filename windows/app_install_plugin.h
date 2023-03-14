#ifndef FLUTTER_PLUGIN_APP_INSTALL_PLUGIN_H_
#define FLUTTER_PLUGIN_APP_INSTALL_PLUGIN_H_

#include <flutter/method_channel.h>
#include <flutter/plugin_registrar_windows.h>

#include <memory>

namespace app_install {

class AppInstallPlugin : public flutter::Plugin {
 public:
  static void RegisterWithRegistrar(flutter::PluginRegistrarWindows *registrar);

  AppInstallPlugin();

  virtual ~AppInstallPlugin();

  // Disallow copy and assign.
  AppInstallPlugin(const AppInstallPlugin&) = delete;
  AppInstallPlugin& operator=(const AppInstallPlugin&) = delete;

 private:
  // Called when a method is called on this plugin's channel from Dart.
  void HandleMethodCall(
      const flutter::MethodCall<flutter::EncodableValue> &method_call,
      std::unique_ptr<flutter::MethodResult<flutter::EncodableValue>> result);
};

}  // namespace app_install

#endif  // FLUTTER_PLUGIN_APP_INSTALL_PLUGIN_H_
