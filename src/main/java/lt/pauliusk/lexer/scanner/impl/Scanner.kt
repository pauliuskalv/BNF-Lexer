package lt.pauliusk.lexer.scanner.impl

import lt.pauliusk.lexer.bean.ISourceFileWord
import lt.pauliusk.lexer.bean.ISourceFileWordFactory
import lt.pauliusk.lexer.scanner.IScanner
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import java.io.InputStream
import java.lang.StringBuilder

@Component
class Scanner(
    private val inputStream : InputStream
) : IScanner {
    @Autowired
    private lateinit var sourceFileWordFactory : ISourceFileWordFactory

    private var currentColumn = 0
    private var currentRow = 0
    private var stringBuilder : StringBuilder = getStringBuilder()

    override fun getNextCharSequence(): ISourceFileWord {
        val nextChar = inputStream.read()

        if (nextChar.equals("\n")) {
            currentColumn = 0
            currentRow ++
        } else {
            currentColumn ++
        }

        stringBuilder.append(nextChar as Char)

        return sourceFileWordFactory.create()
    }

    override fun startNextCharSequence(): Boolean {
        stringBuilder = getStringBuilder()

        return true
    }

    private fun getStringBuilder() : StringBuilder = StringBuilder()
}