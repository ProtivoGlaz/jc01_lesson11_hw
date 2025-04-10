package edu.training.jc.homework;

public class Main {

	public static void main(String[] args) {
		ComplexNumber num1 = new ComplexNumber(1, 2);
		ComplexNumber num2 = new ComplexNumber(3, 4);
		
		ComplexNumber.display(num1);

		ComplexNumber.display(num2);
		
		ComplexNumber result = ComplexNumber.addition(num1, num2);
		
		ComplexNumber.display(result);
	}

}
