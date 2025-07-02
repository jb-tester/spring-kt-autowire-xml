package org.example.springktautowirexml.byCompletion

import org.springframework.stereotype.Component

@Component
class CompoWithPrimaryConstructor(private val bean11: B1) {

    fun foo() {
           // try to complete bean12
    }
}