import org.scalatest._

class BlocknessSpec extends FlatSpec with DiagrammedAssertions {
  it should "ゴースト has blockness types かくとう" in {
    var blockness: Blockness = new Blockness(Ghost)
    assert(blockness.types() === Set(Fight))
  }

  it should "other types has blockness types none" in {
    var blockness: Blockness = new Blockness(Fire)
    assert(blockness.types() === Set())
  }
}