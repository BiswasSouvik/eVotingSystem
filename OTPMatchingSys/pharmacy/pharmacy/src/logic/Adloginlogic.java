package logic;
import java.sql.*;

import dao.AdloginDao;
public class Adloginlogic extends ComConnection
{
	public boolean meth(AdloginDao ob)
	{
		PreparedStatement ps=null;
		ResultSet res=null;
		Connection con=null;
		//System.out.println(ob.getEmail());
		//System.out.println(ob.getPassword());
		String sql="select * from adlogin where email=?and Password=?";
		con=commonMeth();
		try
		{
			ps=con.prepareStatement(sql);
			ps.setString(1,ob.getEmail());
			ps.setString(2,ob.getPassword());
			res=ps.executeQuery();
			while(res.next())
			{
				if(ob.getEmail().equals(res.getString("email")) && ob.getPassword().equals(res.getString("password")))
					return true;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	
}
