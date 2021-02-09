package id.sharekom.myapplication

import org.simpleframework.xml.Element
import org.simpleframework.xml.Root

@Root(name = "gempa")
data class Gempa(
    @field:Element(name = "Bujur", required = false)
    var Bujur: String = "",
    @field:Element(name = "Jam", required = false)
    var Jam: String = "",
    @field:Element(name = "Kedalaman", required = false)
    var Kedalaman: String = "",
    @field:Element(name = "Lintang", required = false)
    var Lintang: String = "",
    @field:Element(name = "Magnitude", required = false)
    var Magnitude: String = "",
    @field:Element(name = "Potensi", required = false)
    var Potensi: String = "",
    @field:Element(name = "Tanggal", required = false)
    var Tanggal: String = "",
    @field:Element(name = "Wilayah1", required = false)
    var Wilayah1: String = "",
    @field:Element(name = "Wilayah2", required = false)
    var Wilayah2: String = "",
    @field:Element(name = "Wilayah3", required = false)
    var Wilayah3: String = "",
    @field:Element(name = "Wilayah4", required = false)
    var Wilayah4: String = "",
    @field:Element(name = "Wilayah5", required = false)
    var Wilayah5: String = "",
    @field:Element(name = "_symbol", required = false)
    var _symbol: String = "",
    @field:Element(name = "point", required = false)
    var point: Point = Point()
)