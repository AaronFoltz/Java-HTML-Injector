
package injector;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Java_HTML_InjectorServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {

		// Set the response type
		resp.setContentType("text/html");

		// Get the writer to write the HTML
		PrintWriter out = resp.getWriter();

		// HTML code for the presentation layer
		out.println("<form name=\"input\" action=\"html_form_action.asp\" method=\"post\"> "
				+
				"HTML code to Inject: <br><br> <textarea name=\"code\" cols=\"100\" rows=\"20\">Enter your code here...</textarea>"
				+
				"<br><input type=\"submit\" value=\"Submit\" />" +
				"</form>");
	}
}
