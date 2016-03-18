package goodwill.rest.resources.asm;

import goodwill.core.services.util.BlogList;
import goodwill.rest.mvc.BlogController;
import goodwill.rest.resources.BlogListResource;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;


import java.util.List;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;


public class BlogListResourceAsm extends ResourceAssemblerSupport<BlogList, BlogListResource> {

    public BlogListResourceAsm()
    {
        super(BlogController.class, BlogListResource.class);
    }

    @Override
    public BlogListResource toResource(BlogList blogList) {
        BlogListResource res = new BlogListResource();
        res.setBlogs(new BlogResourceAsm().toResources(blogList.getBlogs()));
        return res;
    }
}
