package br.ufpe.cin.if678.business;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;

public class Group implements Serializable {

	private static final long serialVersionUID = 518398686073207805L;

	private String name;
	private int founderID;
	private Date creationDate;

	private HashMap<Integer, Boolean> members;

	public Group(String name, int founderID) {
		this.name = name;
		this.founderID = founderID;
		this.creationDate = new Date();

		this.members = new HashMap<Integer, Boolean>();
	}

	public String getName() {
		return name;
	}

	public int getFounderID() {
		return founderID;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public HashMap<Integer, Boolean> getMembers() {
		return members;
	}

	public boolean isMember(int ID) {
		return founderID == ID || members.containsKey(ID);
	}

	public boolean isAdmin(int ID) {
		return founderID == ID || (members.containsKey(ID) && members.get(ID));
	}

	public int getMembersAmount() {
		return members.size() + 1;
	}

	public void changeGroupName(String name) {
		this.name = name;
	}

	public void addMember(int ID) {
		members.put(ID, false);
	}

	public void removeMember(int admin, int ID) {
		members.remove(ID);
	}

	public void turnAdmin(int ID) {
		members.replace(ID, true);
	}

	public void turnMember(int ID) {
		members.replace(ID, false);
	}

}
