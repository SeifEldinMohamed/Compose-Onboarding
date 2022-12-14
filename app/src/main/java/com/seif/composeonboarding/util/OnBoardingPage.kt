package com.seif.composeonboarding.util
import androidx.annotation.DrawableRes
import com.seif.composeonboarding.R

sealed class OnBoardingPage(
    @DrawableRes
    val image: Int, // Denotes that an integer parameter, field or method return value is expected to be a drawable resource
    val title: String,
    val description: String
) {
    object First : OnBoardingPage(
        image = R.drawable.first,
        title = "Meeting",
        description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod."
    )

    object Second : OnBoardingPage(
        image = R.drawable.second,
        title = "Coordination",
        description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod."
    )

    object Third : OnBoardingPage(
        image = R.drawable.third,
        title = "Dialogue",
        description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod."
    )
}