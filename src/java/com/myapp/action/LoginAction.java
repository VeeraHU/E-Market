/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.action;

import com.myapp.actionForm.LoginActionForm;
import com.myapp.DaoIN.LoginDaoImpl;
import com.myapp.Dao.LoginDAO;
import com.myapp.javaclasses.LoginBean;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author trainee
 */
public class LoginAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";
    private static final String NOTSUCCESS = "notsuccess";
    private static final String SUCCESS1 = "success1";
    private static final String SUCCESS2 = "success2";

    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        LoginActionForm laf = (LoginActionForm) form;
        LoginBean lb = new LoginBean();

        lb.setUserName(laf.getUserName());
        lb.setPassword(laf.getPassword());

        //  InsertUserDetails iud = new InsertUserDetails();
        LoginDaoImpl iud = new LoginDAO();
        int userId = iud.loginUser(lb);
        int roleId = lb.getRoleId();
        String name = iud.name(lb);
        HttpSession hs = request.getSession();
        hs.setAttribute("id", userId);
        hs.setAttribute("name", lb.getUserName());
        hs.setAttribute("name", name);
        hs.setAttribute("role", lb.getRoleId());

        System.out.println("++++++++++++@@@@@@@@@@"+lb.getRoleId());
        

        if (roleId == 5) {
            return mapping.findForward(SUCCESS1);
        }else if(roleId == 6){
            return mapping.findForward(SUCCESS2);

        } else if (userId != 0) {
            request.setAttribute("userId", userId);
            return mapping.findForward(SUCCESS);
        } else {
            request.setAttribute("msg1", "Authentication Failed");
            return mapping.findForward(NOTSUCCESS);
        }



    }
}
