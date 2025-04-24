// Custom Exceptions
class CourseFullException extends Exception {
    public CourseFullException(String message) {
        super(message);
    }
}

class PrerequisiteNotMetException extends Exception {
    public PrerequisiteNotMetException(String message) {
        super(message);
    }
}

// Enrollment system
public class UniversityEnrollment {
    public static void enroll(String course, boolean isCourseFull, boolean hasCompletedPrerequisite) 
            throws CourseFullException, PrerequisiteNotMetException {
        
        if (isCourseFull) {
            throw new CourseFullException("Cannot enroll: Course is full.");
        }

        if (!hasCompletedPrerequisite) {
            throw new PrerequisiteNotMetException("Cannot enroll: Prerequisite not completed.");
        }

        System.out.println("Enrollment successful in " + course + "!");
    }

    public static void main(String[] args) {
        String course = "Advanced Java";
        boolean isCourseFull = false;
        boolean hasCompletedPrerequisite = false;

        try {
            enroll(course, isCourseFull, hasCompletedPrerequisite);
        } catch (CourseFullException | PrerequisiteNotMetException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
