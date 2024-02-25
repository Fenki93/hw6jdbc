package org.ddiachenko.service;

import org.ddiachenko.database.Database;
import org.ddiachenko.dto.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DatabaseQueryService {
    Database database = Database.getInstance();

    public List<MaxWorkerSalary> findMaxSalaryFromWorker() {
        List<MaxWorkerSalary> maxWorkerSalaries = new ArrayList<>();
        try (ResultSet resultSet = database.executeResult("sql/find_max_salary_worker.sql");
        ) {

            while (resultSet.next()) {
                MaxWorkerSalary maxWorkerSalary = new MaxWorkerSalary(resultSet.getString("name"), resultSet.getInt("salary"));
                maxWorkerSalaries.add(maxWorkerSalary);
                System.out.println("MAX Salary: " + maxWorkerSalary);
            }
        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());
            throw new RuntimeException("Cannot run query");
        }
        database.closeConnection();
        return maxWorkerSalaries;
    }

    public List<LongestProject> findLongestProjects() {
        List<LongestProject> longestProjectList = new ArrayList<>();

        try (ResultSet resultSet = database.executeResult("sql/find_longest_project.sql");
        ) {

            while (resultSet.next()) {
                LongestProject longestProject = new LongestProject(resultSet.getString("name"), resultSet.getString("project_duration"));
                longestProjectList.add(longestProject);
                System.out.println("MAX Salary: " + longestProject);
            }
        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());
            throw new RuntimeException("Cannot run query");
        }
        database.closeConnection();
        return longestProjectList;
    }

    public List<MaximumProjectClients> findMaximumProjectClients() {
        List<MaximumProjectClients> maximumProjectClientsList = new ArrayList<>();

        try (ResultSet resultSet = database.executeResult("sql/find_max_projects_client.sql");
        ) {

            while (resultSet.next()) {
                MaximumProjectClients maximumProjectClients = new MaximumProjectClients(resultSet.getString("client_name"), resultSet.getInt("project_count"));
                maximumProjectClientsList.add(maximumProjectClients);
                System.out.println("MAX Projects number: " + maximumProjectClients);
            }
        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());
            throw new RuntimeException("Cannot run query");
        }
        database.closeConnection();
        return maximumProjectClientsList;
    }

    public List<Worker> findYoungestOldestWorker() {
        List<Worker> workerList = new ArrayList<>();

        try (ResultSet resultSet = database.executeResult("sql/find_youngest_eldest_workers.sql");
        ) {

            while (resultSet.next()) {
                Worker worker = new Worker(resultSet.getString("type"), resultSet.getString("name"), resultSet.getDate("birthdate"));
                workerList.add(worker);
                System.out.println(worker);
            }
        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());
            throw new RuntimeException("Cannot run query");
        }
        database.closeConnection();
        return workerList;
    }

    public List<Project> findProjectPrices() {
        List<Project> projectList = new ArrayList<>();

        try (ResultSet resultSet = database.executeResult("sql/print_project_prices.sql");
        ) {

            while (resultSet.next()) {
                Project project = new Project(resultSet.getString("name"), resultSet.getInt("price"));
                projectList.add(project);
                System.out.println(project);
            }
        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());
            throw new RuntimeException("Cannot run query");
        }
        database.closeConnection();
        return projectList;
    }


    public static void main(String[] args) throws SQLException {
        DatabaseQueryService databaseQueryService = new DatabaseQueryService();
        databaseQueryService.findMaxSalaryFromWorker();
        databaseQueryService.findLongestProjects();
        databaseQueryService.findMaximumProjectClients();
        databaseQueryService.findYoungestOldestWorker();
        databaseQueryService.findProjectPrices();

    }
}
