package com.cg.oicrs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cg.oicrs.model.ClaimQuestions;

public class ClaimQuestionDaoImpl implements ClaimQuestionDao {

	@Override
	public List<ClaimQuestions> getAllClaimQuestions(long policyNumber) {

		List<ClaimQuestions> claimsQ = new ArrayList<>();
		Connection con = JdbcUtility.getConnection();

		String query = (ClaimQueries.claimques);

		try {

			PreparedStatement ps = con.prepareStatement(query);
			ps.setLong(1, policyNumber);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("ques_id");
				
				String question = rs.getString("ques_desc");
				String answer1 = rs.getString("ques_ans1");
				String answer2 = rs.getString("ques_ans2");

				ClaimQuestions claimQues = new ClaimQuestions(id, question, answer1, answer2);
				claimsQ.add(claimQues);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return claimsQ;
	}

	@Override
	public String getClaimQuestions(int questionId) {

		String question = "";
		Connection con = JdbcUtility.getConnection();
		PreparedStatement ps = null;
		try {
			ps = con.prepareStatement(ClaimQueries.quesdesc);
			ps.setInt(1, questionId);
			ResultSet rs = ps.executeQuery();

			rs.next();
			question = rs.getString("QUES_DESC");

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return question;
	}

}