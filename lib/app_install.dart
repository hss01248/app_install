
import 'app_install_platform_interface.dart';

class AppInstall {
  Future<String?> getPlatformVersion() {
    return AppInstallPlatform.instance.getPlatformVersion();
  }
}
