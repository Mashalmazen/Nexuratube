package com.nexuratube.svg.database.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import androidx.preference.PreferenceManager
import com.nexuratube.svg.R
import com.nexuratube.svg.database.DBManager
import com.nexuratube.svg.database.enums.DownloadType
import com.nexuratube.svg.database.models.DownloadItem
import com.nexuratube.svg.database.models.Format
import com.nexuratube.svg.database.models.FormatRecyclerView
import com.nexuratube.svg.database.models.ResultItem
import com.nexuratube.svg.database.repository.DownloadRepository
import com.nexuratube.svg.ui.downloadcard.FormatSelectionBottomSheetDialog.FormatCategory
import com.nexuratube.svg.ui.downloadcard.FormatSelectionBottomSheetDialog.FormatSorting
import com.nexuratube.svg.ui.downloadcard.FormatTuple
import com.nexuratube.svg.ui.downloadcard.MultipleItemFormatTuple
import com.nexuratube.svg.util.Extensions.isYoutubeURL
import com.nexuratube.svg.util.FileUtil
import com.nexuratube.svg.util.FormatUtil
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.launch
import java.io.File

class DownloadCardViewModel(application: Application) : AndroidViewModel(application) {
    var resultItem: ResultItem? = null
        private set

    var downloadItem: DownloadItem? = null
        private set

    fun setDownloadItem(item: DownloadItem?) {
        downloadItem = item
    }

    fun setResultItem(item: ResultItem?) {
        resultItem = item
    }
}