package com.quiz.controller;

import com.quiz.entity.exam.Category;
import com.quiz.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping("/")
    public ResponseEntity<?> addCategory(@RequestBody Category category){
        return ResponseEntity.ok(this.categoryService.addCategory(category));
    }

    @GetMapping("/{cId}")
    public Category getCategory(@PathVariable("cId") Long cId){
       return this.categoryService.getCategory(cId);
    }

    @GetMapping("/")
    public ResponseEntity<?> getCategories(){
        return ResponseEntity.ok(this.categoryService.getCategories());
    }

    @PutMapping("/")
    public Category updateCategory(@RequestBody Category category){
        return this.categoryService.updateCategory(category);
    }

    @DeleteMapping("/{cId}")
    public void deleteCategory(@PathVariable("cId") Long cId ){
        this.categoryService.deleteCategory(cId);
    }
}
