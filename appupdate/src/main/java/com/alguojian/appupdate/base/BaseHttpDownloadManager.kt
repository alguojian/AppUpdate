package com.alguojian.appupdate.base

import com.alguojian.appupdate.base.bean.DownloadStatus
import kotlinx.coroutines.flow.Flow

abstract class BaseHttpDownloadManager {
    /**
     * download apk from apkUrl
     *
     * @param apkUrl
     * @param apkName
     */
    abstract fun download(apkUrl: String, apkName: String): Flow<DownloadStatus>

    /**
     * cancel download apk
     */
    abstract fun cancel()

    /**
     * release memory
     */
    abstract fun release()
}