public class Main {
    public static void main(String[] args){
        Author SE = new Author("Сергей", "Есенин");
        Author AD = new Author("Александр","Пушкин");
        Book LukDub = new Book("У лукоморья дуб зелёный",AD,1820);
        Book PismoKZhenshine = new Book("Письмо к женщине",SE,1924);
        System.out.println("Книга: " + LukDub.getTitle() + " Автор: " + LukDub.getAuthor().getName() + " " + LukDub.getAuthor().getSurname() + " Год публикации " + LukDub.getPublicationYear());
        System.out.println("Книга: " + PismoKZhenshine.getTitle() + " Автор: " + PismoKZhenshine.getAuthor().getName() + " " + PismoKZhenshine.getAuthor().getSurname() + " Год публикации " + LukDub.getPublicationYear());

    }



}