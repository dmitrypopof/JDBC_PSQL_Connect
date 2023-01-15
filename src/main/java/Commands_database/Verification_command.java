package Commands_database;

import java.sql.Connection;
import java.sql.DriverManager;

import static Setting_connection_data.ConnectionData.*;

public class Verification_command {
    public void VerificationQuery () {
        Connection connection = null; // создаем объект подключения
        try {
            Class.forName(DRIVER_JDBC_PSQL); // зарегистрируем тип БД, в нашем случае PSQL. Подгрузит драйвер, который мы импортировали
            connection = DriverManager.getConnection(URL_PSQL, USER_PSQL, PASSWORD_USER_PSQL); // вызываем класс диспетчера get.connection и учетные данные БД - имя сервера(локалхост),имя БД, пользователь, пароль

            if (connection != null) {
                System.out.println("Connection OK");
            } else
                System.out.println("Connection Failed");

        } catch (Exception e) {
            System.out.println("Error "+ e);
        }

    }


}
