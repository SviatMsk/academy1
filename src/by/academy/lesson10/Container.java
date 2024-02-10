package by.academy.lesson10;

public class Container {

    public Tomato[] tomatos;
    private int current;
    public void delete(int index) {
        if (index < 0 || index >= current) {
            System.out.println("vvedi prav index");
            return;
        }
        if (index != tomatos.length - 1) {
            System.arraycopy(tomatos, index, tomatos, index + 1, tomatos.length - index - 1);
        }
        tomatos[tomatos.length - 1] = null;
    }
    private void grow(){
        Tomato[] newTomatos = new Tomato[tomatos.length*2+1];
        System.arraycopy(tomatos,0, newTomatos,0, tomatos.length); //увеличение кoрзины
        tomatos = newTomatos;
    }
    public void add(Tomato tomato){
        if(tomatos == null){
            tomatos = new Tomato[10];//создание корзины
            current = 0;
        }
        if(current >= tomatos.length){
            grow();   //увеличение массива
        }
        tomatos[current++] = tomato;
    }
}
