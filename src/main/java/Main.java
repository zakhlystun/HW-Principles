public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.passport = "4444 № 44444444";
        post.patronymic = "Иванович";
        post.phone = "+7 (999)-999-99-99";
        post.surname = "Иванов";
        post.subscription = true;
        post.setBirthday(new FormDate());
        post.getBirthday().setDay(13);
        post.getBirthday().setMonth(6);
        post.getBirthday().setYear(1999);
    }
}
