package lt.pauliusk.lexer.util

import java.io.BufferedInputStream

interface ILexemSentenceExtractor {
    fun getSentence(name : String) : String
    fun getLexemNames() : Collection<String>
}