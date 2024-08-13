package controller;

public class FatorialDuploController {

	public FatorialDuploController() {
		super();
	}
	
	public int fatorialDuplo (int num) {
		//condição de parada
		if (num == 1) {
			return 1;
		} else {
			int res = num;
			return res * fatorialDuplo(num - 2);
		}
	}
}
