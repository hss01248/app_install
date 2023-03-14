import 'package:pigeon/pigeon.dart';

// Flutter 调用原生代码

@HostApi()
abstract class AppInstaller {

  /**
   * 几种模式互斥
   * 默认定位时显示loading
   */
  @deprecated
  @async
  Map<String,Object> install(String filePath );


}
