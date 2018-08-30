package com.mistareastecmi.eli.myuserapp.models;

import android.os.Parcel;
import android.os.Parcelable;

public class User implements Parcelable {

    // Datos del usuario
    public String names;
    public String lastnames;
    public int age;

    /**
     * Constructor para inicializar el objeto User y sus atributos
     * @param names
     * @param lastnames
     * @param age
     */
    public User(String names, String lastnames, int age){
        this.names      = names;
        this.lastnames  = lastnames;
        this.age        = age;
    }

    /**
     * Leer los datos del usuario en el objeto Parcel
     * @param in
     */
    protected User(Parcel in) {
        this.names    = in.readString();
        this.lastnames  = in.readString();
        this.age       = in.readInt();
    }

    /**
     * Este atributo tambien es necesario para implementar Parcelable
     */
    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };


    /**
     * Metodo autogenerado pero necesario para implementar Parcelable
     * @return
     */
    @Override
    public int describeContents() {
        return 0;
    }

    /**
     * Metodo que guarda la info del User en el objeto Parcel
     * @param parcel
     * @param i
     */
    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.names);
        parcel.writeString(this.lastnames);
        parcel.writeInt(this.age);
    }
}
