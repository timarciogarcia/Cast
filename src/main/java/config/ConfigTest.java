package config;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.cast.avaliacao.service.DbService;

@Configuration
@Profile("test")
public class ConfigTest {

	@Autowired
	private DbService dbService;

	@Bean
	public void instanciaBaseDeDados() throws ParseException {
		this.dbService.instanciaBaseDeDados();
	}

}
