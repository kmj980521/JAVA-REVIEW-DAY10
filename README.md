# JAVA-REVIEW-DAY10
자바 복습하기 10일차 

예외처리

프로그램에서의 오류는 컴파일 오류와 실행 오류가 있다. 컴파일 오류는 문법적으로 오류가 있다는 것이고, 실행 오류는 프로그램 실행 도중 오류가 발생하는 경우이다. 예를들면 한 배열의 요소 수보다 더 큰 인덱스의 값을 호출할 때 발생한다. 오류 클래스는 **Throwable 클래스**에서 상속을 받고, 그 하위에는 Exception 클래스등등 여러 예외 클래스들이 존재한다. 

1**try~catch 문**을 이용해 try 블록을 실행하다가 오류가 발생되면 catch를 하고, catch문이 출력이 된다. 

2**try-catch-finally문**을 이용해, try블록 안에서 발생할 수 있는 예외 상황이 여러 개라면, catch블록을 예외 수만큼 구현해야하는데 이것보다 **finally 문으로 구현한다.** finally문은 어떤 경우에서도 반드시 실행된다. return문이 있어도. 

3.**try-with-resources문**을 이용하면,  close()메서드를 명시적으로 호출하지 않아도 **자동으로 닫도록 만들 수 있다**. 또한 **FileInputStream클래스는 Closeable과 AutoCloseable인터페이스를 구현하고, close()메서드를 재정의** 해줘야한다. 네트워크와 데이터베이스 관련 클래스도 AutoCloserable 인터페이스를 구현하고있다. 

try문에 **throw new Exception()**문장을 사용하면 **강제로 예외를 발생**시켜 catch블록이 수행되도록 구현할 수 있다.
