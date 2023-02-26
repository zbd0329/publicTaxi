package taxi;

public class Main {
    public static void main(String[] args) {
        Taxi taxi = new Taxi(0, 0, 0, 100, "운행중");

        taxi.addPassenger(3); //첫번째 고객 3명
        taxi.moveDistance(9); //9키로 이다 distance 오ㅑㅐ 안떠요??? 나도 몰루
        taxi.addPassenger(4); //두번째 고객 4명 양심없네
        taxi.moveDistance(20); //20키로 이동
        taxi.addPassenger(5); //5명 타려고해서 탑승거부




    }
}

//    public Taxi(int taxiFare, int maxPassenger, int distance, int fuel, String state)
//기타 연산자 new 에 의해 인스턴스(객체)가 메모리 빈공간에 생성된다. + 초기화값입력 + 호출 !!
// > 이것이 간결하고 직관적인 객체지향적인 코드였군요ㅣ.....


//택시
//기본요금 1,000원
//최대승객수 4명
//현재승객수 초기상태 0명
//이동거리에 따른 수익계산 3키로당 1000원
//이동거리에 따른 주유차감 3키로당 10리터
//주유량 (최대 150/ 최소0 / 기본 100)
//일반,탑승불가(운행상태)