abstract public class Teacher {
    int _salarioBaseMensual = 2000;
    int _comision = 500;
    int _bonus = 100;

    abstract int Sueldo();
    abstract String Nombre();
    abstract boolean getExtraPoint();
}

class ProfesorTP extends Teacher {
    private boolean isExtraPoint = false;
    private String _Nombre;
    ProfesorTP(String nombre){
        this._Nombre = nombre;
    }
    public int Sueldo() {
        return _salarioBaseMensual;
    }

    public String Nombre() {
        return _Nombre;
    }

    public boolean getExtraPoint() {
        return isExtraPoint;
    }
}

class ProfesorTC extends Teacher {
    private boolean isExtraPoint = true;
    private String _Nombre;

    ProfesorTC(String nombre){
        this._Nombre = nombre;
    }
    public int Sueldo() {
        return _salarioBaseMensual + _comision;
    }
    public String Nombre() {
        return _Nombre;
    }
    public boolean getExtraPoint() {
        return isExtraPoint;
    }
}

class Administrativo extends Teacher {
    private boolean isExtraPoint = false;
    private String _Nombre;
    Administrativo(String nombre){
        this._Nombre = nombre;
    }
    public int Sueldo() {
        return _salarioBaseMensual + _bonus;
    }
    public String Nombre() {
        return _Nombre;
    }
    public boolean getExtraPoint() {
        return isExtraPoint;
    }
}

