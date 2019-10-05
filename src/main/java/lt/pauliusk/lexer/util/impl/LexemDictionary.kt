package lt.pauliusk.lexer.util.impl

import lt.pauliusk.lexer.bean.ILexem
import lt.pauliusk.lexer.util.ILexemDictionary
import org.springframework.stereotype.Component

@Component
class LexemDictionary : ILexemDictionary {
    private val mDictionary : HashMap<String, ILexem> = HashMap()

    fun addLexem(name : String, lexem : ILexem) : Boolean {
        if (mDictionary.containsKey(name))
            return false

        mDictionary[name] = lexem

        return true
    }

    override fun getLexem(name: String): ILexem = mDictionary[name]!!
}