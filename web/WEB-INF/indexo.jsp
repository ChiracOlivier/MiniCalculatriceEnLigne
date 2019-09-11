<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <title>Calculatrice En Ligne</title>
    <link type="text/css" rel="stylesheet" href="style2.css" />
</head>
<body>
<form method="post" action="Servlet">
    <fieldset>
        <legend>Calculatrice</legend>
        <p> Resultat de l'operation : <c:out value="${nombre1}"/> ${operation} <c:out value="${nombre2}"/> = ${resultatCompl}. </p>

        <input type="number" id="nombre1" name="nombre1" placeholder="1er nombre" value="" size="20" maxlength="20" />

        <select id="operation" name="operation" required autofocus  >
            <option value='+'> + </option>
            <option value='-'> - </option>
            <option value='*'> * </option>
            <option value="/"> / </option>
        </select>

        <input type="number" id="nombre2" name="nombre2" placeholder="2ème nombre" value="" size="20" maxlength="20" />

        <input type="submit" value="ENVOYER" class="sansLabel" />
        </br>
        <p> En ce moment, il est ${heure} (heure de Bruxelles).</p>
    </fieldset>
</form>
</body>
</html>
