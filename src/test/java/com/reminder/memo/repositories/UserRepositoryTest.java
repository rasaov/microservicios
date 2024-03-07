package com.reminder.memo.repositories;

import com.reminder.memo.AbstractIntegrationDBTest;
import com.reminder.memo.models.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class UserRepositoryTest extends AbstractIntegrationDBTest {

    @Autowired
    UserRepository userRepository;

    void initMockUsers() {
        userRepository.save(new User(
                "janayxsa",
                "jaxsznaya@unimagdalena.edu.co",
                "Juan",
                "de Dios Ríos",
                "12345%=**",
                "12345%=**",
                20,
                "https://facebook.com?photo_id=asdlkjfljhfdsa123",
                true,
                "USER"
        ));

        userRepository.flush();
    }

    @BeforeEach
    void setUp() {
        userRepository.deleteAll();
    }

    @Test
    void givenAnUser_whenSave_thenUserwithId(){
        //given
        User user = new User();

        user.setName("Jose");
        user.setAge(20);

        //when
        User userSaved = userRepository.save(user);
        //then
        assertThat(userSaved.getId()).isNotNull();
    }
}
