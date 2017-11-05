import org.scalatest._

class DeffenceTypeSpec extends FlatSpec with DiagrammedAssertions {
  it should "typeof" in {
    var fire: DeffenceType = new DeffenceType(Fire)
    var water: DeffenceType = new DeffenceType(Water)
    assert(fire.typeof() === Fire)
    assert(water.typeof() === Water)
  }

  it should "weakness" in {
    var deffence: DeffenceType = new DeffenceType(Glass)
    assert(deffence.weakness() === Set(Fire))
  }

  it should "reduceness" in {
    var deffence: DeffenceType = new DeffenceType(Fight)
    assert(deffence.reduceness() === Set(Rock))
  }

  it should "blockness" in {
    var deffence: DeffenceType = new DeffenceType(Ghost)
    assert(deffence.blockness() === Set(Fight))
  }
}