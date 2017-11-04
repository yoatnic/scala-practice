import org.scalatest._

class DamageRateSpec extends FlatSpec with DiagrammedAssertions {
  it should "attack type is weakness of deffence type => damage is 2x" in {
    var attack: AttackType = new AttackType(Fire)
    var deffece: DeffenceType = new DeffenceType(Glass)
    var damageRate: DamageRate = new DamageRate()
    assert(damageRate.rate(attack, deffece) === 2)
  }
}