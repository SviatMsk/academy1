package by.academy.lesson13;

public class User {
    private String login;
    private String password;
    public User(String login, String password){
        this.login = login;
        this.password = password;
    }
    public void createQuery(){
        Query query = new Query();
        query.printToLog();
    }

    class Query {
        public void printToLog(){
            System.out.println("пользователь с ЛОгином " + login + "и паролем " + password + " отправил запрос ");

        }

    }
    public static void main(String[]args){
        User user = new User("123","daad");
        user.createQuery();
        Query q2 = user.new Query();
        q2.printToLog();
        Query q3 = new User("lqef;j", "flkrefw").new Query();
        q3.printToLog();



    }

}