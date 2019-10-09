package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.ecsite.dto.BuyItemDTO;
import com.internousdev.ecsite.util.DBConnector;

public class BuyItemDAO {
	public BuyItemDTO getBuyItemInfo(){
		DBConnector dbConnector =new DBConnector();
		Connection connection = dbConnector.getConnection();
		BuyItemDTO buyItemDTO = new BuyItemDTO();

		String sql = "select id, item_name, item_price from item_info_transaction";

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();

			if(resultSet.next()){
				buyItemDTO.setId(resultSet.getInt("id"));
				buyItemDTO.setItemName(resultSet.getString("item_Name"));
				buyItemDTO.setItemPrice(resultSet.getString("ItemPrice"));
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return buyItemDTO;

		}

}
