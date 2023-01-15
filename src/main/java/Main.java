import Commands_database.Read_command;
import Commands_database.Verification_command;
import Commands_database.Write_command;


import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Verification_command verification_command = new Verification_command();
        Read_command read_command = new Read_command();
        //Write_command write_command = new Write_command(); // закомментил чтобы лишний раз не записывать в БД

        verification_command.VerificationQuery(); // проверка подключения
        read_command.ReadFromAirports(); // запрос на считывание аэропортов
        //write_command.WriteNewAirport(); // запись в таблицу. сделать с входными параметрами
        //read_command.ReadFromAirports(); // для проверки записи

    }
}
