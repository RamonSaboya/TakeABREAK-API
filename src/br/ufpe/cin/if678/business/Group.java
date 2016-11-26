package br.ufpe.cin.if678.business;

import java.io.Serializable;
import java.net.InetSocketAddress;
import java.util.Date;
import java.util.HashMap;

public class Group implements Serializable {

	private static final long serialVersionUID = 518398686073207805L;

	private String name;
	private InetSocketAddress founder;
	private Date creationDate;

	private HashMap<InetSocketAddress, Boolean> members;

	public Group(String name, InetSocketAddress founder) {
		this.name = name;
		this.founder = founder;
		this.creationDate = new Date();

		this.members = new HashMap<InetSocketAddress, Boolean>();
	}

	public String getName() {
		return name;
	}

	public InetSocketAddress getFounder() {
		return founder;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public HashMap<InetSocketAddress, Boolean> getMembers() {
		return members;
	}

	public boolean isMember(InetSocketAddress address) {
		return founder == address || members.containsKey(address);
	}

	public boolean isAdmin(InetSocketAddress address) {
		return founder == address || (members.containsKey(address) && members.get(address));
	}

	public int getMembersAmount() {
		return members.size() + 1;
	}

	public void changeGroupName(String name) {
		this.name = name;
	}

	public void addMember(InetSocketAddress address) {
		members.put(address, false);
	}

	public void removeMember(InetSocketAddress admin, InetSocketAddress address) {
		members.remove(address);
	}

	public void turnAdmin(InetSocketAddress address) {
		members.replace(address, true);
	}

	public void turnMember(InetSocketAddress address) {
		members.replace(address, false);
	}

}
