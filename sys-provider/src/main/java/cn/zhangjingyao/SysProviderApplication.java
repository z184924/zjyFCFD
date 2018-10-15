package cn.zhangjingyao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@EnableRedisHttpSession
@SpringBootApplication
public class SysProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SysProviderApplication.class, args);
	}
}
