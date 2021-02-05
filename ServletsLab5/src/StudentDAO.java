import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentDAO {

	public int StudentInsert(StudentBean sb) throws ClassNotFoundException,SQLException{
		Connection con=DBUtil.DBConnection();
		String sql="insert into lab5 values(?,?,?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1,sb.getRegno());
		ps.setString(2,sb.getName());
		ps.setString(3,sb.getGender());
		ps.setString(4,sb.getDept());
		ps.setString(5,sb.getEmail());
		ps.setString(6,sb.getPassword());
		int i=ps.executeUpdate();
		return i;
		
	}

}
