package goodwill.core.services;


import goodwill.core.models.entities.Account;
import goodwill.core.models.entities.Blog;
import goodwill.core.services.util.AccountList;
import goodwill.core.services.util.BlogList;
import java.util.List;


public interface AccountService {
    public Account findAccount(Long id);
    public Account createAccount(Account data);
    public Blog createBlog(Long accountId, Blog data);
    public BlogList findBlogsByAccount(Long accountId);
    public AccountList findAllAccounts();
    public Account findByAccountName(String name);
}
