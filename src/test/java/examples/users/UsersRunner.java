package examples.users;

import com.intuit.karate.junit5.*;

class UsersRunner {
    
    @Karate.Test
    Karate testGetUsers() {
        return Karate.run("get-all-users").relativeTo(getClass());
    }    

}
