package lt.pauliusk.lexer.scanner

import java.net.URI

interface IScannerFactory {
    fun create(uri : URI) : IScanner
}