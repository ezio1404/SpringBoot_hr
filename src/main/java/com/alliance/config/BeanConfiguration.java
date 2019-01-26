package com.alliance.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;

@Configuration
@ComponentScan({ "com.alliance.controller", "com.alliance.service" })
@EntityScan("com.alliance.entity")
@EnableJpaRepositories(basePackages = { "com.alliance.repository", "com.alliance.repository.custom" })
public class BeanConfiguration extends WebMvcConfigurerAdapter {

	// @Bean
	// public UrlBasedViewResolver viewResolver() {
	// UrlBasedViewResolver tilesViewResolver = new UrlBasedViewResolver();
	// tilesViewResolver.setViewClass(TilesView.class);
	// return tilesViewResolver;
	// }
	//
	// @Bean
	// public TilesConfigurer tilesConfigurer() {
	// TilesConfigurer tiles = new TilesConfigurer();
	// tiles.setDefinitions(new String[] { "/WEB-INF/tiles/tiles.xml" });
	// return tiles;
	//
	// }

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// registry.addInterceptor(new
		// LoginInterceptor()).addPathPatterns("/login/**");

	}

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**");
	}

	@Bean
	public UrlBasedViewResolver viewResolver() {
		UrlBasedViewResolver tilesViewResolver = new UrlBasedViewResolver();
		tilesViewResolver.setViewClass(TilesView.class);
		return tilesViewResolver;
	}

	@Bean
	public TilesConfigurer tilesConfigurer() {
		TilesConfigurer tiles = new TilesConfigurer();
		tiles.setDefinitions(new String[] { "WEB-INF/tiles/tiles.xml" });
		return tiles;

	}

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.setOrder(Ordered.LOWEST_PRECEDENCE);
		registry.addViewController("/**").setViewName("forward:/");
	}
}
