package br.com.glandata;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class Escrita {

	public static void main(String[] args) throws IOException {

		// Gerando arquivo txt na pasta do computador
		Path path = Path.of("C:\\teste-java\\texto.txt");
		String texto = "Arquivo e texto gerado com java e com suporte a acentuação.";
		Files.writeString(path, texto, StandardCharsets.UTF_8);

		List<String> listaUsuarios = Arrays.asList("Ailton", "Gian", "Camila", "Pedro", "Célia", "Kelly", "Alessandra");
		List<String> listaTelefones = Arrays.asList("123", "456", "789", "987", "654", "321", "000");

		// Gerando lista de usuários em arquivo txt a pasta do computador
		Path path2 = Path.of("C:\\teste-java\\Lista-Usuarios.txt");

		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("Lista de Usuários e Números de Linhas");

		int i = 1;
		for (String usuario : listaUsuarios) {
			stringBuffer.append("\nLinha " + i + ": \t" + usuario);
			i++;
		}

		Files.writeString(path2, stringBuffer, StandardCharsets.UTF_8);

		// Gerando CSV da lista de usuários
		Path path3 = Path.of("C:\\teste-java\\Lista-Usuarios.csv");

		StringBuffer stringBuffer2 = new StringBuffer();

		int j = 0;
		for (String usuario : listaUsuarios) {
			stringBuffer2.append(usuario + ";" + listaTelefones.get(j) + "\n");
			j++;
		}

		Files.writeString(path3, stringBuffer2, StandardCharsets.ISO_8859_1);

	}

}
