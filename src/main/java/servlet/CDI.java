/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servlet;

import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * @author akiba-chan
 * origin: https://cloudear.jp/blog/?p=1945
 */
@WebServlet(urlPatterns = "/cdi-sample")
public class CDI extends HttpServlet {

    @Inject
    ScopedService scopedService;

    @Override
    protected void doGet(final HttpServletRequest pReq, final HttpServletResponse pResp) throws ServletException, IOException {
        this.scopedService.countUp();
        this.scopedService.countUp();
        pResp.setContentType("text/plain");
        pResp.getWriter().println("Counter Value -> " + this.scopedService.getCounter());
    }
}