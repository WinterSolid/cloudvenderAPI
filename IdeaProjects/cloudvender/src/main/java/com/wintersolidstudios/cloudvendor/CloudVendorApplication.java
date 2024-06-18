package com.wintersolidstudios.cloudvendor;


import com.google.common.base.Predicate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@SpringBootApplication
@EnableSwagger2
public class CloudVendorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudVendorApplication.class, args);
	}

	@Bean
	public Docket swaggerConfiguration() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
					.paths((Predicate<String>) PathSelectors.ant("/cloudvendor/*"))
					.apis((Predicate<RequestHandler>) RequestHandlerSelectors.basePackage("com.wintersolidstudios.cloudvendor"))
					.build()
					.apiInfo(custom_Api_Data());
	}

	private ApiInfo custom_Api_Data() {
		return new ApiInfo(
				"Cloud_Vendor API",
				"Cloud Vendor Documentation",
				"1.0",
				"",
				new Contact("Wintersolid", "https://github.com/WinterSolid/cloudvenderAPI", null),
				"WintersolidStudios",
				"",
				Collections.emptyList()
		);
	}
}
