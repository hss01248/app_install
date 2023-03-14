//
//  Generated file. Do not edit.
//

// clang-format off

#include "generated_plugin_registrant.h"

#include <app_install/app_install_plugin.h>

void fl_register_plugins(FlPluginRegistry* registry) {
  g_autoptr(FlPluginRegistrar) app_install_registrar =
      fl_plugin_registry_get_registrar_for_plugin(registry, "AppInstallPlugin");
  app_install_plugin_register_with_registrar(app_install_registrar);
}
