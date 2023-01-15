package Commands_database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Write_command {
    public void WriteNewAirport() throws ClassNotFoundException, SQLException {
        String url = "jdbc:postgresql://localhost:5432/test_db";// зарегистрируем тип БД, в нашем случае PSQL. Подгрузит драйвер, который мы импортировали. Вписать IP-адрес:порт/имя базы данных
        String uname = "postgres"; // пользователь
        String pass = "1234"; // пароль пользователя
        Class.forName("org.postgresql.Driver"); // загрузка драйвера
        Connection con = DriverManager.getConnection(url, uname, pass); // подключаемся
        Statement st = con.createStatement();// создать заявление . Посмотреть PreparedStatement st = con.prepareStatement(query);
        //Данные для записи:
        String airport_code = "MLN";
        String airport_name = "Milan";
        String city = "Milan";
        String longitude = "189.1";
        String latitude = "144.351";
        String timezone = "Roma";

        String query = "INSERT INTO airports VALUES ('" + airport_code + "','" + airport_name + "','" + city + "','" + longitude+ "','" + latitude + "','" + timezone + "');";
        int count = st.executeUpdate(query);	//запрос executeUpdate для записи с БД
        System.out.println(count + " строк записано");


    }
}
