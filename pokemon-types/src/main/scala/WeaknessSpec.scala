class Weakness(val targetType: TypeEnum) {
  def types(): Set[TypeEnum] = {
    targetType match {
      case Fire => Set(Water, Rock)
      case Water => Set(Glass)
      case Glass => Set(Fire)
      case Rock => Set(Water, Glass)
      case Ghost => Set()
      case Fight => Set()
    }
  }
}