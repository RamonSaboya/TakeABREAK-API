package br.ufpe.cin.if678.communication;
  

/**
 * Mapa de possíveis ações de comunicação cliente-servidor
 * 
 * @author Ramon
 */
public enum UserAction {

	SEND_USERNAME(0),
	REQUEST_USER_LIST(1),
	SEND_MESSAGE(2),
	GROUP_CREATE(3),
	GROUP_ADD_MEMBER(4);

	private int ID; // ID associado a ação

	/**
	 * Construtor do enum
	 * 
	 * @param ID ID da ação
	 */
	UserAction(int ID) {
		this.ID = ID;
	}

	/**
	 * Retorna o ID da ação
	 * 
	 * @return ID da ação
	 */
	public int getID() {
		return ID;
	}

}
