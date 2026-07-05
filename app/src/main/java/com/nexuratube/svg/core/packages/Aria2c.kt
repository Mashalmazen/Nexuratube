package com.nexuratube.svg.core.packages

object Aria2c : PackageBase() {
    override val executableName: String get() = "aria2c"
    override val packageFolderName: String get() = "aria2c"
    override val bundledZipName: String get() = "libaria2c.zip.so"
    override val canUninstall: Boolean = false
    override val bundledVersion: String get() = "v1.37.0"
    override val githubRepo: String  get() = "Mashalmazen/Nexuratube-packages"
    override val githubPackageName: String  get() = "aria2c"
    override val apkPackage: String get() = "com.nexuratube.svg.aria2c"
}