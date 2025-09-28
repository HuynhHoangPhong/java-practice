import java.util.Scanner;  

public class Bai1 {
    private double Length;
    private double Width; 

    // contructor 
    public Bai1(double Length, double Width) {
        this.Length = Length;
        this.Width = Width;
    }
// Getter 
public double getWidth() {
    return Width;
}
public double getLength() {
    return Length;
}
// tinh dien tich 
public double Area() {
    return Width*Length;
}

// tinh chu vi 
public double Primeter() {
    return (Width+Length) *2; 
}
// ham nhap 
public void Nhap() {
    do {
    Scanner sc = new Scanner(System.in); 

    System.out.print("Length: "); 
    double L = sc.nextDouble();

    System.out.print("Width: ");
    double W = sc.nextDouble();
    
    this.Length = L;
    this.Width = W;
    }
    while (Length<0 || Width < 0); 
}
// ham xuat 
public void Xuat() {
    System.out.println("Dien tich: " + Area());
    System.out.println("Chu vi: " + Primeter());
}
public static void main (String[]args){
    // Nhap tu ban phim
    Bai1 hcn = new Bai1(0,0); 
    System.out.println("Enter values greater than zero");
    System.out.println("Rectangle 1 ");
    hcn.Area(); 
    hcn.Primeter();
    hcn.Nhap();
    hcn.Xuat();
    // Nhap truc tiep trong chuong trinh
    Bai1 hcn2 = new Bai1(3,5 );
    System.out.println("Rectangle 2 ");
    hcn2.Area();
    hcn2.Primeter(); 
    hcn2.Xuat();
}
}
