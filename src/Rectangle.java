public class Rectangle{
    double width;
    double height;
    Rectangle(){
    }

    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return this.width * this.height;
    }
    public double getPerimeter(){
        return (this.height + this.width)*2;
    }
    public String display() {
        return "Hinh chu nhat co chieu rong la: " + this.width + "\n Co chieu cao la: " + this.height;
    }
}
