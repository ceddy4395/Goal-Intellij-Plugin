// This is a generated file. Not intended for manual editing.
package nl.tudelft.core.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.simpleplugin.psi.impl.*;

public interface GOALType {

  IElementType ACT_2_G = new GoalTokenType("ACT_2_G");
  IElementType MOD_2_G = new GoalTokenType("MOD_2_G");
  IElementType PROPERTY = new GoalTokenType("PROPERTY");

  IElementType COMMENT = new GoalTokenType("COMMENT");
  IElementType CRLF = new GoalTokenType("CRLF");
  IElementType KEY = new GoalTokenType("KEY");
  IElementType SEPARATOR = new GoalTokenType("SEPARATOR");
  IElementType VALUE = new GoalTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == ACT_2_G) {
        return new SimpleAct2GImpl(node);
      }
      else if (type == MOD_2_G) {
        return new SimpleMod2GImpl(node);
      }
      else if (type == PROPERTY) {
        return new SimplePropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
