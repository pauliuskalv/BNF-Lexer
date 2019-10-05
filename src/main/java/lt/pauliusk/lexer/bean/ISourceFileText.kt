package lt.pauliusk.lexer.bean

interface ISourceFileText {
    fun getStart() : ISourceFileRange
    fun getEnd() : ISourceFileRange

    fun getWords() : ISourceFileWord
    fun getTextPart() : ISourceFileText
}