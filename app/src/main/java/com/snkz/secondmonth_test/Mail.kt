package com.snkz.secondmonth_test

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Mail(val avatar : Int, val name : String, val des : String, val content : String, val time : String, var farvoriteStatus : Int) : Parcelable
