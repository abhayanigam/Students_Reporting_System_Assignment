<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Add Student</title>
    </head>
    <body>
        <c:if test="${addStudentSuccess}">
            <div>Successfully added Student</div>
        </c:if>

        <c:url var="add_marks_url" value="/marks/addMarks"/>
        <form:form action="${add_marks_url}" method="post" modelAttribute="marks">


            <form:label path="studentName">Student Name : </form:label> <form:input type="text" path="studentName" />
            <form:label path="studentId">Student Id : </form:label> <form:input  type="hidden" path="studentId"/>

            <form:label path="marks">Marks : </form:label> <form:input type="text" path="marks" />

            <select name="semester">
                <option value="First">First</option>
                <option value="Second">Second</option>
              </select>

              <select name="Subject">
               <option value="English">English</option>
               <option value="Science">Science</option>
               <option value="Maths">Maths</option>
            </select>

            <input type="submit" value="submit"/>
        </form:form>
    </body>
</html>