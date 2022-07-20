/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThongBao;

/**
 *
 * @author XPS
 */
public class ThongBao {

    private String message;
    private Boolean read;

    public ThongBao(String s) {
        this.message = s;
        this.read = false;
    }

    public ThongBao(String s, Boolean t) {
        this.message = s;
        this.read = t;
    }

    public Boolean getRead() {
        return this.read;
    }

    public void setRead(Boolean newval) {
        this.read = newval;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String s) {
        this.message = s;
    }
}
