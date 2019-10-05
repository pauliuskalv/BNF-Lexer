package lt.pauliusk.lexer.bean.impl

import lt.pauliusk.lexer.bean.ISourceFileRange

class SourceFileRange(
    override val startingLine: Int,
    override val startingColumn: Int,
    override val endingLine: Int,
    override val endingColumn: Int
) : ISourceFileRange