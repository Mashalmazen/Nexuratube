package com.nexuratube.svg.core.packages

object FFmpeg : PackageBase() {
    override val executableName: String get() = "ffmpeg"
    override val packageFolderName: String get() = "ffmpeg"
    override val bundledZipName: String get() = "libffmpeg.zip.so"
    override val canUninstall: Boolean = false
    override val bundledVersion: String get() = "v7.0.1"
    override val githubRepo: String  get() = "Mashalmazen/Nexuratube-packages"
    override val githubPackageName: String  get() = "ffmpeg"
    override val apkPackage: String get() = "com.nexuratube.svg.ffmpeg"
}