package com.example.diaryapp_jc.navigation

import com.example.diaryapp_jc.util.Constants.WRITE_SCREEN_DIARY_ID_ARG

sealed class Screen(val route: String) {

    object Authentication : Screen("authentication")
    object Home : Screen("home")
    object Write : Screen("write?$WRITE_SCREEN_DIARY_ID_ARG={$WRITE_SCREEN_DIARY_ID_ARG}") {
        fun passId(diaryId: String) =
            "write?$WRITE_SCREEN_DIARY_ID_ARG={$diaryId}"
    }
}
