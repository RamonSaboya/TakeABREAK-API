package br.ufpe.cin.if678.communication;


/**
 * Mapa de possíveis ações de comunicação servidor-cliente
 * 
 * @author Ramon
 */
public enum ServerAction {

	SEND_USERS_LIST(1),
	SEND_USER_CONNECTED(2),
	SEND_GROUP(3),
	GROUP_MESSAGE(4),
	GROUP_ADD_MEMBER(5),
	SEND_FILE_TO_SERVER(6);

	private int ID; // ID associado a ação

	/**
	 * Construtor do enum
	 * 
	 * @param ID ID da ação
	 */
	ServerAction(int ID) {
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
