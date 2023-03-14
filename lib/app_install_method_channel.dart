import 'package:flutter/foundation.dart';
import 'package:flutter/services.dart';

import 'app_install_platform_interface.dart';

/// An implementation of [AppInstallPlatform] that uses method channels.
class MethodChannelAppInstall extends AppInstallPlatform {
  /// The method channel used to interact with the native platform.
  @visibleForTesting
  final methodChannel = const MethodChannel('app_install');

  @override
  Future<String?> getPlatformVersion() async {
    final version = await methodChannel.invokeMethod<String>('getPlatformVersion');
    return version;
  }
}
