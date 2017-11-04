import org.scalatest._

class WeaknessSpec extends FlatSpec with DiagrammedAssertions {
  val weakness: Weakness = new Weakness()

  it should "ほのお has weakness types みず, いわ" in {
    assert(weakness.types(Fire) === Set(Water, Rock))
  }

  it should "みず has weakness types くさ" in {
    assert(weakness.types(Water) === Set(Glass))
  }

  it should "くさ has weakness types ほのお" in {
    assert(weakness.types(Glass) === Set(Fire))
  }

  it should "いわ has weakness types みず, くさ, かくとう" in {
    assert(weakness.types(Rock) === Set(Water, Glass, Fight))
  }

  it should "ゴースト has weakness types none" in {
    assert(weakness.types(Ghost) === Set())
  }

  it should "かくとう has weakness types none" in {
    assert(weakness.types(Fight) === Set())
  }
}