package com.josephwong.maestrofication.ui.maestro

import com.josephwong.maestrofication.models.MaestroResponseWrapper

sealed class MaestroFragmentViewState {
    object Loading : MaestroFragmentViewState()
    class Ready(val maestroResponseWrapper: MaestroResponseWrapper?) : MaestroFragmentViewState()
    class Error(val errorMsg: Any) : MaestroFragmentViewState()
}