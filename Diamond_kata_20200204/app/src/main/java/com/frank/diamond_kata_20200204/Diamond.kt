package com.frank.diamond_kata_20200204

import org.apache.commons.lang3.StringUtils

class Diamond(private val mid: Char) {

    private val startLetter = 'A'

    fun print(): String {
        var top = ""
        var bottom = ""

        for(current in startLetter..mid) {
            var line = buildLine(current)
            top = addTop(top, line)
            bottom = addBottom(bottom, line, current)
        }

        return top + bottom
    }

    private fun addBottom(bottom: String, line: String, c: Char): String {
        return if (c != mid) line + bottom else bottom
    }

    private fun addTop(top: String, line: String): String {
        var top1 = top
        top1 += line
        return top1
    }

    private fun buildLine(c: Char): String {
        return indent(c) +
                frontLetter(c) +
                innerSpaces(c) +
                rearLetter(c) +
                "\n"
    }

    private fun frontLetter(c: Char): String {
        return c.toString()
    }

    private fun rearLetter(c: Char): String {
        return if (index(c) > 0) c.toString() else ""
    }

    private fun innerSpaces(c: Char): String {
        return StringUtils.repeat(" ", innerSpaceCount(c))
    }

    private fun innerSpaceCount(c: Char) : Int {
        var i = index(c)
        return if (i > 0) i * 2 - 1 else 0
    }

    private fun index(c: Char) = c - startLetter

    private fun indent(c: Char): String {
        return StringUtils.repeat(" ", mid - c)
    }

}
