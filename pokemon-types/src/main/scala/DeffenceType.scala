class DeffenceType(val deffenceType: TypeEnum) {
  def name(): String = {
    deffenceType.name
  }

  def weakness(): Set[TypeEnum] = {
    var w: Weakness = new Weakness(deffenceType)
    w.types()
  }

  def reduceness(): Set[TypeEnum] = {
    var r: Reduceness = new Reduceness(deffenceType)
    r.types()
  }

  def blockness(): Set[TypeEnum] = {
    var b: Blockness = new Blockness()
    b.types(deffenceType)
  }
}