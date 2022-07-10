package co.edu.poli.fruitexco.usuario.entities;

import co.edu.poli.fruitexco.usuario.entities.enumerator.EstadoEnum;
import co.edu.poli.fruitexco.usuario.entities.enumerator.RolEnum;

import java.time.LocalDateTime;
import java.util.UUID;

public class Usuario {
    private Integer id;
    private String GUID;
    private String email;
    private String userName;
    private String password;
    private LocalDateTime expTime;
    private LocalDateTime createdOn;
    private String phone;
    private String address;
    private RolEnum rol;
    private EstadoEnum status;

    public Usuario(Integer id, String email, String userName, String password, String phone, String address, String rol, String status) {
        this.id = id;
        this.GUID = UUID.randomUUID().toString();
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.expTime = LocalDateTime.now().plusMinutes(15);
        this.createdOn = LocalDateTime.now();
        this.phone = phone;
        this.address = address;
        this.rol = RolEnum.valueOf(rol);
        this.status = EstadoEnum.valueOf(status);
    }

    public Usuario(String email, String userName, String password, String phone, String address, String rol, String status) {
        this.GUID = UUID.randomUUID().toString();
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.expTime = LocalDateTime.now().plusMinutes(15);
        this.createdOn = LocalDateTime.now();
        this.phone = phone;
        this.address = address;
        this.rol = RolEnum.valueOf(rol.toUpperCase());
        this.status = EstadoEnum.valueOf(status.toUpperCase());
    }

    public Usuario() {
        this.GUID = UUID.randomUUID().toString();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGUID() {
        return GUID;
    }

    public void setGUID(String GUID) {
        this.GUID = GUID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getExpTime() {
        return expTime;
    }

    public void setExpTime(LocalDateTime expTime) {
        this.expTime = expTime;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public RolEnum getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = RolEnum.valueOf(rol.toUpperCase());
    }

    public EstadoEnum getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = EstadoEnum.valueOf(status.toUpperCase());
    }
}
