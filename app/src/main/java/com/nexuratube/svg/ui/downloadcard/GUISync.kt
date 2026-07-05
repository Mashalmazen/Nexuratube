package com.nexuratube.svg.ui.downloadcard

import com.nexuratube.svg.database.models.ResultItem

interface GUISync {
    fun updateTitleAuthor(t: String, a: String)
    fun updateUI(res: ResultItem?)
}