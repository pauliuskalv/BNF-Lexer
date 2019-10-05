package lt.pauliusk.lexer

import org.springframework.context.annotation.AnnotationConfigApplicationContext

fun main(args: Array<String>) {
    val context = AnnotationConfigApplicationContext()
    context.register(AppConfig::class.java)
    context.refresh()
}