/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Modelo.Actor;
import java.util.List;

/**
 *
 * @author HP
 */
interface IActorServicio {
    public Actor crear(Actor actor);
    public List<Actor> listar();
}
