package br.ufpe.cin.if678.communication;

/**
 * Mapa de possíveis ações de comunicação servidor-cliente
 * 
 * @author Ramon
 */
public enum ServerAction {

	VERIFY_USERNAME,
	USERS_LIST_UPDATE,
	PONG,
	USER_CONNECTED,
	SEND_GROUP,
	GROUP_ADD_MEMBER,
	GROUP_MESSAGE,
	START_UPLOAD;

}
