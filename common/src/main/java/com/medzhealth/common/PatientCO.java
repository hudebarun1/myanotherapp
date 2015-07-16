package com.medzhealth.common;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;



@XmlType(name="patientbean")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "patientbean")
public class PatientCO {

	private String pName;
	private int age;
	private int id;
	private List<AddressCO> addressList;

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<AddressCO> getAddressList() {
		return addressList;
	}

	public void setAddressList(List<AddressCO> addressList) {
		this.addressList = addressList;
	}

}
