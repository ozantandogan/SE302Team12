public class CV {
    int ID;
    int age;
    int entryyear;
    String name;
    String surname;
    String gender;
    String contact;
    String highSchoolName;
    String studyArea;
    String noteworthyAchievements;
    String proAreaOfInterest;
    String workExperience;
    String extraNotes;

    public CV(int id, int Age, int entryy, String Name, String Surname, String Gender, String Contact, String Highschoolname, String StudyArea, String NoteworthyAchievements, String Proareofintereest, String WorkExperience, String ExtraNotes){
        ID = id;
        age = Age;
        entryyear =entryy;
        name = Name;
        surname = Surname;
        gender = Gender;
        contact = Contact;
        highSchoolName = Highschoolname;
        studyArea = StudyArea;
        noteworthyAchievements = NoteworthyAchievements;
        proAreaOfInterest = Proareofintereest;
        workExperience = WorkExperience;
        extraNotes = "";


    }

    public int getID() {
        return ID;
    }

}