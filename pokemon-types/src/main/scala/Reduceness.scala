class Reduceness(val targetType: TypeEnum) {
  def types(): Set[TypeEnum] = {
    targetType match {
      case Fire => Set(Glass)
    }
  }
}