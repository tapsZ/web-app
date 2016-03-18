package goodwill.rest.mvc;

import goodwill.core.models.entities.BlogEntry;
import goodwill.core.services.BlogEntryService;
import goodwill.rest.resources.BlogEntryResource;
import goodwill.rest.resources.asm.BlogEntryResourceAsm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/rest/blog-entries")
public class BlogEntryController {
    private BlogEntryService service;

    @Autowired
    public BlogEntryController(BlogEntryService service)
    {
        this.service = service;
    }

    @RequestMapping(value="/{blogEntryId}",
            method = RequestMethod.GET)
    public ResponseEntity<BlogEntryResource> getBlogEntry(
            @PathVariable Long blogEntryId) {
        BlogEntry entry = service.findBlogEntry(blogEntryId);
        if(entry != null)
        {
            BlogEntryResource res = new BlogEntryResourceAsm().toResource(entry);
            return new ResponseEntity<BlogEntryResource>(res, HttpStatus.OK);
        } else {
            return new ResponseEntity<BlogEntryResource>(HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value="/{blogEntryId}",
            method = RequestMethod.DELETE)
    public ResponseEntity<BlogEntryResource> deleteBlogEntry(
            @PathVariable Long blogEntryId) {
        BlogEntry entry = service.deleteBlogEntry(blogEntryId);
        if(entry != null)
        {
            BlogEntryResource res = new BlogEntryResourceAsm().toResource(entry);
            return new ResponseEntity<BlogEntryResource>(res, HttpStatus.OK);
        } else {
            return new ResponseEntity<BlogEntryResource>(HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value="/{blogEntryId}",
            method = RequestMethod.PUT)
    public ResponseEntity<BlogEntryResource> updateBlogEntry(
            @PathVariable Long blogEntryId, @RequestBody BlogEntryResource sentBlogEntry) {
        BlogEntry updatedEntry = service.updateBlogEntry(blogEntryId, sentBlogEntry.toBlogEntry());
        if(updatedEntry != null)
        {
            BlogEntryResource res = new BlogEntryResourceAsm().toResource(updatedEntry);
            return new ResponseEntity<BlogEntryResource>(res, HttpStatus.OK);
        } else {
            return new ResponseEntity<BlogEntryResource>(HttpStatus.NOT_FOUND);
        }
    }
}
