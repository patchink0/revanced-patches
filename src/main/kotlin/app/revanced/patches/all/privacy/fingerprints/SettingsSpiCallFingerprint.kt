package app.revanced.patches.all.privacy.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint
import com.android.tools.smali.dexlib2.AccessFlags

internal object SettingsSpiCallFingerprint : MethodFingerprint(
    returnType = "L",
    accessFlags = AccessFlags.PUBLIC.value,
    strings = listOf("Settings request failed."),
    customFingerprint = { _, classDef ->
        classDef.sourceFile == "DefaultSettingsSpiCall.java"
    }
)