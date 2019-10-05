package lt.pauliusk.lexer.bean

interface ISourceFileRange {
    val startingLine : Int
    val startingColumn : Int

    val endingLine : Int
    val endingColumn : Int
}