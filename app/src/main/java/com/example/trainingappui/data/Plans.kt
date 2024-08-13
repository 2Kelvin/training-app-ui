package com.example.trainingappui.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.trainingappui.R

data class WorkOut (
    @StringRes val txt: Int,
    @DrawableRes val imgID: Int
)

val workoutPlans = listOf(
    WorkOut(R.string.training_plan, R.drawable.pic_five),
    WorkOut(R.string.meal_plan, R.drawable.pic_three),
    WorkOut(R.string.supplement_plan, R.drawable.pic_four),
    WorkOut(R.string.biceps_plan, R.drawable.pic_two),
    WorkOut(R.string.legs_plan, R.drawable.pic_one),
)