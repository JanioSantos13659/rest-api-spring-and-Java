package br.com.treinamento;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreatinController {

	
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping(value = "/creeting")
	public Creating creating(@RequestParam(name = "name", defaultValue = "world") String name) {
		return new Creating(counter.incrementAndGet(), String.format(template, name));
	}
}
