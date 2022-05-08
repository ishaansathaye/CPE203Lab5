class DivideExpression extends BinaryExpression {

   public DivideExpression(final Expression lft, final Expression rht)
   {
      super(lft, rht, "/");
   }

   public double _applyOperator(double left, double right)
   {
      return left / right;
   }
}

