package fileBufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
	public static void main(String[] args) {
		String[] lines = new String[] {"Frase 1", "Frase 2", "Frase 3"};
		
		String path = "/home/keziah/Estudos/Java/eclipse-workspace/oo-java/out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}