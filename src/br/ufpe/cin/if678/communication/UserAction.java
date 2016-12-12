package br.ufpe.cin.if678.communication;

/**
 * Mapa de possíveis ações de comunicação cliente-servidor
 * 
 * @author Ramon
 */
public enum UserAction {

	REQUEST_USERNAME,
	REQUEST_USER_LIST,
	GROUP_CREATE,
	GROUP_ADD_MEMBER,
	SEND_MESSAGE,
	SEND_FILE,
	RECONNECT;

}
