package com.dev.contentcalender.repository;
import com.dev.contentcalender.model.Content;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ContentCollectionRepository {
    private final List<Content> content=new ArrayList<>();
    public ContentCollectionRepository(){

    }

    public List<Content> findAll(){

    }

    public Optional<Content> findbyId(Integer id){
        return content.stream().filter(c->c.id().equals(id)).findFirst();
    }


}
