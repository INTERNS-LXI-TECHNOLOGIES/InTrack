<%@ page language="java" %>
<%@ page import="org.springframework.web.context.WebApplicationContext" %>
<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<%@ page import="java.util.Map" %>

<html>
<head>
    <title>Spring Beans List</title>
</head>
<body>
    <h1>List of Spring Beans and their Types</h1>
    <%
        // Get the Spring ApplicationContext from the servlet context
        WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(application);

        if (context != null) {
            // Get all bean names from the context
            String[] beanNames = context.getBeanDefinitionNames();

            // Loop through each bean and print the bean name and its class type
            for (String beanName : beanNames) {
                Object bean = context.getBean(beanName);
                out.println("<p>Bean Name: " + beanName + " | Bean Class: " + bean.getClass().getName() + "</p>");
            }
        } else {
            out.println("<p>Spring ApplicationContext is not available!</p>");
        }
    %>
</body>
</html>
