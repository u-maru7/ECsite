package com.internousdev.template.dao;

import com.internousdev.template.util.DBConnector;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.internousdev.template.dto.MyPageDTO;
import com.internousdev.template.util.DBConnector;

public class MyPageDAO {
	public class MyPageDTO getMyPageUserInfo(
			String item_transaction_id,
			String user_master_id)
	throws SQLException{
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		MypageDTO myPageDTO= new MyPageDTO();

		String sql ="SELECT iit.item_name,ubit.total_price,ubit.total_count,"
				+"ubit.pay FROM user_buy_item_transaction ubit LEFT JOIN item_info_transaction iit ON"
				+"ubit.user_master_id = ? ORDER BY ubit.insert_date DESC";

		try {
			PreparedStatement preparedStatement =
					connection.prepareStatement(sql);
			preparedStatement.setString(1,item_transaction_id);
			preparedStatement.setString(2,user_master_id);
			ResultSet resultSet = prepareStatement.executeQuery();

			if(resultSet.next()) {
				myPageDTO.setItemName(resultSet.getString("item_name"));
				myPageDTO.setTotalprice(resultSet.getString("tptal_price"));
				myPageDTO.setTotalCount(resultSet.getString("total_count"));
				myPageDTO.setPayment(resultSet.getString("pay"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			connection.close();
		}
		return myPageDTO;
	}

	public int buyItemHistoryDelete(String item_transaction_id,String user_master_id)throws SQLException{
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();

		String sql = "DELETE FROM user_buy_item_transaction WHERE item_transaction_id = ? AND user_master_id = ?";
		PreparedStatement preparedStatement;
		int result =0;

		try {
			preparedStatement =connection.prepareStatement(sql);
			preparedStatement.setString(1,item_transaction_id);
			preparedStatement.setString(2,user_master_id);

			result = preparedStatement.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			connection.close();
		}
		return result;
	}

}
