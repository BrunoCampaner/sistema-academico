import java.sql.Connection;
import java.sql.DriverManager;
public class ConexaoBD {
    //colocar os valores do seu aiven
    private static String usuario = "avnadmin";
    private static String senha = "AVNS_ZZsbu8VmP9qpqpqjHkT";
    private static String host = "mysql-1f8741a6-brunotrova802-cab9.aivencloud.com";
    private static String porta = "19335";
    private static String bd = "defaultdb";
    public static Connection obtemConexao (){
        try {
            Connection c = DriverManager.getConnection(
            "jdbc:mysql://" + host + ":" + porta + "/" + bd + "?user=" + usuario + 
            "&password=" + senha + 
            "&useTimezone=true&serverTimezone=America/Sao_Paulo");
            return c;
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    //public static void main(String[] args) throws Exception{
       // System.out.println(obtemConexao());
    //}
}
