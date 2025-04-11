package org.example.springktautowirexml

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ImportResource

@SpringBootApplication
@ImportResource("classpath:spring-config.xml")
class SpringKtAutowireXmlApplication

fun main(args: Array<String>) {
    runApplication<SpringKtAutowireXmlApplication>(*args)
}
