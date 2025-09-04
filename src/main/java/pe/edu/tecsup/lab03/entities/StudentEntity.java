package pe.edu.tecsup.lab03.entities;

public class StudentEntity {
    private Long id;
    private String name;
    private String email;

    // Constructor vacío
    public StudentEntity() {
    }

    // Getters y setters básicos
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}