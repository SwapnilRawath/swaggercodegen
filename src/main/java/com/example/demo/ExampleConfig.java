package com.example.demo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.swagger.client.codegen.rest.api.ProductControllerApi;
import com.swagger.client.codegen.rest.invoker.ApiClient;
@Configuration	
public class ExampleConfig {
	
	@Value("${product.cat.host.uri}")
	public String hostInfoBasePath;
	
	@Bean
	public ApiClient apiClient() {
		return new ApiClient().setBasePath(hostInfoBasePath);
	}
	
	@Bean
	public ProductControllerApi productControllerApi() {
		return new ProductControllerApi(apiClient());
	}
}
