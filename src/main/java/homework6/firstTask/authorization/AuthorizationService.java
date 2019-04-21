package homework6.firstTask.authorization;


import homework6.firstTask.connectToDatabase.ConnectToDB;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class AuthorizationService implements Authorization {


    public Map<String, String> users = new HashMap<>();


    public AuthorizationService() {
        try {
            ConnectToDB.connect();
            ResultSet res = ConnectToDB.getStatement().executeQuery("SELECT * FROM users");
            while (res.next()) {
                users.put(res.getString("nickname"), res.getString("password"));
            }
            ConnectToDB.disconnect();
        } catch (SQLException e) {
            e.printStackTrace();
        }
//        users.put("john", "123");
//        users.put("valery", "345");
//        users.put("bob", "567");
//        users.put("jenifer", "789");
    }

    @Override
    public boolean authUser(String nickname, String password) {
        String psw = users.get(nickname);
        return psw != null && psw.equals(password);
    }


}
