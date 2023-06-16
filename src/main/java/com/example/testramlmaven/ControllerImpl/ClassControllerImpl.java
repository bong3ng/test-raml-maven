package com.example.testramlmaven.ControllerImpl;



import com.example.testramlmaven.ClassController;
import com.example.testramlmaven.model.Clazz;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class ClassControllerImpl implements ClassController {

    @Override
    public ResponseEntity<List<Clazz>> getClazzs() {
        return null;
    }

    @Override
    public ResponseEntity<?> createClazz(Clazz clazz) {
        return null;
    }

    @Override
    public ResponseEntity<Clazz> getClazzById(String id) {
        return null;
    }

    @Override
    public ResponseEntity<?> updateClazz(String id, Clazz clazz) {
        return null;
    }

    @Override
    public ResponseEntity<?> deleteClassCustomById(String id) {
        return null;
    }

    @Override
    public ResponseEntity<Clazz> getClazz() {
        return null;
    }
}
