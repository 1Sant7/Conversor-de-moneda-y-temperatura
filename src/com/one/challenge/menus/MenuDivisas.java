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
import javax.swing.text.AbstractDocument;
import javax.swing.text.DocumentFilter;

import com.one.challenge.auxiliares.DatosYUnidades;
import com.one.challenge.auxiliares.MetodosDeConversion;

@SuppressWarnings("serial")
public class MenuDivisas extends JFrame implements DatosYUnidades{
	
	/**
	 * Declaration of the panel object and objects that will be in it.
	 */
	private JPanel contentPane;
	private JTextField txtCantidad;
	JLabel lblDe,lblCantidad,lblA,lblResultado;
	JButton btnConvertir,btnRegresarMenu;
	JComboBox<String> cbxMoneda1;
	static JComboBox<String> cbxMoneda2;

	/**
	 * Let's create the frame. Here is the currency menu where you choose 
	 * the source currency to convert, the amount and the target currency.
	 */
	public MenuDivisas() {
		setTitle("Divisas");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		setLocationRelativeTo(null);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblDe = new JLabel("DE :");
		lblDe.setFont(new Font("Agency FB", Font.BOLD, 24));
		lblDe.setForeground(Color.WHITE);
		lblDe.setHorizontalAlignment(SwingConstants.CENTER);
		lblDe.setBounds(60, 78, 78, 24);
		contentPane.add(lblDe);

		lblCantidad = new JLabel("CANTIDAD:");
		lblCantidad.setFont(new Font("Agency FB", Font.BOLD, 22));
		lblCantidad.setForeground(Color.WHITE);
		lblCantidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblCantidad.setBounds(15, 158, 78, 24);
		contentPane.add(lblCantidad);

		lblA = new JLabel("A :");
		lblA.setFont(new Font("Agency FB", Font.BOLD, 22));
		lblA.setForeground(Color.WHITE);
		lblA.setHorizontalAlignment(SwingConstants.CENTER);
		lblA.setBounds(60, 238, 78, 24);
		contentPane.add(lblA);

		lblResultado = new JLabel("");
		lblResultado.setFont(new Font("Agency FB", Font.BOLD, 22));
		lblResultado.setForeground(Color.WHITE);
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado.setBounds(60, 268, 414, 77);
		contentPane.add(lblResultado);

		//DE
		cbxMoneda1 = new JComboBox<String>();
		cbxMoneda1.setModel(new DefaultComboBoxModel<>(divisasString));
		cbxMoneda1.setFont(new Font("Agency FB", Font.BOLD, 22));
		cbxMoneda1.setBounds(120, 77, 180, 30);
		contentPane.add(cbxMoneda1);

		//CANTIDAD
		txtCantidad = new JTextField();
		txtCantidad.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad.setFont(new Font("Agency FB", Font.BOLD, 22));
		txtCantidad.setBounds(120, 155, 180, 30);
		contentPane.add(txtCantidad);
		txtCantidad.setColumns(10);
		
		//A
		cbxMoneda2 = new JComboBox<String>();
		cbxMoneda2.setModel(new DefaultComboBoxModel<>(divisasString));
		cbxMoneda2.setFont(new Font("Agency FB", Font.BOLD, 22));
		cbxMoneda2.setBounds(120, 235, 180, 30);
		contentPane.add(cbxMoneda2);
		
		//Boton regresar
		btnRegresarMenu = new JButton("Regresar");
		btnRegresarMenu.setFont(new Font("Agency FB", Font.BOLD, 22));
		btnRegresarMenu.setBounds(380, 77, 130, 30);
		contentPane.add(btnRegresarMenu);

		//Boton convertir
		btnConvertir = new JButton("Convertir");
		btnConvertir.setFont(new Font("Agency FB", Font.BOLD, 22));
		btnConvertir.setBounds(380, 235, 130, 30);
		contentPane.add(btnConvertir);
		
		
		/**
		 * Background
		 */
		
		JLabel imagenFondo = new JLabel("",JLabel.CENTER);
		imagenFondo.setSize(600,400);
		ImageIcon imagen = new ImageIcon("media/mercado.gif");
		Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(imagenFondo.getWidth(),
				imagenFondo.getHeight(), Image.SCALE_DEFAULT));
		imagenFondo.setIcon(icono);
		contentPane.add(imagenFondo);
		

		/**
		 * This code makes sure that the textField only accepts numbers.
		 */
		((AbstractDocument) txtCantidad.getDocument()).setDocumentFilter(new DocumentFilter() {
			@Override
			public void insertString(FilterBypass fb, int offset, String string, javax.swing.text.AttributeSet attrribute)
					throws javax.swing.text.BadLocationException { if (string.matches("/d+")) { super.insertString(fb, offset, string, attrribute); } }

			@Override
			public void replace(FilterBypass fb, int offset, int length, String text, javax.swing.text.AttributeSet attrs) 
					throws javax.swing.text.BadLocationException {
				if (text.matches("\\d+")) {
					super.replace(fb, offset, length, text, attrs);
				}
			}
		});

		/**
		 * Here are the action listeners, the ones who are in charge of making the interaction real.
		 * You can both return to the home menu and convert the selected currency.
		 */
		btnRegresarMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MenuPrincipal();
				dispose();

			}
		});

		btnConvertir.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				String opcionSeleccionadaOrigen = cbxMoneda1.getSelectedItem().toString();
				System.out.println("opcionSeleccionadaOrigen: "+opcionSeleccionadaOrigen);

				String opcionSeleccionadaDestino = cbxMoneda2.getSelectedItem().toString();
				System.out.println("opcionSeleccionadaDestino: "+opcionSeleccionadaDestino);

				String cantidadMonedasString = txtCantidad.getText();
				System.out.println("cantidadMonedasString: "+cantidadMonedasString);

				double cantidadMonedas = Double.parseDouble(cantidadMonedasString);
				System.out.println("cantidadMonedas: "+cantidadMonedas);

				double resultado = Math.round(cantidadMonedas * 1000.0)/1000.0;
				System.out.println("resultado: "+resultado);

				/**
				 * Here the variable types are organized and checked for validity so that 
				 * they can be interpreted by the function.
				 */
				try {
					cantidadMonedas = Double.parseDouble(cantidadMonedasString);
					System.out.println("La cantidad de monedas es: " + cantidadMonedas);
				} catch (NumberFormatException e1) {
					System.out.println("El valor ingresado en txtCantidad no es válido para convertir a double.");
				}

				double opcion1 = divisasValor[0];
				double opcion2 = divisasValor[0];

				int indice = Arrays.asList(divisasString).indexOf(opcionSeleccionadaOrigen);
				if (indice != -1) {
					opcion1 = divisasValor[indice];
				}
				int indice2 = Arrays.asList(divisasString).indexOf(opcionSeleccionadaDestino);
				if (indice2 != -1) {
					opcion2 = divisasValor[indice2];
				}

				lblResultado.setText(cantidadMonedasString+opcionSeleccionadaOrigen+" Es igual a "+
						Double.toString(MetodosDeConversion.funcionDivisas(opcion1, opcion2, cantidadMonedas, resultado))+
						" en "+opcionSeleccionadaDestino);
				
				System.out.println("res en ventana "+" opcion 1 es "+opcion1+" opcion 2 es "+ opcion2+
						" cantidad es "+ cantidadMonedas+" resultado es "+resultado);	
			}
		});
	}
	
}
