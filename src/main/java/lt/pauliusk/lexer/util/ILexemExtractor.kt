package lt.pauliusk.lexer.util

import lt.pauliusk.lexer.bean.ILexem

interface ILexemExtractor {
    fun extract(sentence : String, importer : ILexemImporter) : Collection<ILexem>
}