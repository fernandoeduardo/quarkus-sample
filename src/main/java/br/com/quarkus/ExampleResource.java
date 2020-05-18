package br.com.quarkus;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/categories")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ExampleResource {

    @Inject
    private CategoryRepository categoryRepository;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Category> listCategories() {

        return categoryRepository.listAll();

//        Category category = new Category();
//        return category.listCategories();
    }

    @POST
    @Transactional
    public Category saveCategory(@Valid Category category) {
        category.persist();
        return category;
    }

}