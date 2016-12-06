package IronYard;

import java.util.ArrayList;

/**
 * Created by scofieldservices on 12/6/16.
 */
public class User {
    String name;
    ArrayList<Game> games = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }
}
