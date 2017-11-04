import org.scalatest._

class AttacTypeSpec extends FlatSpec with DiagrammedAssertions {
  it should "type is ほのお" in {
    var attackType: AttackType = new AttackType(Fire)
    assert(attackType.typeof() === Fire)
  }

  it should "type is みず" in {
    var attackType: AttackType = new AttackType(Water)
    assert(attackType.typeof() === Water)
  }
}