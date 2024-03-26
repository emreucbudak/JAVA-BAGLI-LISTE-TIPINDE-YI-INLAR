package bagliliste;

public class Kontrol {
	Liste head = null;
	Liste tail = null;
	int boyut;
	int adim = 0;
	Kontrol(int x){
		this.boyut = x;
	}
	void push (int a) {
		Liste eleman = new Liste(a);
		if (head == null) {
			head = eleman;
			tail = eleman;
			System.out.println("ELEMAN EKLENDİ -->" +eleman.veri);
		}
		else if (adim ==  boyut) {
			System.out.println("Liste Dolu!");
		}
		else {
			head = eleman;
			eleman.next = head;
			System.out.println("ELEMAN EKLENDİ -->" +eleman.veri);
			adim++;
			
		}
	}
	void bak() {
		Liste ref = head;
		int a=0;
		while (a != adim) {
			System.out.println("------> " + ref.veri);
			ref = ref.next;
			a++;
		}
	}
	void pop() {
		if (head == null) {
			System.out.println("Yığın Boş");
		}
		else if (head != null && tail == null) {
			head = null;
			System.out.println("Yığın Boşaldı!");
		}
		else {
			head.next = head;
			System.out.println("Silindi!");
		}
	}
	void isFull() {
		if (adim==boyut) {
			System.out.println("Yığın dolu!");
		}
		else {
			System.out.println("Yığın Boş!");
		}
	}
	void isEmpty () {
		if (adim == 0) {
			System.out.println("Yığında hiç eleman yok");
		}
		else {
			System.out.println("Yığında eleman mevcut!");
		}
	}
	void basBak () {
		System.out.println("ILK ELEMAN ------------> " + head.veri);
	}
}
