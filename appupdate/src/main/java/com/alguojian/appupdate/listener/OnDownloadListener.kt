package com.alguojian.appupdate.listener

import java.io.File


interface OnDownloadListener {
    /**
     * start download
     */
    fun start()

    /**
     *
     * @param max      file length
     * @param progress downloaded file size
     */
    fun downloading(max: Int, progress: Int)

    /**
     * @param apk
     */
    fun done(apk: File)

    /**
     * cancel download
     */
    fun cancel()

    /**
     *
     * @param e
     */
    fun error(e: Throwable)
}