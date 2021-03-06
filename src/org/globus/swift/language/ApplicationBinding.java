/*
 * XML Type:  ApplicationBinding
 * Namespace: http://ci.uchicago.edu/swift/2009/02/swiftscript
 * Java type: org.globus.swift.language.ApplicationBinding
 *
 * Automatically generated - do not modify.
 */
package org.globus.swift.language;


/**
 * An XML ApplicationBinding(@http://ci.uchicago.edu/swift/2009/02/swiftscript).
 *
 * This is a complex type.
 */
public interface ApplicationBinding extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ApplicationBinding.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4846B13C10E24B6C12C8DCBE3348DA75").resolveHandle("applicationbindingd4c3type");
    
    /**
     * Gets the "executable" element
     */
    java.lang.String getExecutable();
    
    /**
     * Gets (as xml) the "executable" element
     */
    org.apache.xmlbeans.XmlString xgetExecutable();
    
    /**
     * Sets the "executable" element
     */
    void setExecutable(java.lang.String executable);
    
    /**
     * Sets (as xml) the "executable" element
     */
    void xsetExecutable(org.apache.xmlbeans.XmlString executable);
    
    /**
     * Gets the "stdin" element
     */
    org.globus.swift.language.UnlabelledUnaryOperator getStdin();
    
    /**
     * True if has "stdin" element
     */
    boolean isSetStdin();
    
    /**
     * Sets the "stdin" element
     */
    void setStdin(org.globus.swift.language.UnlabelledUnaryOperator stdin);
    
    /**
     * Appends and returns a new empty "stdin" element
     */
    org.globus.swift.language.UnlabelledUnaryOperator addNewStdin();
    
    /**
     * Unsets the "stdin" element
     */
    void unsetStdin();
    
    /**
     * Gets the "stdout" element
     */
    org.globus.swift.language.UnlabelledUnaryOperator getStdout();
    
    /**
     * True if has "stdout" element
     */
    boolean isSetStdout();
    
    /**
     * Sets the "stdout" element
     */
    void setStdout(org.globus.swift.language.UnlabelledUnaryOperator stdout);
    
    /**
     * Appends and returns a new empty "stdout" element
     */
    org.globus.swift.language.UnlabelledUnaryOperator addNewStdout();
    
    /**
     * Unsets the "stdout" element
     */
    void unsetStdout();
    
    /**
     * Gets the "stderr" element
     */
    org.globus.swift.language.UnlabelledUnaryOperator getStderr();
    
    /**
     * True if has "stderr" element
     */
    boolean isSetStderr();
    
    /**
     * Sets the "stderr" element
     */
    void setStderr(org.globus.swift.language.UnlabelledUnaryOperator stderr);
    
    /**
     * Appends and returns a new empty "stderr" element
     */
    org.globus.swift.language.UnlabelledUnaryOperator addNewStderr();
    
    /**
     * Unsets the "stderr" element
     */
    void unsetStderr();
    
    /**
     * Gets array of all "abstractExpression" elements
     */
    org.apache.xmlbeans.XmlObject[] getAbstractExpressionArray();
    
    /**
     * Gets ith "abstractExpression" element
     */
    org.apache.xmlbeans.XmlObject getAbstractExpressionArray(int i);
    
    /**
     * Returns number of "abstractExpression" element
     */
    int sizeOfAbstractExpressionArray();
    
    /**
     * Sets array of all "abstractExpression" element
     */
    void setAbstractExpressionArray(org.apache.xmlbeans.XmlObject[] abstractExpressionArray);
    
    /**
     * Sets ith "abstractExpression" element
     */
    void setAbstractExpressionArray(int i, org.apache.xmlbeans.XmlObject abstractExpression);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "abstractExpression" element
     */
    org.apache.xmlbeans.XmlObject insertNewAbstractExpression(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "abstractExpression" element
     */
    org.apache.xmlbeans.XmlObject addNewAbstractExpression();
    
    /**
     * Removes the ith "abstractExpression" element
     */
    void removeAbstractExpression(int i);
    
    /**
     * Gets the "src" attribute
     */
    java.lang.String getSrc();
    
    /**
     * Gets (as xml) the "src" attribute
     */
    org.apache.xmlbeans.XmlString xgetSrc();
    
    /**
     * True if has "src" attribute
     */
    boolean isSetSrc();
    
    /**
     * Sets the "src" attribute
     */
    void setSrc(java.lang.String src);
    
    /**
     * Sets (as xml) the "src" attribute
     */
    void xsetSrc(org.apache.xmlbeans.XmlString src);
    
    /**
     * Unsets the "src" attribute
     */
    void unsetSrc();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.globus.swift.language.ApplicationBinding newInstance() {
          return (org.globus.swift.language.ApplicationBinding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.globus.swift.language.ApplicationBinding newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.globus.swift.language.ApplicationBinding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.globus.swift.language.ApplicationBinding parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.globus.swift.language.ApplicationBinding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.globus.swift.language.ApplicationBinding parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.globus.swift.language.ApplicationBinding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.globus.swift.language.ApplicationBinding parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.globus.swift.language.ApplicationBinding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.globus.swift.language.ApplicationBinding parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.globus.swift.language.ApplicationBinding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.globus.swift.language.ApplicationBinding parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.globus.swift.language.ApplicationBinding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.globus.swift.language.ApplicationBinding parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.globus.swift.language.ApplicationBinding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.globus.swift.language.ApplicationBinding parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.globus.swift.language.ApplicationBinding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.globus.swift.language.ApplicationBinding parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.globus.swift.language.ApplicationBinding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.globus.swift.language.ApplicationBinding parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.globus.swift.language.ApplicationBinding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.globus.swift.language.ApplicationBinding parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.globus.swift.language.ApplicationBinding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.globus.swift.language.ApplicationBinding parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.globus.swift.language.ApplicationBinding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.globus.swift.language.ApplicationBinding parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.globus.swift.language.ApplicationBinding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.globus.swift.language.ApplicationBinding parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.globus.swift.language.ApplicationBinding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.globus.swift.language.ApplicationBinding parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.globus.swift.language.ApplicationBinding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.globus.swift.language.ApplicationBinding parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.globus.swift.language.ApplicationBinding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.globus.swift.language.ApplicationBinding parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.globus.swift.language.ApplicationBinding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
