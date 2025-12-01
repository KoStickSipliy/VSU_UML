package main.java;

import java.util.Scanner;

public class UniversitySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Создаем университет
        University university = new University("ВГУ");

        // Создаем факультеты
        Faculty facultyFKN = new Faculty("ФКН");
        Faculty facultyPhysics = new Faculty("Физический");

        // Создаем кафедры
        Institute instituteCS = new Institute("Кафедра информатики", "ул. Университетская, 1");
        Institute instituteMath = new Institute("Кафедра математики", "ул. Университетская, 2");
        Institute institutePhysics = new Institute("Кафедра физики", "ул. Ленина, 3");

        // Добавляем кафедры к факультетам
        facultyFKN.addInstitute(instituteCS);
        facultyFKN.addInstitute(instituteMath);
        facultyPhysics.addInstitute(institutePhysics);

        // Создаем сотрудников
        ResearchAssociate researcher1 = new ResearchAssociate(
                123456, "Иванов И.И.", "ivanov@university.com", "Компьютерные науки");
        ResearchAssociate researcher2 = new ResearchAssociate(
                234567, "Петров П.П.", "petrov@university.com", "Прикладная математика");

        AdministrativeEmployee admin1 = new AdministrativeEmployee(
                345678, "Сидорова С.С.", "sidorova@university.com", "Учебный отдел");

        // Создаем декана
        Dean deanFKN = new Dean(
                456789, "Смирнов А.А.", "smirnov@university.com", "Информационные системы", facultyFKN);

        // Назначаем декана
        facultyFKN.setDean(deanFKN);

        // Прикрепляем научных сотрудников к кафедрам
        instituteCS.addResearcher(researcher1);
        instituteMath.addResearcher(researcher2);
        instituteCS.addResearcher(deanFKN); // Декан тоже прикреплен к кафедре

        // Создаем курсы
        Course courseOOP = new Course("Объектно-ориентированное программирование", 101, 4.5f);
        Course courseMath = new Course("Высшая математика", 102, 6.0f);

        // Назначаем курсы преподавателям
        researcher1.addCourse(courseOOP);
        researcher2.addCourse(courseMath);

        // Создаем проекты
        Project projectAI = new Project(
                "Искусственный интеллект",
                new SimpleDate(2024, 1, 1),
                new SimpleDate(2024, 12, 31));

        Project projectDB = new Project(
                "Большие данные",
                new SimpleDate(2024, 3, 1),
                new SimpleDate(2024, 11, 30));

        // Участие в проектах
        Participation part1 = new Participation(
                researcher1, projectAI, 200,
                new SimpleDate(2024, 1, 1),
                new SimpleDate(2024, 12, 31));

        Participation part2 = new Participation(
                researcher2, projectAI, 150,
                new SimpleDate(2024, 2, 1),
                new SimpleDate(2024, 10, 31));

        Participation part3 = new Participation(
                researcher1, projectDB, 100,
                new SimpleDate(2024, 3, 1),
                new SimpleDate(2024, 9, 30));

        // Добавляем участия в проекты
        projectAI.addParticipation(part1);
        projectAI.addParticipation(part2);
        projectDB.addParticipation(part3);

        // Добавляем участия сотрудникам
        researcher1.addParticipation(part1);
        researcher2.addParticipation(part2);
        researcher1.addParticipation(part3);

        // Добавляем факультеты в университет
        university.addFaculty(facultyFKN);
        university.addFaculty(facultyPhysics);

        // === ВВОД/ВЫВОД ДАННЫХ ===
        System.out.println("=== ИНФОРМАЦИОННАЯ СИСТЕМА УНИВЕРСИТЕТА ===\n");

        // 1. Информация об университете
        university.displayUniversityInfo();

        System.out.println("\n--- Подробная информация ---\n");

        // 2. Информация о кафедрах
        instituteCS.displayInstituteInfo();
        System.out.println();
        instituteMath.displayInstituteInfo();
        System.out.println();
        institutePhysics.displayInstituteInfo();

        System.out.println("\n--- Информация о сотрудниках ---\n");

        // 3. Информация о сотрудниках
        researcher1.displayInfo();
        System.out.println();
        researcher2.displayInfo();
        System.out.println();
        admin1.displayInfo();
        System.out.println();
        deanFKN.displayInfo();
        deanFKN.manageFaculty();

        System.out.println("\n--- Информация о проектах ---\n");

        // 4. Информация о проектах
        projectAI.displayProjectInfo();
        System.out.println();
        projectDB.displayProjectInfo();

        System.out.println("\n--- Интерактивная часть ---\n");

        // 5. Простой ввод данных от пользователя
        System.out.print("Хотите добавить нового сотрудника? (да/нет): ");
        String response = scanner.nextLine();

        if (response.equalsIgnoreCase("да")) {
            System.out.print("Введите тип (1-научный, 2-административный): ");
            int type = scanner.nextInt();
            scanner.nextLine(); // очистка буфера

            System.out.print("Введите ФИО: ");
            String name = scanner.nextLine();

            System.out.print("Введите email: ");
            String email = scanner.nextLine();

            if (type == 1) {
                System.out.print("Введите область исследований: ");
                String field = scanner.nextLine();

                ResearchAssociate newResearcher = new ResearchAssociate(
                        999999, name, email, field);
                instituteCS.addResearcher(newResearcher);

                System.out.println("Новый научный сотрудник добавлен!");
                newResearcher.displayInfo();
            } else if (type == 2) {
                System.out.print("Введите отдел: ");
                String department = scanner.nextLine();

                AdministrativeEmployee newAdmin = new AdministrativeEmployee(
                        888888, name, email, department);

                System.out.println("Новый административный сотрудник добавлен!");
                newAdmin.displayInfo();
            }
        }

        scanner.close();

        System.out.println("\n=== ПРОГРАММА ЗАВЕРШЕНА ===");
    }
}
