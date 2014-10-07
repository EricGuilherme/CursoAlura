<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
     <%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

            <html:html>
                <head>
                    <title>Sistema de Teste do Struts</title>
                </head>

                <html:errors/>

                <html:form action="/novoContato" focus="contato.nome">
                    Nome:
                        <html:text  property="contato.nome"/>
                        <br/>

                    Email: 
                        <html:text  property="contato.email"/>
                        <br/>

                    Endereço: 
                        <html:text  property="contato.endereco"/>
                        <br/>

                        <html:submit>Enviar dados</html:submit>
                    <br/>
                </html:form>
            </html:html>
