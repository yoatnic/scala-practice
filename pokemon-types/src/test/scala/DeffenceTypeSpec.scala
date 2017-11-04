import org.scalatest._

class DeffenceTypeSpec extends FlatSpec with DiagrammedAssertions {
  it should "typeof" in {
    var fire: DeffenceType = new DeffenceType(Fire)
    var water: DeffenceType = new DeffenceType(Water)
    assert(fire.typeof() === Fire)
    assert(water.typeof() === Water)
  }

  it should "weakness" in {
    var glass: DeffenceType = new DeffenceType(Glass)
    assert(glass.weakness() === Set(Fire))
  }

  it should "reduceness" in {
    var glass: DeffenceType = new DeffenceType(Fight)
    assert(glass.reduceness() === Set(Rock))
  }

  it should "blockness" in {
    var glass: DeffenceType = new DeffenceType(Ghost)
    assert(glass.blockness() === Set(Fight))
  }
}