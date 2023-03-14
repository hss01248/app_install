import 'package:flutter_test/flutter_test.dart';
import 'package:app_install/app_install.dart';
import 'package:app_install/app_install_platform_interface.dart';
import 'package:app_install/app_install_method_channel.dart';
import 'package:plugin_platform_interface/plugin_platform_interface.dart';

class MockAppInstallPlatform 
    with MockPlatformInterfaceMixin
    implements AppInstallPlatform {

  @override
  Future<String?> getPlatformVersion() => Future.value('42');
}

void main() {
  final AppInstallPlatform initialPlatform = AppInstallPlatform.instance;

  test('$MethodChannelAppInstall is the default instance', () {
    expect(initialPlatform, isInstanceOf<MethodChannelAppInstall>());
  });

  test('getPlatformVersion', () async {
    AppInstall appInstallPlugin = AppInstall();
    MockAppInstallPlatform fakePlatform = MockAppInstallPlatform();
    AppInstallPlatform.instance = fakePlatform;
  
    expect(await appInstallPlugin.getPlatformVersion(), '42');
  });
}
