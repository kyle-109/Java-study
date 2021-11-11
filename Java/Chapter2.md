# 변수와 타입
## 변수
+ 변수란?
  + 값을 저장할 수 있는 메모리의 공간을 의미. 
  + 변수는 한번에 한가지 타입과 값만 저장할 수 있다.

+ 변수의 선언
  + 변수를 사용하기 위해선 어떤 타입의 데이터를 저장할 것인지 변수 이름이 무엇인지 선언해야한다.
  ``` java
  int age; // int는 데이터 타입, age는 변수이름
  double value; // double은 데이터 타입, value는 변수이름
  ```
  + 같은 타입의 변수는 콤마(,)를 이용해서 한꺼번에 선언할 수 있다.
  ```
  int x, y, z;
  ```
  + 프로그램은 변수이름을 통해서 메모리 주소에 저장, 값을 읽는다.
  + 변수 이름은 자바에서 정한 명명 규칙을 따라야 한다.
### 작성규칙
  1. 첫 번째 글자는 문자이거나 "_",'$', 이어야 하고 숫자로 시작할 수 없다. (price, $price, _companyName)
  2. 영어 대소문자가 구분된다. (fistname과 firstName은 다른 변수) 
  3. 첫 문자는 영어 소문자로 시작하되, 다른 단어가 붙은 경우 첫 문자를 대문자로 한다.(관례) 예를 들어 carColor는 변수이름으로 사용하고 CarColor는 클래스 이름으로 사용하는데 보통은 대소문자  로 식별자를 구분하기 때문에 지켜주는 편이 좋다
  4. 문자 수의 제한은 없다.
  5. 자바 예약어는 사용할 수 없다.
  
  |분류|예약어|
  |---------|-------------------|
  |기본 데이터 타입| boolean, byte, char, short, int, long, float, double|
  |접근 지정자| private, protected, public|
  |클래스와 관련된 것| class, abstract, interface, extends, implements, enum|
  |객체와 관련된것| new, instanceof, this, super, null|
  |메소드와 관련된 것| void, return|
  |제어문과 관련된 것| if, else, switch, case, default, for, do, while, braeak, continue|
  |논리값|ture, false|
  |예외 처리와 관련된 것|try, catch, finally, throw, throws|
  |기타| transient, volatile, package, import, synchronized, native, final, static, strictf, assert|
  
### 변수의 사용
+ 변수에 값을 저장할 때에는 대입연산자(=)를 사용한다.
+ 자바에서는 우측의 값을 좌측 변수에 저장한다는 의미를 갖는다.
+ 변수를 선언하고 처음 값을 저장하는 것을 초기값이라 하고, 변수에 초기값을 주는 행위를 변수의 초기화라고 한다.
``` java
int score1; // 변수 선언
score1 = 90; // 값 저장(초기값)
int score2 = 90;
```
+ 변수는 초기화가 되어야 읽을 수 있다. 
```
int vlaue; //초기화가 되지 않음
int result = value + 10;
System.out.print(result); //변수는 초기화되지 않으면 읽을 수 없기 때문에 컴파일 에러가 발생한다.
```
- 옳은 코드
```
int value = 0; // value가 0으로 초기화됨
int result = value + 10;
System.out.println(result); 
```

#### 단어정리
```
int a = 10; // int - 변수타입, a - 변수, 10 - 리터럴
final int a= 10; int - 변수타입, a - 상수, 10 - 리터럴
```
+ 변수는 하나의 값을 저장하기 위한 공간이다.(변경 가능)
+ 상수는 값을 한번만 저장할 수 있는 공간이다.(변경 불가능)
+ 리터럴은 그 자체로 값을 의미한다.

#### 정수 리터럴
+ 소수점이 없는 정수 리터럴은 10진수로 간주한다.
+ 0으로 시작되는 리터럴은 8진수로 간주한다.
+ 0x 또는 0X로 시작하는 리터럴은 16진수로 간주한다.

#### 실수 리터럴
+ 소수점이 있는 리터럴은 10진수 실수로 간주한다. 
+ 대문자 E 또는 소문자 e가 있는 리터럴은 10진수 지수와 가수로 간주한다.
  
    예) 0.12345 * 10<sup>2<sup/></br> (0.12345 = 가수, 10<sup>2<sup> = 진수)
  
#### 문자,문자열 리터럴
+ 작은 따옴표(')로 묶은 텍스트는 하나의 문자 리터럴로 간주한다.
+ 큰따옴표(")로 묶은 텍스트는 문자열 리터럴로 간주한다.

#### 논리 리터럴
+ 논리 리터럴로는 ture와 false를 사용한다.
+ 논리 리터럴을 저장할 수 있는 데이터 타입은 boolean 하나뿐이다.

## 변수의 사용 범위
+ 변수는 클래스, 생성자, 메소드의 중괄호 {} 블록에서 선언되고 사용된다.
+ 변수는 선언된 블록 내에서만 사용이 가능하다.
  + 메소드 블록 내에서 선언된 변수를 로컬 변수(local variable)이라 한다. 로컬 변수는 메소드 실행이 끝나면 메모리에서 자동으로 없어진다.
  + 조건문, 반복문 등의 제어문은 중괄호를 가질 수 있는데, 제어문 블록에서 선언된 변수는 해당 제어문 블록 내에서만 사용할 수 있다.
``` java
public class VariableExample {
  public static void main(String[] args) {
    int a = 10;
    int sum = a + b; // 변수 b는 Example메소드 블록 내에서 선언되었기 때문에 main 메소드 내에서 사용할 수 없다.
    for(...){
      int c = 5;
    }
    int sum2 = a + c; // 변수 c는 제어문 블록 안에서 선언 되었기 때문에 main 메소드에서 사용할 수 없다.
  }

  static int Example() {
    int b = 10;
  }
}
```  
## 데이터 타입
  
