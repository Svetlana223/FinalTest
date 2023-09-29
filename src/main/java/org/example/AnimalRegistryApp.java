package org.example;

import java.util.List;
import java.util.Scanner;

public class AnimalRegistryApp {
    public static void main(String[] args) {
        try (Counter counter = new Counter()) {
            Scanner scanner = new Scanner(System.in);
            AnimalRegistry registry = new AnimalRegistry();

            while (true) {
                System.out.println("Меню:");
                System.out.println("1. Завести новое животное");
                System.out.println("2. Просмотреть список животных");
                System.out.println("3. Просмотреть команды животного");
                System.out.println("4. Обучить животное новым командам");
                System.out.println("5. Выход");

                System.out.print("Выберите опцию: ");
                int option = scanner.nextInt();
                scanner.nextLine();  // Чтение символа новой строки после ввода числа

                switch (option) {
                    case 1:
                        System.out.print("Введите имя животного: ");
                        String name = scanner.nextLine();
                        System.out.print("Введите категорию животного (например, 'собаки'): ");
                        String category = scanner.nextLine();
                        Animal animal = new Animal(name);
                        registry.addAnimal(category, animal);
                        counter.add();
                        System.out.println("Животное успешно добавлено в реестр.");
                        break;

                    case 2:
                        System.out.println("Список категорий животных:");
                        registry.getCategories().forEach(System.out::println);
                        System.out.print("Введите категорию для просмотра списка животных: ");
                        category = scanner.nextLine();
                        List<Animal> animalsInCategory = registry.getAnimalsByCategory(category);
                        System.out.println("Животные в категории '" + category + "':");
                        animalsInCategory.forEach(a -> System.out.println(a.getName()));
                        break;

                    case 3:
                        System.out.print("Введите имя животного для просмотра команд: ");
                        name = scanner.nextLine();
                        List<Animal> matchingAnimals = registry.getAnimalsByName(name);
                        if (!matchingAnimals.isEmpty()) {
                            System.out.println("Список команд для животного '" + name + "':");
                            matchingAnimals.get(0).getCommands().forEach(System.out::println);
                        } else {
                            System.out.println("Животное с именем '" + name + "' не найдено.");
                        }
                        break;

                    case 4:
                        System.out.print("Введите имя животного для обучения новым командам: ");
                        name = scanner.nextLine();
                        matchingAnimals = registry.getAnimalsByName(name);
                        if (!matchingAnimals.isEmpty()) {
                            System.out.print("Введите новую команду для животного: ");
                            String newCommand = scanner.nextLine();
                            matchingAnimals.get(0).addCommand(newCommand);
                            System.out.println("Команда добавлена.");
                        } else {
                            System.out.println("Животное с именем '" + name + "' не найдено.");
                        }
                        break;

                    case 5:
                        System.out.println("Выход из программы.");
                        return;

                    default:
                        System.out.println("Неверный выбор опции.");
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
    }

}
