package taxi;

    public interface TaxiFunction {
        void TaxiState(String str);

        void moveDistance (int distance);

        void gasDecrease(int num);

        void addPassenger(int num);
    }


//interface (다형성)
//