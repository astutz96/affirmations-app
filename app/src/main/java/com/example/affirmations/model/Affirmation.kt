package com.example.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

class Affirmation(
    //These @XXX will provide warnings if the implementer of this class provides the wrong resource type
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int) {
}