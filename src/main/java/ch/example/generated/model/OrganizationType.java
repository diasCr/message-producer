/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package ch.example.generated.model;

@org.apache.avro.specific.AvroGenerated
public enum OrganizationType implements org.apache.avro.generic.GenericEnumSymbol<OrganizationType> {
    FOO, BAR, BAZ;

    public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse(
            "{\"type\":\"enum\",\"name\":\"OrganizationType\",\"namespace\":\"com.jerolba.xbuffers.avro\",\"symbols\":[\"FOO\",\"BAR\",\"BAZ\"]}");

    public static org.apache.avro.Schema getClassSchema() {
        return SCHEMA$;
    }

    @Override
    public org.apache.avro.Schema getSchema() {
        return SCHEMA$;
    }
}