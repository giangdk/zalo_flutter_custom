package com.example.login_zalo

import com.zing.zalo.zalosdk.oauth.ZaloSDKApplication
import io.flutter.app.FlutterApplication
import io.flutter.plugin.common.PluginRegistry

class MyApplication : FlutterApplication(), PluginRegistry.PluginRegistrantCallback {
    override fun onCreate() {
        super.onCreate()
        ZaloSDKApplication.wrap(this)
    }
    override fun registerWith(registry: PluginRegistry) {}
}
