package com.example.demo.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Entity.Student;
import com.example.demo.Repository.StudentRepository;

@Service
public class StudentService {
    @Autowired

    StudentRepository StudentRepository;

    //Metodo para listar todo
    public List<Student> getStudent(){
        return StudentRepository.findAll();
    }
    
    //Metodo para mostrar uno
    public Optional <Student> getStudent(Long id){
        return StudentRepository.findById(id);
    }

    //Metodo para guardar y actualizar
    public void saveOrUpdate (Student student){
    StudentRepository.save(student);
    }
    //Metodo para eliminar
    public void delete(Long id){
        StudentRepository.deleteById(id);
    }
}
