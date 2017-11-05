import org.scalatest._

class DamageRateSpec extends FlatSpec with DiagrammedAssertions {
  val damageRate: DamageRate = new DamageRate()

  it should "attack type is weakness of deffence type => damage is 2x" in {
    var attack: AttackType = new AttackType(Fire)
    var deffence: DeffenceType = new DeffenceType(Glass)
    assert(damageRate.rate(attack, deffence) === 2)
  }

  it should "attack type is reduceness of deffence type => damage is 0.5x" in {
    var attack: AttackType = new AttackType(Rock)
    var deffence: DeffenceType = new DeffenceType(Fight)
    assert(damageRate.rate(attack, deffence) === 0.5)
  }

  it should "attack type is blockness of deffence type => damage is 0x" in {
    var attack: AttackType = new AttackType(Fight)
    var deffence: DeffenceType = new DeffenceType(Ghost)
    assert(damageRate.rate(attack, deffence) === 0)
  }

  it should "attack type is otherwise of deffence type => damage is 1x" in {
    var attack: AttackType = new AttackType(Water)
    var deffence: DeffenceType = new DeffenceType(Ghost)
    assert(damageRate.rate(attack, deffence) === 1)
  }
}