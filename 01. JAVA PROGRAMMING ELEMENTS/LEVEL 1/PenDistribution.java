public class PenDistribution {
public static void main(String[] args) {

int totalPens = 14;
int totalStudents = 3;

double PenPerStudent = totalPens / totalStudents;
double RemainingPens = totalPens % totalStudents;

System.out.println("The pen per student is:" + PenPerStudent + "and the remaining pens not distributed is:" + RemainingPens);

}
}