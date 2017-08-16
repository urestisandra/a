/**
 * 
 */
package com.rccl.entities;

import java.util.ArrayList;

/**
 * @author d.serrano.parreno
 *
 */
public class Ship {

	String voyage_info;
	/**
	 * @return the voyage_info
	 */
	public String getVoyage_info() {
		return voyage_info;
	}
	/**
	 * @param voyage_info the voyage_info to set
	 */
	public void setVoyage_info(String voyage_info) {
		this.voyage_info = voyage_info;
	}
	/**
	 * @return the voyage_List
	 */
	public ArrayList<String> getVoyage_List() {
		return voyage_List;
	}
	/**
	 * @param voyage_List the voyage_List to set
	 */
	public void setVoyage_List(ArrayList<String> voyage_List) {
		this.voyage_List = voyage_List;
	}
	/**
	 * @return the ship_name
	 */
	public String getShip_name() {
		return ship_name;
	}
	/**
	 * @param ship_name the ship_name to set
	 */
	public void setShip_name(String ship_name) {
		this.ship_name = ship_name;
	}
	/**
	 * @return the ship_id
	 */
	public String getShip_id() {
		return ship_id;
	}
	/**
	 * @param ship_id the ship_id to set
	 */
	public void setShip_id(String ship_id) {
		this.ship_id = ship_id;
	}
	/**
	 * @return the port_info
	 */
	public String getPort_info() {
		return port_info;
	}
	/**
	 * @param port_info the port_info to set
	 */
	public void setPort_info(String port_info) {
		this.port_info = port_info;
	}
	ArrayList<String> voyage_List; 
	String ship_name;
	String ship_id;
	String port_info;
}
