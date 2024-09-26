public class Tdd{

	public static void main(String[] args) {
			
		Car<Integer> carA = new Car<>(807571, "Camry ", "Tesla");

			
		Car<String> carB = new Car<>("KL097103", "Civic", "Honda");

			
		System.out.println(carA.toString());
		System.out.println(carB.toString());
	}
}