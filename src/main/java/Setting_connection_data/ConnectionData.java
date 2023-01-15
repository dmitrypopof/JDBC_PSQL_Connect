package Setting_connection_data;

public class ConnectionData {
    public static final String DRIVER_JDBC_PSQL = "org.postgresql.Driver"; // загрузка драйвера
    public static final String URL_PSQL = "jdbc:postgresql://localhost:5432/test_db"; // зарегистрируем тип БД, в нашем случае PSQL. Подгрузит драйвер, который мы импортировали. Вписать IP-адрес:порт/имя базы данных
    public static final String USER_PSQL = "postgres"; // пользователь
    public static final String PASSWORD_USER_PSQL = "1234"; // пароль пользователя

}
