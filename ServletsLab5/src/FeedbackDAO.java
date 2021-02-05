import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class FeedbackDAO {
	public int FeedbackInsert(FeedbackBean fb) throws ClassNotFoundException,SQLException{
		Connection con=DBUtil.DBConnection();
		String sql="insert into feedback values(?,?,?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1,fb.getFb1());
		ps.setString(2,fb.getFb2());
		ps.setString(3,fb.getFb3());
		ps.setString(4,fb.getFb4());
		ps.setString(5,fb.getFb5());
		ps.setString(6,fb.getFb6());
		int i=ps.executeUpdate();
		return i;
	}
}