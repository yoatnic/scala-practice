import org.scalatest._

class WeaknessSpec extends FlatSpec with DiagrammedAssertions {
  it should "ほのお has weakness types みず, いわ" in {
    var weakness: Weakness = new Weakness(Fire)
    assert(weakness.types() === Set(Water, Rock))
  }

  it should "みず has weakness types くさ" in {
    var weakness: Weakness = new Weakness(Water)
    assert(weakness.types() === Set(Glass))
  }

  it should "くさ has weakness types ほのお" in {
    var weakness: Weakness = new Weakness(Glass)
    assert(weakness.types() === Set(Fire))
  }

  it should "いわ has weakness types みず, くさ, かくとう" in {
    var weakness: Weakness = new Weakness(Rock)
    assert(weakness.types() === Set(Water, Glass, Fight))
  }

  it should "ゴースト has weakness types none" in {
    var weakness: Weakness = new Weakness(Ghost)
    assert(weakness.types() === Set())
  }

  it should "かくとう has weakness types none" in {
    var weakness: Weakness = new Weakness(Fight)
    assert(weakness.types() === Set())
  }
}