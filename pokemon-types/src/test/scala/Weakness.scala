import org.scalatest._

class WeaknessSpec extends FlatSpec with DiagrammedAssertions {
  it should "ほのお has weakness types みず, いわ" in {
    var weakness: Weakness = new Weakness(Fire)
    assert(weakness.types() === Set(Water, Rock))
  }
}