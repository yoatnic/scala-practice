# やること

ある技タイプに対するポケモンのタイプ相性の倍率計算をする。

* 倍率
  * 効果抜群 → 2倍
  * いまひとつ → 半減
  * 無効 → 0倍
  * そのた → 等倍
* タイプのバリエーション
  * 初代のやつからさらにしぼる
* 技を受ける側のポケモンがもつタイプ数
  * 実物と同じ1ポケモンにつき1〜2こもつ

### タイプ

攻撃側、技を受ける側問わず6こにしぼる

* ほのお
* みず
* くさ
* ゴースト
* 格闘
* いわ
* ~~じめん~~
* ~~ノーマル~~
* ~~どく~~
* ~~むし~~
* ~~ひこう~~
* ~~こおり~~
* ~~でんき~~
* ~~エスパー~~

### 例

#### タイプ1コ

* 技：みず、ポケ：かくとう → 1倍
* 技：ほのお、ポケ：みず → 0.5倍
* 技：ほのお、ポケ：くさ → 2倍
* 技：かくとう、ポケ：ゴースト → 0倍

#### タイプ2コ

* 技：ほのお、ポケ：みず＆くさ → 1倍
* 技：みず、ポケ：ほのお＆いわ → 4倍
* 技：くさ、ポケ：ほのお＆くさ → 0.25倍