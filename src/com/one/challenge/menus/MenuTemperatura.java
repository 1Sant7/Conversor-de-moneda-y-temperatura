package com.one.challenge.menus;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.one.challenge.auxiliares.DatosYUnidades;
import com.one.challenge.auxiliares.MetodosDeConversion;

@SuppressWarnings("serial")
public class MenuTemperatura extends JFrame implements DatosYUnidades{
	
	/**
	 * Declaration of the panel object and objects that will be in it.
	 */
	private JPanel contentPane;
	private JTextField txtCantidad;
	JLabel labelOrigen,labelCantidad,labelDestino,labelResultado;
	JComboBox<String> cbxOrigen,cbxDestino;
	JButton btnRegresar,btnConvertir;
	
	/**
	 * Let's create the frame. Here is the menu where you choose the source and 
	 * target units of measurement and the number of degrees you want to convert. 
	 */
	public MenuTemperatura() {
		
		setTitle("Temperatura");
		setResizable(false);
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		labelOrigen = new JLabel("DE :");
		labelOrigen.setForeground(new Color(255, 255, 255));
		labelOrigen.setFont(new Font("Agency FB", Font.BOLD, 22));
		labelOrigen.setHorizontalAlignment(SwingConstants.CENTER);
		labelOrigen.setBounds(60, 78, 78, 24);
		contentPane.add(labelOrigen);

		labelCantidad = new JLabel("CANTIDAD:");
		labelCantidad.setHorizontalAlignment(SwingConstants.CENTER);
		labelCantidad.setForeground(Color.WHITE);
		labelCantidad.setFont(new Font("Agency FB", Font.BOLD, 22));
		labelCantidad.setBounds(15, 158, 78, 24);
		contentPane.add(labelCantidad);

		labelDestino = new JLabel("A :");
		labelDestino.setHorizontalAlignment(SwingConstants.CENTER);
		labelDestino.setForeground(Color.WHITE);
		labelDestino.setFont(new Font("Agency FB", Font.BOLD, 22));
		labelDestino.setBounds(60, 238, 78, 24);
		contentPane.add(labelDestino);
		
		labelResultado = new JLabel("");
		labelResultado.setHorizontalAlignment(SwingConstants.CENTER);
		labelResultado.setForeground(Color.WHITE);
		labelResultado.setFont(new Font("Agency FB", Font.BOLD, 22));
		labelResultado.setBounds(60, 268, 414, 77);
		contentPane.add(labelResultado);
		
		//DE
		cbxOrigen = new JComboBox<String>();
		cbxOrigen.setModel(new DefaultComboBoxModel<>(grados));
		cbxOrigen.setFont(new Font("Agency FB", Font.BOLD, 22));
		cbxOrigen.setBounds(120, 77, 180, 30);
		contentPane.add(cbxOrigen);
		
		//CANTIDAD
		txtCantidad = new JTextField();
		txtCantidad.setFont(new Font("Agency FB", Font.BOLD, 22));
		txtCantidad.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad.setBounds(120, 155, 180, 30);
		contentPane.add(txtCantidad);
		txtCantidad.setColumns(10);
		
		//A
		cbxDestino = new JComboBox<String>();
		cbxDestino.setFont(new Font("Agency FB", Font.BOLD, 22));
		cbxDestino.setModel(new DefaultComboBoxModel<>(grados));
		cbxDestino.setBounds(120, 235, 180, 30);
		contentPane.add(cbxDestino);
		
		//BOTON REGRESAR
		btnRegresar = new JButton("Regresar");
		btnRegresar.setFont(new Font("Agency FB", Font.BOLD, 22));
		btnRegresar.setBounds(380, 77, 130, 30);
		contentPane.add(btnRegresar);
		
		//BOTON CONVERTIR
		btnConvertir = new JButton("Convertir");
		btnConvertir.setFont(new Font("Agency FB", Font.BOLD, 22));
		btnConvertir.setBounds(380, 235, 130, 30);
		contentPane.add(btnConvertir);
		
		/**
		 * Background
		 */
		JLabel imagenFondo = new JLabel("",JLabel.CENTER);
		imagenFondo.setSize(600,400);
		ImageIcon imagen = new ImageIcon("media/cielo4.gif");
		Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(imagenFondo.getWidth(),
				imagenFondo.getHeight(), Image.SCALE_DEFAULT));
		imagenFondo.setIcon(icono);
		contentPane.add(imagenFondo);
		
		/**
		 * Here are the action listeners, the ones who are in charge of making the interaction real.
		 * This is the button to return to main menu.
		 */
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MenuPrincipal();
				dispose();
			}
		});
		
		/**
		 * Accion en el boton convertir para que ejecute su funcion 	
		 */
		btnConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/**
				 * Here the variable types are organized and checked for validity so that 
				 * they can be interpreted by the function.
				 */
				String opcionSeleccionadaOrigen = cbxOrigen.getSelectedItem().toString();
				String opcionSeleccionadaDestino = cbxDestino.getSelectedItem().toString();
				String cantidad = txtCantidad.getText();
				double cantidadDouble = Double.parseDouble(cantidad);

				try {
					cantidadDouble = Double.parseDouble(cantidad);
					System.out.println("La temperatura a convertir es: " + cantidadDouble);
				} catch (NumberFormatException e1) {
					System.out.println("El valor ingresado en txtCantidad no es válido para convertir a double.");
				}

				int indice = Arrays.asList(divisasString).indexOf(opcionSeleccionadaOrigen);
				if (indice != -1) {
				}
				
				int indice2 = Arrays.asList(divisasString).indexOf(opcionSeleccionadaDestino);
				if (indice2 != -1) {
				}
				
				double resultado = Math.round(cantidadDouble * 1000.0)/1000.0;
				labelResultado.setText(cantidad+" "+opcionSeleccionadaOrigen+"es igual a "+
						Double.toString(MetodosDeConversion.funcionTemperatura(opcionSeleccionadaOrigen,opcionSeleccionadaDestino, 
						cantidadDouble, resultado))+""+opcionSeleccionadaDestino);
				
			}
		});
	}
}