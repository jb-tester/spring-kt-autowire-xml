package org.example.springktautowirexml.byCompletion

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Configuration


@Configuration
class CompoFewConstructors (b1: String) {

    constructor(str1: String, str2: String): this(str1+str2) {
    }

    @Autowired
    constructor(bean11: B1) : this(bean11.id) {
        // try to complete bean13
    }

    fun test() {
        // try to complete bean12

    }
}
