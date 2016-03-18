package goodwill.rest.resources.asm;

import goodwill.core.services.util.BlogEntryList;
import goodwill.rest.mvc.BlogController;
import goodwill.rest.resources.BlogEntryListResource;
import goodwill.rest.resources.BlogEntryResource;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import java.util.List;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;


public class BlogEntryListResourceAsm extends ResourceAssemblerSupport<BlogEntryList, BlogEntryListResource> {
    public BlogEntryListResourceAsm() {
        super(BlogController.class, BlogEntryListResource.class);
    }

    @Override
    public BlogEntryListResource toResource(BlogEntryList list) {
        List<BlogEntryResource> resources = new BlogEntryResourceAsm().toResources(list.getEntries());
        BlogEntryListResource listResource = new BlogEntryListResource();
        listResource.setEntries(resources);
        listResource.add(linkTo(methodOn(BlogController.class).findAllBlogEntries(list.getBlogId())).withSelfRel());
        return listResource;
    }
}
