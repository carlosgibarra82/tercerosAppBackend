package com.carlosibarra.entities;


import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.NonNull;


@Entity
@Table(name="NITS")
public class Nit implements Serializable
{
	private static final long serialVersionUID = -1003851511401658981L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable = false)
	public Long Id;
	
	@NonNull
	@Column(nullable = false, length=2)
	public String C_EMP;
	
	@NonNull
	@Column(nullable = false, length=12, unique = true)
	public String N_IDE;
	
	@NonNull
	@Column(nullable = false, length=120)
	public String NOM;
	
	@Column(length=2)
	public String IDE;
	
	@Column(length=200)
	public String DIR;
	
	@Column(length=15)
	public String TEL;
	
	@Column(length=15)
	public String FAX;
	
	@Column(length=15)
	public String TLX;
	
	@Column(length=10)
	public String AA;
	
	@Column(length=1)
	public String EST;
	
	@NonNull
	@Column(length=30)
	public String NOM1;
	
	@Column(length=30)
	public String NOM2;
	
	@Column(length=30)
	public String APE1;
	
	@Column(length=30)
	public String APE2;
	
	@Column(length=200)
	public String DIR_ELECT;
	
	@Column(length=1)
	public String DIG;
	
	@Column(length=1)
	public String TIPO_NIT;
	
	@Column(length=1)
	public String TIP_CONTRIB;
	
	@Column(length=1)
	public String TIP_TERC;
	
	@Column()
	public Date FECHA;

	public Nit(Long ID_,String C_EMP_,String N_IDE_,String NOM_,String IDE_,String DIR_,String TEL_,String FAX_,String TLX_,String AA_,String EST_,String NOM1_,String NOM2_,String APE1_,String APE2_,String DIR_ELECT_,String DIG_,String TIPO_NIT_,String TIP_CONTRIB_,String TIP_TERC_,java.sql.Date FECHA_)
	{
		this.Id = ID_;
		this.C_EMP = C_EMP_;
		this.N_IDE = N_IDE_;
		this.NOM = NOM_;
		this.IDE = IDE_;
		this.DIR = DIR_;
		this.TEL = TEL_;
		this.FAX = FAX_;
		this.TLX = TLX_;
		this.AA = AA_;
		this.EST = EST_;
		this.NOM1 = NOM1_;
		this.NOM2 = NOM2_;
		this.APE1 = APE1_;
		this.APE2 = APE2_;
		this.DIR_ELECT = DIR_ELECT_;
		this.DIG = DIG_;
		this.TIPO_NIT = TIPO_NIT_;
		this.TIP_CONTRIB = TIP_CONTRIB_;
		this.TIP_TERC = TIP_TERC_;
		this.FECHA = FECHA_;
	}

	public Nit() {
	}

	public Long getID() {
		return Id;
	}

	public void setID(Long iD) {
		Id = iD;
	}

	public String getC_EMP() {
		return C_EMP;
	}

	public void setC_EMP(String c_EMP) {
		C_EMP = c_EMP;
	}

	public String getN_IDE() {
		return N_IDE;
	}

	public void setN_IDE(String n_IDE) {
		N_IDE = n_IDE;
	}

	public String getNOM() {
		return NOM;
	}

	public void setNOM(String nOM) {
		NOM = nOM;
	}

	public String getIDE() {
		return IDE;
	}

	public void setIDE(String iDE) {
		IDE = iDE;
	}

	public String getDIR() {
		return DIR;
	}

	public void setDIR(String dIR) {
		DIR = dIR;
	}

	public String getTEL() {
		return TEL;
	}

	public void setTEL(String tEL) {
		TEL = tEL;
	}

	public String getFAX() {
		return FAX;
	}

	public void setFAX(String fAX) {
		FAX = fAX;
	}

	public String getTLX() {
		return TLX;
	}

	public void setTLX(String tLX) {
		TLX = tLX;
	}

	public String getAA() {
		return AA;
	}

	public void setAA(String aA) {
		AA = aA;
	}

	public String getEST() {
		return EST;
	}

	public void setEST(String eST) {
		EST = eST;
	}

	public String getNOM1() {
		return NOM1;
	}

	public void setNOM1(String nOM1) {
		NOM1 = nOM1;
	}

	public String getNOM2() {
		return NOM2;
	}

	public void setNOM2(String nOM2) {
		NOM2 = nOM2;
	}

	public String getAPE1() {
		return APE1;
	}

	public void setAPE1(String aPE1) {
		APE1 = aPE1;
	}

	public String getAPE2() {
		return APE2;
	}

	public void setAPE2(String aPE2) {
		APE2 = aPE2;
	}

	public String getDIR_ELECT() {
		return DIR_ELECT;
	}

	public void setDIR_ELECT(String dIR_ELECT) {
		DIR_ELECT = dIR_ELECT;
	}

	public String getDIG() {
		return DIG;
	}

	public void setDIG(String dIG) {
		DIG = dIG;
	}

	public String getTIPO_NIT() {
		return TIPO_NIT;
	}

	public void setTIPO_NIT(String tIPO_NIT) {
		TIPO_NIT = tIPO_NIT;
	}

	public String getTIP_CONTRIB() {
		return TIP_CONTRIB;
	}

	public void setTIP_CONTRIB(String tIP_CONTRIB) {
		TIP_CONTRIB = tIP_CONTRIB;
	}

	public String getTIP_TERC() {
		return TIP_TERC;
	}

	public void setTIP_TERC(String tIP_TERC) {
		TIP_TERC = tIP_TERC;
	}

	public Date getFECHA() {
		return FECHA;
	}

	public void setFECHA(Date fECHA) {
		FECHA = fECHA;
	}
	
	
}
	
	

