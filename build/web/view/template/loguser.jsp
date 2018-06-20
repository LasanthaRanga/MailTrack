<%@page import="java.util.Set"%>
<%@page import="org.hibernate.Session"%>
<%

    if (request.getSession().getAttribute("luid") != null) {
        int luid = Integer.parseInt(request.getSession().getAttribute("luid").toString());
        Session hs = conn.NewHibernateUtil.getSessionFactory().openSession();
        try {
            pojo.User lu = (pojo.User) hs.load(pojo.User.class, luid);
            Set pl = lu.getUsercatagory().getPrivileges();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            hs.close();
        }

    }


%>