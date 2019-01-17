package com.cg.lms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.cg.lms.exceptions.LMSException;
import com.cg.lms.model.BooksInventory;
import com.cg.lms.utility.JdbcUtility;

public class LibraryDaoImpl implements LibraryDao {

	Statement statement = null;
	PreparedStatement prepareStatement = null;
	Connection connection = null;
	ResultSet resultSet = null;

	@Override
	public void createTables() throws LMSException {

		connection = JdbcUtility.getConnection();

		try {
			statement = connection.createStatement();
			statement.executeQuery(QueryMapper.createTable1);

			System.out.println("create table 1");
			statement = connection.createStatement();
			statement.executeQuery(QueryMapper.createTable2);
			System.out.println("create table 2");
			statement = connection.createStatement();
			statement.executeQuery(QueryMapper.createTable3);
			System.out.println("create table 3");
			statement = connection.createStatement();
			statement.executeQuery(QueryMapper.createTable4);
			System.out.println("create table 4");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	@Override
	public boolean userLogin(String username, String password) throws LMSException {

		connection = JdbcUtility.getConnection();
		boolean loginStatus = false;

		try {
			prepareStatement = connection.prepareStatement(QueryMapper.loginDetails);
			resultSet = prepareStatement.executeQuery();

			while (resultSet.next()) {

				String user = resultSet.getString("user_name");
				String pass = resultSet.getString("password");
				// System.out.println("222222");

				if (user.equals(username) && pass.equals(password)) {
					// System.out.println("11111111");
					loginStatus = true;
					break;

				}

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				resultSet.close();
			} catch (SQLException e) {
				throw new LMSException("resultset not closed");
			}
			try {
				prepareStatement.close();
			} catch (SQLException e) {
				throw new LMSException("prepare statement not closed");
			}
			try {
				connection.close();
			} catch (SQLException e) {
				throw new LMSException("connection not closed");
			}

		}

		return loginStatus;
	}

	@Override
	public int insertNewBook(BooksInventory inventory) throws LMSException {

		connection = JdbcUtility.getConnection();
		int result = 0;

		try {
			prepareStatement = connection.prepareStatement(QueryMapper.insertBookInto);
			prepareStatement.setString(1, inventory.getBook_id());
			prepareStatement.setString(2, inventory.getBook_name());
			prepareStatement.setString(3, inventory.getAuthor1());
			prepareStatement.setString(4, inventory.getAuthor2());
			prepareStatement.setString(5, inventory.getPublisher());
			prepareStatement.setString(6, inventory.getYearofpublication());
			result = prepareStatement.executeUpdate();

		} catch (SQLException e) {
			throw new LMSException("Prepare statement not created");
		} finally {
			try {
				prepareStatement.close();
			} catch (SQLException e) {
				throw new LMSException("prepare statement not closed");
			}
			try {
				connection.close();
			} catch (SQLException e) {
				throw new LMSException("connection not closed");
			}

		}

		return result;
	}

	@Override
	public int deleteBook(String book_id) throws LMSException {
		connection = JdbcUtility.getConnection();
		int result = 0;

		try {
			prepareStatement = connection.prepareStatement(QueryMapper.deleteBookfrom);
			prepareStatement.setString(1, book_id);
			result = prepareStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new LMSException("prepare statement not created");
		} finally {
			try {
				prepareStatement.close();
			} catch (SQLException e) {
				throw new LMSException("prepare statement not closed");
			}
			try {
				connection.close();
			} catch (SQLException e) {
				throw new LMSException("connection not closed");
			}

		}

		return result;
	}

}
