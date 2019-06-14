package view;

import javax.swing.JOptionPane;

import model.Professor;

public class Execucao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Professor professor = new Professor();
		
		professor.setNome(JOptionPane.showInputDialog(null, "Nome"));
		professor.setEndereco(JOptionPane.showInputDialog(null, "Endereço"));
		professor.setBairro(JOptionPane.showInputDialog(null, "Bairro"));
		professor.setCep(Integer.parseInt(JOptionPane.showInputDialog(null, "Cep")));
		professor.setCidade(JOptionPane.showInputDialog(null, "Cidade"));
		professor.setEstado(JOptionPane.showInputDialog(null, "Estado"));
		professor.setRg(Long.parseLong(JOptionPane.showInputDialog(null, "Rg")));
		professor.setCpf(Long.parseLong(JOptionPane.showInputDialog(null, "Cpf")));
		
		try {
			int dis = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas disciplinas você possui?"));
			String disciplinas[] = new String[100];
			for (int i = 0; i < dis; i++) {
				disciplinas[i] = JOptionPane.showInputDialog(null, "Digite a disciplina " + i);
				
			}
			professor.setDisciplinas(disciplinas);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			int cur = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas cursos você possui?"));
			String cursos[] = new String[100];
			for (int i = 0; i < cur; i++) {
				cursos[i] = JOptionPane.showInputDialog(null, "Digite o curso " + i);
				
			}
			professor.setCursos(cursos);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		JOptionPane.showMessageDialog (null, professor.getNome());
		JOptionPane.showMessageDialog (null, professor.getEndereco());
		JOptionPane.showMessageDialog (null, professor.getBairro());
		JOptionPane.showMessageDialog (null, professor.getCep());
		JOptionPane.showMessageDialog (null, professor.getCidade());
		JOptionPane.showMessageDialog (null, professor.getEstado());
		JOptionPane.showMessageDialog (null, professor.getRg());
		JOptionPane.showMessageDialog (null, professor.getCpf());
		
	}
	
}

