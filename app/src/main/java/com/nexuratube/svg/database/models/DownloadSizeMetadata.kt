package com.nexuratube.svg.database.models

import com.nexuratube.svg.database.enums.DownloadType

data class DownloadSizeMetadata(
    val id: Long,
    val type: DownloadType,
    val format: Format,
    val allFormats: List<Format>,
    val videoPreferences: VideoPreferences
)