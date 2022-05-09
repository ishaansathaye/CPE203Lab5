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
      boolean result = true;
      if (this.prefix == null) {
         result = (other.prefix == null);
      } else {
         result = this.prefix.equals(other.prefix);
      }
      if (this.number == null) {
         result = (result && (other.number == null));
      } else {
         result = (result && this.number.equals(other.number));
      }
      if (this.startTime == null) {
         result = (result && (other.startTime == null));
      } else {
         result = (result && this.startTime.equals(other.startTime));
      }
      if (this.endTime == null) {
         result = (result && (other.endTime == null));
      } else {
         result = (result && this.endTime.equals(other.endTime));
      }
      return result && (this.enrollment == other.enrollment);
   }

   @Override
   public int hashCode() {
      int hash = 1;
      
      hash = 31 * hash + ((prefix == null) ? 0 : prefix.hashCode());
      hash = 31 * hash + ((number == null) ? 0 : number.hashCode());
      hash = 31 * hash + ((Integer)enrollment).hashCode();
      hash = 31 * hash + ((startTime == null) ? 0 : startTime.hashCode());
      hash = 31 * hash + ((endTime == null) ? 0 : endTime.hashCode());

      return hash;
   
   }
   
}
