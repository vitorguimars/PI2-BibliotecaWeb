/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filtro;

import bean.LoginMB;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author vitor
 */
@WebFilter(filterName = "FiltroAcessoAdmin", urlPatterns = {"/faces/admin2/*"})
public class FiltroPrincipal implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
        
        System.out.println("Verificando acesso do admin!");
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;
        LoginMB auth = (LoginMB) req.getSession().getAttribute("loginMB");
        if(auth!=null && auth.estaLogado() && auth.eAdmin())
            chain.doFilter(request, response);
        else
            resp.sendRedirect(req.getContextPath()+"/faces/login.xhtml");
    }

    @Override
    public void destroy() {
    }

    @Override
    public void init(FilterConfig filterConfig) {
    }

}

