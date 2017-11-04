class Blockness() {
  def types(targetType: TypeEnum): Set[TypeEnum] = {
    targetType match {
      case Ghost => Set(Fight)
      case _ => Set()
    }
  }
}