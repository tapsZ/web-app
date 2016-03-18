package goodwill.rest.resources.asm;

import goodwill.core.models.entities.Account;
import goodwill.rest.mvc.AccountController;
import goodwill.rest.resources.AccountResource;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;


import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;

public class AccountResourceAsm extends ResourceAssemblerSupport<Account, AccountResource> {
    public AccountResourceAsm() {
        super(AccountController.class, AccountResource.class);
    }

    @Override
    public AccountResource toResource(Account account) {
        AccountResource res = new AccountResource();
        res.setName(account.getName());
        res.setPassword(account.getPassword());
        res.setRid(account.getId());
        res.add(linkTo(methodOn(AccountController.class).getAccount(account.getId())).withSelfRel());
        res.add(linkTo(methodOn(AccountController.class).findAllBlogs(account.getId())).withRel("blogs"));
        return res;
    }
}
