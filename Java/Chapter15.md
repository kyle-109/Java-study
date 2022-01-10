🚨 **배열의 문제점**
- 선언할 때 배열의 크기를 지정해야 한다. 
👉 불특정 다수의 객체를 저장하기에는 문제가 있음
- 객체를 삭제했을 때 해당 인덱스가 비게 된다.
👉 새로운 객체 저장 시 어디가 비어있는지 확인하는 코드 필요

💡 **컬렉션 프레임워크**
- **자료구조를 바탕으로 객체들을 효율적으로 추가, 삭제, 검색할 수 있도록 제공된 것**  
- 몇 가지 인터페이스를 통해 다양한 컬렉션 클래스를 이용할 수 있다.
<img src="https://images.velog.io/images/3hee_11/post/0db49b6c-e92d-474b-a7bf-8756e9e0cfcb/image.png">
<img src="https://images.velog.io/images/3hee_11/post/01e4d679-51aa-4802-a24b-acaad1642d6f/image.png">

### List 컬렉션
- 객체를 일렬로 늘어놓은 구조를 가지고 있다.
- **객체를 인덱스로 관리**하기 때문에 저장하면 자동으로 인덱스가 부여된다.
- 객체 자체를 저장하지 않고 객체의 번지를 참조한다.
- 동일한 객체 **중복 저장이 가능**하다.

<img src="https://images.velog.io/images/3hee_11/post/6ce40697-57a1-4d1c-8c45-a2cf546c26ef/image.png">
<img src="https://images.velog.io/images/3hee_11/post/b78e7163-784b-4e96-afc4-0ad4f186aa1b/image.png">

#### ArrayList
저장 용량(capacity)을 초과한 객체들이 들어오면 자동으로 저장 용량이 늘어난다.

<img src="https://images.velog.io/images/3hee_11/post/720ec504-c8f1-4173-a8d2-a054390ccb44/image.png">
특정 인덱스의 객체를 제거하면 뒤에 인덱스 모두가 1씩 앞 당겨진다.

<img src="https://images.velog.io/images/3hee_11/post/0995f2e4-5ec9-4331-96f6-8c69f500c89a/image.png">

고정된 객체들로 구성된 List를 생성 할때는 Arrays.asList()를 사용한다.
```java
List<String> list = Arrays.asList("홍길동", "김아무개");
```

#### Vertor
- ArrayList와 동일한 내부 구조를 가지고 있다. 
- ** ArrayList와 차이점은 Vector는 [동기화된 메소드](https://velog.io/@3hee_11/JAVA-%EC%9D%B4%EA%B2%83%EC%9D%B4-%EC%9E%90%EB%B0%94%EB%8B%A4-)로 구성되어 있어 멀티 스레드가 동시에 이 메소드를 실행할 수 없다.**
👉 멀티 스레드 환경에서 안전하게 객체를 추가, 삭제 할 수 있음
<img src="https://images.velog.io/images/3hee_11/post/b4d2cb56-e527-4bed-b125-49f20e4cb162/image.png">

#### LinkedList
LinkedList는 **인접 참조를 링크해서 체인처럼 관리**한다.

<img src="https://images.velog.io/images/3hee_11/post/564af02e-5afe-42a0-81c6-498770df49d4/image.png">

특정 인덱스의 객체를 제거하면 **앞뒤 링크만 변경되고 나머지 링크는 변경되지 않는다.**

📌 **객체 삭제와 삽입이 아주 일어난다면 ArrayList보다 LinkedList가 더 적합하다.**

### Set 컬렉션
- **저장 순서가 유지되지 않는다.**
- **객체를 중복해서 저장할 수 없다.**
- 하나의 null만 저장할 수 있다.

<img src="https://images.velog.io/images/3hee_11/post/a36cec1b-3d1e-48fb-897d-af05b134e67e/image.png">
<img src="https://images.velog.io/images/3hee_11/post/86572250-f420-4964-a1ab-0cd9b3143204/image.png">

- 인덱스로 객체를 검색해 가져오는 메소드가 없으므로 반복자(Iterator)를 제공한다.
``` java
Set<String> set = ''';
Iterator<String> iterator = set.iterator();

// hasNext() : 가져올 객체가 있는지 boolean으로 리턴
// next() : 컬렉션에서 하나의 객체를 가져옴
// remove() : Set 컬렉션에서 객체 제거 
```

#### HashSet
동일한 객체는 중복 저장하지 않는다.

<img src="https://images.velog.io/images/3hee_11/post/df36160e-fd85-4ec2-8e81-4b4e2673c6c5/image.png">

### Map 컬렉션
키와 값으로 구성된 Entry 객체를 저장하는 구조를 가지고 있다.
**키는 중복 저장될 수 없지만** 값은 중복 저장될 수 있다.

<img src="https://images.velog.io/images/3hee_11/post/0bbe52f2-899a-4095-8a14-0c56e079ba56/image.png">
<img src="https://images.velog.io/images/3hee_11/post/942c0b73-72a6-4954-adb7-7e38353e96d3/image.png">

#### HashMap
키 객체는 hashCode()와 equals() 를 재정의해 동등 객체가 될 조건을 정해야 한다.

<img src="https://images.velog.io/images/3hee_11/post/df36160e-fd85-4ec2-8e81-4b4e2673c6c5/image.png">

#### Hashtable
- HashMap과 동일한 내부 구조이며 Hashtable도 키 객체는 hashCode()와 equals() 를 재정의해 동등 객체가 될 조건을 정해야 한다.
- HashMap과 차이점은 **Hashtable은 [동기화된 메소드](https://velog.io/@3hee_11/JAVA-%EC%9D%B4%EA%B2%83%EC%9D%B4-%EC%9E%90%EB%B0%94%EB%8B%A4-)로 구성되어** 있기 때문에 **멀티 스레드가 동시에 이 메소드들을 실행할 수 없다.**
👉 멀티 스레드 환경에서 안전하게 객체를 추가, 삭제 할 수 있음

#### Properties
- Hashtable의 하위 클래스이기 때문에 Hashtable의 모든 특징을 가지고 있다.
- 차이점은 Properties는** 키와 값을 String으로 제한**한 컬렉션이다.
- 프로퍼티 파일(~.properties)을 읽을 때 사용한다.
  - 프로퍼티 파일 : 키와 값이 = 기호로 연결된 텍스트 파일, ISO 8859-1 문자셋으로 저장됨(한글은 유니코드)
  
```java
Properties properties = new Properties();
properties.load(new FileReader("C:/~/database.properties"));


// 클래스 파일 기준으로 상대 경로를 이용해 프로퍼티 파일의 경로를 얻어 파일 읽기
String path = 클래스.class.getResource("database.properties").getPath(); 
// getResource()는 주어진 파일에 상대경로 URL 객체로 리턴
// URL의 getPath()는 파일의 절대 경로 리턴
path = URLDecoder.decode(path, "utf-8");
// 경로에 한글이 있을 경우 한글로 복원
Properties properties = new Properties();
properties.load(new FileReader(path));


// Properties 객체의 해당 키에서 값을 읽을 때
String value = properties.getProperty("key");
```

### 검색 기능을 강화시킨 컬렉션
TreeSet과 TreeMap이 있으며 이진 트리(binary tree)를 이용해서 계층적 구조(tree 구조)를 가지면서 객체를 저장한다.

#### 이진 트리 구조
- 여러개의 노드가 **트리 형태로 연결된 구조**이다.
- 루트 노트를 제외하고는 각 노트에 **최대 2개의 노드를 연결**할 수 있다.
- 위아래로 연결된 두 노드를 부모-자식관계에 있다고 한다.
![](https://images.velog.io/images/3hee_11/post/2e858b5e-3c17-47f1-9229-bf6b723d4eba/image.png)
- 부모 노드의 값보다 작은 노드는 왼쪽, 큰 노드는 오른쪽에 배치한다(문자는 유니코드)
👉 왼쪽 마지막 노드가 가장 작은 값, 오른쪽 마지막 노드가 가장 큰 값이 된다.
- [ 왼쪽 노드 → 부모 노드 → 오른쪽 노드 ] 순으로 읽으면 오른차순으로 정렬된 값을 얻을 수 있다. 반대는 내림차순! 
👉 **값들이 정렬되어 있어 그룹핑이 쉽기 때문에 범위 검색이 쉽다.**
![](https://images.velog.io/images/3hee_11/post/71e0400e-18fe-45be-89bc-43d11f5a6c51/image.png)

#### TreeSet
- **이진 트리를 기반으로 한 Set 컬렉션**이다.
- 노드는 노드 값과 왼쪽과 오른쪽 자식을 참조하기 위한 두 개의 변수로 구성된다.
- TreeSet에 객체를 저장하면 부모값과 비교해 **자동으로 정렬**이 된다.
![](https://images.velog.io/images/3hee_11/post/a621902a-e056-4614-9e3c-9531ccbaaf08/image.png)

**주요 메소드**
✔ 검색 메소드 : first(), last(), lower(), higher(), floor(), ceiling(), pollFirst(), pollLast()
✔ 정렬 메소드 : descendingIterator(), descendingSet()
✔ 범위 검색 메소드 : headSet(), tailSet(), subSet()

#### TreeMap
- **이진 트리를 기반으로 한 Map 컬렉션**이다.
- TreeSet과 차이점은 **키와 값이 저장된 Map.Entry를 저장**한다는 점이다.
- TreeMap에 객체를 저장하면 **부모 키 값과 비교해 자동으로 정렬**되고 Map.Entry 객체를 저장한다.
![](https://images.velog.io/images/3hee_11/post/13505320-e8be-41aa-ba6c-34afd2de1793/image.png)

**주요 메소드**
✔ 검색 메소드 : firstEntry(), lastEntry(), lowerEntry(), higherEntry(), floorEntry(), ceilingEntry(), pollFirstEntry(), pollLastEntry()
✔ 정렬 메소드 : descendingKetSet(), descendingMap()
✔ 범위 검색 메소드 : headMap(), tailMap(), subMap()

#### Comparable과 Comparator
- TreeSet과 TreeMap은 자동 정렬을 위해 Comparable을 구현한 객체를 요구한다.
- 사용자 정의 클래스도 Comparable을 구현하고 compareTo()를 오버라이딩하면 자동 정렬이 가능하다.
🚨 TreeSet과 TreeMap의 키가 Comparable을 구현하지 않는다면 저장하는 순간 ClassCastException이 발생
👉 비구현 객체를 정렬하려면 TreeSet과 TreeMap 생성자의 매개값으로 정렬자() 주기
```java
TreeSet<E> treeSet = new TreeSet<E>(new AscendingComparator()); // 오름차순

TreeMap<K, V> treeMap = new TreeMap<K, V>(new DescendingComparator()); // 내림차순
```

### LIFO와 FIFO 컬렉션
- **LIFO(후입선출)** : 나중에 넣은 객체가 먼저 빠져나가는 자료구조
  - 예) Stack 클래스 
- **FIFO(선입선출)** : 먼저 넣은 객체가 먼저 빠져나가는 자료구조
  - 예) Queue 인터페이스
  
#### ✔ Stack
**LIFO 자료구조를 구현**한 클래스로 Stack을 응용한 대표적인 예가 **JVM 스택 메모리**이다.

<img src="https://images.velog.io/images/3hee_11/post/b8a19314-f4de-4800-9677-025a748e1a89/image.png">

**주요 메소드**

<img src="https://images.velog.io/images/3hee_11/post/530bcad5-08ed-4014-82b0-d0fce4eed8f9/image.png">


#### ✔ Queue
FIFO 자료구조에서 사용되는 메소드를 정의하고 있다.
Queue 인터페이스를 구현한 대표적인 클래스는 LinkedList이다.

<img src="https://images.velog.io/images/3hee_11/post/437899fb-bb87-43d0-b917-b89a64326805/image.png">

**주요 메소드**

<img src="https://images.velog.io/images/3hee_11/post/8753edea-44ca-44e9-ba36-17879eb77839/image.png">

### 동기화된 컬렉션
멀티스레드 환경에서 안전하게 요소를 처리하기 위해 비동기화된 컬렉션(ArrayList, HashSet, HashMap)을 동기화된 컬렉션으로 래핑한다.

<img src="https://images.velog.io/images/3hee_11/post/a0b2ffc0-b336-41c3-9e00-5588d1c5e557/image.png">

### 병렬 처리를 위한 컬렉션
🚨 동기화된 컬렉션은 하나의 요소를 처리할 때 다른 스레드는 대기 상태가 되므로 멀티 스레드가 병렬적으로 요소를 빠르게 처리하지 못한다.
💡 **ConcurrentHashMap과 ConcurrentLinkedQueue 사용!**

#### ConcurrentHashMap
- Map의 구현 클래스이다.
- 처리하는 요소가 포함된 부분만 잠금하고 나머지는 다른 스레드가 변경할 수 있도록 한다 → **부분 잠금**
```java
Map<K, V> map = new ConcurrentHashMap<K, V>();
```

#### ConcurrentLinkedQueue
- **락프리(lock-free) 알고리즘을 구현한 컬렉션**이다.
  - 락프리 알고리즘 : 여러 스레드가 동시에 접근할 경우 잠금을 사용하지 않고도 최소한 하나의 스레드가 안전하게 요소를 저장하거나 얻도록 함
```java
Queue<E> queue = new ConcurrentLinkedQueue<E>();
```