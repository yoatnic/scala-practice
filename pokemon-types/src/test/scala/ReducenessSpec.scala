import org.scalatest._

class ReducenessSpec extends FlatSpec with DiagrammedAssertions {
  it should "ほのお has reduceness types くさ" in {
    var reduceness: Reduceness = new Reduceness(Fire)
    assert(reduceness.types() === Set(Glass))
  }

  it should "みず has reduceness types ほのお" in {
    var reduceness: Reduceness = new Reduceness(Water)
    assert(reduceness.types() === Set(Fire))
  }

  it should "くさ has reduceness types みず" in {
    var reduceness: Reduceness = new Reduceness(Glass)
    assert(reduceness.types() === Set(Water))
  }

  it should "いわ has reduceness types ほのお" in {
    var reduceness: Reduceness = new Reduceness(Rock)
    assert(reduceness.types() === Set(Fire))
  }

  it should "ゴースト has reduceness types none" in {
    var reduceness: Reduceness = new Reduceness(Ghost)
    assert(reduceness.types() === Set())
  }

  it should "かくとう has reduceness types いわ" in {
    var reduceness: Reduceness = new Reduceness(Fight)
    assert(reduceness.types() === Set(Rock))
  }
}