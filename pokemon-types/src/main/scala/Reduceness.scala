class Reduceness(val targetType: TypeEnum) {
  def types(): Set[TypeEnum] = {
    targetType match {
      case Fire => Set(Glass)
      case Water => Set(Fire)
      case Glass => Set(Water)
      case Rock => Set(Fire)
      case Ghost => Set()
      case Fight => Set(Rock)
    }
  }
}