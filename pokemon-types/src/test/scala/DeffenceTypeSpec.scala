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
}