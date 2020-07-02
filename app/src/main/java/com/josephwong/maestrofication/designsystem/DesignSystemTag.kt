// Copyright (c) 2020 Wishabi. All rights reserved.

package com.josephwong.maestrofication.designsystem

import android.content.Context
import android.content.res.TypedArray
import android.util.AttributeSet
import android.view.View
import android.widget.FrameLayout
import android.widget.TextView
import androidx.annotation.StringRes
import com.josephwong.maestrofication.R

/**
 * Design System `Tag` Component
 * https://confluence.wishabi.com/display/NDS/Tag
 *
 * This Design System component is a FrameLayout that wraps a TextView. It is designed this
 * way on purpose to allow for possible iterations down the road to add more child views.
 */
class DesignSystemTag @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
    defStyleRes: Int = 0
) : FrameLayout(context, attrs, defStyleAttr) {

    enum class Style(val style: Int) {
        NEW(0),
        PREVIEW(1),
        EXPIRING(2)
    }

    // Allows access to the XML styles
    private val styles: TypedArray = context.obtainStyledAttributes(
        attrs,
        R.styleable.DesignSystemTag,
        defStyleAttr,
        defStyleRes
    )

    // Views
    private val container: View = inflate(context, R.layout.design_system_tag, this)
    val tagTextView: TextView = container.findViewById(R.id.design_system_tag_text)

    init {
        // Reads the XML attrs and applies the style, otherwise defaults to thew NEW style.
        val attrStyleValue: Int =
            styles.getInt(R.styleable.DesignSystemTag_tagStyle, Style.NEW.style)
        val style: Style = Style.values()[attrStyleValue]
        setTagStyle(style)

        // Reads the XML attrs and applies text to the TextView
        val text: CharSequence? = styles.getText(R.styleable.DesignSystemTag_android_text)
        tagTextView.text = text
    }

    /**
     * Programmatically change the tag style.
     *
     * Nothing special, simply updates the background of the root view to a pre-defined xml
     * drawable and updates the text of the child TextView.
     *
     * NOTE: If you plan on adding more styles, update attrs.xml as well!!
     */
    fun setTagStyle(style: Style) {
        when (style) {
            Style.NEW -> {
                this.background =
                    context.resources.getDrawable(R.drawable.design_system_tag_new, null)
                tagTextView.setTextColor(resources.getColor(R.color.primary3, null))
            }
            Style.PREVIEW -> {
                this.background =
                    context.resources.getDrawable(R.drawable.design_system_tag_preview, null)
                tagTextView.setTextColor(resources.getColor(R.color.success3, null))
            }
            Style.EXPIRING -> {
                this.background =
                    context.resources.getDrawable(R.drawable.design_system_tag_ends_soon, null)
                tagTextView.setTextColor(resources.getColor(R.color.urgent3, null))
            }

        }
    }

    /**
     * Updates the text of the child TextView
     */
    fun setText(text: String) {
        tagTextView.text = text
    }

    /**
     * Updates the text of the child TextView
     */
    fun setText(@StringRes resId: Int) {
        tagTextView.setText(resId)
    }
}
