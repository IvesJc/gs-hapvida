package br.com.hapvida.main;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.hapvida.beans.Endereco;
import br.com.hapvida.beans.Enfermeira;
import br.com.hapvida.beans.Medico;
import br.com.hapvida.beans.Paciente;
import br.com.hapvida.beans.Prescricao;

public class SistemaProntuarioEletronico {
	
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	public static void main(String[] args) {
		
		List<Paciente> listPacie = new ArrayList<Paciente>(); 
		List<Enfermeira> listEnfer = new ArrayList<Enfermeira>();
		List<Medico> listMedico = new ArrayList<Medico>();
		List<Prescricao> listPresc = new ArrayList<Prescricao>();
		
		
		/* String nome, String sobrenome, String cpf, String sexo, String dataNascimento, String naturalidade,
			String email, String estadoCivil, String tipoSanguineo)  */
		JOptionPane.showMessageDialog(null, "Paciente");
		Paciente objPaciente = new Paciente(
				texto("Nome do paciente: "),
				texto("Sobrenome do paciente: "),
				texto("CPF do paciente: "),
				texto("Sexo do paciente: "),
				texto("Data de Nascimento do paciente: "),
				texto("Naturalidade do paciente: "),
				texto("Email do paciente: "),
				texto("Estado Civil do paciente: "),
				texto("Tipo Sanguíneo do paciente")
				);
		
		/* String logradouro, int numero, String complemento, String bairro, String cidade,
			String uf, String cep */
		JOptionPane.showMessageDialog(null, "Endereço do Paciente: ");
		Endereco objEnd = new Endereco(
				texto("Logradouro: "),
				inteiro("Numero: "),
				texto("Complemento: "),
				texto("Bairro: "),
				texto("Cidade: "),
				texto("UF: "),
				texto("CEP: "));
		objPaciente.setEndereco(objEnd);
		
		listPacie.add(objPaciente);
		
		/* String nome, String sobrenome, String cpf, String sexo, String dataNascimento,
			String naturalidade, String email, String estadoCivil, String dataAdmissao,
			String dataDesligamento */
		Enfermeira objEnfer = new Enfermeira(
				"Thaís",
				"Melo",
				"457.902.324-26",
				"Feminino",
				"12/07/1961",
				"Brasileira",
				"thaismeloalves@rhyta.com",
				"Casada",
				"22/10/1987",
				"-");
		listEnfer.add(objEnfer);
		
		Medico objMedico = new Medico(
				"Leila",
				"Araujo",
				"781.335.698-50",
				"Feminino",
				"12/07/1969",
				"Brasileira",
				"LeilaCorreiaAraujo@rhyta.com",
				"Solteira",
				"05/03/1990",
				"-",
				"CRM/SP 123456"
				);
		listMedico.add(objMedico);
		
		
		Prescricao objPresc = new Prescricao(
				"Fazer  o uso do medicamento DUAS vezes ao dia de 8 em 8 horas"
				);
		listPresc.add(objPresc);
		
	
		
		int resposta = JOptionPane.showConfirmDialog(null, "Agendar consulta?", null, JOptionPane.YES_NO_OPTION);
		if (resposta == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, objPaciente.agendarConsulta(objPaciente.getNome()));
			int respMedico = JOptionPane.showConfirmDialog(null, "Confirmar consulta com Dr(a). "+objMedico.getNome()+"?", null, JOptionPane.YES_NO_OPTION);
			if (respMedico == JOptionPane.YES_OPTION) {
				JOptionPane.showMessageDialog(null, objMedico.agendarConsulta(objPaciente.getNome()));
			}
		}else{
			JOptionPane.showMessageDialog(null, "Consulta não agendada");
			System.exit(0);
		}
		System.out.println(objPaciente.toString());
		
	}
}
