import org.scalatest._

class ReducenessSpec extends FlatSpec with DiagrammedAssertions {
  it should "ほのお has reduceness types くさ" in {
    var reduceness: Reduceness = new Reduceness(Fire)
    assert(reduceness.types() === Set(Glass))
  }
}