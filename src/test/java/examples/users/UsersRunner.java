package examples.users;

import com.intuit.karate.junit5.*;

class UsersRunner {
    
    @Karate.Test
    Karate testGetAllUsers() {
        return Karate.run("get-all-users").relativeTo(getClass());
    }

    @Karate.Test
    Karate testPostUsers() {
        return Karate.run("post-users").relativeTo(getClass());
    }

}
