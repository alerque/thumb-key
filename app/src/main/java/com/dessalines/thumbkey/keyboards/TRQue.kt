@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.KeyboardBackspace
import androidx.compose.material.icons.automirrored.outlined.KeyboardTab
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
                """, color = ColorVariant.MUTED),
        topRight = KeyC("'", color = ColorVariant.MUTED),
        top = KeyC(
            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
            action = KeyAction.ToggleShiftMode(true),
            size = FontSizeVariant.LARGE,
            color = ColorVariant.PRIMARY,
        ),
        bottom = KeyC(
            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropDown),
            action = KeyAction.ToggleShiftMode(false),
            size = FontSizeVariant.LARGE,
            color = ColorVariant.PRIMARY,
        ),
        bottomLeft = KeyC(""",
                color = ColorVariant.MUTED,
            ),
        bottomRight = KeyC("'", color = ColorVariant.MUTED),
        right = KeyC("—", color = ColorVariant.MUTED),
        left = KeyC("–", color = ColorVariant.MUTED),
    )

val TR_QUE_MAIN =
    KeyboardC(
        listOf(
            listOf(
                EMOJI_KEY_ITEM,
                KeyItemC(
                    center = KeyC("s", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    bottom = KeyC("ş"),
                    bottomRight = KeyC("w"),
                    top = KeyC("~", color = ColorVariant.MUTED),
                    topLeft = KeyC("`", color = ColorVariant.MUTED),
                    topRight = KeyC("/", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("r", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    bottom = KeyC("g"),
                    bottomRight = KeyC("ğ"),
                    top = KeyC("^", color = ColorVariant.MUTED),
                    topRight = KeyC("×", color = ColorVariant.MUTED),
                    topLeft = KeyC("\\", color = ColorVariant.MUTED),
                    right = KeyC("-", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("_", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("o", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    top = KeyC("*", color = ColorVariant.MUTED),
                    bottom = KeyC("ö"),
                    bottomLeft = KeyC("u"),
                    left = KeyC("ü"),
                    topLeft = KeyC("=", color = ColorVariant.MUTED),
                    topRight = KeyC("+", color = ColorVariant.MUTED),
                    right = KeyC("÷", color = ColorVariant.MUTED),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_ALL_DIRECTIONS,
                KeyItemC(
                    center = KeyC("n", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    right = KeyC("m"),
                    top = KeyC("$", color = ColorVariant.MUTED),
                    topRight = KeyC("₺", color = ColorVariant.MUTED),
                    bottom = KeyC("&", color = ColorVariant.MUTED),
                    topLeft = KeyC("{", color = ColorVariant.MUTED),
                    left = KeyC("(", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("[", color = ColorVariant.MUTED),
                    bottomRight = KeyC("%", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("h", size = FontSizeVariant.LARGE),
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
                    center = KeyC("a", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    left = KeyC("l"),
                    bottomLeft = KeyC("|", color = ColorVariant.MUTED),
                    topLeft = KeyC("â"),
                    top = KeyC(",", color = ColorVariant.MUTED),
                    bottom = KeyC(".", color = ColorVariant.MUTED),
                    right = KeyC(")", color = ColorVariant.MUTED),
                    topRight = KeyC("}", color = ColorVariant.MUTED),
                    bottomRight = KeyC("]", color = ColorVariant.MUTED),
                ),
                SPACEBAR_ALL_MORE_SYMBOLS,
            ),
            listOf(
                BACKSPACE_KEY_ITEM,
                KeyItemC(
                    center = KeyC("t", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FIVE_WAY,
                    top = KeyC("ç"),
                    topRight = KeyC("c"),
                    topLeft = KeyC("\"", color = ColorVariant.MUTED),
                    left = KeyC("<", color = ColorVariant.MUTED),
                    right = KeyC("!", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("i", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FIVE_WAY,
                    topLeft = KeyC("ı"),
                    top = KeyC("f"),
                    right = KeyC("z"),
                    left = KeyC("?", color = ColorVariant.MUTED),
                    topRight = KeyC("'", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("e", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FIVE_WAY,
                    topLeft = KeyC("d"),
                    topRight = KeyC("°", color = ColorVariant.MUTED),
                    right = KeyC(">", color = ColorVariant.MUTED),
                    left = KeyC("@", color = ColorVariant.MUTED),
                    top = KeyC("#", color = ColorVariant.MUTED),
                ),
                RETURN_KEY_FOO,
            ),
        ),
    )

val TR_QUE_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                EMOJI_BACK_KEY_ITEM,
                KeyItemC(
                    center = KeyC("S", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    bottom = KeyC("Ş"),
                    bottomRight = KeyC("W"),
                    top = KeyC("~", color = ColorVariant.MUTED),
                    topLeft = KeyC("`", color = ColorVariant.MUTED),
                    topRight = KeyC("/", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("R", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    bottom = KeyC("G"),
                    bottomRight = KeyC("Ğ"),
                    top = KeyC("^", color = ColorVariant.MUTED),
                    topRight = KeyC("×", color = ColorVariant.MUTED),
                    topLeft = KeyC("\\", color = ColorVariant.MUTED),
                    right = KeyC("-", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("_", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("O", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    top = KeyC("*", color = ColorVariant.MUTED),
                    bottom = KeyC("Ö"),
                    bottomLeft = KeyC("U"),
                    left = KeyC("Ü"),
                    topLeft = KeyC("=", color = ColorVariant.MUTED),
                    topRight = KeyC("+", color = ColorVariant.MUTED),
                    right = KeyC("÷", color = ColorVariant.MUTED),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_ALL_DIRECTIONS,
                KeyItemC(
                    center = KeyC("N", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    right = KeyC("M"),
                    top = KeyC("$", color = ColorVariant.MUTED),
                    topRight = KeyC("₺", color = ColorVariant.MUTED),
                    bottom = KeyC("&", color = ColorVariant.MUTED),
                    topLeft = KeyC("{", color = ColorVariant.MUTED),
                    left = KeyC("(", color = ColorVariant.MUTED),
                    bottomLeft = KeyC("[", color = ColorVariant.MUTED),
                    bottomRight = KeyC("%", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("H", size = FontSizeVariant.LARGE),
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
                    center = KeyC("A", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.EIGHT_WAY,
                    left = KeyC("L"),
                    bottomLeft = KeyC("|", color = ColorVariant.MUTED),
                    topLeft = KeyC("Â"),
                    top = KeyC(",", color = ColorVariant.MUTED),
                    bottom = KeyC(".", color = ColorVariant.MUTED),
                    right = KeyC(")", color = ColorVariant.MUTED),
                    topRight = KeyC("}", color = ColorVariant.MUTED),
                    bottomRight = KeyC("]", color = ColorVariant.MUTED),
                ),
                SPACEBAR_ALL_MORE_SYMBOLS,
            ),
            listOf(
                BACKSPACE_KEY_ITEM,
                KeyItemC(
                    center = KeyC("T", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FIVE_WAY,
                    top = KeyC("Ç"),
                    topRight = KeyC("C"),
                    topLeft = KeyC("\"", color = ColorVariant.MUTED),
                    left = KeyC("<", color = ColorVariant.MUTED),
                    right = KeyC("!", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("İ", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FIVE_WAY,
                    topLeft = KeyC("I"),
                    top = KeyC("F"),
                    right = KeyC("Z"),
                    left = KeyC("?", color = ColorVariant.MUTED),
                    topRight = KeyC("'", color = ColorVariant.MUTED),
                ),
                KeyItemC(
                    center = KeyC("E", size = FontSizeVariant.LARGE),
                    swipeType = SwipeNWay.FIVE_WAY,
                    topLeft = KeyC("D"),
                    topRight = KeyC("°", color = ColorVariant.MUTED),
                    right = KeyC(">", color = ColorVariant.MUTED),
                    left = KeyC("@", color = ColorVariant.MUTED),
                    top = KeyC("#", color = ColorVariant.MUTED),
                ),
                RETURN_KEY_FOO,
            ),
        ),
    )

val TR_QUE_NUMERIC = NUMERIC_KEYBOARD

val TR_QUE: KeyboardDefinition =
    KeyboardDefinition(
        title = "türkçe que",
        modes =
            KeyboardDefinitionModes(
                main = TR_QUE_MAIN,
                shifted = TR_QUE_SHIFTED,
                numeric = TR_QUE_NUMERIC,
            ),
        settings =
            KeyboardDefinitionSettings(
                autoCapitalizers = listOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
            ),
    )
