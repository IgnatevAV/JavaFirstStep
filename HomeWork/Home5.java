package HomeW;


    public class Home5 {

        public static void main(String[] args) {

            Person novik = new Person("Иванов", "Иванович",
                    "Иванов", "89265461287",
                    "Форист", 50000, 1996);

            Person[] office = {
                    novik,
                    new Person("Ольга", "Андреевна",
                            "Иванова", "89268945623",
                            "Флорист", 50000, 1985),
                    new Person("Татьяна", "Юрьевна",
                            "Соколова", "89268562147",
                            "Мастер флорист", 80000, 1969),
                    new Person("Артем", "Андреевич",
                            "Шагалов", "89265697777",
                            "Доставка", 30000, 1999),
                    new Person("Михаил", "Михайлович",
                            "Соколов", "89038529632",
                            "Менеджер", 100000, 2000)
            };

            getAllPersonsInOffice(office);
            System.out.println("***************");
            getOldPerson(office, 40);

        }

        private static void getOldPerson(Person[] office, int year) {
            for (int i = 0; i < office.length; i++)
                if (office[i].getAge() > year) {
                    System.out.println(office[i].getFullInfo());
                }
        }


        private static void getAllPersonsInOffice(Person[] office) {
            System.out.println("All person: ");
            for (int i = 0; i < office.length; i++)
                System.out.println((i + 1) + " " + office[i].getFullInfo());
        }
    }





