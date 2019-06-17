package com.finrestcalc.controlcalc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.finrestcalc.operations.OperationsDeCalc;
import com.finrestcalc.variables.VariablesDeCalc;

@RestController
@RequestMapping("operation")
public class ControllerDeCalc {
	
	@GetMapping
	public VariablesDeCalc getValues(
			@RequestParam(value = "number1") double number1,
			@RequestParam(value = "number2") double number2, 
			@RequestParam(value = "operation") String operation) {

		VariablesDeCalc varCalculator = new VariablesDeCalc();
		OperationsDeCalc opCalculator = new OperationsDeCalc();

		varCalculator.setNumber1(number1);
		varCalculator.setNumber2(number2);
		varCalculator.setOperation(operation);

		try {
			if (operation.equals("suma"))
				varCalculator.setResult(opCalculator.suma(number1, number2));
			else if (operation.equals("resta")) 
				varCalculator.setResult(opCalculator.resta(number1, number2));
			else if (operation.equals("multi")) 
				varCalculator.setResult(opCalculator.multi(number1, number2));
			else if (operation.equals("divi"))
				varCalculator.setResult(opCalculator.divi(number1, number2));

			return varCalculator;

		} catch (Exception ex) {
			return varCalculator;
		}

	}

}
