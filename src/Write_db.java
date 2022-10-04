import java.io.IOException;
import java.sql.*;

public class Write_db {
    public static void main(String[] args) throws Exception{

        String url = "jdbc:postgresql://localhost:5432/test_db";// зарегистрируем тип БД, в нашем случае PSQL. Подгрузит драйвер, который мы импортировали. Вписать IP-адрес:порт/имя базы данных
        String uname = "postgres"; // пользователь
        String pass = "1234"; // пароль пользователя
        Class.forName("org.postgresql.Driver"); // загрузка драйвера
        Connection con = DriverManager.getConnection(url, uname, pass); // подключаемся
        Statement st = con.createStatement();// создать заявление . Посмотреть PreparedStatement st = con.prepareStatement(query);



       /* Первый вариант: запрос сразу в строке
        String query = "INSERT INTO airports (airport_code, airport_name, city, longitude, latitude, timezone) VALUES ('LSA', 'Los-Santos', 'Santos', '95.06', '189.45', 'Europe/Moscow');";
        int count = st.executeUpdate(query);	//запрос executeUpdate для записи с БД
        System.out.println(count + " строк записано");
        */

        //Второй вариант:
        String airport_code = "BGR";
        String airport_name = "Oslo";
        String city = "Oslo";
        String longitude = "166.1";
        String latitude = "140.351";
        String timezone = "Tokio";

        String query = "INSERT INTO airports VALUES ('" + airport_code + "','" + airport_name + "','" + city + "','" + longitude+ "','" + latitude + "','" + timezone + "');";
        int count = st.executeUpdate(query);	//запрос executeUpdate для записи с БД
        System.out.println(count + " строк записано");
        /////////////////////////////////////


        //после запроса, обязательно сделать:
        st.close(); //закрыть заявление
        con.close(); // прервать соединение


    }
}
