package id.forum.gowes.navigation

import android.view.View
import androidx.annotation.FloatRange
import id.forum.core.util.normalize

/**
 * Callback used to run actions when the offset/progress of [BottomNavDrawerFragment]'s account
 * picker sandwich animation changes.
 */
interface OnSandwichSlideAction {

    /**
     * Called when the sandwich animation is running, either opening or closing the account picker.
     * [slideOffset] is a value between 0 and 1. 0 represents the closed, default state with the
     * account picker not visible. 1 represents the open state with the account picker visible.
     */
    fun onSlide(
        @FloatRange(
            from = 0.0,
            fromInclusive = true,
            to = 1.0,
            toInclusive = true
        ) slideOffset: Float
    )
}

/**
 * Rotate the given [view] counter-clockwise by 180 degrees.
 */
class HalfCounterClockwiseRotateSlideAction(
    private val view: View
) : OnSandwichSlideAction {
    override fun onSlide(slideOffset: Float) {
        view.rotation = slideOffset.normalize(
            0F,
            1F,
            180F,
            0F
        )
    }
}