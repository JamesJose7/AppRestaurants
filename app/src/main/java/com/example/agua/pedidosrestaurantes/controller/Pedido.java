package com.example.agua.pedidosrestaurantes.controller;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by agua on 02/07/15.
 */
public class Pedido implements Parcelable {
    private int mNumero;
    private String mNombre;
    private int mCedula;
    private String mFecha;
    private int mMesa;

    private String mItem1;
    private int mCantidad1;
    private String mItem2;
    private int mCantidad2;
    private String mItem3;
    private int mCantidad3;
    private String mItem4;
    private int mCantidad4;
    private String mItem5;
    private int mCantidad5;
    private String mItem6;


    public Pedido(String nombre, int cedula, String fecha, int mesa) {
        mNombre = nombre;
        mCedula = cedula;
        mFecha = fecha;
        mMesa = mesa;
    }

    public Pedido(int numero, String nombre, int cedula, String fecha, int mesa, String item1, int cantidad1, String item2,
                  int cantidad2, String item3, int cantidad3, String item4, int cantidad4, String item5, int cantidad5, String item6, int cantidad6) {
        mNumero = numero;
        mNombre = nombre;
        mCedula = cedula;
        mFecha = fecha;
        mMesa = mesa;
        mItem1 = item1;
        mCantidad1 = cantidad1;
        mItem2 = item2;
        mCantidad2 = cantidad2;
        mItem3 = item3;
        mCantidad3 = cantidad3;
        mItem4 = item4;
        mCantidad4 = cantidad4;
        mItem5 = item5;
        mCantidad5 = cantidad5;
        mItem6 = item6;
        mCantidad6 = cantidad6;
    }


    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel out, int flags) {
        out.writeInt(mNumero);
        out.writeString(mNombre);
        out.writeInt(mCedula);
        out.writeString(mFecha);
        out.writeInt(mMesa);
        out.writeString(mItem1);
        out.writeInt(mCantidad1);
        out.writeString(mItem2);
        out.writeInt(mCantidad2);
        out.writeString(mItem3);
        out.writeInt(mCantidad3);
        out.writeString(mItem4);
        out.writeInt(mCantidad4);
        out.writeString(mItem5);
        out.writeInt(mCantidad5);
        out.writeString(mItem6);
        out.writeInt(mCantidad6);
    }

    public static final Parcelable.Creator<Pedido> CREATOR = new Parcelable.Creator<Pedido>() {
        public Pedido createFromParcel(Parcel in) {
            return new Pedido(in);
        }

        public Pedido[] newArray(int size) {
            return new Pedido[size];
        }
    };

    private Pedido(Parcel in) {
        mNumero = in.readInt();
        mNombre = in.readString();
        mCedula = in.readInt();
        mFecha = in.readString();
        mMesa = in.readInt();
        mItem1 = in.readString();
        mCantidad1 = in.readInt();
        mItem2 = in.readString();
        mCantidad2 = in.readInt();
        mItem3 = in.readString();
        mCantidad3 = in.readInt();
        mItem4 = in.readString();
        mCantidad4 = in.readInt();
        mItem5 = in.readString();
        mCantidad5 = in.readInt();
        mItem6 = in.readString();
        mCantidad6 = in.readInt();
    }

    public int getNumero() {
        return mNumero;
    }

    public void setNumero(int numero) {
        mNumero = numero;
    }

    public String getNombre() {
        return mNombre;
    }

    public void setNombre(String nombre) {
        mNombre = nombre;
    }

    public int getCedula() {
        return mCedula;
    }


    public void setCedula(int cedula) {

        mCedula = cedula;
    }

    public String getFecha() {
        return mFecha;
    }

    public void setFecha(String fecha) {
        mFecha = fecha;
    }

    public int getMesa() {
        return mMesa;
    }

    public void setMesa(int mesa) {
        mMesa = mesa;
    }

    public String getItem1() {
        return mItem1;
    }

    public void setItem1(String item1) {
        mItem1 = item1;
    }

    public int getCantidad1() {
        return mCantidad1;
    }

    public void setCantidad1(int cantidad1) {
        mCantidad1 = cantidad1;
    }

    public String getItem2() {
        return mItem2;
    }

    public void setItem2(String item2) {
        mItem2 = item2;
    }

    public int getCantidad2() {
        return mCantidad2;
    }

    public void setCantidad2(int cantidad2) {
        mCantidad2 = cantidad2;
    }

    public String getItem3() {
        return mItem3;
    }

    public void setItem3(String item3) {
        mItem3 = item3;
    }

    public int getCantidad3() {
        return mCantidad3;
    }

    public void setCantidad3(int cantidad3) {
        mCantidad3 = cantidad3;
    }

    public String getItem4() {
        return mItem4;
    }

    public void setItem4(String item4) {
        mItem4 = item4;
    }

    public int getCantidad4() {
        return mCantidad4;
    }

    public void setCantidad4(int cantidad4) {
        mCantidad4 = cantidad4;
    }

    public String getItem5() {
        return mItem5;
    }

    public void setItem5(String item5) {
        mItem5 = item5;
    }

    public int getCantidad5() {
        return mCantidad5;
    }

    public void setCantidad5(int cantidad5) {
        mCantidad5 = cantidad5;
    }

    public String getItem6() {
        return mItem6;
    }

    public void setItem6(String item6) {
        mItem6 = item6;
    }

    public int getCantidad6() {
        return mCantidad6;
    }

    public void setCantidad6(int cantidad6) {
        mCantidad6 = cantidad6;
    }

    private int mCantidad6;

}
