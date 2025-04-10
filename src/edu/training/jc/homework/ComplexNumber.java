package edu.training.jc.homework;

public class ComplexNumber {
	private int real;
	private int imaginary;
	
	ComplexNumber(int realPart, int imaginaryPart) {
		real = realPart;
		imaginary = imaginaryPart;
		System.out.println("Конструктор запущен");
	}

	public int getReal() {
		return real;
	}

	public void setReal(int realPart) {
		real = realPart;
	}

	public int getImaginary() {
		return imaginary;
	}

	public void setImaginary(int imaginaryPart) {
		imaginary = imaginaryPart;
	}

	public static ComplexNumber addition(ComplexNumber num1, ComplexNumber num2) {
		int realPartAdd = num1.getReal() + num2.getReal();
		int imaginaryPartAdd = num1.getImaginary() + num2.getImaginary();

		ComplexNumber result = new ComplexNumber(realPartAdd, imaginaryPartAdd);

		return result;
	}

	public static void display(ComplexNumber num) {
		int realPart = num.getReal();
		int imaginaryPart = num.getImaginary();

		System.out.printf("%d + %di\n", realPart, imaginaryPart);
	}
}
