package goodwill.core.services;



import goodwill.core.models.entities.Blog;
import goodwill.core.models.entities.BlogEntry;
import goodwill.core.services.util.BlogEntryList;
import goodwill.core.services.util.BlogList;
import java.util.List;


public interface BlogService {

    public BlogEntry createBlogEntry(Long blogId, BlogEntry data);
    public BlogList findAllBlogs();
    public BlogEntryList findAllBlogEntries(Long blogId); // findBlog all associated blog entries
    public Blog findBlog(Long id);
}
