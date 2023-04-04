package crud.admin;
import java.io.*; //input/output
import java.util.*; //ArrayList < SomeCollection>, Enumeration 
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

//import Customer and CustomerDB classes 
import crud.business.Customer; 
//import crud.data.CustomerDB;
//servlet mapping for Serviet 3.0
//servlet Customer is mapped to the URL pattern /customerAdmin
//When accessing this servlet, it will return a message.
@WebServlet ("/customerAdmin")
public class CustomerServlet extends HttpServlet
{
@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
{

HttpSession session = request.getSession();
String url = "/index.jsp";
String message = ""; 
String action = null;
String cid = null;
action = request.getParameter("action");

if (request.getParameter("modify_customer") != null)
{
	action = "modify_customer";
	cid = request.getParameter(action);
}

else if (request.getParameter("delete_customer") != null) 
{
	action = "delete_customer";
	cid = request.getParameter(action); 
}
else if (request.getParameter("update_customer") != null) 
{
	action = "update_customer";
	cid = request.getParameter(action);						
}
else
{
	url = "/index.jsp";
}
if (action == null || action.equals("join"))
			{
				url = "/customerform.jsp";   //"join" page						
			}
		//from customers.jsp
		else if (action.equals("modify_customer"))
		{
			//Customer user = CustomerDB.selectCustomer(cid);
			//session.setAttribute("user",user);
			url = "/modify.jsp";
		}
		else if (action.equals("display_customers"))
		{
			//ArrayList<Customer>users= CustomerDB.selectCustomer();
			//request.setAttribute("users",users);
			url = "/customers.jsp";
		}
		else if (action.equals("add_customer"))
		{
			String id_v = request.getParameter(null);
				String firstName_v = request.getParameter("fname");
				String lastName_v = request.getParameter("lname");
				String street_v = request.getParameter("street");
				String city_v = request.getParameter("city");
				String state_v = request.getParameter("state");
				String zip_v = request.getParameter("zip");
				String phone_v = request.getParameter("phone");
				String email_v = request.getParameter("email");
				String balance_v = request.getParameter("balance");
				String totalSales_v = request.getParameter("total_sales");
				String notes_v = request.getParameter("notes");

				Customer user = new Customer(id_v, firstName_v, lastName_v, street_v, city_v, state_v, zip_v, phone_v,
				email_v, balance_v, totalSales_v, notes_v);

				if(!isValidInput(firstName_v, lastName_v, street_v, city_v, state_v, zip_v, phone_v, email_v, balance_v, totalSales_v, notes_v))
				{
					message = "<span style='color: red; background-color: yellow; font-weight: bold; font-variant:small-caps;'>All text boxes required except Notes.</span>";
					url = "/customerform.jsp";
				}
				else
				{
					//CustomerDB.insert(user);
					message = "";
					url = "/thanks.jsp";
				}
				request.setAttribute("user", user);
				request.setAttribute("message", message);
			}
			/* 
		}
		else if (action.equals("update_customer"))
		{
			String firstName_v = request.getParameter("fname");
				String lastName_v = request.getParameter("lname");
				String street_v = request.getParameter("street");
				String city_v = request.getParameter("city");
				String state_v = request.getParameter("state");
				String zip_v = request.getParameter("zip");
				String phone_v = request.getParameter("phone");
				String email_v = request.getParameter("email");
				String balance_v = request.getParameter("balance");
				String totalSales_v = request.getParameter("total_sales");
				String notes_v = request.getParameter("notes");
				
				if(!isValidInput(firstName_v, lastName_v, street_v, city_v, state_v, zip_v, phone_v, email_v, balance_v, totalSales_v, notes_v))
				{
					url = "/modify.jsp";
				}
				else
				{
					Customer user = (Customer) session.getAttribute("user");

					user.setId(cid); //cid retrieved from request.getParameter(action);
						user.setFname(firstName_v);
						user.setLname(lastName_v);
						user.setStreet(street_v);
						user.setCity(city_v);
						user.setState(state_v);
						user.setZip(zip_v);
						user.setPhone(phone_v);
						user.setEmail(email_v);
						user.setBalance(balance_v);
						user.setTotalSales(totalSales_v);
						user.setNotes(notes_v);
						
						CustomerDB.update(user);

						ArrayList<Customer>users = CustomerDB.selectCustomers();
						request.setAttribute("users", users);
						url = "/customers.jsp";
				}
		}
		*/
		else if (action.equals("delete_customer"))
		{
			//Customer user = CustomerDB.selectCustomer(cid);

			//CustomerDB.delete(user);

			//ArrayList<Customer>users=CustomerDB.selectCustomers();
			//request.setAttribute("users", users);

			url = "/customers.jsp";
		}
		getServletContext()
		.getRequestDispatcher(url)
		.forward(request, response);
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doPost(request,response);
	}

	private boolean isValidInput(String firstName_p, String lastName_p, String street_p, String city_p, String state_p, String zip_p,
	String phone_p, String email_p, String balance_p, String totalSales_p, String notes_p)
	{
		if (
			firstName_p == null ||
				lastName_p == null ||
				street_p == null ||
				city_p == null ||
				state_p == null ||
				zip_p == null ||
				phone_p == null ||
				email_p == null ||
				balance_p == null ||
				totalSales_p == null ||
								
				firstName_p.isEmpty() ||
				lastName_p.isEmpty() ||
				street_p.isEmpty() || 
				city_p.isEmpty() || 
				state_p.isEmpty() || 
				zip_p.isEmpty() || 
				phone_p.isEmpty() || 
				email_p.isEmpty() ||
				balance_p.isEmpty() || 
				totalSales_p.isEmpty()
		)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
}
