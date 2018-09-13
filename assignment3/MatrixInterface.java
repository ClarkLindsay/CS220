/**
*The MatricInterface interface may be implemented by an ADT for a matrix.
*
*@arthor Clark Lindsay
*@version 1.0
*@since 2018-02-12 
*/

public interface MatrixInterface<Matrix>{

   /**
   The add method adds two methods together.
   
   @param first The first matrix.
   @param second The second matrix
   @return Matrix The matrix resulting from the matrix addition.
   */
   public Matrix add(Matrix first, Matrix second);
   
   /**
   The multiply method multiplies two methods together.
   
   @param first The first matrix.
   @param second The second matrix
   @return Matrix The matrix resulting from the matrix multiplication.
   */
   public Matrix multiply(Matrix first, Matrix second);
   
   /**
   The scalarMultiply method multiplies a matrix by a scalar.
   
   @param entry The matrix to be multiplied.
   @param scalar The scalar multiple.
   @return Matrix The matrix resulting from the scalar multiplication.
   */
   public Matrix scalarMultiply(Matrix entry, double scalar);
   
   /**
   The transpose method transposes a given matrix.
   
   @param entry The matrix to transpose.
   @return Matrix The transpose of the matrix.
   */
   public Matrix transpose(Matrix entry);
   
}