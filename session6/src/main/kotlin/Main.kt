import java.sql.*
import java.util.*

fun main() {


    Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance()

    val credentials = Credentials()

    val connectionProps = Properties()
    connectionProps["user"] = credentials.databaseUser
    connectionProps["password"] = credentials.databasePassword

    // Create the connection: this will allow us to run queries on it later
    val connection =  DriverManager.getConnection(
        "jdbc:" + "mysql" + "://" +
                "dt5.ehb.be" +
                ":" + "3306" + "/" +
                credentials.databaseName, connectionProps)

    val statement = connection.prepareStatement("SELECT * FROM trains WHERE type LIKE \"%C%\"" )
    val result = statement.executeQuery()

    while (result.next()) {
        val type = result.getString("type")
        println(type)
    }
}


