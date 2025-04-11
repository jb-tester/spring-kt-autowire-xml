package org.example.springktautowirexml.fromXml

// AutowireBean for xml beans:
//  the first bean is not autowired,
// the second bean autowiring attempt is failed
// (autowire ClassB, then try to autowire ClassC)
// https://youtrack.jetbrains.com/issue/IDEA-370720/Spring-Kotlin-AutowireBean...-failure-for-xml-beans
class ClassA {

}