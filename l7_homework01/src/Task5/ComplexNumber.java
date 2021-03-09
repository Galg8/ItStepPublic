package Task5;

import Task3.Money;

public class ComplexNumber {

    private int realPartNumber;
    private int imaginaryPartNumber;
    private int dblNumber;
    private static int sumReal, sumIm;


    public ComplexNumber(int real, int imaginary) {
        this.realPartNumber = real;
        this.imaginaryPartNumber = imaginary;
    }

    /*public ComplexNumber(double dblNumber) {
        this.dblNumber = ;

        this.realPartNumber = real;
        this.imaginaryPartNumber = (int) Math.pow(dblNumber,2.00);
    }*/

    public static ComplexNumber addition(ComplexNumber complex1, ComplexNumber complex2) {
        sumReal = complex1.getRealPartNumber() + complex2.getRealPartNumber();
        sumIm = complex1.getImaginaryPartNumber() + complex2.getImaginaryPartNumber();
        return new ComplexNumber(sumReal,sumIm);
    }

    public static ComplexNumber subtraction(ComplexNumber complex1, ComplexNumber complex2) {
        sumReal = complex1.getRealPartNumber() - complex2.getRealPartNumber();
        sumIm = complex1.getImaginaryPartNumber() - complex2.getImaginaryPartNumber();
        return new ComplexNumber(sumReal,sumIm);
    }

    public static ComplexNumber multiply(ComplexNumber complex1, ComplexNumber complex2) {
        sumReal = complex1.getRealPartNumber() * complex2.getRealPartNumber() - complex1.getImaginaryPartNumber() * complex2.getImaginaryPartNumber();
        sumIm = complex1.getRealPartNumber() * complex2.getImaginaryPartNumber() + complex2.getRealPartNumber() * complex1.getImaginaryPartNumber();
        return new ComplexNumber(sumReal, sumIm);
    }

    public static String compare(ComplexNumber complex1, ComplexNumber complex2) {

        if((complex1.getRealPartNumber() > complex2.getRealPartNumber()) || (complex1.getImaginaryPartNumber() > complex2.getImaginaryPartNumber())) {
            return "Komplexní číslo 1 je větší než komplexní číslo 2";
        }
        else if((complex1.getRealPartNumber() < complex2.getRealPartNumber()) || (complex1.getImaginaryPartNumber() < complex2.getImaginaryPartNumber())) {
            return "Komplexní číslo 1 je menší než komplexní číslo 2";
        }
        else {
            return "Komplexní číslo 1 se rovná komplexnímu číslu 2";
        }
    }

    public int getRealPartNumber() {
        return this.realPartNumber;
    }

    public int getImaginaryPartNumber() {
        return this.imaginaryPartNumber;
    }

    @Override
    public String toString() {
        return realPartNumber + " + " + imaginaryPartNumber +"i";
    }
}
