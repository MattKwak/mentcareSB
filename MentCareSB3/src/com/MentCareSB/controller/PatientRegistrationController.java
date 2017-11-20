package com.MentCareSB.controller;

import java.io.IOException;
import com.MentCareSB.model.Patient;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class PatientRegistrationController
{
	@FXML TextField firstnameField, lastnameField, illnessField, usernameField, passwordField;
	
	public void registerPatient()
	{
		String firstname = firstnameField.getText();
		String lastname = lastnameField.getText();
		String illness = illnessField.getText();
		
		String assigneddoctor = DoctorViewController.getDoctorUsername();
		
		String username = usernameField.getText();
		String password = passwordField.getText();
	
		Patient.patient(firstname, lastname, illness, assigneddoctor, username, password);
		
		
		
		
		
		
	}
	public void back(ActionEvent event) throws IOException
	{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("/com/MentCareSB/view/DoctorView.fxml"));
		Parent tableViewParent = loader.load();
		Scene tableViewScene = new Scene(tableViewParent);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(tableViewScene);
		window.show();
	}
	
}
