package com.calculadoraimc;

import java.io.IOException;
//import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/calcular-imc")
public class CalculadoraIMCServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    double peso = 0;
    double altura = 0;
    double imc = 0;
    String classificacao = "";

    try {
        peso = Double.parseDouble(request.getParameter("peso"));
        altura = Double.parseDouble(request.getParameter("altura"));
        imc = peso / (altura * altura);

        if (imc < 18.5) {
            classificacao = "Abaixo do peso";
        } else if (imc >= 18.5 && imc < 24.9) {
            classificacao = "Peso normal";
        } else if (imc >= 25 && imc < 29.9) {
            classificacao = "Sobrepeso";
        } else {
            classificacao = "Obesidade";
        }
    } catch (NumberFormatException e) {
        classificacao = "Entrada inválida. Por favor, insira valores numéricos para peso e altura.";
    }
    request.setAttribute("imc", imc);
    request.setAttribute("classificacao", classificacao);
    request.getRequestDispatcher("resultado.jsp").forward(request, response);
    }
}