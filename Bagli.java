package bagliliste; 

public class Bagli {

	public static void main(String[] args) {
		Kontrol benim = new Kontrol(3);
		benim.push(45);
		benim.bak();
		benim.push(36);
		benim.bak();
		benim.pop();
		benim.push(45);
		benim.bak();
		benim.isEmpty();
		benim.isFull();
		benim.basBak();
	
	}

}
