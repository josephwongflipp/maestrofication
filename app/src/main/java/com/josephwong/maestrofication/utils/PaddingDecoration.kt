package com.josephwong.maestrofication.utils

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

/**
 * Sets the appropriate padding for a single column recyclerView
 *
 * - All items have a left and right padding
 * - First item has a top padding
 * - Last item has a bottom padding.
 */
class PaddingDecoration(private val p: Int) : RecyclerView.ItemDecoration() {

    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        val itemPosition = parent.getChildAdapterPosition(view);
        val itemCount = state.itemCount

        if (itemPosition == 0) {
            outRect.set(p, p, p, 0)
        } else if (itemCount > 0 && itemPosition == itemCount - 1) {
            outRect.set(p, 0, p, p)
        } else {
            outRect.set(p, 0, p, 0)
        }
    }


}