package com.hss01248.app_install;

import com.hss01248.apkinstaller.ApkInstallUtil;
import com.hss01248.apkinstaller.InstallCallback;

import java.util.HashMap;
import java.util.Map;

/**
 * @Despciption todo
 * @Author hss
 * @Date 13/03/2023 17:52
 * @Version 1.0
 */
public class AppInstallerImpl implements AppInstallPigeonGererated.AppInstaller{
    @Override
    public void install(String filePath, AppInstallPigeonGererated.Result<Map<String, Object>> result) {

        ApkInstallUtil.checkAndInstallApk(filePath, new InstallCallback() {
            @Override
            public void onError(String code, String msg) {
                result.error(new Throwable(code+"\n"+msg));
            }

            @Override
            public void onInstall() {
                result.success(new HashMap<>());
            }
        });
    }
}
