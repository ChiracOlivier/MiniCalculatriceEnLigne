
<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8" />
  <title>Inscription</title>
  <link type="text/css" rel="stylesheet" href="style.css" />
</head>
<body>
<form method="post" action="Servlet">
  <fieldset>
    <legend>Calculatrice</legend>
    <p>${ calculator.a ? 'Entrez vos nombres!!!': 'Rien'} </p>

    <label for="nombre1">Nombre1 </label>
    <input type="number" id="nombre1" name="nombre1" value="<c:out value=""/>" size="20" maxlength="60" />
    <span class="erreur">${form.erreurs['nombre1']}</span>
    <span> ${ calculator.signe}</span>

    <label for="nombre2">Nombre2 </label>
    <input type="number" id="nombre2" name="nombre2" value="" size="20" maxlength="20" />
    <span class="erreur">${form.erreurs['nombre2']}</span>



    <input type="submit" value="GO" class="sansLabel" />
    <br />

    <p class="${empty form.erreurs ? 'succes' : 'erreur'}">${form.resultat}</p>
  </fieldset>
</form>
</body>
</html>
