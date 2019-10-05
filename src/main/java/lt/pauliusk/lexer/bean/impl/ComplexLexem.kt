package lt.pauliusk.lexer.bean.impl

import lt.pauliusk.lexer.bean.ILexem
import lt.pauliusk.lexer.bean.ISourceFileWord

class ComplexLexem(private val name : String,
                   private val keyWords : Collection<ILexem>) : ILexem {
    override fun check(words: Collection<ISourceFileWord>): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getMatchingWords(words: Collection<ISourceFileWord>): Collection<ISourceFileWord> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun checkInnerLexem(lexem: ILexem): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getInnerLexems(): Collection<ILexem> = keyWords

    override fun hasInnerLexems(): Boolean = !keyWords.isEmpty()

    override fun containsLexem(lexem: ILexem): Boolean {
        var contains = false

        for (keyWords in keyWords) {
            if (keyWords.containsLexem(lexem)) {
                contains = true
                break
            }
        }

        return contains
    }

    override fun getComplexity(): Int {
        var sum = 0

        for (lexem in keyWords)
            sum += lexem.getComplexity() * 10

        return sum
    }
}