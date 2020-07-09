package com.josephwong.maestrofication.ui.browse

import com.josephwong.maestrofication.models.MaestroResponseWrapper

sealed class BrowseActivityViewState {
    object Loading : BrowseActivityViewState()
    class Ready(val maestroResponseWrapper: MaestroResponseWrapper?) : BrowseActivityViewState()
    class Error(val errorMsg: Any) : BrowseActivityViewState()
}