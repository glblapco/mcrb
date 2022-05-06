package xyz.blapco.mcrb.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import xyz.blapco.mcrb.model.User;
import xyz.blapco.mcrb.repository.UserRepository;

public class UserDetailsServiceConfiguration implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findbyUsername(username);

        if (user == null) {
            throw new UsernameNotFoundException("User not found.");
        }
        return user;
    }
}
