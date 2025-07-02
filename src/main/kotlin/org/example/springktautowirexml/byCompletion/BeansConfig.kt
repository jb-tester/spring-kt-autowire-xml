package org.example.springktautowirexml.byCompletion

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
class BeansConfig {

    @Bean fun bean11():B1 = B1("b11",)
    @Bean fun bean12():B1 = B1("b12",)
    @Bean fun bean13():B1 = B1("b13",)
}
class B1(val id: String) {}