package cs.vsu.odinaev.brs;

import cs.vsu.odinaev.brs.model.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Создаем факультет
        Faculty faculty = new Faculty("Факультет компьютерных наук");

        // Создаем кафедры
        Institute softwareEngineering = new Institute("Кафедра ПО", "ул. Университетская, 1");
        Institute algorithms = new Institute("Кафедра алгоритмов", "ул. Университетская, 1");

        // Добавляем кафедры на факультет
        faculty.addInstitute(softwareEngineering);
        faculty.addInstitute(algorithms);

        // Создаем сотрудников
        AdministrativeEmployee admin = new AdministrativeEmployee(123456, "Иван Петров", "ivan@university.ru");
        ResearchAssociate researcher = new ResearchAssociate(789012, "Мария Сидорова", "maria@university.ru", "Искусственный интеллект");
        Lecturer lecturer = new Lecturer(345678, "Алексей Козлов", "alex@university.ru", "Машинное обучение");

        // Назначаем декана
        faculty.setDean(admin);

        // Добавляем научных сотрудников на кафедры
        softwareEngineering.addEmployee(researcher);
        algorithms.addEmployee(lecturer);

        // Создаем проекты
        Project aiProject = new Project("Разработка ИИ системы", new Date(), new Date(System.currentTimeMillis() + 86400000L * 30));
        Project mlProject = new Project("Исследование ML алгоритмов", new Date(), new Date(System.currentTimeMillis() + 86400000L * 60));

        // Добавляем сотрудников в проекты
        researcher.addProject(aiProject, 20);
        lecturer.addProject(aiProject, 15);
        lecturer.addProject(mlProject, 10);

        // Создаем курсы
        Course javaCourse = new Course("Программирование на Java", 101, 4.5f);
        Course mlCourse = new Course("Машинное обучение", 202, 3.0f);

        lecturer.addCourse(javaCourse);
        lecturer.addCourse(mlCourse);

        // Выводим информацию
        System.out.println("=== ИНФОРМАЦИЯ О СИСТЕМЕ ===");
        System.out.println(faculty);
        System.out.println("Декан: " + faculty.getDean().getName());

        System.out.println("\n=== КАФЕДРЫ И СОТРУДНИКИ ===");
        for (Institute institute : faculty.getInstitutes()) {
            System.out.println(institute);
            for (ResearchAssociate employee : institute.getEmployees()) {
                System.out.println("  - " + employee.getName() + " (" + employee.getRole() + ")");
            }
        }

        System.out.println("\n=== ПРОЕКТЫ И УЧАСТНИКИ ===");
        System.out.println(researcher.getName() + " участвует в проектах:");
        for (Project project : researcher.getProjects()) {
            System.out.println("  - " + project.getName());
        }

        System.out.println(lecturer.getName() + " участвует в проектах:");
        for (Project project : lecturer.getProjects()) {
            System.out.println("  - " + project.getName());
        }

        System.out.println("\n=== КУРСЫ ПРЕПОДАВАТЕЛЕЙ ===");
        System.out.println(lecturer.getName() + " ведет курсы:");
        for (Course course : lecturer.getCourses()) {
            System.out.println("  - " + course.getName() + " (" + course.getHours() + " часов/неделю)");
        }

        System.out.println("\n=== ОБЩАЯ СТАТИСТИКА ===");
        System.out.println("Всего сотрудников: " + Employee.getCounter());
        System.out.println("Всего кафедр: " + faculty.getInstitutes().size());
    }
}