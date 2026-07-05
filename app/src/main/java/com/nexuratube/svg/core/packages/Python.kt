package com.nexuratube.svg.core.packages

object Python : PackageBase() {
    override val executableName: String get() = "python"
    override val packageFolderName: String get() = "python"
    override val bundledZipName: String get() = "libpython.zip.so"
    override val bundledVersion: String get() = "v3.12.11"
    override val canUninstall: Boolean = false
    override val githubRepo: String  get() = "Mashalmazen/Nexuratube-packages"
    override val githubPackageName: String  get() = "python"
    override val apkPackage: String get() = "com.nexuratube.svg.python"
}