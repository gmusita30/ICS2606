class CharSeq {
	private static final int maxLength = 255;
	private char[] cArray = new char[maxLength + 1];
	private int cLength = 0;

	public String toString() {
		String s = "";
		for (int i = 1; i <= cLength; i++)
			s = s + cArray [i];
		return s;
	}
	
	public boolean isFull () {
		if (cLength == maxLength) return true;
		else return false;
	}
	
	public void append (char c) {
		if (isFull()) System.out.println("CharSeq is Full");
		else cArray[++cLength] = c;
	}
	



public static void main(String args[]) {
	CharSeq ca = new CharSeq();
	ca.append('g');
	ca.append('a');
	ca.append('b');
	ca.append('r');
	ca.append('i');
	ca.append('e');
	ca.append('l');
	ca.append('_');
	ca.append('u');
	ca.append('s');
	ca.append('i');
	ca.append('t');
	ca.append('a');
	System.out.println(ca.toString());

	}
}