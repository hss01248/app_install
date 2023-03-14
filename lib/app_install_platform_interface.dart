import 'package:plugin_platform_interface/plugin_platform_interface.dart';

import 'app_install_method_channel.dart';

abstract class AppInstallPlatform extends PlatformInterface {
  /// Constructs a AppInstallPlatform.
  AppInstallPlatform() : super(token: _token);

  static final Object _token = Object();

  static AppInstallPlatform _instance = MethodChannelAppInstall();

  /// The default instance of [AppInstallPlatform] to use.
  ///
  /// Defaults to [MethodChannelAppInstall].
  static AppInstallPlatform get instance => _instance;
  
  /// Platform-specific implementations should set this with their own
  /// platform-specific class that extends [AppInstallPlatform] when
  /// they register themselves.
  static set instance(AppInstallPlatform instance) {
    PlatformInterface.verifyToken(instance, _token);
    _instance = instance;
  }

  Future<String?> getPlatformVersion() {
    throw UnimplementedError('platformVersion() has not been implemented.');
  }
}
