### 예외와 예외 클래스 

#### 예외란? 
사용자의 잘못된 조작 또는 개발자의 잘못된 코딩으로 인해 발생한 프로그램 오류를 말하며 **예외 처리**(Exception Handling)을 통해 프로그램을 종료하지 않고 실행할 수 있다.

- 예외는 컴파일 시 예외 처리 코드가 필요한지 검사하는 일반 예외(Exception)과  컴파일 시 검사하지 않는 실행 예외(Runtime Excetion)으로 나뉜다.
- 자바에서는 예외를 클래스로 관리하며 예외가 발생하면 예외 클래스 객체를 생성한다.
- 모든 예외 클래스는 java.lang.Exception을 상속받는다.

### 실행 예외

#### NullPotinterException
- null 값을 갖는 참조 변수로 객체 접근 연산자인 도트(.)를 사용했을 때 발생한다.

```java
public class NullPointerExceptionExample{
	public static void main(String[] args){
    	String data = null;
        System.out.println(data.toString());
    }
}
```
![](https://images.velog.io/images/3hee_11/post/716f5391-496f-4acf-94cc-dfea58a40379/image.png)

#### ArrayIndexOutOfBoundsException
- 배열에서 인덱스 범위를 초과하여 사용할 경우 발생한다.

```java
public class ArrayIndexOutOfBoundsExceptionExample{
	public static void main(String[] args){
     	// arr[0] ~ arr[2]
    	int[] arr = new int[3];
        arr[3] = 2;
    }
}
```
- length 속성으로 배열의 길이를 먼저 확인하고 사용해야 한다.

#### NumberFormatException
- 문자열에서 숫자로 변경하는 정적 메소드 parseXXX()를 사용할 때 매개값을 숫자로 변경할 수 없으면 발생한다.

```java
public class NumberFormatExceptionExample{
	public static void main(String[] args){
     	String str = "a100";
        int number = Integer.parseInt(str);
    }
}
```

#### ClassCastException
- **부모, 자식 클래스 간의 상속 관계**나 **인터페이스 구현 객체**와 같은 관계가 **아닐 때** 타입 변환을 하면 발생하는 예외이다.
![](https://images.velog.io/images/3hee_11/post/2e19cd5e-4489-4ba5-8c5e-26065a29681a/image.png)

```java
public class ClassCastExceptionExample{
	public static void main(String[] args){
     	Animal aninal = new Dog();
        Cat cat = (Cat)animal;
        
        RemoteControl rc = new Tv();
        Audio audio = (audio)rc;
    }
}
```
- 타입 변환 전에 instanceof  연산자로 확인하는 것이 좋다. instanceof 연산자 결과가 true면 좌항에서 우항으로 변환이 가능하다는 뜻이다.

### 예외처리 코드

#### try - catch - finally
- 생성자와 메소드 내부에 작성되어 일반 예외나 실행 예외가 발생할 경우 예외 처리를 할 수 있도록 해준다.
![](https://images.velog.io/images/3hee_11/post/7d883dfe-f5a2-435e-b42e-08cfdc9ef072/image.png)
- try 블록에는 예외 발생 가능한 코드를 작성한다. 만약 try에서 예외가 발생하지 않는다면 catch를 거치지 않고 finally 블록으로 간다. try에서 예외가 발생한다면  실행을 멈추고 catch 블록 내부에서 예외 처리 코드를 실행하고 finally로 간다.

#### 일반 예외 처리
- forName() 메소드는 매개값인 클래스가 존재하면 class 객체를 리턴하지만 존재하지 않으면 ClassNotFoundException 예외를 발생시킨다. 
```java
public class TryCatchFinallyExample{
	public static void main(String[] args){
     	try{
        	Class clazz = Class.forName("java.lang.String");
        }catch(ClassNotFoundException e){
        	System.out.println("클래스가 존재하지 않습니다");
        }
    }
}
```

#### 실행 예외 처리
```java
public class TryCatchFinallyRuntimeExceptionExample{
	public static void main(String[] args){
    	String data1 = null;
        String data2 = null;
        
     	try{
            data1 = args[0];
            data2 = args[1];
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("매개값이 부족합니다.");
            System.out.println("<실행방법>");
            System.out.println("java class명 num1 num2");
            return;
        }
        
        try{
	    int value1 = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);
            int result = value1 + value2;
	}catch(NumberFormatException e){
    	    System.out.println("숫자로 변환할 수 없습니다.");
   	}finally{
    	    System.out.println("다시 실행하세요.");
    	}
    }
}
```

### 예외 종류에 따른 처리 코드

#### 다중 catch
![](https://images.velog.io/images/3hee_11/post/fa78cd8c-c116-4db4-bb7e-25a79b3bab4e/image.png)
- try 블록에서 동시에 예외가 발생하지 않고 하나의 예외가 발생하면 실행을 멈추고 catch 블록으로 이동하기 때문에 catch 블록이 여러개여도 하나의 블록만 실행된다.

#### catch 순서
![](https://images.velog.io/images/3hee_11/post/31885fe6-f949-4d78-8860-763d4da4f1f7/image.png)
- 다중 catch를 사용할 때 주의할 점은 **상위 예외 클래스가 하위 예외 클래스보다 아래쪽에 위치**해야 한다. 상위 예외 클래스의 catch 블록이 위에 있다면 하위 예외 클래스는 실행되지 않는다. 왜냐하면 **하위 예외는 상위 예외를 상속받았기 때문에 상위 예외 타입도 되기 때문**이다.

#### 멀티 catch
![](https://images.velog.io/images/3hee_11/post/10ec5ad6-5cc7-41b0-91c7-9d9f168f502d/image.png)
- 자바7부터 멀티 catch를 지원한다.
- catch 괄호 안에 동일하게 처리하고 싶은 예외를 |로 연결하면 된다.

### 자동 리소스 닫기
- 자바 7에서 추가된 try-with-resources를 사용하면 예외 발생 여부와 상관없이 사용했던 리소스 객체의 close() 메소드를 호출해 안전하게 리소스를 닫아준다.
- 리소스 객체란 각종 입출력 스트림(ex. FileInputStream), 서버 소켓 등 데이터를 읽고 쓰는 객체이다.
- try-with-resources를 사용하려면 AutoCloseable 인터페이스를 구현해야한다.
    - 💡 AutoCloseable를 구현한 클래스 보기 [API Document](https://docs.oracle.com/javase/7/docs/api/)
    
```java
try(FileInputStream fis = new FileInputStream("file.txt")){
	...
}catch(ClassNotFoundException e){
	...	
}
```

### 예외 떠넘기기
- throws 키워드를 메소드 선언부 끝에 작성하면 메소드에서 처리하지 않은 예외를 **메소드를 호출한 곳으로 떠넘기는** 역할을 한다.
- throws 뒤에 떠넘길 예외들을 쉼표로 구분해서 나열해주면 된다.

```java
리턴타입 메소드명(매개변수) throws 예외클래스1, 예외클래스2{
	...
}
```

- throws 뒤에 나열하는게 일반적이지만 Exception만 작성해서 모든 예외를 떠넘길 수도 있다.
![](https://images.velog.io/images/3hee_11/post/e5fa4b55-c698-4594-a8d7-a5bdfacfea7f/image.png)
- **throws가 붙은 메소드는 반드시 try 블록 내에서 호출**돼야 하고 catch 블록에서 떠넘겨받은 예외를 처리해야 한다.

### 사용자 정의 예외와 예외 발생
```java
public class XXXException extends [Exception | RuntimeException]{
	public XXXException(){ }
    public XXXException(String message){ super(message) ;}
}
```
- 일반 예외로 선언할 경우 Exception을 실행 예외로 선언할 경우 RuntimeException을 상속받는다.
- 사용자 정의 예외 클래스도 필드, 생성자, 메소드를 포함할 수 있으나 일반적으로 생성자만 포함한다.
- 생성자는 일반적으로 두개를 생성하는데 하나는 매개 변수가 없는 기본 생성자, 하나는 예외 발생 원인(예외 메세지)를 전달하기 위해 String 타입의 매개 변수를 갖는 생성자이다.
- String 매개 변수를 갖는 생성자는 상위 클래스의 생성자를 호출하여 메세지를 넘겨준다. 예외 메세지의 용도는 catch 블록에서 이용하기 위함이다.

#### 예외 발생시키기
```java
throw new XXXException();
throw new XXXException("메세지");
```

```java
public void method() throws XXXException{
	throw new XXXException("메세지");
}
```

```java
try{
    method();
}catch(XXXException e){
	// 예외처리
}
```

#### 예외 정보 얻기
![](https://images.velog.io/images/3hee_11/post/00cabe82-01f6-403e-8d17-0800b6ae010c/image.png)
- 모든 예외 객체는 Exception 클래스를 상속받으므로 Exception 클래스가 가지고 있던 메소드를 호출할 수 있다.
    - getMessage() : 예외가 발생한 이유에 대한 자세한 설명
    - printStackTrace() : 예외가 어디서 발생했는지 출력
    
```java
public class Acount {
    private long balance;
    
    public Acount();
    
    public long getBalance(){
    	return balance;
    }
    
    public void deposit(int money){
    	balance += money;
    }
    
    public void withdraw(int money) throws BalanceInstufficientException {
    	if(balance < money){
        	throw new BalanceInstufficientException("잔고부족:" + (money - balance) 
            							   + "원 모자람");
        }
        balance -= money;
    }
}

public class AccountExample{
	public static void main(String[] args){
    	Account account = new Account();
        
        //예금하기
        account.deposit(1000);
        System.out.println("예금액" + account.getBalance());
        
        //출금하기
       try{
           account.withdraw(30000)
       }catch(BalanceInstuffienceException e){
            String message = e.getMessage();
            System.out.println("message");
            System.out.println();
            e.printStackTrace();
       }
    }
}
```