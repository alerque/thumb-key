@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import android.view.KeyEvent
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.*
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val RETURN_KEY_FOO =
    RETURN_KEY_ITEM.copy(
        swipeType = SwipeNWay.FOUR_WAY_CROSS,
        left =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.KeyboardBackspace),
                action =
                    KeyAction.SendEvent(
                        KeyEvent(
                            KeyEvent.ACTION_DOWN,
                            KeyEvent.KEYCODE_DEL,
                        ),
                    ),
            ),
        top =
            KeyC(
                display = KeyDisplay.IconDisplay(Icons.AutoMirrored.Outlined.KeyboardTab),
                action = KeyAction.CommitText("\t"),
            ),
    )

val SPACEBAR_ALL_MORE_SYMBOLS =
    SPACEBAR_ALL_SYMBOLS.copy(
        swipeType = SwipeNWay.EIGHT_WAY,
        topLeft =
            KeyC(
                "“", color = MUTED),
        topRight = KeyC("‘", color = MUTED),
        top = KeyC(
            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
            action = KeyAction.ToggleShiftMode(true),
            size = LARGE,
            color = PRIMARY,
        ),
        bottom = KeyC(
            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
            action = KeyAction.ToggleShiftMode(false),
            size = LARGE,
            color = PRIMARY,
        ),
        bottomLeft = KeyC("”",
                color = MUTED,
            ),
        bottomRight = KeyC("’", color = MUTED),
        right = KeyC("—", color = MUTED),
        left = KeyC("–", color = MUTED),
    )

val KB_TR_QUE_MAIN =
    KeyboardC(
        listOf(
            listOf(
                EMOJI_KEY_ITEM,
                KeyItemC(
                    center = KeyC("s", size = LARGE),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    bottom = KeyC("ş"),
                    bottomRight = KeyC("w"),
                    top = KeyC("~", color = MUTED),
                    topLeft = KeyC("`", color = MUTED),
                    topRight = KeyC("/", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("r", size = LARGE),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    bottom = KeyC("g"),
                    bottomRight = KeyC("ğ"),
                    top = KeyC("^", color = MUTED),
                    topRight = KeyC("×", color = MUTED),
                    topLeft = KeyC("\\", color = MUTED),
                    right = KeyC("-", color = MUTED),
                    bottomLeft = KeyC("_", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("o", size = LARGE),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    top = KeyC("*", color = MUTED),
                    bottom = KeyC("ö"),
                    bottomLeft = KeyC("u"),
                    left = KeyC("ü"),
                    topLeft = KeyC("=", color = MUTED),
                    topRight = KeyC("+", color = MUTED),
                    right = KeyC("÷", color = MUTED),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_ALL_DIRECTIONS,
                KeyItemC(
                    center = KeyC("n", size = LARGE),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    right = KeyC("m"),
                    top = KeyC("$", color = MUTED),
                    topRight = KeyC("₺", color = MUTED),
                    bottom = KeyC("&", color = MUTED),
                    topLeft = KeyC("{", color = MUTED),
                    left = KeyC("(", color = MUTED),
                    bottomLeft = KeyC("[", color = MUTED),
                    bottomRight = KeyC("%", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("h", size = LARGE),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    topLeft = KeyC("j"),
                    top = KeyC("q"),
                    topRight = KeyC("b"),
                    right = KeyC("p"),
                    bottomRight = KeyC("y"),
                    bottom = KeyC("x"),
                    bottomLeft = KeyC("v"),
                    left = KeyC("k"),
                ),
                KeyItemC(
                    center = KeyC("a", size = LARGE),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    left = KeyC("l"),
                    bottomLeft = KeyC("|", color = MUTED),
                    topLeft = KeyC("â"),
                    top = KeyC(",", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    right = KeyC(")", color = MUTED),
                    topRight = KeyC("}", color = MUTED),
                    bottomRight = KeyC("]", color = MUTED),
                ),
                SPACEBAR_ALL_MORE_SYMBOLS,
            ),
            listOf(
                BACKSPACE_KEY_ITEM,
                KeyItemC(
                    center = KeyC("t", size = LARGE),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    top = KeyC("ç"),
                    topRight = KeyC("c"),
                    topLeft = KeyC("\"", color = MUTED),
                    left = KeyC("<", color = MUTED),
                    right = KeyC("!", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("i", size = LARGE),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    topLeft = KeyC("ı"),
                    top = KeyC("f"),
                    right = KeyC("z"),
                    left = KeyC("?", color = MUTED),
                    topRight = KeyC("'", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("e", size = LARGE),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    topLeft = KeyC("d"),
                    topRight = KeyC("°", color = MUTED),
                    right = KeyC(">", color = MUTED),
                    left = KeyC("@", color = MUTED),
                    top = KeyC("#", color = MUTED),
                ),
                RETURN_KEY_FOO,
            ),
        ),
    )

val KB_TR_QUE_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                EMOJI_BACK_KEY_ITEM,
                KeyItemC(
                    center = KeyC("S", size = LARGE),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    bottom = KeyC("Ş"),
                    bottomRight = KeyC("W"),
                    top = KeyC("~", color = MUTED),
                    topLeft = KeyC("`", color = MUTED),
                    topRight = KeyC("/", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("R", size = LARGE),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    bottom = KeyC("G"),
                    bottomRight = KeyC("Ğ"),
                    top = KeyC("^", color = MUTED),
                    topRight = KeyC("×", color = MUTED),
                    topLeft = KeyC("\\", color = MUTED),
                    right = KeyC("-", color = MUTED),
                    bottomLeft = KeyC("_", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("O", size = LARGE),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    top = KeyC("*", color = MUTED),
                    bottom = KeyC("Ö"),
                    bottomLeft = KeyC("U"),
                    left = KeyC("Ü"),
                    topLeft = KeyC("=", color = MUTED),
                    topRight = KeyC("+", color = MUTED),
                    right = KeyC("÷", color = MUTED),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_ALL_DIRECTIONS,
                KeyItemC(
                    center = KeyC("N", size = LARGE),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    right = KeyC("M"),
                    top = KeyC("$", color = MUTED),
                    topRight = KeyC("₺", color = MUTED),
                    bottom = KeyC("&", color = MUTED),
                    topLeft = KeyC("{", color = MUTED),
                    left = KeyC("(", color = MUTED),
                    bottomLeft = KeyC("[", color = MUTED),
                    bottomRight = KeyC("%", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("H", size = LARGE),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    topLeft = KeyC("J"),
                    top = KeyC("Q"),
                    topRight = KeyC("B"),
                    right = KeyC("P"),
                    bottomRight = KeyC("Y"),
                    bottom = KeyC("X"),
                    bottomLeft = KeyC("V"),
                    left = KeyC("K"),
                ),
                KeyItemC(
                    center = KeyC("A", size = LARGE),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    left = KeyC("L"),
                    bottomLeft = KeyC("|", color = MUTED),
                    topLeft = KeyC("Â"),
                    top = KeyC(",", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    right = KeyC(")", color = MUTED),
                    topRight = KeyC("}", color = MUTED),
                    bottomRight = KeyC("]", color = MUTED),
                ),
                SPACEBAR_ALL_MORE_SYMBOLS,
            ),
            listOf(
                BACKSPACE_KEY_ITEM,
                KeyItemC(
                    center = KeyC("T", size = LARGE),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    top = KeyC("Ç"),
                    topRight = KeyC("C"),
                    topLeft = KeyC("\"", color = MUTED),
                    left = KeyC("<", color = MUTED),
                    right = KeyC("!", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("İ", size = LARGE),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    topLeft = KeyC("I"),
                    top = KeyC("F"),
                    right = KeyC("Z"),
                    left = KeyC("?", color = MUTED),
                    topRight = KeyC("'", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("E", size = LARGE),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    topLeft = KeyC("D"),
                    topRight = KeyC("°", color = MUTED),
                    right = KeyC(">", color = MUTED),
                    left = KeyC("@", color = MUTED),
                    top = KeyC("#", color = MUTED),
                ),
                RETURN_KEY_FOO,
            ),
        ),
    )

val KB_TR_QUE_NUMERIC =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("0", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("1", size = LARGE),
                    topRight = KeyC("/", color = MUTED),
                    topLeft = KeyC("`", color = MUTED),
                    top = KeyC("~", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("2", size = LARGE),
                    right = KeyC("-"),
                    top = KeyC("^", color = MUTED),
                    topRight = KeyC("×", color = MUTED),
                    topLeft = KeyC("\\", color = MUTED),
                    bottomLeft = KeyC("_", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("3", size = LARGE),
                    top = KeyC("*", color = MUTED),
                    topLeft = KeyC("=", color = MUTED),
                    topRight = KeyC("+", color = MUTED),
                    right = KeyC("÷", color = MUTED),
                ),
                ABC_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_ALL_DIRECTIONS,
                KeyItemC(
                    center = KeyC("4", size = LARGE),
                    topLeft = KeyC("{", color = MUTED),
                    top = KeyC("$", color = MUTED),
                    topRight = KeyC("₺", color = MUTED),
                    bottom = KeyC("&", color = MUTED),
                    bottomLeft = KeyC("[", color = MUTED),
                    left = KeyC("(", color = MUTED),
                    bottomRight = KeyC("%", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("5", size = LARGE),
                ),
                KeyItemC(
                    center = KeyC("6", size = LARGE),
                    top = KeyC(",", color = MUTED),
                    bottomLeft = KeyC("|", color = MUTED),
                    right = KeyC(")", color = MUTED),
                    topRight = KeyC("}", color = MUTED),
                    bottom = KeyC(".", color = MUTED),
                    bottomRight = KeyC("]", color = MUTED),
                ),
                SPACEBAR_ALL_MORE_SYMBOLS,
            ),
            listOf(
                BACKSPACE_KEY_ITEM,
                KeyItemC(
                    center = KeyC("7", size = LARGE),
                    topLeft = KeyC("\"", color = MUTED),
                    left = KeyC("<", color = MUTED),
                    right = KeyC("!", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("8", size = LARGE),
                    topRight = KeyC("'", color = MUTED),
                    left = KeyC("?", color = MUTED),
                ),
                KeyItemC(
                    center = KeyC("9", size = LARGE),
                    topRight = KeyC("°", color = MUTED),
                    right = KeyC(">", color = MUTED),
                    left = KeyC("@", color = MUTED),
                    top = KeyC("#", color = MUTED),
                ),
                RETURN_KEY_FOO,
            ),
        ),
    )

val KB_TR_QUE: KeyboardDefinition =
    KeyboardDefinition(
        title = "türkçe que",
        modes =
            KeyboardDefinitionModes(
                main = KB_TR_QUE_MAIN,
                shifted = KB_TR_QUE_SHIFTED,
                numeric = KB_TR_QUE_NUMERIC,
            ),
        settings =
            KeyboardDefinitionSettings(
                autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
            ),
    )
