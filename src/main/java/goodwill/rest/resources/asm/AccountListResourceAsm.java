package goodwill.rest.resources.asm;

import goodwill.core.services.util.AccountList;
import goodwill.rest.mvc.AccountController;
import goodwill.rest.resources.AccountListResource;
import goodwill.rest.resources.AccountResource;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import java.util.List;


public class AccountListResourceAsm extends ResourceAssemblerSupport<AccountList, AccountListResource> {


    public AccountListResourceAsm() {
        super(AccountController.class, AccountListResource.class);
    }

    @Override
    public AccountListResource toResource(AccountList accountList) {
        List<AccountResource> resList = new AccountResourceAsm().toResources(accountList.getAccounts());
        AccountListResource finalRes = new AccountListResource();
        finalRes.setAccounts(resList);
        return finalRes;
    }
}
