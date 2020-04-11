import java.sql.*;
public class Customer 
{

	public static void main(String[] args) 
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test2","root","");
			System.out.println("Connected Successfully!");
			Statement stmt=conn.createStatement();
			//first
			String record1="INSERT INTO customer (id, name, city)"+"values(1,'Yash','Mumbai')";
			stmt.execute(record1);
			String record2="INSERT INTO customer (id, name, city)"+"values(2,'Devesh','Raigad')";
			stmt.execute(record2);
			String record3="INSERT INTO customer (id, name, city)"+"values(3,'Renuka','Sangli')";
			stmt.execute(record3);
			String record4="INSERT INTO customer (id, name, city)"+"values(4,'Aditya','Kolhapur')";
			stmt.execute(record4);
			String record5="INSERT INTO customer (id, name, city)"+"values(5,'Aakanksha','Aurangabad')";
			stmt.execute(record5);
			String record6="INSERT INTO customer (id, name, city)"+"values(6,'Mahima','Mumbai')";
			stmt.execute(record6);
			String record7="INSERT INTO customer (id, name, city)"+"values(7,'Prathamesh','Pune')";
			stmt.execute(record7);
			String record8="INSERT INTO customer (id, name, city)"+"values(8,'Rudra','Aurangabad')";
			stmt.execute(record8);
			String record9="INSERT INTO customer (id, name, city)"+"values(9,'Kshitija','Satara')";
			stmt.execute(record9);
			System.out.println("Records inserted...\n");
		
			//Second
			
			String update= "UPDATE customer SET name = 'Default_Name' WHERE id=2";
			String update2= "UPDATE customer SET city= 'Default_City' WHERE id=2";
			stmt.executeUpdate(update);
			stmt.executeUpdate(update2);
			System.out.println("Records Updated for customer ID=2\n");
			
			//Third
			
			String delete="DELETE FROM customer WHERE id = 3";
			stmt.executeUpdate(delete);
			System.out.println("Records deleted for customer ID=3\n");
			
			//fourth
			
			String select="SELECT distinct * FROM customer";
			ResultSet rs=stmt.executeQuery(select);
			
			while(rs.next())
			{
				int id=rs.getInt("id");
				String name=rs.getString("name");
				String city=rs.getString("city");
				
				System.out.print("ID: "+id);
				System.out.print("\tName: "+name);
				System.out.print("\tCity: "+city);
				System.out.print("\n");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		System.out.println("Completed!");
	}
	
}
