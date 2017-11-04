import org.scalatest._

class DeffenceTypeSpec extends FlatSpec with DiagrammedAssertions {
  it should "type name is ほのお" in {
    var deffenceType: DeffenceType = new DeffenceType("ほのお")
    assert(deffenceType.name() === "ほのお")
  }

  it should "type name is みず" in {
    var deffenceType: DeffenceType = new DeffenceType("みず")
    assert(deffenceType.name() === "みず")
  }
}