class MultiplyExpression extends BinaryExpression {

   public MultiplyExpression(final Expression lft, final Expression rht)
   {
      super(lft, rht, "*");
   }

   public double _applyOperator(double left, double right)
   {
      return left * right;
   }
}

