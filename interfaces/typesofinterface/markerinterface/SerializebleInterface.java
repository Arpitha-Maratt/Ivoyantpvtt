package interfaces.typesofinterface.markerinterface;

import java.io.Serializable;


class SerializebleInterface implements Serializable {
    int id;
    String name;

    SerializebleInterface(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        SerializebleInterface s = new SerializebleInterface(1,"Arpitha");
        System.out.println(s.id);
        System.out.println(s.name);
    }
}
