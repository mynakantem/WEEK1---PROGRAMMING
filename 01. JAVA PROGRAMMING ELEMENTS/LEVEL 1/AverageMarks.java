public class AverageMarks {
public static void main (String[] args) {

int MathMarks = 94;
int PhysicsMarks = 95;
int ChemistryMarks = 96;
int TotalMarks = 100;
int NumberofSubjects = 3;

int totalObtainedMarks = MathMarks + PhysicsMarks + ChemistryMarks;
int totalPossibleMarks = TotalMarks * NumberofSubjects;

double AverageMark = ((double) totalObtainedMarks / totalPossibleMarks) * 100;

System.out.print("The Average percent mark is:" + AverageMark);

}
}