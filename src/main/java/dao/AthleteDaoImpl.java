package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import main.Athlete;

public class AthleteDaoImpl implements dao.IAthleteDao {
	JdbcTemplate jdbc;
	public void setJdbc(JdbcTemplate jdbc) {
		this.jdbc=jdbc;
	}
	public int save(Athlete a) {
		return jdbc.update("insert into athlete values(athleteSeq.nextval,'"+a.getName()+"','"+a.getGender()+"','"+a.getCategory()+"','"+a.getEmail()+"','"+a.getMobile()+"')");
	}
	public List<Athlete> getDetails(){
		return jdbc.query("select * from athlete", new RowMapper<Athlete>() {
			public Athlete mapRow(ResultSet rs,int row)throws SQLException{
				Athlete e=new Athlete();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setGender(rs.getString(3));
				e.setCategory(rs.getString(4));
				e.setEmail(rs.getString(5));
				e.setMobile(rs.getString(6));
				return e;
			}
		});
		
	}
}
