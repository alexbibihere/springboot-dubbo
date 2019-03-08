package com.ydg.ticket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *  1.讲将服务提供者注册到注册中心
 *    --1.引入dubbo和zkclient相关依赖
 *    --2.配置dubbo的扫描包和注册中心地址
 *    --3.使用@Service服务  ddubbo相关
 */
@SpringBootApplication
public class ProviderTicketApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProviderTicketApplication.class, args);
	}

}
