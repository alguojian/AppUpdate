package com.alguojian.app

import com.alguojian.appupdate.base.BaseHttpDownloadManager
import com.alguojian.appupdate.base.bean.DownloadStatus
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class MyDownload : BaseHttpDownloadManager() {


    override fun download(
        apkUrl: String, apkName: String
    ): Flow<DownloadStatus> {
        return flow { }
    }

    override fun cancel() {
    }

    override fun release() {
    }
}