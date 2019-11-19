package br.com.microservices.ff4j.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.net.HostAndPort;
import com.orbitz.consul.Consul;

@Configuration
public class DataSourceConfig {

	@Value("${spring.cloud.consul.host:localhost}")
	private String consulHost;

	@Value("${spring.cloud.consul.port:8500}")
	private int consulPort;
	
	
	@Bean
    public Consul ff4jDataSource(){
		 
	  return Consul.builder().withHostAndPort(HostAndPort.fromParts(consulHost, consulPort)).build();
    }
	
}
