package Commands_database;

import java.sql.Connection;
import java.sql.DriverManager;

public class Verification_command {
    public void VerificationQuery () {
        Connection connection = null; // создаем объект подключения
        try {
            Class.forName("org.postgresql.Driver"); // зарегистрируем тип БД, в нашем случае PSQL. Подгрузит драйвер, который мы импортировали
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/demo", "postgres", "1234"); // вызываем класс диспетчера get.connection и учетные данные БД - имя сервера(локалхост),имя БД, пользователь, пароль

            if (connection != null) {
                System.out.println("Connection OK");
            } else
                System.out.println("Connection Failed");

        } catch (Exception e) {
            System.out.println(e);
        }

    }


}
