class RowScope { fun weight() = "W" }
class ColumnScope { fun gravity() = "G" }

fun Row(content: RowScope.() -> String) = RowScope().content()
fun Column(content: ColumnScope.() -> String) = ColumnScope().content()

fun testScopes(): String {
    val rowPart = Row { weight() }

    val colPart = Column { gravity() }

    return rowPart + colPart
}