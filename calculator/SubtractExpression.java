class SubtractExpression extends BinaryExpression {

   public SubtractExpression(final Expression lft, final Expression rht)
   {
      super(lft, rht, "-");
   }

   protected double _applyOperator(double left, double right)
   {
      return left - right;
   }
}

