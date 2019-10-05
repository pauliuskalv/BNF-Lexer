package lt.pauliusk.lexer.bean.impl

import lt.pauliusk.lexer.bean.ILexem
import lt.pauliusk.lexer.bean.ISourceFileWord

/**
 * Defines a basic keyword lexem.
 *
 * This is a lexem, which has only one word e.g. "int", "float", ...
 */
class KeywordLexem(
    private val name : String,
    private val keyWord : String
) : ILexem {
    override fun check(words: Collection<ISourceFileWord>): Boolean {
        if (words.size == 0)
            return false

        return words
            .elementAt(0)
            .value
            .trim() // keyword can contain whitespace characters
            .equals(keyWord)
    }

    /**
     * If check() was successful, the matching word is the first one in the collection
     */
    override fun getMatchingWords(words: Collection<ISourceFileWord>): Collection<ISourceFileWord> {
        return listOf(words.elementAt(0))
    }

    override fun checkInnerLexem(lexem: ILexem): Boolean = false
    override fun getInnerLexems(): Collection<ILexem> = emptyList()
    override fun hasInnerLexems(): Boolean = false
    override fun containsLexem(lexem: ILexem): Boolean = false
    override fun getComplexity(): Int = 1
}