class DamageRate() {
  def rate(attack: AttackType, deffence: DeffenceType): Double = {
    if (deffence.weakness()(attack.typeof())) {
      return 2
    }
    return 1
  }
}