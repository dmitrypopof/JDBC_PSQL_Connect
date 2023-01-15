package Commands_database;

import static Setting_connection_data.ConnectionData.*;

import java.sql.*;
import java.util.Arrays;

public class Read_command {
    public void ReadFromAirports() throws ClassNotFoundException, SQLException {
        String query_sql = "SELECT * FROM airports;"; // запрос который хотим выполнять

        // Создаем заявление в БД:
        Class.forName(DRIVER_JDBC_PSQL); // загрузка драйвера
        Connection con = DriverManager.getConnection(URL_PSQL, USER_PSQL, PASSWORD_USER_PSQL); // подключаемся
        Statement st = con.createStatement();// создать заявку
        ResultSet rs = st.executeQuery(query_sql);	//запрос executeQuery для чтения с БД

        while(rs.next()) // извлечь всю таблицу (Лимит извлечения строк ставить в SQL-запросе переменной query "LIMIT")

        {   // собираем в массив (не забудь импорт библа для массивов), указывая столбцы в rs.getString
            String [] MyQuery= {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),rs.getString(6)} ;
            System.out.println(Arrays.toString(MyQuery));
        }

        st.close(); //закрыть заявку
        con.close(); // прервать соединение
    }

}
