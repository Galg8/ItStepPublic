package Task4;

public class StringStorage {

    private int countChars;
    private char[] Charray;
    private char oneChar;
    private String unknownString;
    private int count = 0;

    public StringStorage() {
        this.unknownString = "";
    }

    public StringStorage(String myString) {
        Charray = new char[myString.length()];
        for(int i = 0; i < myString.length(); i++) {
            this.Charray[i] = myString.charAt(i);
        }
    }

    public StringStorage(char myChar) {
        this.oneChar = myChar;
    }

    public int lengthOfString() {
        return this.Charray.length;
        }

    public void clearCharray() {
        for(int i = 0; i < this.Charray.length; i++) {
            this.Charray[i] = '\u0000';
        }
    }

    public void getCharray() {
        for(int i = 0; i < this.Charray.length; i++) {
            System.out.print(Charray[i]);
        }
        System.out.println();
    }

    public void findCharacterInCharray(char character) {
        for(int i = 0; i < this.Charray.length; i++) {
            if(character == this.Charray[i]) {
                count++;
            }
        }
        System.out.println("Znaku " + character + " je v řetězci " + count + ".");
    }
}

