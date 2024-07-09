package org.sid.bank_account_service.service;

import jakarta.persistence.Entity;
import org.hibernate.dialect.unique.CreateTableUniqueDelegate;
import org.sid.bank_account_service.dto.BankAccountRequestDTO;
import org.sid.bank_account_service.dto.BankAccountResponseDTO;
import org.sid.bank_account_service.entities.BankAccount;

public interface  AccountService {
   BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO);

   BankAccountResponseDTO updateAcount(String id, BankAccountRequestDTO bankAccountDTO) ;
}
