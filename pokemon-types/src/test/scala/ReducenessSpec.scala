import org.scalatest._

class ReducenessSpec extends FlatSpec with DiagrammedAssertions {
  val reduceness: Reduceness = new Reduceness()

  it should "ほのお has reduceness types くさ" in {
    assert(reduceness.types(Fire) === Set(Glass))
  }

  it should "みず has reduceness types ほのお" in {
    assert(reduceness.types(Water) === Set(Fire))
  }

  it should "くさ has reduceness types みず" in {
    assert(reduceness.types(Glass) === Set(Water))
  }

  it should "いわ has reduceness types ほのお" in {
    assert(reduceness.types(Rock) === Set(Fire))
  }

  it should "ゴースト has reduceness types none" in {
    assert(reduceness.types(Ghost) === Set())
  }

  it should "かくとう has reduceness types いわ" in {
    assert(reduceness.types(Fight) === Set(Rock))
  }
}