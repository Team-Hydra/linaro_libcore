
/*
This Java source file was generated by test-to-java.xsl
and is a derived work from the source document.
The source document contained the following notice:



Copyright (c) 2001 World Wide Web Consortium, 
(Massachusetts Institute of Technology, Institut National de
Recherche en Informatique et en Automatique, Keio University).  All 
Rights Reserved.  This program is distributed under the W3C's Software
Intellectual Property License.  This program is distributed in the 
hope that it will be useful, but WITHOUT ANY WARRANTY; without even
the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR 
PURPOSE.  

See W3C License http://www.w3.org/Consortium/Legal/ for more details.


*/

package org.w3c.domts.level2.core;

import org.w3c.dom.*;


import org.w3c.domts.DOMTestCase;
import org.w3c.domts.DOMTestDocumentBuilderFactory;



/**
 *     The "normalize()" method puts all the nodes in the full
 *     depth of the sub-tree underneath this element into a 
 *     "normal" form. 
 *     
 *     Retrieve the third employee and access its second child.
 *     This child contains a block of text that is spread 
 *     across multiple lines.   The content of the "name" child
 *     should be parsed and treated as a single Text node.
 *     This appears to be a duplicate of elementnormalize.xml in DOM L1 Test Suite
* @author NIST
* @author Mary Brady
* @see <a href="http://www.w3.org/TR/DOM-Level-2-Core/core#ID-normalize">http://www.w3.org/TR/DOM-Level-2-Core/core#ID-normalize</a>
* @see <a href="http://www.w3.org/TR/DOM-Level-2-Core/core#ID-72AB8359">http://www.w3.org/TR/DOM-Level-2-Core/core#ID-72AB8359</a>
*/
public final class normalize01 extends DOMTestCase {

   /**
    * Constructor.
    * @param factory document factory, may not be null
    * @throws org.w3c.domts.DOMTestIncompatibleException Thrown if test is not compatible with parser configuration
    */
   public normalize01(final DOMTestDocumentBuilderFactory factory)  throws org.w3c.domts.DOMTestIncompatibleException {
      super(factory);

    //
    //   check if loaded documents are supported for content type
    //
    String contentType = getContentType();
    preload(contentType, "staff", false);
    }

   /**
    * Runs the test case.
    * @throws Throwable Any uncaught exception causes test to fail
    */
   public void runTest() throws Throwable {
      Document doc;
      Element root;
      NodeList elementList;
      Node firstChild;
      NodeList textList;
      CharacterData textNode;
      String data;
      doc = (Document) load("staff", false);
      root = doc.getDocumentElement();
      root.normalize();
      elementList = root.getElementsByTagName("name");
      firstChild = elementList.item(2);
      textList = firstChild.getChildNodes();
      textNode = (CharacterData) textList.item(0);
      data = textNode.getData();
      assertEquals("data", "Roger\n Jones", data);
      }
   /**
    *  Gets URI that identifies the test.
    *  @return uri identifier of test
    */
   public String getTargetURI() {
      return "http://www.w3.org/2001/DOM-Test-Suite/level2/core/normalize01";
   }
   /**
    * Runs this test from the command line.
    * @param args command line arguments
    */
   public static void main(final String[] args) {
        DOMTestCase.doMain(normalize01.class, args);
   }
}

