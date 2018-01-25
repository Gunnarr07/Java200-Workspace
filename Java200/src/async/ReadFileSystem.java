package async;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.Callable;

public class ReadFileSystem {
	private String sDir;
	
	public ReadFileSystem(String sDir) {
		this.sDir = sDir;
	}
	
	public Callable<String> processAsync() {
		return new Callable<String>() {
			public String call() throws Exception {
				Files.find(Paths.get(sDir), 999, (p, bfa) -> bfa.isRegularFile()).forEach(System.out::println);
				return "Done reading file.";
			}
		};
	}
	
	public String processSync() throws IOException {
		Files.find(Paths.get(sDir), 999, (p, bfa) -> bfa.isRegularFile()).forEach(System.out::println);
		return "Done reading file.";
	}
}
