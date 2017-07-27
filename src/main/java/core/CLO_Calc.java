package core;

import com.beust.jcommander.*;
import java.util.*;
import java.math.*;

public class CLO_Calc {
	
	@Parameter(names = {"-o", "--operator"}, description = "Operator")
	static String operator = null;
	
	@Parameter(names = {"-l", "--operands"}, variableArity = true, description = "list of Operands")
	static List<Double> operands = new ArrayList<Double>();

	public static void main(String[] args) {
		   for (String a: args) {if (a.matches("[@#&]")) {System.err.println("Invalid characters"); System.exit(2);}}
		   
		   Double result = null;
		   JCommander.newBuilder().addObject(new CLO_Calc()).build().parse(args);
		   if (operator == null || !operator.matches("[+-/*/]")) {System.err.println("Please specify the operator + - / *");System.exit(2);}
		   else if (operands.size() == 0) {System.err.println("List of operands is empty");System.exit(2);}
		   else {
			   result = operands.get(0);
			   for (int i = 1; i < operands.size(); i++) {
				   switch (operator) {
				   case "+": result += operands.get(i); break;
				   case "-": result -= operands.get(i); break;
				   case "*": result *= operands.get(i); break;
				   case "/": result /= operands.get(i); break;
				   }
			   }
		   }
	       System.out.println(new BigDecimal(result).setScale(2, RoundingMode.HALF_UP));
		   //System.out.println(result);
	}

}
