import org.scalatest._

class AttacTypeSpec extends FlatSpec with DiagrammedAssertions {
  it should "type name is ほのお" in {
    var attackType: AttackType = new AttackType("ほのお")
    assert(attackType.name() === "ほのお")
  }
}