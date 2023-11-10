package org.example;

public class Student {
    String vorname;
    String nachname;
    String matrikelNr;

    public Student(String vorname, String nachname, String matrikelNr) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.matrikelNr = matrikelNr;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getMatrikelNr() {
        return matrikelNr;
    }

    public void setMatrikelNr(String matrikelNr) {
        this.matrikelNr = matrikelNr;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Vorname: '" + vorname + '\'' +
                ", Nachname: '" + nachname + '\'' +
                ", MatrikelNr:'" + matrikelNr + '\'' +
                '}';
    }
}
