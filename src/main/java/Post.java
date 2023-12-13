public class Post {
    public String name; // поле для имени
    public String passport;
    public String patronymic;
    public String phone;
    public String surname;
    public boolean subscription;
    public FormDate birthday;

    public FormDate getBirthday() {
        return birthday;
    }

    public void setBirthday(FormDate birthday) {
        this.birthday = birthday;
    }
}
