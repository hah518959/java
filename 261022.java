//생성자 오버로딩

//생성자를 클래스 안에서 많이 만들면 예를들어

class Dount{
  int price;
  
  dount(){
    price = 2000;
  }

  dount(int p){
    price = p;
  }
}

class Main{
  Dount d1 = new Dount(2000);
}

//메서드 앞에 public, private, void, default(" ") 등 뭐가 있는데 뭐라고 설명했는지 이해 못 함

//도넛이라는 클래스에 도넛이라는 생성자를 불러온 것.
		Dount d1 = new Dount();

//생성자에 값을 넣으면 자바에서 자동으로 오버로딩된 생성자 중 값을 받는 생성자로 쓸 수 있음.

//생성자는 내가 안만들어도 자동으로 만들어짐

//대신 생성자를 하나라도 정의하면 기본 생성자는 자동으로 안 만들어짐(즉 무조건 생성자 형태가 1개 이상은 있어야 함)

// -this() 생성자
사용시 주의 반드시 생성자의 첫 번째 문자이어야 한다.

exam)
	System.out.println("tlqkf"+ sang);
	this(1818);
이게 아님
	this(1818);
	System.out.println("tlqkf"+ sang);
이거임


//final 멤버 변수와 생성자

final은 단 한 번만 초기화되는 변수임

