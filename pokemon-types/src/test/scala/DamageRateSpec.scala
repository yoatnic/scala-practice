import org.scalatest._

class DamageRateSpec extends FlatSpec with DiagrammedAssertions {
  it should "attack type is weakness of deffence type => damage is 2x" in {
    var attack: AttackType = new AttackType(Fire)
    var deffece: DeffenceType = new DeffenceType(Glass)
    var damageRate: DamageRate = new DamageRate()
    assert(damageRate.rate(attack, deffece) === 2)
  }

  it should "attack type is reduceness of deffence type => damage is 0.5x" in {
    var attack: AttackType = new AttackType(Rock)
    var deffece: DeffenceType = new DeffenceType(Fight)
    var damageRate: DamageRate = new DamageRate()
    assert(damageRate.rate(attack, deffece) === 0.5)
  }

  it should "attack type is blockness of deffence type => damage is 0x" in {
    var attack: AttackType = new AttackType(Fight)
    var deffece: DeffenceType = new DeffenceType(Ghost)
    var damageRate: DamageRate = new DamageRate()
    assert(damageRate.rate(attack, deffece) === 0)
  }

  it should "attack type is otherwise of deffence type => damage is 1x" in {
    var attack: AttackType = new AttackType(Water)
    var deffece: DeffenceType = new DeffenceType(Ghost)
    var damageRate: DamageRate = new DamageRate()
    assert(damageRate.rate(attack, deffece) === 1)
  }
}