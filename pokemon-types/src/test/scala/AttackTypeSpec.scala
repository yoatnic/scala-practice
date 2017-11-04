import org.scalatest._

class AttacTypeSpec extends FlatSpec with DiagrammedAssertions {
  it should "typeof" in {
    var fire: AttackType = new AttackType(Fire)
    var water: AttackType = new AttackType(Water)
    assert(fire.typeof() === Fire)
    assert(water.typeof() === Water)
  }
}