package com.ntt.mwonimoney.domain.account.api.response;

import java.time.LocalDate;
import java.util.List;

import com.ntt.mwonimoney.domain.account.model.dto.FinAccountTransactionDto;

import lombok.Data;

@Data
public class FinAccountResponse {
	private String number;
	private int remain;
	private LocalDate createdDay;
	private String status;
	List<FinAccountTransactionDto> finAccountTransaction;
}
