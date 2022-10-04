import java.util.Arrays; // для массива
import java.sql.*; /* нужны все интерфейсы и классы*/
                                // СЧИТЫВАЕМ ДАННЫЕ С БД
public class Read_db {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:postgresql://localhost:5432/test_db";// зарегистрируем тип БД, в нашем случае PSQL. Подгрузит драйвер, который мы импортировали. Вписать IP-адрес:порт/имя базы данных
        String uname = "postgres"; // пользователь
        String pass = "1234"; // пароль пользователя
        String query_sql = "SELECT * FROM airports;"; // запрос который хотим выполнять

        // Создаем заявление в БД:
        Class.forName("org.postgresql.Driver"); // загрузка драйвера
        Connection con = DriverManager.getConnection(url, uname, pass); // подключаемся
        Statement st = con.createStatement();// создать заявку
        ResultSet rs = st.executeQuery(query_sql);	//запрос executeQuery для чтения с БД

        while(rs.next()) // извлечь всю таблицу (Лимит извлечения строк ставить в SQL-запросе переменной query "LIMIT")

        {   // собираем в массив (не забудь импорт библа для массивов), указывая то же количество столбцов в rs.getString
            String [] MyQuery= {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),rs.getString(6)} ;
            System.out.println(Arrays.toString(MyQuery));
        }

        st.close(); //закрыть заявку
        con.close(); // прервать соединение

    }
}
