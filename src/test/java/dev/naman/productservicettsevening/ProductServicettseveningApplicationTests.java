package dev.naman.productservicettsevening;

import dev.naman.productservicettsevening.inheritanceexamples.joinedtable.JTMentorRepository;
import dev.naman.productservicettsevening.inheritanceexamples.joinedtable.Mentor;
import dev.naman.productservicettsevening.inheritanceexamples.joinedtable.User;
import dev.naman.productservicettsevening.inheritanceexamples.joinedtable.JTUserRepository;
//import dev.naman.productservicettsevening.inheritanceexamples.tableperclass.TPCMentorRepository;
//import dev.naman.productservicettsevening.inheritanceexamples.tableperclass.TPCUserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProductServicettseveningApplicationTests {
//    @Autowired
//    private TPCUserRepository userRepository;
//    @Autowired
//    private TPCMentorRepository mentorRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void testDifferentInheritances() {
//        dev.naman.productservicettsevening.inheritanceexamples.tableperclass.User user = new User();
//        user.setEmail("naman@scaler.com");
//        user.setPassword("password");
//        userRepository.save(user);
//
//        Mentor mentor = new Mentor();
//        mentor.setEmail("nmn@sclr.com");
//        mentor.setPassword("psswrd");
//        mentor.setNumberOfMentees(4);
//        mentor.setNumberOfSessions(50);
//        mentorRepository.save(mentor);
    }

}
