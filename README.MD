English follows Japanese

---

# コーディング試験
以下の課題を解いてください。

## 1. FizzBuzz問題のリファクタリング

### 説明
整数値を入力として受け取り、以下のルールに従って結果を出力するプログラムを作成した。

1. 数が3で割り切れる場合は、数の代わりに"Fizz"と出力する。
2. 数が5で割り切れる場合は、数の代わりに"Buzz"と出力する。
3. 数が3と5両方で割り切れる場合は、数の代わりに"FizzBuzz"と出力する。
4. 上記の条件に該当しない場合は、入力された数をそのまま出力する。

### 課題
FizzBuzz問題の要件を満たす`FizzBuzzEngine`クラスを実装したが、7で割り切れるときは数の代わりに"Foo"と出力する要件が追加されることが決定した。また、今後も任意の素数に応じた文字列を返す要件が複数追加される可能性がある。

**Open Closed Principle**を適用し、拡張に対しては開かれているが、修正に対しては閉じている設計に`FizzBuzzEngine`クラスをリファクタリングしなさい。`FizzBuzzEngine`クラスの振る舞いをインターフェースや抽象クラスを通して柔軟に拡張可能にすることが求められています。

## 2. FizzBuzz問題のWeb API化

### 説明
リファクタリングした`FizzBuzzEngine`を、Spring MVCを用いてWeb APIとして公開する。

### 課題
リファクタリングした`FizzBuzzEngine`をWeb APIとして公開する`FizzBuzzRestController`を実装しなさい。`FizzBuzzRestController`は以下のエンドポイントを提供します。

`GET /api/fizzbuzz/{number}`

- **number**: 整数値
- **Content-Type**: `plain/text`
- リクエストされた`number`に対して`FizzBuzzEngine`を使用して結果を返却する。

#### 例:
- `/api/fizzbuzz/1` -> `1`
- `/api/fizzbuzz/3` -> `Fizz`
- `/api/fizzbuzz/5` -> `Buzz`
- `/api/fizzbuzz/7` -> `Foo`
- `/api/fizzbuzz/15` -> `FizzBuzz`
- `/api/fizzbuzz/21` -> `FizzFoo`
- `/api/fizzbuzz/35` -> `BuzzFoo`
- `/api/fizzbuzz/105` -> `FizzBuzzFoo`

## 3. FizzBuzz問題のGraphQL化

### 説明
リファクタリングした`FizzBuzzEngine`を、Spring for GraphQLを用いてGraphQLとして公開する。

### 課題
`FizzBuzzEngine`をGraphQLとして公開する`FizzBuzzGraphQLController`を実装しなさい。`FizzBuzzGraphQLController`は以下のクエリを提供します。

`fizzBuzz(number: Int!): String`

- **number**: 整数値
- リクエストされた`number`に対して`FizzBuzzEngine`を使用して結果を返却する。

#### 例:
- `fizzBuzz(1)` -> `1`
- `fizzBuzz(3)` -> `Fizz`
- `fizzBuzz(5)` -> `Buzz`
- `fizzBuzz(7)` -> `Foo`
- `fizzBuzz(15)` -> `FizzBuzz`
- `fizzBuzz(21)` -> `FizzFoo`
- `fizzBuzz(35)` -> `BuzzFoo`
- `fizzBuzz(105)` -> `FizzBuzzFoo`

## 4. Web APIのセキュア化

### 説明
FizzBuzz問題のWeb APIをセキュア化する。

### 課題
FizzBuzz問題のWeb APIをSpring Securityを使用して認証を要求するように変更しなさい。設定内容は以下の通りとする。

- `/api/**`は**Basic認証**を使用する。
  - **ユーザ名**: `User`
  - **パスワード**: `P@ssword`
- 上記以外のエンドポイントでは認証を要求しない。

---

# Coding Exam

## 1. Refactoring the FizzBuzz Problem

### Description
A program has been implemented that accepts an integer as input and outputs results according to the following rules:

1. If the number is divisible by 3, output "Fizz" instead of the number.
2. If the number is divisible by 5, output "Buzz" instead of the number.
3. If the number is divisible by both 3 and 5, output "FizzBuzz" instead of the number.
4. If none of the above conditions apply, output the number itself.

### Task
The `FizzBuzzEngine` class has been implemented to meet the FizzBuzz requirements. However, a new requirement has been added to output "Foo" when the number is divisible by 7. Additionally, there may be future requirements to return specific strings for various prime numbers.

Refactor the `FizzBuzzEngine` class by applying the **Open Closed Principle** to make it open for extension but closed for modification. The `FizzBuzzEngine` class should be flexible for extension via interfaces or abstract classes.

## 2. Creating a Web API for the FizzBuzz Problem

### Description
Refactor the `FizzBuzzEngine` and expose it as a Web API using Spring MVC.

### Task
Implement the `FizzBuzzRestController` to expose the refactored `FizzBuzzEngine` as a Web API. The `FizzBuzzRestController` should provide the following endpoint:

`GET /api/fizzbuzz/{number}`

- **number**: Integer value
- **Content-Type**: `plain/text`
- Returns the result for the requested number using the `FizzBuzzEngine`.

#### Examples:
- `/api/fizzbuzz/1` -> `1`
- `/api/fizzbuzz/3` -> `Fizz`
- `/api/fizzbuzz/5` -> `Buzz`
- `/api/fizzbuzz/7` -> `Foo`
- `/api/fizzbuzz/15` -> `FizzBuzz`
- `/api/fizzbuzz/21` -> `FizzFoo`
- `/api/fizzbuzz/35` -> `BuzzFoo`
- `/api/fizzbuzz/105` -> `FizzBuzzFoo`

## 3. Creating a GraphQL API for the FizzBuzz Problem

### Description
Expose the refactored `FizzBuzzEngine` using Spring for GraphQL.

### Task
Implement the `FizzBuzzGraphQLController` to expose the `FizzBuzzEngine` as a GraphQL API. The `FizzBuzzGraphQLController` should provide the following query:

`fizzBuzz(number: Int!): String`

- **number**: Integer value
- Returns the result for the requested number using the `FizzBuzzEngine`.

#### Examples:
- `fizzBuzz(1)` -> `1`
- `fizzBuzz(3)` -> `Fizz`
- `fizzBuzz(5)` -> `Buzz`
- `fizzBuzz(7)` -> `Foo`
- `fizzBuzz(15)` -> `FizzBuzz`
- `fizzBuzz(21)` -> `FizzFoo`
- `fizzBuzz(35)` -> `BuzzFoo`
- `fizzBuzz(105)` -> `FizzBuzzFoo`

## 4. Securing the Web API

### Description
Secure the FizzBuzz Web API.

### Task
Modify the FizzBuzz Web API to require authentication using Spring Security. The configuration should meet the following requirements:

- All `/api/**` endpoints require **Basic Authentication**.
  - **Username**: `User`
  - **Password**: `P@ssword`
- All other endpoints do not require authentication.
