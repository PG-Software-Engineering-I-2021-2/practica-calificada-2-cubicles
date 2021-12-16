abstract public class Student {
    int _notaBase = 11;
    abstract int Grado();

}

class Pregado extends Student {
    private String _Nombre;
    Pregado(String Nombre) {
        this._Nombre = Nombre;
    }
    public int Grado() {
        return _notaBase;
    }
}

class Maestria extends Student {
    private String _Nombre;
    Maestria(String Nombre) {
        this._Nombre = Nombre;
    }
    public int Grado() {
        return _notaBase + 1;
    }
}

class Doctorado extends Student {
    private String _Nombre;
    Maestria(String Nombre) {
        this._Nombre = Nombre;
    }
    public int Grado() {
        return _notaBase + 2;
    }
}
