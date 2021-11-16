package firstProject;

import java.util.ArrayList;
import java.util.Random;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] first = { "AARON", "ABEL", "ADAM", "ADRIAN", "ALEX", "ALFRED", "ALBERT", "BEN", "BILL", "BRANDON",
				"BRETT", "CARTER", "CLARK", "DANIEL", "DONALD", "DEXTER", "DILLON", "ERIC", "ERICA", "ETHEL",
				"FRAN", "FRANK", "GLEN", "GINA", "GEORGE", "HARRIET", "HENRY", "IGNACIO", "JOSE", "JULIA", "KEN",
				"KATHERINE", "LISA", "LEIA", "MARIA", "MICHAEL", "NANCY", "NICHOLE", "NINA", "NICHOLAS",
				"OMAR", "OLIVIA", "PATRICIA", "PAUL", "QUINN", "ROBERT", "RACHEL", "SAM", "SANDRA", "THOMAS",
				"TERRY", "ULYSSES", "VICTORIA", "VICTOR", "WALTER"};
		String[] last = { "AARON", "AARONSON", "ANDERSON", "ANDREWS", "ARQUETTE", "BANKS", "BAKER", "BARKER", "BECKER",
				"BENSON", "BOSTON", "CODD", "COX", "DALTON", "DAWES", "DAWSON", "ERICKSON", "EMERSON", "EVANS", 
				"FALMER", "FITZGERALD", "GRAHAM", "HARRIS", "HOLMES", "INMON", "JACOBS", "JAMESON",
				"KILPATRICK", "LAFAYETTE", "MATTHEWS", "MOORE", "NICHOLSON", "ONEIL", "PARKER", "QUIGLEY", "ROMERO",
				"ROBERTSON", "SAMUELS", "SANFORD", "TRUJILLO", "TOWNSHEND", "VICTORIA", "WILSON", "XAVIER", "YOUNG", "ZED"
				};
		ArrayList<String> results = new ArrayList<String>();
		for (int i = 0; i < 300; i++) {
			String dbStatement = "INSERT INTO dbo.customer VALUES('" + first[generateRandomInt(0, first.length - 1)]
					+ "', '" +  last[generateRandomInt(0, last.length - 1)] + "'); ";

			if (IsInList(results, dbStatement)) {
				continue;
			}

			System.out.println(dbStatement);
			results.add(dbStatement);
		}
	}

	public static boolean IsInList(ArrayList<String> results, String possible) {
		for (String entry : results) {
			if (entry.equalsIgnoreCase(possible)) {
				return true;
			}
		}
		return false;
	}

	/*
	 * public static double randdouble() { double x = Math.random(); return x; }
	 */

	public static int generateRandomInt(int min, int max) {
		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
}
