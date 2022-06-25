import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Magazin{
	public static int sumaTotala = 0;
	public static int start = 0;
	public static void main(String[] args){
		JFrame frame = new JFrame("Magazin");
		JButton rosii = new JButton("Rosii \n Pret: 4");
		JButton ciocolata = new JButton("Ciocolata \n Pret:3");
		JButton cartofi = new JButton("Cartofi \n Pret: 8");
		JButton varza = new JButton("Varza \n Pret: 5");
		JButton salata = new JButton("Salata \n Pret: 7");
		JButton	vin = new JButton("Vin \n Pret: 20");
		JButton patrunjel = new JButton("Patrunjel \n Pret: 6");
		JButton bomboane = new JButton("Bomboane \n Pret: 9");
		JButton budinca = new JButton("Budinca \n Pret: 10");
		JButton cola = new JButton("Cola \n Pret: 6");
		JButton detergent = new JButton("Detergent \n Pret: 15");
		JButton pui = new JButton("Pui \n Pret: 12");
		JButton cafea = new JButton("Cafea \n Pret: 13");
		JButton lapte = new JButton("Lapte \n Pret: 7");
		JButton mere = new JButton("Mere \n Pret: 6");
		JButton fanta = new JButton("Fanta \n Pret: 6");
		JTextArea rosiiText = new JTextArea();
		JTextArea ciocolataText = new JTextArea();
		JTextArea cartofiText = new JTextArea();
		JTextArea varzaText = new JTextArea();
		JTextArea salataText = new JTextArea();
		JTextArea patrunjelText = new JTextArea();
		JTextArea bomboaneText = new JTextArea();
		JTextArea budincaText = new JTextArea();
		JTextArea colaText = new JTextArea();
		JTextArea detergentText = new JTextArea();
		JTextArea puiText = new JTextArea();
		JTextArea cafeaText = new JTextArea();
		JTextArea lapteText = new JTextArea();
		JTextArea mereText = new JTextArea();
		JTextArea fantaText = new JTextArea();
		JTextArea vinText = new JTextArea();
		JTextArea cart = new JTextArea("Cos de Cumparaturi");
		JTextArea total = new JTextArea("Total");
		
		
		frame.setSize(950, 860);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		///////////////////////////////////////////////////////////////////////////////////////rosii
		rosii.setBounds(50, 50, 100, 80);
		rosii.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				int cant = Integer.parseInt(rosiiText.getText());
				sumaTotala = sumaTotala+4*cant;
				if(start == 0){
					cart.setText(Integer.toString(cant)+" rosii \n");
					total.setText(Integer.toString(sumaTotala));
					start = 1;
				}
				else{
					String textAnt = cart.getText();
					cart.setText(textAnt+ cant+" rosii \n");
					total.setText(Integer.toString(sumaTotala));
				}
			}
		});
		
		rosiiText.setBounds(50, 140, 100, 50);
		////////////////////////////////////////////////////////////////////////////////////////rosii
		
		
		///////////////////////////////////////////////////////////////////////////////////////ciocolata
		ciocolata.setBounds(200, 50, 100, 80);
		ciocolata.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				int cant = Integer.parseInt(ciocolataText.getText());
				sumaTotala = sumaTotala+3*cant;
				if(start == 0){
					cart.setText(Integer.toString(cant)+" ciocolata \n");
					total.setText(Integer.toString(sumaTotala));
					start = 1;
				}
				else{
					String textAnt = cart.getText();
					cart.setText(textAnt+ cant+" ciocolata \n");
					total.setText(Integer.toString(sumaTotala));
				}
			}
		});
		
		ciocolataText.setBounds(200, 140, 100, 50);
		////////////////////////////////////////////////////////////////////////////////////////ciocolata
		
		
		///////////////////////////////////////////////////////////////////////////////////////cartofi
		cartofi.setBounds(350, 50, 100, 80);
		cartofi.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				int cant = Integer.parseInt(cartofiText.getText());
				sumaTotala = sumaTotala+8*cant;
				if(start == 0){
					cart.setText(Integer.toString(cant)+" cartofi \n");
					total.setText(Integer.toString(sumaTotala));
					start = 1;
				}
				else{
					String textAnt = cart.getText();
					cart.setText(textAnt+ cant+" cartofi \n");
					total.setText(Integer.toString(sumaTotala));
				}
			}
		});
		
		cartofiText.setBounds(350, 140, 100, 50);
		////////////////////////////////////////////////////////////////////////////////////////cartofi
		
		
		///////////////////////////////////////////////////////////////////////////////////////varza
		varza.setBounds(500, 50, 100, 80);
		varza.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				int cant = Integer.parseInt(varzaText.getText());
				sumaTotala = sumaTotala+5*cant;
				if(start == 0){
					cart.setText(Integer.toString(cant)+" varza \n");
					total.setText(Integer.toString(sumaTotala));
					start = 1;
				}
				else{
					String textAnt = cart.getText();
					cart.setText(textAnt+ cant+" varza \n");
					total.setText(Integer.toString(sumaTotala));
				}
			}
		});
		
		varzaText.setBounds(500, 140, 100, 50);
		////////////////////////////////////////////////////////////////////////////////////////varza
		
		
		///////////////////////////////////////////////////////////////////////////////////////
		salata.setBounds(50, 240, 100, 80);
		salata.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				int cant = Integer.parseInt(salataText.getText());
				sumaTotala = sumaTotala+7*cant;
				if(start == 0){
					cart.setText(Integer.toString(cant)+" salata \n");
					total.setText(Integer.toString(sumaTotala));
					start = 1;
				}
				else{
					String textAnt = cart.getText();
					cart.setText(textAnt+ cant+" salata \n");
					total.setText(Integer.toString(sumaTotala));
				}
			}
		});
		
		salataText.setBounds(50,330, 100, 50);
		////////////////////////////////////////////////////////////////////////////////////////
		
		
		///////////////////////////////////////////////////////////////////////////////////////
		patrunjel.setBounds(200, 240, 100, 80);
		patrunjel.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				int cant = Integer.parseInt(patrunjelText.getText());
				sumaTotala = sumaTotala+6*cant;
				if(start == 0){
					cart.setText(Integer.toString(cant)+" patrunjel \n");
					total.setText(Integer.toString(sumaTotala));
					start = 1;
				}
				else{
					String textAnt = cart.getText();
					cart.setText(textAnt+ cant+" patrunjel \n");
					total.setText(Integer.toString(sumaTotala));
				}
			}
		});
		
		patrunjelText.setBounds(200, 330, 100, 50);
		////////////////////////////////////////////////////////////////////////////////////////
		
	
		///////////////////////////////////////////////////////////////////////////////////////
		bomboane.setBounds(350,240, 100, 80);
		bomboane.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				int cant = Integer.parseInt(bomboaneText.getText());
				sumaTotala = sumaTotala+9*cant;
				if(start == 0){
					cart.setText(Integer.toString(cant)+" bomboane \n");
					total.setText(Integer.toString(sumaTotala));
					start = 1;
				}
				else{
					String textAnt = cart.getText();
					cart.setText(textAnt+ cant+" bomboane \n");
					total.setText(Integer.toString(sumaTotala));
				}
			}
		});
		
		bomboaneText.setBounds(350, 330, 100, 50);
		////////////////////////////////////////////////////////////////////////////////////////
		

		///////////////////////////////////////////////////////////////////////////////////////
		budinca.setBounds(500, 240, 100, 80);
		budinca.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				int cant = Integer.parseInt(budincaText.getText());
				sumaTotala = sumaTotala+10*cant;
				if(start == 0){
					cart.setText(Integer.toString(cant)+" budinca \n");
					total.setText(Integer.toString(sumaTotala));
					start = 1;
				}
				else{
					String textAnt = cart.getText();
					cart.setText(textAnt+ cant+" budinca \n");
					total.setText(Integer.toString(sumaTotala));
				}
			}
		});
		
		budincaText.setBounds(500,330 , 100, 50);
		////////////////////////////////////////////////////////////////////////////////////////
		
		///////////////////////////////////////////////////////////////////////////////////////
		cola.setBounds(50, 430, 100, 80);
		cola.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				int cant = Integer.parseInt(colaText.getText());
				sumaTotala = sumaTotala+6*cant;
				if(start == 0){
					cart.setText(Integer.toString(cant)+" cola \n");
					total.setText(Integer.toString(sumaTotala));
					start = 1;
				}
				else{
					String textAnt = cart.getText();
					cart.setText(textAnt+ cant+" cola \n");
					total.setText(Integer.toString(sumaTotala));
				}
			}
		});
		
		colaText.setBounds(50, 520, 100, 50);
		////////////////////////////////////////////////////////////////////////////////////////
		
		///////////////////////////////////////////////////////////////////////////////////////
		detergent.setBounds(200, 430, 100, 80);
		detergent.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				int cant = Integer.parseInt(detergentText.getText());
				sumaTotala = sumaTotala+15*cant;
				if(start == 0){
					cart.setText(Integer.toString(cant)+" detergent \n");
					total.setText(Integer.toString(sumaTotala));
					start = 1;
				}
				else{
					String textAnt = cart.getText();
					cart.setText(textAnt+ cant+" detergent \n");
					total.setText(Integer.toString(sumaTotala));
				}
			}
		});
		
		detergentText.setBounds(200, 520, 100, 50);
		////////////////////////////////////////////////////////////////////////////////////////
		
		
		///////////////////////////////////////////////////////////////////////////////////////
		pui.setBounds(350, 430, 100, 80);
		pui.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				int cant = Integer.parseInt(puiText.getText());
				sumaTotala = sumaTotala+12*cant;
				if(start == 0){
					cart.setText(Integer.toString(cant)+" pui \n");
					total.setText(Integer.toString(sumaTotala));
					start = 1;
				}
				else{
					String textAnt = cart.getText();
					cart.setText(textAnt+ cant+" pui \n");
					total.setText(Integer.toString(sumaTotala));
				}
			}
		});
		
		puiText.setBounds(350, 520, 100, 50);
		////////////////////////////////////////////////////////////////////////////////////////
		
		
		///////////////////////////////////////////////////////////////////////////////////////
		cafea.setBounds(500, 430, 100, 80);
		cafea.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				int cant = Integer.parseInt(cafeaText.getText());
				sumaTotala = sumaTotala+13*cant;
				if(start == 0){
					cart.setText(Integer.toString(cant)+" cafea \n");
					total.setText(Integer.toString(sumaTotala));
					start = 1;
				}
				else{
					String textAnt = cart.getText();
					cart.setText(textAnt+ cant+" cafea \n");
					total.setText(Integer.toString(sumaTotala));
				}
			}
		});
		
		cafeaText.setBounds(500, 520, 100, 50);
		////////////////////////////////////////////////////////////////////////////////////////
		
		
		///////////////////////////////////////////////////////////////////////////////////////
		lapte.setBounds(50, 620, 100, 80);
		lapte.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				int cant = Integer.parseInt(lapteText.getText());
				sumaTotala = sumaTotala+7*cant;
				if(start == 0){
					cart.setText(Integer.toString(cant)+" lapte \n");
					total.setText(Integer.toString(sumaTotala));
					start = 1;
				}
				else{
					String textAnt = cart.getText();
					cart.setText(textAnt+ cant+" lapte \n");
					total.setText(Integer.toString(sumaTotala));
				}
			}
		});
		
		lapteText.setBounds(50, 710, 100, 50);
		////////////////////////////////////////////////////////////////////////////////////////
		
		
		///////////////////////////////////////////////////////////////////////////////////////
		mere.setBounds(200, 620, 100, 80);
		mere.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				int cant = Integer.parseInt(mereText.getText());
				sumaTotala = sumaTotala+6*cant;
				if(start == 0){
					cart.setText(Integer.toString(cant)+" mere \n");
					total.setText(Integer.toString(sumaTotala));
					start = 1;
				}
				else{
					String textAnt = cart.getText();
					cart.setText(textAnt+ cant+" mere \n");
					total.setText(Integer.toString(sumaTotala));
				}
			}
		});
		
		mereText.setBounds(200, 710, 100, 50);
		////////////////////////////////////////////////////////////////////////////////////////
		
		
		///////////////////////////////////////////////////////////////////////////////////////
		fanta.setBounds(350, 620, 100, 80);
		fanta.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				int cant = Integer.parseInt(fantaText.getText());
				sumaTotala = sumaTotala+6*cant;
				if(start == 0){
					cart.setText(Integer.toString(cant)+" fanta \n");
					total.setText(Integer.toString(sumaTotala));
					start = 1;
				}
				else{
					String textAnt = cart.getText();
					cart.setText(textAnt+ cant+" fanta \n");
					total.setText(Integer.toString(sumaTotala));
				}
			}
		});
		
		fantaText.setBounds(350, 710, 100, 50);
		////////////////////////////////////////////////////////////////////////////////////////
		
		
		///////////////////////////////////////////////////////////////////////////////////////
		vin.setBounds(500, 620, 100, 80);
		vin.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				int cant = Integer.parseInt(vinText.getText());
				sumaTotala = sumaTotala+20*cant;
				if(start == 0){
					cart.setText(Integer.toString(cant)+" vin \n");
					total.setText(Integer.toString(sumaTotala));
					start = 1;
				}
				else{
					String textAnt = cart.getText();
					cart.setText(textAnt+ cant+" vin \n");
					total.setText(Integer.toString(sumaTotala));
				}
			}
		});
		
		vinText.setBounds(500, 710, 100, 50);
		////////////////////////////////////////////////////////////////////////////////////////
		
		cart.setBounds(650, 0, 300, 790);
		total.setBounds(650, 790, 300, 20);
		
		
		frame.getContentPane().setLayout(null);
		frame.add(rosii);
		frame.add(rosiiText);
		frame.add(ciocolata);
		frame.add(ciocolataText);
		frame.add(cartofi);
		frame.add(cartofiText);
		frame.add(varza);
		frame.add(varzaText);
		frame.add(salata);
		frame.add(salataText);
		frame.add(patrunjel);
		frame.add(patrunjelText);
		frame.add(bomboane);
		frame.add(bomboaneText);
		frame.add(budinca);
		frame.add(budincaText);
		frame.add(cola);
		frame.add(colaText);
		frame.add(detergent);
		frame.add(detergentText);
		frame.add(pui);
		frame.add(puiText);
		frame.add(cafea);
		frame.add(cafeaText);
		frame.add(lapte);
		frame.add(lapteText);
		frame.add(mere);
		frame.add(mereText);
		frame.add(fanta);
		frame.add(fantaText);
		frame.add(vin);
		frame.add(vinText);
		frame.add(cart);
		frame.add(total);
	}
}