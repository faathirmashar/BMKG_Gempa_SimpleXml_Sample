package id.sharekom.myapplication

import org.simpleframework.xml.Element
import org.simpleframework.xml.Root

@Root(name = "Infogempa")
data class Infogempa(
    @field:Element(name = "gempa")
    var gempa: Gempa = Gempa()
)