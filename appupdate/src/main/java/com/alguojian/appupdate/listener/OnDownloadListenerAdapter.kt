package com.alguojian.appupdate.listener

import java.io.File

abstract class OnDownloadListenerAdapter : OnDownloadListener {
    override fun start() {
    }

    override fun downloading(max: Int, progress: Int) {
    }

    override fun done(apk: File) {
    }

    override fun cancel() {
    }

    override fun error(e: Throwable) {
    }
}