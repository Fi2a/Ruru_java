package control;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class BoardControoler
 */
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		active(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		active(request, response);
		
		
	}
	
	private void active(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String url = request.getRequestURI();
		String cmd = url.substring( url.lastIndexOf("/") + 1 );
		System.out.println( cmd );
		
		String view = "/WEB-INF/views/board/";
		
		if ( cmd.equals("list") ) { // 게시판 목룍 페이지 요청 - /jsp2/board/list
			view += "list.jsp";
		}else if( cmd.equals("write") ) { // 게시판 작성 페이지 요청 - /jsp2/board/write
			view += "write.jsp";
		}else if( cmd.equals("save") ) { // 게시판 저장 요청 - /jsp2/board/save
			view = null;
		}
		
		if( view != null ) {
			// getRequestDispatcher() 메서드 안에 보여줄 페이지를 모든경로 작성
			RequestDispatcher rd = request.getRequestDispatcher(view);
			rd.forward(request, response);
		} else {
			response.sendRedirect("/jsp2/board/list");
		}
		
		
		
		
		
		// getRequestDispatcher() 메서드 안에 보여줄 페이지를 모든경로 작성
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/board/list.jsp");
		rd.forward(request, response);
		
	}
	
}








