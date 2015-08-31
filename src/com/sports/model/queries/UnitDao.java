package com.sports.model.queries;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sports.db.utils.DBHelper;
import com.sports.model.entities.Unit;

public class UnitDao {
	
	private Map<String, String > userCredentialMap = new HashMap<String, String >();
	private Map<String, String > userDetailsMap = new HashMap<String, String >();
	
	public UnitDao() {
		// TODO Auto-generated constructor stub
		//userDetailsMap.put(user, type);
		userDetailsMap.put("ref", "2");
		userDetailsMap.put("oth", "3");
		userDetailsMap.put("org", "1");
		
		userCredentialMap.put("org", "org");
		userCredentialMap.put("oth", "oth");
		userCredentialMap.put("ref", "ref");
	}
	
	public boolean save(Unit unit) {
		String sql = "insert into sports_unit values (?,?,?,?,?)";
		return DBHelper.execute(sql, new Object[] { null,unit.getUnitName(),unit.getUnitType(),
				unit.getUserName(),unit.getPassWord()});
	}
	
	public Unit queryUnitByUnitId(int unitId){
		String sql = "select * from sports_unit where unit_id = ?";
		List<Map> list = DBHelper.executeQuery(sql, new Object[]{unitId});
		return new Unit(list.get(0));
	}
	
	public Unit queryPsdByUsername(String username,String unittype){
		String sql = "select * from sports_unit where username = ? and UNIT_TYPE = ?";
		List<Map> list = DBHelper.executeQuery(sql, new Object[]{username,unittype});
		if(list.size() == 0){
			return null;
		}
		return new Unit(list.get(0));
	}
	public boolean queryByUsername(String username){
		String sql = "select * from sports_unit where username = ?  ";
		List<Map> list = DBHelper.executeQuery(sql, new Object[]{username});
		if(list.size() == 0){
			return false;
		}
		return true;
	}
	
	public Unit getUserDetails(String userName, String unitType){
		return new Unit(unitType, userDetailsMap.get(userName),userName,userCredentialMap.get(userName));
	}
}
