package cn.com.demo.ssm.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class DemoBankWebStart {
	public static void main(String[] args) {
		SpringApplication.run(DemoBankWebStart.class, args);
	}

}
