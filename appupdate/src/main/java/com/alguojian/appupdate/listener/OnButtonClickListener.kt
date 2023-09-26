package com.alguojian.appupdate.listener


interface OnButtonClickListener {
    companion object {
        /**
         * click update button
         */
        const val UPDATE = 0

        /**
         * click cancel button
         */
        const val CANCEL = 1
    }

    fun onButtonClick(id: Int)
}