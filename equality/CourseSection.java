import java.time.LocalTime;

class CourseSection
{
   private final String prefix;
   private final String number;
   private final int enrollment;
   private final LocalTime startTime;
   private final LocalTime endTime;

   public CourseSection(final String prefix, final String number,
      final int enrollment, final LocalTime startTime, final LocalTime endTime)
   {
      this.prefix = prefix;
      this.number = number;
      this.enrollment = enrollment;
      this.startTime = startTime;
      this.endTime = endTime;
   }

   // additional likely methods not defined since they are not needed for testing

   @Override
   public boolean equals(Object o) {
      if (o == null) {
         return false;
      }
      if (o.getClass() != this.getClass()) {
         return false;
      }
      CourseSection other = (CourseSection) o;
      return this.prefix.equals(other.prefix) && this.number.equals(other.number) 
         && this.enrollment == other.enrollment && this.startTime.equals(other.startTime)
         && this.endTime.equals(other.endTime);
   }

   @Override
   public int hashCode() {
      int hash = 1;
      
      hash = 31 * hash + ((prefix == null) ? 0 : prefix.hashCode());
      hash = 31 * hash + ((number == null) ? 0 : number.hashCode());
      hash = 31 * hash + enrollment;
      hash = 31 * hash + ((startTime == null) ? 0 : startTime.hashCode());
      hash = 31 * hash + ((endTime == null) ? 0 : endTime.hashCode());

      return hash;
   
   }
   
}
