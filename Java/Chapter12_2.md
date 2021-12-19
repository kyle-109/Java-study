### 스레드 상태 제어
스레드의 상태를 변경하는 것을 **스레드 상태 제어**라고 한다.

<img src="https://images.velog.io/images/3hee_11/post/35e41e59-9a37-4689-9cd5-24047c986896/image.png" width="80%">

#### sleep()
- 주어진 시간동안 일시 정지 했다가 다시 실행 대기 상태로 돌아간다.
- 매개값은 얼마동안 일시정지 할 건지를 밀리세컨드 단위로 넣어주면 된다.
- 일시 정지 상태에서 주어진 시간이 되기 전에 interrupt()가 호출되면 예외가 발생하기 때문에 예외 처리가 필요하다.

#### yield()
- yield()를 호출한 스레드는 실행 대기 상태가 되고 다른 스레드가 실행된다.
- 무의미한 반복문이 쓰여질 경우 사용된다.
<img src="https://images.velog.io/images/3hee_11/post/063da101-b26f-4e23-acc5-18b6e98ae200/image.png" width="65%">

#### join()
- 다른 스레드가 종료될 때까지 기다렸다가 실행한다.
- 아래 그림같은 경우** ThreadA는 threadB가 종료될 때까지 일시 정지 상태**가 된다.
![](https://images.velog.io/images/3hee_11/post/df1b6255-d3de-426a-b290-bcd16b2019c6/image.png)

#### 스레드 간 협업(wait(), notify(), notifyAll())
- 스레드를 교대로 번갈아가며 실행한다. 
👉 A의 작업이 끝나면 notify()를 호출해 B의 일시 정지 상태를 실행 대기 상태로 바꾸고 A는 wait()를 호출해 일시 정지 상태로 만든다.
![](https://images.velog.io/images/3hee_11/post/2b41e9c1-c42e-41bc-8aa9-0b778209a0c1/image.png)
- wait(long timeout), wait(long timeout, int nanos)를 사용하면 notify()를 호출하지 않아도 지정된 시간이 지나면 스레드가 실행 대기 상태가 된다.
- notifyAll()은 wait()에 의해 일시 정지된 **모든 스레드들을 실행 대기 상태**로 만든다.
- Object의 메소드이므로 모든 공유 객체에서 호출이 가능하나 동기화 메소드, 블록 내에서만 사용이 가능하다.

#### 스레드의 안전한 종료(stop 플래그, interrupt())
🚨 stop() 메소드를 사용하면 스레드가 바로 종료된다. 이렇게 되면 스레드가 사용중이던 자원들이 불안정한 상태로 남겨지므로 권장하지 않음!

👉 **stop 플래그 이용하기**

<img src="https://images.velog.io/images/3hee_11/post/9926d90a-098d-4a87-8fe0-87e2fc9212b2/image.png" width="80%">

👉 **interrupt() 메소드**
- interrupt()는 스레드가 일시 정지 상태에 있을 때 예외를 발생시키는 역할을 한다. 이것을 이용하면 run()을 정상 종료시킬 수 있다.
- 스레드가 실행 대기 또는 실행 상태에 있을 떄 interrupt()가 실행되면 스레드가 미리에 일시 정지 상태가 되면서 예외가 발생한다. 
- interrup() 호출 여부
  - interrupted() : 정적 메소드로 현재 스레드가 interrupted() 됐는지 확인
  - isinterrupted() : 인스턴스 메소드로 현재 스레드가 interrupted() 됐는지 확인 
  
### 데몬 스레드
- 데몬 스레드는 주 스레드의 작업을 돕는 **보조적인 역할을 수행하는 스레드**이다.
- 주 스레드가 종료되면 데몬 스레드도 강제 종료된다.
- 주 스레드가 데몬이 될 스레드의 setDaemon(true)를 호출해주면 된다.
📌 start() 호출 전에 setDaemon(true) 호출하기(예외 발생)
- isDaemon()은 현재 실행 중인 스레드가 데몬 스레드인지 알려준다.

### 스레드 그룹
- 스레드 그룹은 관련된 스레드를 묶어서 관리할 목적으로 이용된다.
- JVM이 실행되면 system 그룹을 만들고 JVM 운영에 필요한 스레드들을 생성해서 system 스레드 그룹에 포함시킨다. 
- system의 하위 스레드 그룹으로 main을 만들고 메인 스레드를 main 스레드 그룹에 포함시킨다.
- 스레드는 하나의 스레드 그룹에 포함되며 명시적으로 그룹에 포함시키지 않으면 자신을 생성한 스레드와 같은 그룹에 속한다.

#### 스레드 그룹 이름 얻기
```java
// 스레드 이름 얻기
ThreadGroup group = Thead.currentThread.getThreadGroup();
String groupNmae = group.getName();

// 모든 스레드 정보 얻기
// key는 스레드 객체, 값은 스레드의 상태 기록을 갖고 있는 배열
Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
```

#### 스레드 그룹 생성
- 스레드 그룹을 생성하려면 아래 생성자 중 하나를 이용해 ThreadGroup 객체를 만든다.
- 스레드 그룹 생성 시 부모(parent) 스레드의 그룹을 지정하지 않으면 현재 스레드가 속한 그룹의 하위 그룹으로 생성된다.
```java
ThreadGroup tg = new ThreadGroup(String name);
ThreadGroup tg = new ThreadGroup(ThreadGroup parent, String name);
```

#### 스레드 그룹의 일괄 interrupt()
- 스레드들이 같은 그룹에 소속되어 있을 경우 스레드 그룹의 interrupt() 메소드를 이용하면 모두 종료할 수 있다.
👉 스레드 그룹의 interrupt()는 포함된 모든 스레드의 interrupt() 메소드를 내부적으로 호출해주기 때문이다
📌 개별 스레드에서 발생하는 예외 처리는 해주지 않음! 
![](https://images.velog.io/images/3hee_11/post/beba28d7-7231-4fd3-bfb5-e26beb246a6c/image.png)

### 스레드풀

스레드풀은 작업 처리에 사용되는 **스레드를 제한된 개수만큼 정해**놓고 작업 큐에 들어오는 작업들을 **하나씩 스레드가 맡아 처리**한다. 
👉 작업 처리 요청이 많아도 스레드 전체의 수가 늘어나지 않아 어플리케이션 성능이 저하되지 않는다.

- Executors 클래스의 정적 메소드를 이용해 **ExecutorService 인터페이스의 구현 객체**를 만들 수 있는데 이것이 바로 스레드풀이다.
- **ExecutorService 동작 방식**
<img src="https://images.velog.io/images/3hee_11/post/e76f2481-38a6-4ad5-b3f1-1809d9c2d825/image.png" width="80%">

#### 스레드풀 생성 및 종료

**스레드풀 생성**
- ExecutorService의 구현 객체는 Excutors 클래스의 아래 두가지 메소드 중 하나로 생성할 수 있다.

<img src="https://images.velog.io/images/3hee_11/post/14ceaf98-5401-4e7e-9e71-463926357b86/image.png" width="80%">

- 초기 스레드 수 : 객체가 생성될 때 기본적으로 생성되는 스레드 수
- 코어 스레드 수 : 최소한 유지해야 할 스레드 수
- 최대 스레드 수 : 스레드풀에서 관리하는 최대 스레드 수

**newCachedThreadPool()**
- 스레드 개수보다 작업 개수가 많으면 새 스레드를 생성시켜 작업을 처리한다.
- int의 최대값만큼 스레드를 추가할 수 있지만 운영체제의 성능에 따라 달라진다.
- 스레드가 추가되었을 때 60초 동안 그 스레드가 작업하지 않으면 제거한다. 
```java
ExecutorService executorService = Executors.newCachedThreadPool();
```

**newFixThreadPool(int nThreads)**
- 스레드 개수보다 작업 개수가 많으면 새 스레드를 생성시켜 작업을 처리한다.
- 최대 스레드 개수는 매개값으로준 nThreads이다.
- 스레드가 작업을 처리하지 않고 놀고 있어도 개수가 줄지 않는다.

**스레드풀 종료**

🚨 스레드풀의 스레드는 main 스레드가 종료되어도 **계속 실행 상태**로 남아있다.
👉 main() 메소드가 끝나도 애플리케이션 프로세스가 종료되지 않기 때문에 **스레드풀을 종료**시켜 스레드들이 종료 상태가 되도록 처리

<img src="https://images.velog.io/images/3hee_11/post/1d622789-65bc-46f5-9f61-28cd5e9d298c/image.png" width="90%">

#### 작업 생성과 처리 요청

**작업 생성**
- 하나의 작업은 Runnable 혹은 Callable 구현 클래스로 표현한다.
- 둘의 **차이점은 리턴값의 유무**이다.

<img src="https://images.velog.io/images/3hee_11/post/c83516d0-ab68-40a7-9679-4f4bacb39886/image.png" width="90%">

**작업 처리 요청**
작업 처리 요청이란 ExecutorService의 작업 큐에 Runnable, Callable 객체를 넣는 행위이다.

<img src="https://images.velog.io/images/3hee_11/post/5e9f793c-c6a6-4cf6-a74b-99aed1368fd4/image.png" width="90%">

- **execute()는 작업 처리 중 예외가 발생하면 스레드가 종료**되고 해당 스레드는 스레드풀에서 제거된다.
👉 스레드풀은 다른 작업 처리를 위해 새로운 스레드를 생성한다.
- **submit()은 작업 처리 중 예외가 발생해도 스레드가 종료되지 않고** 다음 작업을 위해 재사용된다.

📌 둘의 가장 큰 차이점은 **작업 처리 결과를 받는지의 여부**

#### 블로킹 방식의 작업 완료 통보
- ExecutorService의 submit()는 매개값으로 준 Runnable 혹은 Callable 작업을 작업큐에 저장하고 즉시 Future 객체를 리턴한다.
- Future 객체는 작업이 완료될 때까지 기다렸다가(블로킹되었다가) 최종 결과를 얻는데 사용된다.
👉 그래서 Future를 지연 완료 객체라고 한다.
- Future의 **get() 메소드**를 호출하면 스레드가 작업을 완료할 때까지 블로킹되었다가 **작업을 완료하면 처리 결과를 리턴**한다.

<img src="https://images.velog.io/images/3hee_11/post/1aa37741-969b-44f3-a2c3-210734c60c68/image.png" width="90%">

👉 리턴타입인 V는 submit(Runnable task, V result)의 두번째 매개값인 V 혹은 submit(Callable< V > task)의 Callable 타입 파라미터 V이다.

🚨 작업을 처리하는 스레드가 작업을 완료하기 전까지 get() 메소드가 블로킹 되므로 다른 코드를 실행할 수 없다. 그렇기 때문에 **get() 메소드를 호출한 스레드는 다른 스레드여야** 한다.

**get() 메소드 이외의 메소드**

<img src="https://images.velog.io/images/3hee_11/post/87fa0199-037f-47c4-be55-97eb4f4e2a7d/image.png" width="90%">

**리턴값이 없는 작업 완료 통보**
Runnable 객체를 생성해서 submit()의 매개값으로 넣어준다.
```java
Runnable task = new Runnable(){
	@Override
    public void run(){
    	// 스레드가 처리할 작업 내용
    }
}

Future future = executorSerivce.submit(task);
```
- 결과값이 없음에도 Future 객체를 리턴하는 건 작업 처리를 정상적으로 완료했는지 확인하기 위함이며 완료되었다면 get() 메소드는 null을 리턴한다.
- 스레드가 작업 처리중 interrupt되면 예외를 발생시키기 때문에 예외처리가 필요하다.

**리턴값이 있는 작업 완료 통보**
작업 객체를 Callable 로 생성한다. 제네릭 타입 파라미터 T는 call() 메소드가 리턴하는 타입이 되도록 한다.
```java
Callable<T> task = new Callable<T>(){
	@Override
    public T call() throws Exception {
    	// 스레드가 처리할 작업 내용
        return T;
    }
}

// get()하면 블로킹이 해제되고 T타입의 값 리턴
Future<T> future = executorSerivce.submit(task);
```

**작업 처리 결과를 외부 객체에 저장**
- 스레드가 작업 처리를 완료하고 외부 Result 객체에 작업 결과를 저장한다.
- Result 객체는 공유 객체가 되어 두 개 이상의 스레드 작업 결과를 취합할 목적으로 이용된다.

<img src="https://images.velog.io/images/3hee_11/post/609cabca-c0ee-43a5-97bd-2fe832e0d85f/image.png" width="60%">

- ExecutorService의 submit(Runnable task, V result) 메소드를 사용할 수 있다.
- 메소드를 호출하면 Future< V >가 리턴되는데 get() 메소드를 호출하면 블로킹되었다가 작업이 끝나면 V 타입 객체를 리턴한다.
- 리턴된 객체는 submit()의 두번째 매개값과 동일한데 차이점은 스레드 처리 결과가 내부에 저장되어 있다는 것이다.
  
```java
Result result = ...;
Runnable task = new Task(result);
Future<Result> future = executorService.submit(task, result);
result = future.get();
```
🚨 Runnable 구현 클래스를 생성할 때 스레드에서 결과를 저장하기 위해 외부 Result 객체를 사용해야 하므로 **생성자를 통해 Result 객체를 주입**받도록 해야 한다.
  
```java
class Task implements Runnable{
	Result result;
  	Task(Result result){
  		this.result =result;
    }
  
    @Override
  	public void run(){
  		// 작업 코드
  		// 처리 결과를 result 저장
  	}  
}
```

**작업 완료 순으로 통보**
- 작업 요청 순서대로 작업 처리가 완료되는 것은 아니다.
- 작업들이 순차적으로 처리될 필요성이 없고, 처리 결과도 순차적으로 이용할 필요가 없다면 작업 처리가 완료된 것부터 결과를 얻어 이용하는 것이 좋다.
👉 CompletionService는 처리가 완료된 작업을 가져오는 poll()과 take() 메소드를 제공한다.
  
<img src="https://images.velog.io/images/3hee_11/post/9e753f6e-be72-499c-945a-b17f4e27bcc6/image.png" width="90%">

- CompletionService의 구현 클래스는 ExecutorCompletionService(V)이다.
- 객체를 생성할 때 생성자의 매개값으로 ExecutorService를 제공해야 한다.

**콜백 방식의 작업 완료 통보**
콜백 : 어플리케이션이 스레드에게 작업 처리를 요청한 후, 스레드가 작업을 완료하면 특정 메소드(콜백 메소드)를 자동 실행하는 기법이다. 
  
![](https://images.velog.io/images/3hee_11/post/1e73ad96-c17c-43bf-86da-7aedf6c8f5a8/image.png)
- 블로킹 방식은 작업 처리 요청 후 작업이 완료될 때까지 블로킹되지만 콜백 방식은 작업 처리를 요청한 후 결과를 기다릴 필요없이 다른 기능을 수행할 수 있다.
👉 작업이 완료되면 자동으로 콜백 메소드가 실행되어 결과를 알 수 있기 때문!
- ExecutorService는 콜백을 위한 기능을 제공하지 않고 대신 Runnable 구현 클래스를 작성할 때 콜백 기능을 구현할 수 있다.

콜백 메소드를 가진 클래스가 있어야 하는데 직접 정의하거나 CompletionHandler를 사용한다.
  
**CompletionHandler를 이용해 콜백 객체를 만드는 법**
```java
CompletionHandler<V, A> callback = new CompletionHandler<V, A>() {
	
    // 작업 정상 처리시 호출
    // V는 결과값, A는 첨부값의 타입
    // 첨부값이란? 콜백에 결과값 이외에 추가적으로 전달하는 객체
    // 첨부값이 필요없다면 A는 void로 지정!
    @Override
    public void completed(V result, A attachment){}
  
    // 작업 처리중 예외 발생시 호출
    @Override 
    public void failed(Throwable exc, A attachment){}
}
```