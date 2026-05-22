package Ensyuu;

import java.sql.Connection;
import java.sql.PreparedStatement;

import bean.Purchase;

public class PurchaseDAO extends DAO {

	public int insert(Purchase purchase) throws Exception{
		Connection con=getConnection();
		
		PreparedStatement st=con.prepareStatement(
				"insert into purchase(count,payment,review,mail)values(?,?,?,?)");
		st.setString(1,purchase.getCount());
		st.setString(2,purchase.getPayment());
		st.setString(3,purchase.getReview());
		st.setString(4,purchase.getMail());
		int line=st.executeUpdate();
		
		st.close();
		con.close();
		return line;
	}
}
