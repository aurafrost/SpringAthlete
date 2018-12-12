package dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import main.Athlete;

public interface IAthleteDao {
	public void setJdbc(JdbcTemplate jdbc);
	public int save(Athlete a);
	public List<Athlete> getDetails();
}
