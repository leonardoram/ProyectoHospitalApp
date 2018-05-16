package com.proyectofinal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.proyectofinal.model.Pacientes;

@WebServlet("/CrearPacientesServlet")
public class CrearPacientesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public CrearPacientesServlet() {
        super();
        
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter salida = response.getWriter();

		Pacientes pacientenuevo = new Pacientes();
		pacientenuevo.setNSS(Integer.parseInt(request.getParameter("nsspaciente")));
		pacientenuevo.setNombre(request.getParameter("nombrepaciente"));
		pacientenuevo.setApellido(request.getParameter("apellidopaciente"));
		pacientenuevo.setNom_responsable((request.getParameter("nomresponsable")));
		
		salida.append("\n nss: "+pacientenuevo.getNSS());
		salida.append("\n nombre: "+pacientenuevo.getNombre());
		salida.append("\n apellido: "+pacientenuevo.getApellido());
		salida.append("\n nombre del responsable: "+pacientenuevo.getNom_responsable());
		
		Configuration cfg = new Configuration();
		cfg.addAnnotatedClass(com.proyectofinal.model.Pacientes.class);
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Transaction t = (Transaction) session.beginTransaction();
	
		session.persist(pacientenuevo);
		
		t.commit();
		session.close();
		
		System.out.println("paciente registrado");
		
	}
	
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		super.doDelete(req, resp);
	}
	

}
