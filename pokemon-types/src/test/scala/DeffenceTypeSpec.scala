import org.scalatest._

class DeffenceTypeSpec extends FlatSpec with DiagrammedAssertions {
  it should "type name is ほのお" in {
    var deffenceType: DeffenceType = new DeffenceType(Fire)
    assert(deffenceType.name() === "ほのお")
  }

  it should "type name is みず" in {
    var deffenceType: DeffenceType = new DeffenceType(Water)
    assert(deffenceType.name() === "みず")
  }

  it should "weakness" in {
    var glass: DeffenceType = new DeffenceType(Glass)
    assert(glass.weakness() === Set(Fire))
  }

  it should "reduceness" in {
    var glass: DeffenceType = new DeffenceType(Fight)
    assert(glass.reduceness() === Set(Rock))
  }
}