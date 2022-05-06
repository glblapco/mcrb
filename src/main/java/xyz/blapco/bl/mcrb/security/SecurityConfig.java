package xyz.blapco.bl.mcrb.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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
    /* @@@ Biel Polastrini: Shitty Spring Security code.
       Using the same name for every function
       and annotating them with @Override makes no sense.
       Also, this authentication sucks.
     */
    @Value("${username:test}")
    private String username;
    @Value("${password:test}")
    private String password;
    @Value("${role:test}")
    private String role;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        /* @@@ Biel Polastrini: Unauthenticated users can
           access the homepage and the login page.
           Any other page, requires authentication.
         */
        http.csrf().disable().authorizeRequests()
                .antMatchers(HttpMethod.GET, "/").permitAll()
                .anyRequest().authenticated().and().formLogin().permitAll()
                .and().logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"));
    }
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        /* @@@ Biel Polastrini: The placeholder username, password and role are "test".
           If no username, password and role are provided as arguments,
           it uses the default Spring credentials.
           There's probably a much better way to do this, but that's what I can do for now.
         */
        if (!username.equals("test") || !password.equals("test") || !role.equals("test")  ) {
            //@@@ Biel Polastrini: Using plain password because it won't be stored and can be changed everytime the program starts.
            auth.inMemoryAuthentication().withUser(username).password("{noop}" + password).roles(role);
        }
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        //@@@ Biel Polastrini: Ignore the CSS directory so the browser can access it.
        web.ignoring().antMatchers("/style/**");
    }
}
