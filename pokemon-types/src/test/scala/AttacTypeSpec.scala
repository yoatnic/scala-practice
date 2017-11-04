import org.scalatest._

class AttacTypeSpec extends FlatSpec with DiagrammedAssertions {
  it should "type name is ほのお" in {
    var attackType: AttackType = new AttackType(Fire)
    assert(attackType.name() === "ほのお")
  }

  it should "type name is みず" in {
    var attackType: AttackType = new AttackType(Water)
    assert(attackType.name() === "みず")
  }
}