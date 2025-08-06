public class Main {  
	static class Toyota extends Car {
        public Toyota() {
            super();
        }

        // Create soundHorn() for Toyota
        public void soundHorn() {
            System.out.println("sounds like a toyota");
        }
    }

    static class Mercedes extends Car {
    	// Create soundHorn() for Mercedes
        public void soundHorn() {
            System.out.println("sounds like a mercedes");
        }

        public Mercedes() {
            super();
        }  
    }

    static abstract class Car {

        public Car() {

        }

        public abstract void soundHorn();

    }
    
    public static void main(String[] args) {
        Toyota myToyota = new Toyota();
        Mercedes myMercedes = new Mercedes();
        
        // Call "soundHorn" for myToyota and myMercedes
        myToyota.soundHorn();
        myMercedes.soundHorn();
    }
    
}
