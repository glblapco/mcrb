package xyz.blapco.mcrb.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    /* Shitty spring security syntax. Adding @Override
       and using the same name for every function makes no sense.
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        /* Unauthenticated users can access the homepage and the login page.
           Any other page, requires authentication.
         */
        http.csrf().disable().authorizeRequests()
                .antMatchers(HttpMethod.GET, "/").permitAll()
                .anyRequest().authenticated().and().formLogin().permitAll()
                .and().logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"));
    }
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //@@@ TODO: Configure credentials and shit.
    }
    @Override
    public void configure(WebSecurity web) throws Exception {
//        Ignore the CSS directory so the browser can access it.
        web.ignoring().antMatchers("/style/**");
    }
}
