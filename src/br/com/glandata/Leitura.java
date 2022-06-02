package br.com.glandata;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Leitura {

	public static void main(String[] args) throws IOException {

		Path path = Path.of("C:\\teste-java\\Lista-Usuarios.txt");

		List<String> listaUsuarios = Files.readAllLines(path, StandardCharsets.UTF_8);

		for (String usuario : listaUsuarios) {
			System.out.println(usuario);
		}

	}

}
