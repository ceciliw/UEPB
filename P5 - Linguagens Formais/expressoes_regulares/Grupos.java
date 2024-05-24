package expressoes_regulares;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Grupos {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite dois números na forma 'x,y ': ");
		String input = scanner.nextLine();
		
		Pattern pattern = Pattern.compile("(\\d), (\\d)");
		Matcher matcher = pattern.matcher(input);
		
		if (matcher.matches()) {
			int x = Integer.parseInt(matcher.group(1));
			System.out.println(x);
			int y = Integer.parseInt(matcher.group(2));
			System.out.println(y);
		}
		
		scanner.close();
		
		// outro código
		
		String input2 = "123 456 789";
		Pattern pattern2 = Pattern.compile("(\\d+)");
		Matcher matcher2 = pattern2.matcher(input2);
		
		while (matcher2.find()) {
			System.out.println("Número encontrado: "+matcher2.group(1));
		}
		
	}
}
