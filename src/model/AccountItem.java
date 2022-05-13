package model;

import java.util.Date;

public class AccountItem {
	
	private String tipoMovimiento;
	private double monto;
	private String descripcion;
	private Date fechaMovimiento;
	
	
	
	public AccountItem(double monto, String tipoMovimiento, String descripcion) {
		super();
		this.tipoMovimiento = tipoMovimiento;
		this.monto = monto;
		this.descripcion = descripcion;
	}
	
	public Date getFechaMovimiento() {
		return fechaMovimiento;
	}
	public void setFechaMovimiento(Date fechaMovimiento) {
		this.fechaMovimiento = fechaMovimiento;
	}
	public String getTipoMovimiento() {
		return tipoMovimiento;
	}
	public void setTipoMovimiento(String tipoMovimiento) {
		this.tipoMovimiento = tipoMovimiento;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	

}
