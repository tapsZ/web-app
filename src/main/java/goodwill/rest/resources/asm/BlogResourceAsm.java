package goodwill.rest.resources.asm;

import goodwill.core.models.entities.Blog;
import goodwill.rest.mvc.AccountController;
import goodwill.rest.mvc.BlogController;
import goodwill.rest.resources.BlogResource;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;


import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;

public class BlogResourceAsm extends ResourceAssemblerSupport<Blog, BlogResource> {
    public BlogResourceAsm() {
        super(BlogController.class, BlogResource.class);
    }

    @Override
    public BlogResource toResource(Blog blog) {
        BlogResource resource = new BlogResource();
        resource.setTitle(blog.getTitle());
        resource.add(linkTo(BlogController.class).slash(blog.getId()).withSelfRel());
        resource.add(linkTo(BlogController.class).slash(blog.getId()).slash("blog-entries").withRel("entries"));
        resource.setRid(blog.getId());
        if(blog.getOwner() != null)
            resource.add(linkTo(AccountController.class).slash(blog.getOwner().getId()).withRel("owner"));
        return resource;
    }
}
