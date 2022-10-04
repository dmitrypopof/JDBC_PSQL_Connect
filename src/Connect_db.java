/*
Для Intellij IDE:
   1. скачать драйвер JDBC https://jdbc.postgresql.org/download.html
   2. Добавить скачанный драйвер в проект: File -> Project Structure -> Modules -> Dependencies -> Add ->Jars or ...-> выбрать
   3. Русские буквы - поменяйте значение в параметрах "Global encoding:" и "Project encoding:"
   на "Default" (параметры располагаются в Intellij idea по пути File->Settings->Editor->File encodings)
 */
                                                // ПРОВЕРКА ПОДКЛЮЧЕНИЯ К БД
import java.sql.Connection;
import java.sql.DriverManager;
public class Connect_db

{
    public static void main(String[] args)
    {
        Connection connection=null; // создаем объект подключения

        try {
            Class.forName("org.postgresql.Driver"); // зарегистрируем тип БД, в нашем случае PSQL. Подгрузит драйвер, который мы импортировали
            connection= DriverManager.getConnection("jdbc:postgresql://localhost:5432/demo","postgres","1234"); // вызываем класс диспетчера get.connection и учетные данные БД - имя сервера(локалхост),имя БД, пользователь, пароль

            if (connection!=null)	{
                System.out.println("Connection OK");
            }else
                System.out.println("Connection Failed");

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
