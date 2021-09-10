package com.revature.TodoSpringBootAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

@Configuration
@EnableWebSecurity
public class TodoWebSecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Autowired
	@Qualifier("userDetailsService")
	UserDetailsService userDetailsService;

	// @Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		System.out.println("configureGlobal");
		auth.userDetailsService(userDetailsService); // pulls the password &
														// username from DB
//		 auth.inMemoryAuthentication().withUser("user").password("password").roles("USER");
		// .passwordEncoder(new BCryptPasswordEncoder());
	}

	@Override
	public void configure(WebSecurity web) throws Exception {
		// Allow these urls
		web.ignoring().antMatchers("login.html", "/");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.headers().disable().csrf().disable().authorizeRequests().antMatchers("/").permitAll()
				.antMatchers("/test**").authenticated().and()

				// .hasRole("ADMIN").and()
				.formLogin()
					.loginPage("/")
					.loginProcessingUrl("/authenticate")
						.successHandler(loginSuccessHandler())
						.failureHandler(loginFailureHandler())
							.usernameParameter("username")
							.passwordParameter("password")
				.permitAll()
					.and().logout().logoutUrl("/logout").deleteCookies("JSESSIONID").permitAll();

	}

	public AuthenticationSuccessHandler loginSuccessHandler() {
		return (request, response, authentication) -> {
			System.out.println("success login");
			response.sendRedirect("/test");
		};
	}

	public AuthenticationFailureHandler loginFailureHandler() {
		return (request, response, exception) -> {
			// request.getSession().setAttribute("flash", new
			// FlashMessage("Incorrect username and/or password. Please try
			// again.", FlashMessage.Status.FAILURE));
			System.out.println("FAILED Login ");
			response.sendRedirect("/");
		};
	}

}
