package javacampodev;

public class Main {
public static void main(String[] args) {
		
		Assignment assignment1 = new Assignment(1, "Java + React", 0001, "Engin Demiroð");
		Assignment assignment2 = new Assignment(2, "C# + Angular", 0002, "Engin Demiroð");
		Assignment assignment3 = new Assignment(3, "PG için TK  ", 0003, "Engin Demiroð");
				
		Assignment [] assignments = {assignment1, assignment2, assignment3};
		
		for (Assignment assignment : assignments) {
			
			System.out.println(assignment.name);	
		}
		System.out.println(assignments.length);
		
		AssignmentManager assignmentManager = new AssignmentManager();
		assignmentManager.addToAssignment(assignment1);
		assignmentManager.addToAssignment(assignment2);
		assignmentManager.addToAssignment(assignment3);
		
		Color color = new Color(1, "Sarý-Kýrmýz-Mavi", "Ana Renkler");
		ColorManager colorManager = new ColorManager();
		colorManager.addColor(color);
		}
	}



