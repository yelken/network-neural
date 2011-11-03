package fsm.com.br.graphic;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Desktop; 
import java.io.IOException;
import java.net.URISyntaxException; 
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import fsm.com.br.fachada.Fachada;
import fsm.com.br.model.Neuronio;
import fsm.com.br.model.Utils;

import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Toolkit;
import java.net.URI;
import java.util.Vector;

public class Gui extends JFrame implements ActionListener, MouseListener{
	private static final long serialVersionUID = 1L;

	private JLabel lblTexto1;
	private ImageIcon img;
	private JLabel lblTexto2;
	private JLabel lblPerceptronImg;
	private JButton btnTreinar;
	private JButton btnValidar;
	private JLabel lblTexto3;
	private JTextArea jtaResult;
	private JScrollPane jspScroll2;
	private JLabel link;
	private Cursor cursor;
	private URI url;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btn10;
	private JButton btn11;
	private JButton btn12;
	private JButton btn13;
	private JButton btn14;
	private JButton btn15;
	private JButton btn16;
	private JButton btn17;
	private JButton btn18;
	private JButton btn19;
	private JButton btn20;
	private Color cor;
	private int cont = 1;
	private int contBtn1 = 0;
	private int contBtn2 = 0;
	private int contBtn3 = 0;
	private int contBtn4 = 0;
	private int contBtn5 = 0;
	private int contBtn6 = 0;
	private int contBtn7 = 0;
	private int contBtn8 = 0;
	private int contBtn9 = 0;
	private int contBtn10 = 0;
	private int contBtn11 = 0;
	private int contBtn12 = 0;
	private int contBtn13 = 0;
	private int contBtn14 = 0;
	private int contBtn15 = 0;
	private int contBtn16 = 0;
	private int contBtn17 = 0;
	private int contBtn18 = 0;
	private int contBtn19 = 0;
	private int contBtn20 = 0;
	
	private Integer[] vetor = new Integer[21];
	private Vector<Neuronio> resultTreinar;
	private char treinou = 0;
	private int desenhou = 0;
	
	public Gui(){
		setTitle("Programa de Reconhecimento de Caracteres - IA");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(new GridBagLayout());
		((JComponent)getContentPane()).setBorder(
			       new EmptyBorder(5, 8, 8, 8));
		
		GridBagConstraints gbc = new GridBagConstraints();
	
		gbc.insets = new Insets(2, 2, 2, 2);
		gbc.anchor = GridBagConstraints.WEST;
	    
	    gbc.gridy = 0; // linha
	    gbc.gridx = 0; // coluna
	    gbc.gridwidth = 3;
		lblTexto1 = new JLabel("    Desenhe um dos Caracteres: (A, S, D, F, G, H, J, K, L, P)");
		add(lblTexto1, gbc);
		
		gbc.gridy = 1; // linha
	    gbc.gridx = 0; // coluna
	    gbc.gridwidth = 1;
	    btn1 = new JButton();
	    add(btn1, gbc);
	    btn1.setPreferredSize(new Dimension(115,80));
	    btn1.setBackground(Color.white); 
	    btn1.addActionListener(
	            new ActionListener(){
	                public void actionPerformed(ActionEvent e){
	                	try {
	                    	if(contBtn1 == 0){
	                    		btn1.setBackground(Color.black);
	                    		contBtn1 = 1;
	                    	}else{
	                    		btn1.setBackground(Color.white);
	                    		contBtn1 = 0;
	                    	}
	                    		
	                    	desenhou += 1;
						} catch (Exception e1) {
							JOptionPane.showMessageDialog(null, e1.getMessage());
						}
	                	
	                }
	            }   
	        ); 
	    
		gbc.gridy = 1; // linha
	    gbc.gridx = 1; // coluna
	    gbc.gridwidth = 1;
	    btn2 = new JButton();
	    add(btn2, gbc);
	    btn2.setPreferredSize(new Dimension(115,80));
	    btn2.setBackground(Color.white);
	    btn2.addActionListener(
	            new ActionListener(){
	                public void actionPerformed(ActionEvent e){
	                	try {
	                    	if(contBtn2 == 0){
	                    		btn2.setBackground(Color.black);
	                    		contBtn2 = 1;
	                    	}else{
	                    		btn2.setBackground(Color.white);
	                    		contBtn2 = 0;
	                    	}
	                    	desenhou += 1;
						} catch (Exception e1) {
							JOptionPane.showMessageDialog(null, e1.getMessage());
						}
	                }
	            }   
	        ); 
	    
		gbc.gridy = 1; // linha
	    gbc.gridx = 2; // coluna
	    gbc.gridwidth = 1;
	    btn3 = new JButton();
	    add(btn3, gbc);
	    btn3.setPreferredSize(new Dimension(115,80));
	    btn3.setBackground(Color.white);
	    btn3.addActionListener(
	            new ActionListener(){
	                public void actionPerformed(ActionEvent e){
	                	try {
	                    	if(contBtn3 == 0){
	                    		btn3.setBackground(Color.black);
	                    		contBtn3 = 1;
	                    	}else{
	                    		btn3.setBackground(Color.white);
	                    		contBtn3 = 0;
	                    	}
	                    	desenhou += 1;
						} catch (Exception e1) {
							JOptionPane.showMessageDialog(null, e1.getMessage());
						}
	                }
	            }   
	        ); 
	    
		gbc.gridy = 1; // linha
	    gbc.gridx = 3; // coluna
	    gbc.gridwidth = 1;
	    btn4 = new JButton();
	    add(btn4, gbc);
	    btn4.setPreferredSize(new Dimension(115,80));
	    btn4.setBackground(Color.white);
	    btn4.addActionListener(
	            new ActionListener(){
	                public void actionPerformed(ActionEvent e){
	                	try {
	                    	if(contBtn4 == 0){
	                    		btn4.setBackground(Color.black);
	                    		contBtn4 = 1;
	                    	}else{
	                    		btn4.setBackground(Color.white);
	                    		contBtn4 = 0;
	                    	}
						} catch (Exception e1) {
							JOptionPane.showMessageDialog(null, e1.getMessage());
						}
	                }
	            }   
	        ); 
	    
		gbc.gridy = 2; // linha
	    gbc.gridx = 0; // coluna
	    gbc.gridwidth = 1;
	    btn5 = new JButton();
	    add(btn5, gbc);
	    btn5.setPreferredSize(new Dimension(115,80));
	    btn5.setBackground(Color.white);
	    btn5.addActionListener(
	            new ActionListener(){
	                public void actionPerformed(ActionEvent e){
	                	try {
	                    	if(contBtn5 == 0){
	                    		btn5.setBackground(Color.black);
	                    		contBtn5 = 1;
	                    	}else{
	                    		btn5.setBackground(Color.white);
	                    		contBtn5 = 0;
	                    	}
	                    	desenhou += 1;
						} catch (Exception e1) {
							JOptionPane.showMessageDialog(null, e1.getMessage());
						}
	                }
	            }   
	        ); 
	    
		gbc.gridy = 2; // linha
	    gbc.gridx = 1; // coluna
	    gbc.gridwidth = 1;
	    btn6 = new JButton();
	    add(btn6, gbc);
	    btn6.setPreferredSize(new Dimension(115,80));
	    btn6.setBackground(Color.white);
	    btn6.addActionListener(
	            new ActionListener(){
	                public void actionPerformed(ActionEvent e){
	                	try {
	                    	if(contBtn6 == 0){
	                    		btn6.setBackground(Color.black);
	                    		contBtn6 = 1;
	                    	}else{
	                    		btn6.setBackground(Color.white);
	                    		contBtn6 = 0;
	                    	}
						} catch (Exception e1) {
							JOptionPane.showMessageDialog(null, e1.getMessage());
						}
	                }
	            }   
	        ); 
	    
		gbc.gridy = 2; // linha
	    gbc.gridx = 2; // coluna
	    gbc.gridwidth = 1;
	    btn7 = new JButton();
	    add(btn7, gbc);
	    btn7.setPreferredSize(new Dimension(115,80));
	    btn7.setBackground(Color.white);
	    btn7.addActionListener(
	            new ActionListener(){
	                public void actionPerformed(ActionEvent e){
	                	try {
	                    	if(contBtn7 == 0){
	                    		btn7.setBackground(Color.black);
	                    		contBtn7 = 1;
	                    	}else{
	                    		btn7.setBackground(Color.white);
	                    		contBtn7 = 0;
	                    	}
	                    	desenhou += 1;
						} catch (Exception e1) {
							JOptionPane.showMessageDialog(null, e1.getMessage());
						}
	                }
	            }   
	        ); 
	    
		gbc.gridy = 2; // linha
	    gbc.gridx = 3; // coluna
	    gbc.gridwidth = 1;
	    btn8 = new JButton();
	    add(btn8, gbc);
	    btn8.setPreferredSize(new Dimension(115,80));
	    btn8.setBackground(Color.white);
	    btn8.addActionListener(
	            new ActionListener(){
	                public void actionPerformed(ActionEvent e){
	                	try {
	                    	if(contBtn8 == 0){
	                    		btn8.setBackground(Color.black);
	                    		contBtn8 = 1;
	                    	}else{
	                    		btn8.setBackground(Color.white);
	                    		contBtn8 = 0;
	                    	}
	                    	desenhou += 1;
						} catch (Exception e1) {
							JOptionPane.showMessageDialog(null, e1.getMessage());
						}
	                }
	            }   
	        ); 
	    
		gbc.gridy = 3; // linha
	    gbc.gridx = 0; // coluna
	    gbc.gridwidth = 1;
	    btn9 = new JButton();
	    add(btn9, gbc);
	    btn9.setPreferredSize(new Dimension(115,80));
	    btn9.setBackground(Color.white);
	    btn9.addActionListener(
	            new ActionListener(){
	                public void actionPerformed(ActionEvent e){
	                	try {
	                    	if(contBtn9 == 0){
	                    		btn9.setBackground(Color.black);
	                    		contBtn9 = 1;
	                    	}else{
	                    		btn9.setBackground(Color.white);
	                    		contBtn9 = 0;
	                    	}
	                    	desenhou += 1;
						} catch (Exception e1) {
							JOptionPane.showMessageDialog(null, e1.getMessage());
						}
	                }
	            }   
	        ); 
	    
		gbc.gridy = 3; // linha
	    gbc.gridx = 1; // coluna
	    gbc.gridwidth = 1;
	    btn10 = new JButton();
	    add(btn10, gbc);
	    btn10.setPreferredSize(new Dimension(115,80));
	    btn10.setBackground(Color.white);
	    btn10.addActionListener(
	            new ActionListener(){
	                public void actionPerformed(ActionEvent e){
	                	try {
	                    	if(contBtn10 == 0){
	                    		btn10.setBackground(Color.black);
	                    		contBtn10 = 1;
	                    	}else{
	                    		btn10.setBackground(Color.white);
	                    		contBtn10 = 0;
	                    	}
	                    	desenhou += 1;
						} catch (Exception e1) {
							JOptionPane.showMessageDialog(null, e1.getMessage());
						}
	                }
	            }   
	        ); 
	    
	    gbc.gridy = 3; // linha
	    gbc.gridx = 2; // coluna
	    gbc.gridwidth = 1;
	    btn11 = new JButton();
	    add(btn11, gbc);
	    btn11.setPreferredSize(new Dimension(115,80));
	    btn11.setBackground(Color.white);
	    btn11.addActionListener(
	            new ActionListener(){
	                public void actionPerformed(ActionEvent e){
	                	try {
	                    	if(contBtn11 == 0){
	                    		btn11.setBackground(Color.black);
	                    		contBtn11 = 1;
	                    	}else{
	                    		btn11.setBackground(Color.white);
	                    		contBtn11 = 0;
	                    	}
	                    	desenhou += 1;
						} catch (Exception e1) {
							JOptionPane.showMessageDialog(null, e1.getMessage());
						}
	                }
	            }   
	        ); 
	    
	    gbc.gridy = 3; // linha
	    gbc.gridx = 3; // coluna
	    gbc.gridwidth = 1;
	    btn12 = new JButton();
	    add(btn12, gbc);
	    btn12.setPreferredSize(new Dimension(115,80));
	    btn12.setBackground(Color.white);
	    btn12.addActionListener(
	            new ActionListener(){
	                public void actionPerformed(ActionEvent e){
	                	try {
	                    	if(contBtn12 == 0){
	                    		btn12.setBackground(Color.black);
	                    		contBtn12 = 1;
	                    	}else{
	                    		btn12.setBackground(Color.white);
	                    		contBtn12 = 0;
	                    	}
	                    	desenhou += 1;
						} catch (Exception e1) {
							JOptionPane.showMessageDialog(null, e1.getMessage());
						}
	                }
	            }   
	        ); 
		
	    gbc.gridy = 4; // linha
	    gbc.gridx = 0; // coluna
	    gbc.gridwidth = 1;
	    btn13 = new JButton();
	    add(btn13, gbc);
	    btn13.setPreferredSize(new Dimension(115,80));
	    btn13.setBackground(Color.white);
	    btn13.addActionListener(
	            new ActionListener(){
	                public void actionPerformed(ActionEvent e){
	                	try {
	                    	if(contBtn13 == 0){
	                    		btn13.setBackground(Color.black);
	                    		contBtn13 = 1;
	                    	}else{
	                    		btn13.setBackground(Color.white);
	                    		contBtn13 = 0;
	                    	}
	                    	desenhou += 1;
						} catch (Exception e1) {
							JOptionPane.showMessageDialog(null, e1.getMessage());
						}
	                }
	            }   
	        ); 
	    
	    gbc.gridy = 4; // linha
	    gbc.gridx = 1; // coluna
	    gbc.gridwidth = 1;
	    btn14 = new JButton();
	    add(btn14, gbc);
	    btn14.setPreferredSize(new Dimension(115,80));
	    btn14.setBackground(Color.white);
	    btn14.addActionListener(
	            new ActionListener(){
	                public void actionPerformed(ActionEvent e){
	                	try {
	                    	if(contBtn14 == 0){
	                    		btn14.setBackground(Color.black);
	                    		contBtn14 = 1;
	                    	}else{
	                    		btn14.setBackground(Color.white);
	                    		contBtn14 = 0;
	                    	}
	                    	desenhou += 1;
						} catch (Exception e1) {
							JOptionPane.showMessageDialog(null, e1.getMessage());
						}
	                }
	            }   
	        ); 
	    
	    gbc.gridy = 4; // linha
	    gbc.gridx = 2; // coluna
	    gbc.gridwidth = 1;
	    btn15 = new JButton();
	    add(btn15, gbc);
	    btn15.setPreferredSize(new Dimension(115,80));
	    btn15.setBackground(Color.white);
	    btn15.addActionListener(
	            new ActionListener(){
	                public void actionPerformed(ActionEvent e){
	                	try {
	                    	if(contBtn15 == 0){
	                    		btn15.setBackground(Color.black);
	                    		contBtn15 = 1;
	                    	}else{
	                    		btn15.setBackground(Color.white);
	                    		contBtn15 = 0;
	                    	}
	                    	desenhou += 1;
						} catch (Exception e1) {
							JOptionPane.showMessageDialog(null, e1.getMessage());
						}
	                }
	            }   
	        ); 
	    
	    gbc.gridy = 4; // linha
	    gbc.gridx = 3; // coluna
	    gbc.gridwidth = 1;
	    btn16 = new JButton();
	    add(btn16, gbc);
	    btn16.setPreferredSize(new Dimension(115,80));
	    btn16.setBackground(Color.white);
	    btn16.addActionListener(
	            new ActionListener(){
	                public void actionPerformed(ActionEvent e){
	                	try {
	                    	if(contBtn16 == 0){
	                    		btn16.setBackground(Color.black);
	                    		contBtn16 = 1;
	                    	}else{
	                    		btn16.setBackground(Color.white);
	                    		contBtn16 = 0;
	                    	} 
	                    	desenhou += 1;
						} catch (Exception e1) {
							JOptionPane.showMessageDialog(null, e1.getMessage());
						}
	                }
	            }   
	        ); 
	    
	    gbc.gridy = 5; // linha
	    gbc.gridx = 0; // coluna
	    gbc.gridwidth = 1;
	    btn17 = new JButton();
	    add(btn17, gbc);
	    btn17.setPreferredSize(new Dimension(115,80));
	    btn17.setBackground(Color.white);
	    btn17.addActionListener(
	            new ActionListener(){
	                public void actionPerformed(ActionEvent e){
	                	try {
	                    	if(contBtn17 == 0){
	                    		btn17.setBackground(Color.black);
	                    		contBtn17 = 1;
	                    	}else{
	                    		btn17.setBackground(Color.white);
	                    		contBtn17 = 0;
	                    	}
	                    	desenhou += 1;
						} catch (Exception e1) {
							JOptionPane.showMessageDialog(null, e1.getMessage());
						}
	                }
	            }   
	        ); 
	    
	    gbc.gridy = 5; // linha
	    gbc.gridx = 1; // coluna
	    gbc.gridwidth = 1;
	    btn18 = new JButton();
	    add(btn18, gbc);
	    btn18.setPreferredSize(new Dimension(115,80));
	    btn18.setBackground(Color.white);
	    btn18.addActionListener(
	            new ActionListener(){
	                public void actionPerformed(ActionEvent e){
	                	try {
	                    	if(contBtn18 == 0){
	                    		btn18.setBackground(Color.black);
	                    		contBtn18 = 1;
	                    	}else{
	                    		btn18.setBackground(Color.white);
	                    		contBtn18 = 0;
	                    	}
	                    	desenhou += 1;
						} catch (Exception e1) {
							JOptionPane.showMessageDialog(null, e1.getMessage());
						}
	                }
	            }   
	        ); 
	    
	    gbc.gridy = 5; // linha
	    gbc.gridx = 2; // coluna
	    gbc.gridwidth = 1;
	    btn19 = new JButton();
	    add(btn19, gbc);
	    btn19.setPreferredSize(new Dimension(115,80));
	    btn19.setBackground(Color.white);
	    btn19.addActionListener(
	            new ActionListener(){
	                public void actionPerformed(ActionEvent e){
	                	try {
	                    	if(contBtn19 == 0){
	                    		btn19.setBackground(Color.black);
	                    		contBtn19 = 1;
	                    	}else{
	                    		btn19.setBackground(Color.white);
	                    		contBtn19 = 0;
	                    	}
	                    	desenhou += 1;
						} catch (Exception e1) {
							JOptionPane.showMessageDialog(null, e1.getMessage());
						}
	                }
	            }   
	        ); 
	    
	    gbc.gridy = 5; // linha
	    gbc.gridx = 3; // coluna
	    gbc.gridwidth = 1;
	    btn20 = new JButton();
	    add(btn20, gbc);
	    btn20.setPreferredSize(new Dimension(115,80));
	    btn20.setBackground(Color.white);
	    btn20.addActionListener(
	            new ActionListener(){
	                public void actionPerformed(ActionEvent e){
	                	try {
	                    	if(contBtn20 == 0){
	                    		btn20.setBackground(Color.black);
	                    		contBtn20 = 1;
	                    	}else{
	                    		btn20.setBackground(Color.white);
	                    		contBtn20 = 0;
	                    	}
	                    	desenhou += 1;
						} catch (Exception e1) {
							JOptionPane.showMessageDialog(null, e1.getMessage());
						}
	                }
	            }   
	        ); 
	    
		gbc.gridy = 0; // linha
	    gbc.gridx = 5; // coluna
	    gbc.gridwidth = 1;
		lblTexto2 = new JLabel("Rede Perceptron:");
		add(lblTexto2, gbc);
		
		gbc.gridy = 1; // linha
	    gbc.gridx = 5; // coluna
	    gbc.gridwidth = 5;
	    gbc.gridheight = 6;
		img = new ImageIcon("Imagens/Perceptron.jpg");
		lblPerceptronImg = new JLabel();
		lblPerceptronImg.setIcon(img);
		add(lblPerceptronImg, gbc);
		
		
		gbc.gridy = 6; // linha
	    gbc.gridx = 0; // coluna
	    gbc.gridwidth = 1;
	    gbc.gridheight = 2;
		btnTreinar = new JButton("Treinar");
		add(btnTreinar, gbc);
		btnTreinar.addActionListener(
	            new ActionListener(){
	                public void actionPerformed(ActionEvent e){
	                    
	                	try {
	                      treinou = 1;
	                      resultTreinar = Fachada.obterInstancia().treinarRede();
	                      jtaResult.setText(Fachada.obterInstancia().lerLog().toString());	                      
	                    } catch (Exception e1) {
							JOptionPane.showMessageDialog(null, e1.getMessage());
						}
	                }
	            }   
	        ); 
		
		gbc.gridy = 6; // linha
	    gbc.gridx = 1; // coluna
	    gbc.gridwidth = 1;
	    gbc.gridheight = 2;
		btnValidar = new JButton("Validar");
		add(btnValidar, gbc);
		btnValidar.addActionListener(
	            new ActionListener(){
	                public void actionPerformed(ActionEvent e){
	                    try {
	                    	if(treinou != 0){
	                    		if(desenhou > 0){
			                    	vetor[0] = Utils.bia;
			                    	for(int x = 0; x < ((JComponent)getContentPane()).getComponentCount();x++){
			                    		String comp = ((JComponent)getContentPane()).getComponent(x).getClass().getName();
			                    		if(comp.equals("javax.swing.JButton") && ((JComponent)getContentPane()).getComponent(x).getHeight() == 80){
			                    			cor = ((JComponent)getContentPane()).getComponent(x).getBackground();
			                    			if(cor == Color.black){
			                    				vetor[cont] = 1;
			                    			}else{
			                    				vetor[cont] = 0;
			                    			}
			                    			cont++;
			                    		}
			                    		
			                    	}
			                    	JOptionPane.showMessageDialog(null, Fachada.obterInstancia().calcularResultado(vetor, resultTreinar));
			                    	jtaResult.setText(Fachada.obterInstancia().lerLog().toString());
			                    	cont = 1;
	                    		}else{
	                    			JOptionPane.showMessageDialog(null, "Ainda não foi desenhado nada! \n Por favor, desenhe algum caractere" +
	                    					" antes de prosseguir com a validação!");
	                    		}
	                    	}else{
	                    		JOptionPane.showMessageDialog(null, "Não há o que validar pois a rede ainda não foi treinada!\n" + 
	                    	    "Por favor, treine a rede primeiro!");
	                    	}
						} catch (Exception e1) {
							JOptionPane.showMessageDialog(null, e1.getMessage());
						}
	                }
	            }   
	        ); 
	    
		gbc.gridy = 6; // linha
	    gbc.gridx = 2; // coluna
	    gbc.gridwidth = 1;
	    gbc.gridheight = 2;
		btnValidar = new JButton("Limpar");
		add(btnValidar, gbc);
		btnValidar.addActionListener(
	            new ActionListener(){
	                public void actionPerformed(ActionEvent e){
	                    try {
	                       	for(int x = 0; x < ((JComponent)getContentPane()).getComponentCount();x++){
	                    		String comp = ((JComponent)getContentPane()).getComponent(x).getClass().getName();
	                    		if(comp.equals("javax.swing.JButton") && ((JComponent)getContentPane()).getComponent(x).getHeight() == 80){
	                    			((JComponent)getContentPane()).getComponent(x).setBackground(Color.white);
	                    			desenhou = 0;
	                    		}
	                    		
	                    	}
	                    	jtaResult.setText("");
						} catch (Exception e1) {
							JOptionPane.showMessageDialog(null, e1.getMessage());
						}
	                }
	            }   
	        ); 
	    
		gbc.gridy = 7; // linha
	    gbc.gridx = 5; // coluna
	    gbc.gridwidth = 1;
	    gbc.gridheight = 2;
		link = new JLabel("https://network-neural.googlecode.com/svn/trunk");
		
		link.setForeground(Color.blue);  
		add(link, gbc);
		link.addMouseListener(
	            new MouseListener() {
	                public void mouseClicked(MouseEvent e){
	                	Desktop desktop = null; 
	                	try {
		                	if (!Desktop.isDesktopSupported())       
		                        throw new IllegalStateException("Desktop resources not supported!");
		                		desktop = Desktop.getDesktop();
		                		if (!desktop.isSupported(Desktop.Action.BROWSE))       
		                            throw new IllegalStateException("No default browser set!"); 
		                	
		                	
	                		url = new URI("http://network-neural.googlecode.com/svn/trunk/network-neural/");            		
	                    	
						} catch (URISyntaxException e1) {
							JOptionPane.showMessageDialog(null, e1.getMessage());
						}
	                	
	                	try {    
	                        desktop.browse(url);    
	                    } catch (IOException e1) {    
	                        e1.printStackTrace();    
	                    }    
	                }

					@Override
					public void mouseEntered(MouseEvent e) {
						cursor = new Cursor(cursor.HAND_CURSOR);
						link.setForeground(Color.red);  
						link.setCursor(cursor);
					}

					@Override
					public void mouseExited(MouseEvent e) {
						link.setForeground(Color.blue);  
						
					}

					@Override
					public void mousePressed(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mouseReleased(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
	            }   
	        ); 
		
		
		gbc.anchor = GridBagConstraints.WEST;
		gbc.gridy = 8; // linha
	    gbc.gridx = 0; // coluna
	    gbc.gridwidth = 1;
	    gbc.gridheight = 2;
	    lblTexto3 = new JLabel("Resultados:");
	    add(lblTexto3, gbc);
	    
	    gbc.gridy = 10; // linha
	    gbc.gridx = 0; // coluna
	    gbc.gridwidth = 13;
	    jtaResult = new JTextArea(10,100);
	    jtaResult.setLineWrap(true);
	    jtaResult.setEditable(false);
	    jspScroll2 = new JScrollPane(jtaResult);
	    add(jspScroll2, gbc);
	    
		pack();
		repaint();
    }
	
	public void centralizar(){  
        /* Função para centralizar janela na tela */  
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();  
        Dimension frameSize = getSize();  
        setLocation(new Point((screenSize.width - frameSize.width) / 2,  
                (screenSize.height - frameSize.height) / 2));  
    }
	
	public static void main(String[] args) {
		Gui rec = new Gui();
		rec.centralizar();
		rec.setVisible(true);

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	
}
