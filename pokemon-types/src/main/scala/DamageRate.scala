class DamageRate() {
  def rate(attack: AttackType, deffence: DeffenceType): Double = {
    if (deffence.weakness()(attack.typeof())) {
      return 2
    }
    if (deffence.reduceness()(attack.typeof())) {
      return 0.5
    }
    if (deffence.blockness()(attack.typeof())) {
      return 0
    }

    return 1
  }
}