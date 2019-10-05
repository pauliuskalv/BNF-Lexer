package lt.pauliusk.lexer.scanner

import lt.pauliusk.lexer.bean.ISourceFileWord

interface IScanner {
    fun getNextCharSequence() : ISourceFileWord
    fun startNextCharSequence() : Boolean
}