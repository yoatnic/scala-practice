import org.scalatest._

class BlocknessSpec extends FlatSpec with DiagrammedAssertions {
  val blockness: Blockness = new Blockness()

  it should "ゴースト has blockness types かくとう" in {
    assert(blockness.types(Ghost) === Set(Fight))
  }

  it should "other types has blockness types none" in {
    assert(blockness.types(Fire) === Set())
  }
}