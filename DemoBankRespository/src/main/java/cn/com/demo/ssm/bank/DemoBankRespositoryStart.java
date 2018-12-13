package cn.com.demo.ssm.bank;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
@MapperScan(basePackages="cn.com.demo.ssm.bank.mapper")
public class DemoBankRespositoryStart {
	public static void main(String[] args) {
		new SpringApplicationBuilder(DemoBankRespositoryStart.class).web(WebApplicationType.NONE).run(args);
	}
}
