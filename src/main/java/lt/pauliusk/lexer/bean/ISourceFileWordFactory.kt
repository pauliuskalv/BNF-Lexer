package lt.pauliusk.lexer.bean

interface ISourceFileWordFactory {
    fun create(
        startColumn : Int,
        startRow : Int,

        endColumn : Int,
        endRow : Int,

        text : String
    ) : ISourceFileWord
}