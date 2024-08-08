// File generated by the BNF Converter (bnfc 2.9.4.1).

package org.syntax.stella.Absyn;

import org.stella.typecheck.Declarations;

public class ListRecordFieldType extends java.util.LinkedList<RecordFieldType> {
    public boolean equals(Object o) {
        if (o instanceof TypeBottom) return false;
        if (o instanceof TypeTop) return true;
        if (o instanceof ListRecordFieldType) {
            if (!Declarations.subtypeEnabled) {
                ListRecordFieldType casted = (ListRecordFieldType) o;
                if (this.size() > casted.size()) {
                    throw new RuntimeException("ERROR_UNEXPECTED_RECORD_FIELDS");
                } else if (this.size() < casted.size()) {
                    throw new RuntimeException("ERROR_MISSING_RECORD_FIELDS");
                }
                for (int i = 0; i < this.size(); i++) {
                    if (!this.get(i).equals(casted.get(i))) {
                        return false;
                    }
                }
                return true;
            } else {
                ListRecordFieldType casted = (ListRecordFieldType) o;
                ListRecordFieldType kek = this;
                casted.stream().forEach(recordValue -> {
                    RecordFieldType param =
                            this
                            .stream().filter(y ->
                                            ((ARecordFieldType) recordValue).stellaident_
                                            .equals(((ARecordFieldType) y).stellaident_))
                                            .findFirst()
                                            .orElseThrow(() -> new RuntimeException("ERROR_MISSING_RECORD_FIELDS"));
                    if (!(((ARecordFieldType) param).type_.equals(((ARecordFieldType) recordValue).type_)))
                        throw new RuntimeException("ERROR_UNEXPECTED_SUBTYPE");
                });
                return true;
            }
        }
        return false;
    }
}
