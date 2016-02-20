package GUI;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import revendedora.ColecaoVeiculos;
import revendedora.Combustivel;
import revendedora.Moto;
import revendedora.Proprietario;

public class Gui extends Frame implements ActionListener, ItemListener {
	
	private Panel veiculoPanel;
	private Panel buttonPanel;
	private Choice ChoiceMoto;
	private Choice combustivelChoice;
	private Button ButtonCadastrar;
	private Button ButtonMotoMaisCara;
	private Label modeloLabel;
	private Label anoLabel;
	private Label PrecoLabel;
	private Label nomeDoProfLabel;
	private Label kmLabel;
	private Label telefoneLabel;
	private Label cinPortLabel;
	private Label veiculosLabel;
	private ColecaoVeiculos colecao;
	private TextField kmTextField;
	private TextField AnoTextField;
	private TextField PrecoTextField;
	private TextField ModeloTextField;
	private TextField NomeDoProfTextField;
	private TextField CinPortTextField;
	private TextField TelefoneTextField;
	
	public Gui(){
		setLayout(new GridLayout(1, 1));
		setTitle("Concessionaria");
		setSize(800, 600);
		
		
		modeloLabel = new Label("Modelo");
		anoLabel = new Label("Ano");
		PrecoLabel = new Label("Preço");
		kmLabel = new Label("Quilometragem");
		veiculosLabel = new Label("Veiculo");
		nomeDoProfLabel = new Label("Nome do Professor");
		telefoneLabel = new Label("Telefone");
		cinPortLabel = new Label("Cilindradas");
		
		ButtonCadastrar = new Button("Cadastrar");
		ButtonMotoMaisCara = new Button("Moto Mais Cara");
		
		kmTextField = new TextField();
		ModeloTextField = new TextField();
		 AnoTextField = new TextField();
		 NomeDoProfTextField = new TextField();
		 PrecoTextField = new TextField();
		 CinPortTextField = new TextField();
		 TelefoneTextField = new TextField();
		
		combustivelChoice = new Choice();
		combustivelChoice.add("Gasolina");
		combustivelChoice.add("alcool");
		combustivelChoice.add("disel");
		combustivelChoice.add("gás natural");
		combustivelChoice.add("flex");
		
		 
		ChoiceMoto = new Choice();
		ChoiceMoto.add("Moto");
		ChoiceMoto.add("Carro");
		ChoiceMoto.addItemListener(this);
		
		veiculoPanel = new Panel();
		buttonPanel = new Panel();
		
		veiculoPanel.setLayout(new GridLayout(7, 2));
		veiculoPanel.add(modeloLabel);
		veiculoPanel.add(ModeloTextField);
		veiculoPanel.add(anoLabel);
		veiculoPanel.add(AnoTextField);
		veiculoPanel.add(PrecoLabel);
		veiculoPanel.add(PrecoTextField);
		veiculoPanel.add(kmLabel);
		veiculoPanel.add(kmTextField);
		veiculoPanel.add(veiculosLabel);
		veiculoPanel.add(ChoiceMoto);
		veiculoPanel.add(nomeDoProfLabel);
		veiculoPanel.add(NomeDoProfTextField);
		veiculoPanel.add(telefoneLabel);
		veiculoPanel.add(TelefoneTextField);
		veiculoPanel.add(cinPortLabel);
		veiculoPanel.add(CinPortTextField);
		
		buttonPanel.setLayout(new GridLayout(1, 2));
		buttonPanel.add(ButtonCadastrar);
		buttonPanel.add(ButtonMotoMaisCara);
		
		this.add(veiculoPanel);
		this.add(buttonPanel);
		
		ButtonCadastrar.addActionListener(this);
		
		colecao = new ColecaoVeiculos();
		
	}

	public void actionPerformed(ActionEvent ae) {
		if (ChoiceMoto.getSelectedItem() == "Moto"){
			Proprietario p = new Proprietario(NomeDoProfTextField.getText(), TelefoneTextField.getText());
			Moto novaMoto = new Moto(p, Integer.parseInt(kmTextField.getText()), Integer.parseInt(PrecoTextField.getText()), Integer.parseInt(AnoTextField.getText()), ModeloTextField.getText(), Combustivel.valueOf(combustivelChoice), c  ) // continuar essa treta
		}
	}

	@Override
	public void itemStateChanged(ItemEvent arg0) {
		//System.out.println("mudou");
		if (ChoiceMoto.getSelectedItem() == "Moto"){
		cinPortLabel.setText("Cilindradas");
		}else if(ChoiceMoto.getSelectedItem() == "Carro"){
			cinPortLabel.setText("Portas");
		}
	}
	
	
	
	
}
