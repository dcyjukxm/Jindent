/*! \brief Brief description.
 *         Brief description continued.
 *
 *  Detailed description starts here.
 */ 
class ClassA {
   
   /**
    * Method a
	*/
   void methodA() {
		// ...
   }

   /*!
    * Method b
	*/
   //!
   //! Method c
   //!
   void methodB() {
		// ...
   }

   //! bla

   //!
   //!
   void methodC() {
		// ...
   }
   
public:
  /** An enum type.
   *  The documentation block cannot be put after the enum!
   */
  void member();   //!< a member function.

protected:
  int value;       /*!< an integer value */

};
