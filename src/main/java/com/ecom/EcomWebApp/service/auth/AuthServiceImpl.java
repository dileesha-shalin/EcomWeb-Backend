package com.ecom.EcomWebApp.service.auth;

import com.ecom.EcomWebApp.dto.SignupRequest;
import com.ecom.EcomWebApp.dto.UserDto;
import com.ecom.EcomWebApp.entity.User;
import com.ecom.EcomWebApp.enums.UserRole;
import com.ecom.EcomWebApp.repository.UserRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    @Autowired
    private UserRepository userRepository;

   /* @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;*/

    @Autowired
    private PasswordEncoder passwordEncoder;

    public UserDto createUser(SignupRequest signupRequest){

        User user= new User();

        user.setEmail(signupRequest.getEmail());
        user.setName(signupRequest.getName());
        user.setPassword(new BCryptPasswordEncoder().encode(signupRequest.getPassword()));
        user.setUserRole(UserRole.CUSTOMER);
        User createdUser=userRepository.save(user);

        UserDto userDto=new UserDto();
        userDto.setId(createdUser.getId());

        return userDto;

    }

    public boolean hasUserWithEmail(String email){
        return userRepository.findFirstByEmail(email).isPresent();
    }

    @PostConstruct
    public void createAdminAccount(){
        User adminAccount=userRepository.findByUserRole(UserRole.ADMIN);
        if(null==adminAccount){
            User user=new User();
            user.setEmail("admin@test.com");
            user.setName("admin");
            user.setUserRole(UserRole.ADMIN);
            user.setPassword(new BCryptPasswordEncoder().encode("admin"));
//            user.setPassword(passwordEncoder.encode("admin"));
            userRepository.save(user);
        }
    }
}
