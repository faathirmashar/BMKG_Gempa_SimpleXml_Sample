package id.sharekom.myapplication

import org.simpleframework.xml.Element
import org.simpleframework.xml.Root

@Root(name = "point")
data class Point(
    @field:Element(name = "coordinates", required = false)
    var coordinates: String = ""
)