class DeffenceType(val deffenceType: TypeEnum) {
  def typeof(): TypeEnum = {
    deffenceType
  }

  def weakness(): Set[TypeEnum] = {
    var w: Weakness = new Weakness()
    w.types(deffenceType)
  }

  def reduceness(): Set[TypeEnum] = {
    var r: Reduceness = new Reduceness()
    r.types(deffenceType)
  }

  def blockness(): Set[TypeEnum] = {
    var b: Blockness = new Blockness()
    b.types(deffenceType)
  }
}