package logic;
import java.sql.Connection;
import java.sql.PreparedStatement;

import logic.ComConnection;
import dao.Dao;

public class Adsignuplogic extends ComConnection 
{
	Connection con=null;
	public boolean meth(Dao ob)
	{
		PreparedStatement ps=null;
		con=commonMeth();
		String sql="insert into adsignup values(?,?,?)";
		try
		{
			ps=con.prepareStatement(sql);
			ps.setString(1,ob.getName());
			ps.setString(2,ob.getEmail());
			ps.setString(3,ob.getPassword());
			if(ps.executeUpdate()>0)
			{
				return true;
			}
				return false;
		}catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}

}
