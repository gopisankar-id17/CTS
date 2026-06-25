interface Image {
    void display();
}

class RealImage implements Image {
    private String file;

    RealImage(String file) {
        this.file = file;
        System.out.println("Loading " + file);
    }

    public void display() {
        System.out.println("Displaying " + file);
    }
}

class ProxyImage implements Image {
    private RealImage realImage;
    private String file;

    ProxyImage(String file) {
        this.file = file;
    }

    public void display() {
        if(realImage == null)
            realImage = new RealImage(file);

        realImage.display();
    }
}

public class ProxyTest {
    public static void main(String[] args) {
        Image img = new ProxyImage("photo.jpg");
        img.display();
        img.display();
    }
}