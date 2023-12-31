package com.ntt.mwonimoney.domain.member.service;

import com.ntt.mwonimoney.domain.member.model.vo.SmallAccount;

public interface ChildService {

	public SmallAccount addSmallAccountInfo(
		Long memberIdx,
		int goalMoney,
		String goalName,
		String imageFilename,
		int saveRatio);

	public void deleteSmallAccountInfo(Long memberIdx);

	public void editQuizReward(String childUUID, int quizReward);

	public void editQuizRewardRemain(String childUUID, int quiRewardRemainToAdd);

	public void checkParent(String parentUUID, String childUUID);

	void changeChildCreditScore(String ChildUUID, int scoreToAdd);

	void changeRegularAllowance(String childUUID, int regularAllowance, int regularAllowanceDay);
}
