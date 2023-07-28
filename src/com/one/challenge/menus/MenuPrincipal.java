package com.one.challenge.menus;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class MenuPrincipal extends JFrame{
		
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public MenuPrincipal() {
		
		/**
		 * Here is the main menu with the options to be chosen by the user.
		 */
		this.setTitle("Conversor ONE B)");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 600, 400);
		
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		
		JPanel contentPane = new JPanel();
		this.setContentPane(contentPane);
		contentPane.setLayout(null);
	
		JLabel TituloInicio = new JLabel("Bienvenido al Conversor");
		TituloInicio.setFont(new Font("Agency FB", Font.BOLD, 35));
		TituloInicio.setForeground(new Color(255, 255, 255));
		TituloInicio.setHorizontalAlignment(SwingConstants.CENTER);
		TituloInicio.setBounds(0, 40, 600, 40);
		contentPane.add(TituloInicio);
		
		JButton btnTemperatura = new JButton("Temperatura");
		btnTemperatura.setForeground(new Color(255, 255, 255));
		btnTemperatura.setFont(new Font("Agency FB", Font.BOLD, 22));
		btnTemperatura.setBackground(new Color(255, 140, 0));
		btnTemperatura.setBounds(40, 200, 162, 38);
		contentPane.add(btnTemperatura);
		
		JButton btnDivisas = new JButton("Divisas");
		btnDivisas.setForeground(new Color(255, 255, 255));
		btnDivisas.setBackground(new Color(0, 128, 64));
		btnDivisas.setFont(new Font("Agency FB", Font.BOLD, 22));
		btnDivisas.setBounds(40, 130, 162, 38);
		contentPane.add(btnDivisas);
		
		
		
		/**
		 * Here is the animated background.
		 */
		
		JLabel imagenFondo = new JLabel("",JLabel.CENTER);
		imagenFondo.setSize(600,400);
		ImageIcon imagen = new ImageIcon("media/fogata4.gif");
		Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(imagenFondo.getWidth(),
				imagenFondo.getHeight(), Image.SCALE_DEFAULT));
		imagenFondo.setIcon(icono);
		contentPane.add(imagenFondo);

		
		/**
		 * Here are the action listeners that open the applications in new windows.
		 */
		
		btnTemperatura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuTemperatura temperaturas = new MenuTemperatura();
				temperaturas.setVisible(true);
			}
		});
		
		btnDivisas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				MenuDivisas divisas = new MenuDivisas();
				divisas.setVisible(true);
			}});

	}
	
}
