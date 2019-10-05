package lt.pauliusk.lexer.util

import lt.pauliusk.lexer.bean.ILexem
import java.net.URI

interface ILexemImporter {
    fun import(uri : URI) : Collection<ILexem>
}