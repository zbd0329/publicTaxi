package sa;

class Bus implements BusFunction {
    private int maxPassenger;
    private int passenger;
    private int fare;
    private int busNumber;
    private int fuelLevel;
    private int speed;
    private String state;


    public Bus(int maxPassenger, int fare, int busNumber, int speed) {
        this.maxPassenger = maxPassenger;
        this.passenger = 0;
        this.fare = fare;
        this.busNumber = busNumber;
        this.fuelLevel = 100;
        this.speed = speed;
        this.state = "운행중";
        System.out.println("버스번호 " + busNumber + "번 생성되었습니다.");
    }

    public int getMaxPassenger() {
        return maxPassenger;
    }

    public void setMaxPassenger(int maxPassenger) {
        this.maxPassenger = maxPassenger;
    }

    public int getPassenger() {
        return passenger;
    }

    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }

    public int getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(int busNumber) {
        this.busNumber = busNumber;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


    @Override
    public void busState(String str) {
        if (str.equals("차고지행")) this.state = "차고지행";
        else this.state = "운행중";
        System.out.println("상태 = " + getState());
    }

    @Override
    public void gasDecrease(int num) {
        if ((getFuelLevel() + num) < 10) {
            this.state = "차고지행";
            System.out.println("현재 주유량 = " + getFuelLevel());
            System.out.println("상태 = " + getState());
            System.out.println("주유필요");
        } else {
            int nowgas = getFuelLevel();
            this.fuelLevel = nowgas + num;
            System.out.println("현재 주유량 = " + getFuelLevel());
        }
    }

    @Override
    public void addPassenger(int num) {
        if (num > getMaxPassenger()) System.out.println("최대 승객 수 초과");
        else {
            int paNum = getPassenger();
            this.passenger = passenger + num;
            System.out.println("탑승 승객 수 = " + getPassenger());
            int maxnum = getMaxPassenger();
            int nownum = getPassenger();
            System.out.println("잔여 승객 수 = " + (maxnum - nownum));
            int fare = getFare();
            System.out.println("요금 확인 = " + (fare * num));
        }
    }
}