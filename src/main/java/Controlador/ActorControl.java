/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Actor;
import Servicio.ActorServicio;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author HP
 */
public class ActorControl {
    private final ActorServicio actorServicio = new ActorServicio();
    public Actor crear(String [] params){
//        var auto = new Auto(Integer.valueOf(params[0]),params[1]);
        var actor = new Actor(Integer.valueOf(params[0]), params[1], params[2],
                LocalDate.parse(params[3]),Integer.valueOf(params[4]));
        this.actorServicio.crear(actor);
        return actor;                                                    
    }
    public List<Actor> listar()
    {
        return this.actorServicio.listar();
    }
}
