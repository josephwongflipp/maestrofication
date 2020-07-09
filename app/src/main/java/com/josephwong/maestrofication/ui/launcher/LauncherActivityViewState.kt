package com.josephwong.maestrofication.ui.launcher

import com.josephwong.maestrofication.models.MaestroResponseWrapper

sealed class LauncherActivityViewState {
    object Loading : LauncherActivityViewState()
    class Ready(val maestroResponseWrapper: MaestroResponseWrapper?) : LauncherActivityViewState()
    class Error(val errorMsg: Any) : LauncherActivityViewState()
}