#include "include/app_install/app_install_plugin_c_api.h"

#include <flutter/plugin_registrar_windows.h>

#include "app_install_plugin.h"

void AppInstallPluginCApiRegisterWithRegistrar(
    FlutterDesktopPluginRegistrarRef registrar) {
  app_install::AppInstallPlugin::RegisterWithRegistrar(
      flutter::PluginRegistrarManager::GetInstance()
          ->GetRegistrar<flutter::PluginRegistrarWindows>(registrar));
}
