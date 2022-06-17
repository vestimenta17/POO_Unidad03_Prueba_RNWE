/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Modelo.Actor;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author HP
 */
public class ActorServicio implements IActorServicio{

    private final List<Actor> actorList = new ArrayList<>();
    @Override
    public Actor crear(Actor actor) {
        this.actorList.add(actor);
        return actor;
    }

    @Override
    public List<Actor> listar() {
        return this.actorList;
    }
}
