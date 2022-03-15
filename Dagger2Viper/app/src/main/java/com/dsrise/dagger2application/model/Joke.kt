package com.dsrise.dagger2application.model

import android.os.Parcel
import android.os.Parcelable


data class Joke(
    val site: String,
    val desc: String,
    val link: String,
    val name: String,
    val elementPureElement: String
):Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(site)
        parcel.writeString(desc)
        parcel.writeString(link)
        parcel.writeString(name)
        parcel.writeString(elementPureElement)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Joke> {
        override fun createFromParcel(parcel: Parcel): Joke {
            return Joke(parcel)
        }

        override fun newArray(size: Int): Array<Joke?> {
            return arrayOfNulls(size)
        }
    }
}