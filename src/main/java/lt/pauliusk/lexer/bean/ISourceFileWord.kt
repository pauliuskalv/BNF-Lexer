package lt.pauliusk.lexer.bean

interface ISourceFileWord {
    val value : String
    val range : ISourceFileRange
    val matchingLexem : ILexem
}