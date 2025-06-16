/*
13. Online Course Portal

Instructions:

    Class Course: fields title, duration, instructor, method getCourseInfo()
    Subclasses:
        LiveCourse: add scheduleTime
        RecordedCourse: add videoCount
    Use encapsulation and method overriding
    File: CoursePortal.java.

 */

class Course {
    private String title;
    private int duration;
    private String instructor;
    
    public Course(String title, int duration, String instructor) {
        this.title = title;
        this.duration = duration;
        this.instructor = instructor;
    }
    
    public void getCourseInfo() {
        System.out.println("Title: " + title);
        System.out.println("Duration: " + duration + " hours");
        System.out.println("Instructor: " + instructor);
    }
}

class LiveCourse extends Course {
    private String scheduleTime;
    
    public LiveCourse(String title, int duration, String instructor, String scheduleTime) {
        super(title, duration, instructor);
        this.scheduleTime = scheduleTime;
    }
    
    @Override
    public void getCourseInfo() {
        super.getCourseInfo();
        System.out.println("Schedule Time: " + scheduleTime);
    }
}

class RecordedCourse extends Course {
    private int videoCount;
    
    public RecordedCourse(String title, int duration, String instructor, int videoCount) {
        super(title, duration, instructor);
        this.videoCount = videoCount;
    }
    
    @Override
    public void getCourseInfo() {
        super.getCourseInfo();
        System.out.println("Number of Videos: " + videoCount);
    }
}

class CoursePortal{
    public static void main(String[] args){
        Course[] courses = new Course[2];
        courses[0] = new LiveCourse("Java Programming", 40, "Bikii", "10:00 AM");
        courses[1] = new RecordedCourse("Python Basics", 30, "Harii", 15);

        System.out.println("Course Portal Information:");
        for (Course course : courses) {
            course.getCourseInfo();
            System.out.println();
        }
    }
}