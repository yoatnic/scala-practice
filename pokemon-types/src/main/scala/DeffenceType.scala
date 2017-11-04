class DeffenceType(val deffenceType: TypeEnum) {
  def name(): String = {
    deffenceType.name
  }

  def weakness(): Set[TypeEnum] = {
    var w: Weakness = new Weakness(deffenceType)
    w.types()
  }
}