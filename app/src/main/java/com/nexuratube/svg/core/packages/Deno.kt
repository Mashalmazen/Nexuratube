package com.nexuratube.svg.core.packages

object Deno : PackageBase() {
    override val executableName: String get() = "deno"
    override val packageFolderName: String get() = "deno"
    override val bundledZipName: String get() = "libdeno.zip.so"
    override val canUninstall: Boolean = true
    override val bundledVersion: String get() = ""
    override val githubRepo: String  get() = "Mashalmazen/Nexuratube-packages"
    override val githubPackageName: String  get() = "deno"
    override val apkPackage: String get() = "com.nexuratube.svg.deno"
}