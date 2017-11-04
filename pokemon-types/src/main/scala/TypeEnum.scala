sealed abstract class TypeEnum(val name: String)

case object Fire extends TypeEnum("ほのお")
case object Water extends TypeEnum("みず")
case object Glass extends TypeEnum("くさ")
case object Rock extends TypeEnum("いわ")
case object Ghost extends TypeEnum("ゴースト")
case object Fight extends TypeEnum("かくとう")