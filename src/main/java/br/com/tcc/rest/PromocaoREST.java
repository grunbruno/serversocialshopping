/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tcc.rest;

import br.com.tcc.model.Promocao;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


/**
 *
 * @author Bruno
 */
@Path("/promocoes")
public class PromocaoREST {
    
    
    @GET
    @Path("/lista")
    @Produces(MediaType.TEXT_PLAIN)
    public String getPromocoes(){
        
        Promocao p1 = new Promocao("Camisa Coringão!","80.00");
        return p1.getDescricao();
    }
    
    @Path("/promocao/{promocao-id}")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getPromocao(@PathParam("promocao-id") int idPromocao){
        
        Promocao p1 = new Promocao("Camisa Coringão!","80.00");
        return p1.getDescricao()+" - "+idPromocao;
    }
}
