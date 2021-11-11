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
  
## 변수의 사용
+ 변수에 값을 저장할 때에는 대입연산자(=)를 사용한다.
+ 자바에서는 우측의 값을 좌측 변수에 저장한다는 의미를 갖는다.
  
