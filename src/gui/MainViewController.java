package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable { //controle de tela para corresponder aos itens de menu do scenebuilder

	@FXML
	private MenuItem menuItemVendedor;
	
	@FXML
	private MenuItem menuItemDepartamento;
	
	@FXML
	private MenuItem menuItemSobre;
	
	@FXML
	public void onMenuItemVendedorAction() {
		System.out.println("onMenuVendedorAction");
	}
	
	@FXML
	public void onMenuItemDepartamentorAction() {
		System.out.println("onMenuDepartamentoAction");
	}
	
	@FXML
	public void onMenuItemSobreAction() {
		System.out.println("onMenuSobreAction");
	}	
	
	@Override
	public void initialize(URL uri, ResourceBundle rb) {		
	}

}
