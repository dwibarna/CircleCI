package com.example.submission2bfaa.db

import android.net.Uri
import android.provider.BaseColumns

internal class DatabaseContract {
    companion object {
        const val AUTHORITY = "com.example.submission2bfaa"
        const val SCHEME = "content"
    }

    internal class UserFavoriteColumns : BaseColumns {
        companion object {
            const val TABLE_NAME = "favorite"
            const val USERNAME = "username"
            const val AVATAR = "avatar"
            const val COMPANY = "company"
            const val LOCATION = "location"
            const val REPOSITORY = "repository"
            const val FOLLOWERS = "followers"
            const val FOLLOWING = "following"

            val CONTENT_URI: Uri = Uri.Builder().scheme(SCHEME).authority(AUTHORITY).appendPath(
                TABLE_NAME
            ).build()

        }
    }
}