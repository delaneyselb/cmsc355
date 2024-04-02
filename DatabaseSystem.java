//This class will contain methods for searching and sorting animal records. For simplicity, I'll implement a basic search by name and a sort by name method.

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DatabaseSystem {
    private List<AnimalRecord> records;

    public DatabaseSystem() {
        this.records = new ArrayList<>();
    }

    public void addRecord(AnimalRecord record) {
        records.add(record);
    }

    public List<AnimalRecord> searchByName(String name) {
        return records.stream()
                .filter(record -> record.getAnimalName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }

    public void sortRecordsByName() {
        records.sort(Comparator.comparing(AnimalRecord::getAnimalName));
    }

    // Method to print all records for demonstration
    public void printAllRecords() {
        for (AnimalRecord record : records) {
            System.out.println(record.toString());
        }
    }
}
