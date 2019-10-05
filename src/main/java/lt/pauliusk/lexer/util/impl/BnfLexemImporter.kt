package lt.pauliusk.lexer.util.impl

import lt.pauliusk.lexer.bean.ILexem
import lt.pauliusk.lexer.util.ILexemImporter
import java.io.BufferedInputStream
import java.net.URI

class BnfLexemImporter : ILexemImporter {
    private val reader : BufferedInputStream = BufferedInputStream(
        javaClass
            .getResource("/rules.bnf")
            .openStream()
    )

    override fun import(uri: URI): Collection<ILexem> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}