package goodwill.core.services;

import goodwill.core.models.entities.BlogEntry;



public interface BlogEntryService {
    public BlogEntry findBlogEntry(Long id); // Returns the BlogEntry or null if it can't be found
    public BlogEntry deleteBlogEntry(Long id); // Deletes the found BlogEntry or returns null if it can't be found
    public BlogEntry updateBlogEntry(Long id, BlogEntry data);
}
