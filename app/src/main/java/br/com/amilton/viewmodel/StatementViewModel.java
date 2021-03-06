package br.com.amilton.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

import br.com.amilton.model.Statement;
import br.com.amilton.model.UserAccount;
import br.com.amilton.repository.StatementRepository;

public class StatementViewModel extends ViewModel {
    public final MutableLiveData<UserAccount> userAccount = new MutableLiveData<>();
    private final StatementRepository statementRepository;

    public StatementViewModel() {
        statementRepository = new StatementRepository();
    }

    public LiveData<List<Statement>> getStatementsMutableLiveData(String userId) {
        return statementRepository.getStatements(userId);
    }

    public MutableLiveData<UserAccount> getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount.setValue(userAccount);
    }

}
