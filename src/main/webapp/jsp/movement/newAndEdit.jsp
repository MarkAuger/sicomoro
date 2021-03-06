<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><spring:message code="movement.edit.title" /></title>
<script type="text/javascript" src="/sicomoro/js/controller/movement.js"></script>
</head>
<body>
	<form:form acceptCharset="UTF-8" action="save.html" commandName="movementForm">
		<form:hidden path="movement.idMovement" />
		<div class="span-12">
			<form:label path="movement.amount">
				<spring:message code="movement.form.amount" />
			</form:label>
		</div>
		<div class="span-12 last">
			<form:label path="movementType">
				<spring:message code="movement.form.type" />
			</form:label>
		</div>
		<div class="span-12">
			<form:input cssClass="decimal" path="movement.amount" />
		</div>
		<div class="span-12 last">
			<form:select path="movementType">
				<form:options items="${movementTypes}" />
			</form:select>
		</div>
		<!-- Segunda Línea -->
		<div class="span-12">
			<form:label path="movement.movementDate">
				<spring:message code="movement.form.date" />
			</form:label>
		</div>
		<div class="span-12 last">
			<form:label cssClass="contributor hide" path="movement.idContributor">
				<spring:message code="movement.form.contributor" />
			</form:label>
		</div>
		<div class="span-12">
			<form:input class="date" path="movement.movementDate" />
		</div>
		<div class="span-12 last">
			<form:select cssClass="contributor hide" path="movement.idContributor"></form:select>
		</div>
		<!-- Tercera linea -->
		<div class="span-12 append-12 last">
			<form:label path="movement.description">
				<spring:message code="form.description" />
			</form:label>
		</div>
		<div class="span-24 last">
			<form:textarea path="movement.description"></form:textarea>
		</div>

		<div class="span-16 append-8 last">
			<form:button>
				<spring:message code="form.save" />
			</form:button>
		</div>

	</form:form>
</body>
</html>