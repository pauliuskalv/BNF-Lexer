package lt.pauliusk.lexer.bean

interface ILexem {
    fun check(words : Collection<ISourceFileWord>) : Boolean
    fun getMatchingWords(words: Collection<ISourceFileWord>) : Collection<ISourceFileWord>

    fun checkInnerLexem(lexem : ILexem) : Boolean

    fun getInnerLexems() : Collection<ILexem>
    fun hasInnerLexems() : Boolean
    fun containsLexem(lexem : ILexem) : Boolean

    fun getComplexity() : Int
}