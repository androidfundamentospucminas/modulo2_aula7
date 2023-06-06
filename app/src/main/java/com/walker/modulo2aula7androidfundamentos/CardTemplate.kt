package com.walker.modulo2aula7androidfundamentos

import android.content.Context
import android.util.AttributeSet
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class CardTemplate(context: Context, attrs: AttributeSet) : ConstraintLayout(context, attrs) {

    init {
        inflate(context, R.layout.card_layout, this@CardTemplate)
        context.theme.obtainStyledAttributes(
            attrs,
            R.styleable.CardTemplate,
            0, 0).apply {

            try {
                findViewById<TextView>(R.id.cardNumber).text = getString(R.styleable.CardTemplate_cardNumber)
                findViewById<TextView>(R.id.expiredDate).text = getString(R.styleable.CardTemplate_expireDate)
                findViewById<TextView>(R.id.bankValue).text = getString(R.styleable.CardTemplate_bankValue)
            } finally {
                recycle()
            }
        }
    }
}