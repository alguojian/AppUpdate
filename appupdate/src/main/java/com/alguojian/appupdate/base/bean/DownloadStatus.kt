package com.alguojian.appupdate.base.bean

import java.io.File



sealed class DownloadStatus {

    object Start : DownloadStatus()

    data class Downloading(val max: Int, val progress: Int) : DownloadStatus()

    class Done(val apk: File) : DownloadStatus()

    object Cancel : DownloadStatus()

    data class Error(val e: Throwable) : DownloadStatus()
}
