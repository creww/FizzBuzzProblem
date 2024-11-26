# コーディング試験
以下の課題を解いてください。

## 1. FizzBuzz問題のリファクタリング

### 説明
整数値を入力として受け取り、以下のルールに従って結果を出力するプログラムを作成した。

1. 数が3で割り切れる場合は、数の代わりに”Fizz”と出力する。
2. 数が5で割り切れる場合は、数の代わりに”Buzz”と出力する。
3. 数が3と5両方で割り切れる場合は、数の代わりに”FizzBuzz”と出力する。
4. 上記の条件に該当しない場合は、入力された数をそのまま出力する。

### 課題
FizzBuzz問題の要件を満たすFizzBuzzEngineクラスを実装したが、7で割り切れるときは数の代わりに"Foo"と出力する要件が追加されることが決定した。また、今後も任意の素数に応じた文字列を返す要件が複数追加される可能性がある。

Open Closed Principleを適用し、拡張に対しては開かれているが、修正に対しては閉じている設計にFizzBuzzEngineクラスをリファクタリングしなさい。FizzBuzzEngineクラスの振る舞いをインターフェースや抽象クラスを通して柔軟に拡張可能にすることが求められています。

## 2. FizzBuzz問題のWeb API化
### 説明
FizzBuzz問題のリファクタリングでリファクタリングしたFizzBuzzEngineを、Spring MVCを用いてWeb APIとして公開する。

### 課題
FizzBuzz問題のリファクタリングでリファクタリングしたFizzBuzzEngineをWeb APIとして公開するFizzBuzzControllerを実装しなさい。FizzBuzzControllerは以下のエンドポイントを提供する。

`GET /api/fizzbuzz/{number}`

- number: 整数値
- content-type: plain/text
- リクエストされたnumberに対してFizzBuzzEngineを使用して結果を返却する。
  - 例
    - /api/fizzbuzz/1 -> 1
    - /api/fizzbuzz/3 -> Fizz
    - /api/fizzbuzz/5 -> Buzz
    - /api/fizzbuzz/7 -> Foo
    - /api/fizzbuzz/15 -> FizzBuzz
    - /api/fizzbuzz/21 -> FizzFoo
    - /api/fizzbuzz/35 -> BuzzFoo
    - /api/fizzbuzz/105 -> FizzBuzzFoo


## 3. FizzBuzz問題のGraphQL化
### 説明
FizzBuzz問題のリファクタリングでリファクタリングしたFizzBuzzEngineを、Spring for GraphQLを用いてGraphQLとして公開する。

### 課題
FizzBuzz問題のリファクタリングでリファクタリングしたFizzBuzzEngineをGraphQLとして公開するFizzBuzzQueryを実装しなさい。FizzBuzzQueryは以下のクエリを提供する。

`fizzBuzz(number: Int!): String`
- number: 整数値
- リクエストされたnumberに対してFizzBuzzEngineを使用して結果を返却する。
  - 例
    - fizzBuzz(1) -> 1
    - fizzBuzz(3) -> Fizz
    - fizzBuzz(5) -> Buzz
    - fizzBuzz(7) -> Foo
    - fizzBuzz(15) -> FizzBuzz
    - fizzBuzz(21) -> FizzFoo
    - fizzBuzz(35) -> BuzzFoo
    - fizzBuzz(105) -> FizzBuzzFoo

## 4. Web APIのセキュア化
### 説明
FizzBuzz問題のWeb APIをセキュア化する。

### 課題
FizzBuzz問題のWeb APIをSpring Securityを使用してセキュア化しなさい。セキュリティ設定は以下の通りとする。

- /api/**はBasic認証を使用する。
- ユーザ名: user
- パスワード: password
- 上記以外のエンドポイント(GraphQL)はセキュリティ設定を行わない。

