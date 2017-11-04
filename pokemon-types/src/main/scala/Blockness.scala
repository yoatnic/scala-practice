class Blockness(val targetType: TypeEnum) {
  def types(): Set[TypeEnum] = {
    targetType match {
      case Ghost => Set(Fight)
    }
  }
}