package com.ngab.primatesinindonesia

object ProfileData {

    val listData: ArrayList<Profile> get() {
        val list = arrayListOf<Profile>()
        val profile = Profile()
        profile.name = "William Yishmael Tangka"
        profile.email = "wtangka22@gmail.com"
        profile.photo = R.drawable.profile_pict
        list.add(profile)
        return list
    }
}