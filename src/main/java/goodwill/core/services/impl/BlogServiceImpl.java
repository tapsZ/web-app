package goodwill.core.services.impl;

import goodwill.core.models.entities.Blog;
import goodwill.core.models.entities.BlogEntry;
import goodwill.core.repositories.BlogEntryRepo;
import goodwill.core.repositories.BlogRepo;
import goodwill.core.services.BlogService;
import goodwill.core.services.exceptions.BlogNotFoundException;
import goodwill.core.services.util.BlogEntryList;
import goodwill.core.services.util.BlogList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import javax.persistence.Entity;
import javax.persistence.PersistenceContext;

@Service
@Transactional
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogRepo blogRepo;

    @Autowired
    private BlogEntryRepo entryRepo;

    @Override
    public BlogEntry createBlogEntry(Long blogId, BlogEntry data) {
        Blog blog = blogRepo.findBlog(blogId);
        if(blog == null)
        {
            throw new BlogNotFoundException();
        }
        BlogEntry entry = entryRepo.createBlogEntry(data);
        entry.setBlog(blog);
        return entry;
    }

    @Override
    public BlogList findAllBlogs() {
        return new BlogList(blogRepo.findAllBlogs());
    }

    @Override
    public BlogEntryList findAllBlogEntries(Long blogId) {
        Blog blog = blogRepo.findBlog(blogId);
        if(blog == null)
        {
            throw new BlogNotFoundException();
        }
        return new BlogEntryList(blogId, entryRepo.findByBlogId(blogId));
    }

    @Override
    public Blog findBlog(Long id) {
        return blogRepo.findBlog(id);
    }
}
