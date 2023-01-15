package Commands_database;

import static Setting_connection_data.ConnectionData.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Write_command {
    public void WriteNewAirport() throws ClassNotFoundException, SQLException {
        Class.forName(DRIVER_JDBC_PSQL); // загрузка драйвера
        Connection con = DriverManager.getConnection(URL_PSQL, USER_PSQL, PASSWORD_USER_PSQL); // подключаемся
        Statement st = con.createStatement();// создать заявление . Посмотреть PreparedStatement st = con.prepareStatement(query);
        //Данные для записи:
        String airport_code = "VBG";
        String airport_name = "Viborg";
        String city = "Viborg";
        String longitude = "49.1";
        String latitude = "50.351";
        String timezone = "MSK";

        String query = "INSERT INTO airports VALUES ('" + airport_code + "','" + airport_name + "','" + city + "','" + longitude+ "','" + latitude + "','" + timezone + "');";
        int count = st.executeUpdate(query);	//запрос executeUpdate для записи с БД
        System.out.println(count + " строк записано");


    }
}
