package WH;

public class Cat {
    public String nickname;
    public int age = 24;
    public int money = 13;
    public String initials;
    public Cat(){

        super();
    }
//    public Cat(String nickname){
//        super();
//        this.nickname = nickname;
//
//    }
    public Cat(String initials){
        super();
        this.initials = initials;

    }
    public Cat(int age, String nickname, String initials){
        super();
        this.age = age;
        this.nickname = nickname;
        this.initials = initials;
    }
    public void spit(){

        System.out.println(" кот по кличке " + nickname + " spit");
    }
    public void grow(){
        System.out.println("коту по кличке " + nickname + " уже " + (age = age + 1) + " лет");
    }
    public void walk(){
        System.out.println("кот по кличке " + nickname + " гуляет ");

    }

    public void eat(){
        System.out.println(" кот по кличке " + nickname + " ест ");
    }
    public String getNickname(){

        return nickname;
    }
    public int getAge() {
        return age;
    }
    public void setNickname(String nickname) {

    this.nickname = nickname;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getMoney() {

        return money;
    }
    public String getInitials(){
        return initials;}
    public void setInitials(String initials){
        this.initials = initials;
    }

    public void setMoney(int money){
        this.money = money;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "nickname='" + nickname + '\'' +
                '}';
    }

}
