package lt.pauliusk.lexer.util

import lt.pauliusk.lexer.bean.ILexem

interface ILexemDictionary {
    fun getLexem(name : String) : ILexem
}