import java.sql.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class MenuPanel implements ActionListener
{
	Container c;
	JTextField id,name,email,id_del,id_up,name_up,email_up,id_search;
	CardLayout card;
	MenuPanel()
	{
		//menu bar
		JFrame f = new JFrame("menu demo");
		f.setSize(300,300);
		JMenuBar jmb = new JMenuBar();
		f.setJMenuBar(jmb);
		JMenu file = new JMenu("Crud Operation");
		JMenuItem item;
		
		file.add(item = new JMenuItem("Insert"));
		item.addActionListener(this);
		item.setAccelerator(KeyStroke.getKeyStroke('I',Event.CTRL_MASK));
		
		file.add(item = new JMenuItem("Update"));
		item.addActionListener(this);
		item.setAccelerator(KeyStroke.getKeyStroke('U',Event.CTRL_MASK));
		
		file.addSeparator();
		file.add(item = new JMenuItem("Delete"));
		item.addActionListener(this);
		item.setAccelerator(KeyStroke.getKeyStroke('D',Event.CTRL_MASK));
		
		jmb.add(file);
		
		// create all panel
		{
			card=new CardLayout(40,30);  
			c = new Container();
			c.setLayout(card);  
			
			JButton b1=new JButton("insert");  
			JButton b2=new JButton("update");  
			JButton b3=new JButton("delete");  
			JButton b4=new JButton("search");
			
			b1.addActionListener(this);  
			b2.addActionListener(this);  
			b3.addActionListener(this);  
			b4.addActionListener(this);
				  
			JPanel insert = new JPanel();
			JPanel update = new JPanel();
			JPanel delete = new JPanel();
			JPanel search = new JPanel();
			
			// create insert panel
			{
				id = new JTextField(10);
				name = new JTextField(10);
				email = new JTextField(10);
				
				JLabel l_id = new JLabel("Student Id");
				JLabel l_name = new JLabel("Student Name");
				JLabel l_email = new JLabel("Student Email");
				
				insert.add(l_id);
				insert.add(id);
				insert.add(l_name);
				insert.add(name);
				insert.add(l_email);
				insert.add(email);
				
			}
			// create delete panel
			{
				id_del = new JTextField(10);
				JLabel l_id = new JLabel("Student id");
				
				delete.add(l_id);
				delete.add(id_del);
				
			}
			
			// search panel
			{
				
				id_search = new JTextField(10);
				JLabel l_id = new JLabel("Existing Student id");
				
				search.add(l_id);
				search.add(id_search);
				
				
			}
			
			// update panel
			{
				
				id_up = new JTextField(10);
				name_up = new JTextField(10);
				email_up = new JTextField(10);
				
				JLabel l_id_new = new JLabel("Student Id");
				JLabel l_name = new JLabel("Student Name");
				JLabel l_email = new JLabel("Student Email");
				
				update.add(l_id_new);
				update.add(id_up);
				update.add(l_name);
				update.add(name_up);
				update.add(l_email);
				update.add(email_up);
				
				
			}
			
			// insert all panel in frame
			insert.add(b1);
			search.add(b4);
			update.add(b2);
			delete.add(b3);
			c.add("ins",insert);
			c.add("sea",search);
			c.add("upd",update);
			c.add("del",delete); 
				
			
		}
		
		f.add(c);
		f.setVisible(true);

	}
	
	//implement click event
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand() == "Insert")
		{
			System.out.println("11");
			//insertstudent();
			id.setText("");
			name.setText("");
			email.setText("");
			card.show(c,"ins");
		}
		else if(e.getActionCommand() == "Delete")
		{
			//deletestudent();
			id_del.setText("");
			card.show(c,"del");
		}
		else if(e.getActionCommand() == "Search")
		{
			searchstudent();
			//card.show(c,"upd");
		}
		else if(e.getActionCommand() == "Update")
		{
			card.show(c,"sea");
			//searchstudent();
			//updatestudent();
			//card.show(c,"sea");
		}
		else if(e.getActionCommand() == "insert")
		{
			System.out.println("11");
			insertstudent();
			id.setText("");
			name.setText("");
			email.setText("");
			//card.show(c,"ins");
		}
		else if(e.getActionCommand() == "delete")
		{
			deletestudent();
			id_del.setText("");
			card.show(c,"del");
		}
		else if(e.getActionCommand() == "search")
		{
			searchstudent();
			card.show(c,"upd");
		}
		else if(e.getActionCommand() == "update")
		{
			id_search.setText("");
			card.show(c,"sea");
			updatestudent();
			//card.show(c,"sea");
		}


		//card.next(c);
		
	}
	
	//insert new data
	public void insertstudent() 
	{
		try 
		{
			DBConnection d = new DBConnection();
		   Statement st1 = d.con.createStatement();
		   PreparedStatement st = d.con.prepareStatement("insert into student_details values(?,?,?)");
		   Integer x = Integer.valueOf(id.getText());
			st.setInt(1,x);
			st.setString(2,name.getText());
			st.setString(3,email.getText());
			st.executeUpdate();
			System.out.println("insert successfully ........");
			d.con.close();
		} 
		catch (SQLException e) 
		{
		   System.out.println(e.toString());
		}
	}
	
	//delete existing data
	public void deletestudent() 
	{
		try 
		{
			DBConnection d = new DBConnection();
		   Statement st1 = d.con.createStatement();
		   PreparedStatement st = d.con.prepareStatement("delete from student_details where stu_id = ?");
		   Integer x = Integer.valueOf(id_del.getText());
			System.out.println(x);
			st.setInt(1,x);
			st.executeUpdate();
			System.out.println("delete successfully ........");
			d.con.close();
		} 
		 
		catch (SQLException e) 
		{
		   System.out.println(e.toString());
		}
	}
	
	//search existing data
	public void searchstudent()
	{
		try
		{
			DBConnection d = new DBConnection();
			
		   	Statement st = d.con.createStatement();
			
		    Integer x = Integer.valueOf(id_search.getText());
			System.out.println(x);
			String query = "select * from student_details where stu_id = "+x;
		    System.out.println(x);
			ResultSet rs = st.executeQuery(query);
			
			System.out.println("id   name   email");
			   while (rs.next()) 
			   {
				    Integer id =rs.getInt("stu_id");
					String s = id.toString();
					
					String name = rs.getString("stu_name");
					String email = rs.getString("stu_email");
					
					System.out.println(" id : "+id+" name :"+name + " email : "+email);
					
					id_up.setText(id.toString());
					name_up.setText(name);
					email_up.setText(email);
			   }
		}
		catch(SQLException e)
		{
			System.out.println(e.toString());
		}
	}
	
	
	// update function
	public void updatestudent()
	{
		try
		{
			DBConnection d = new DBConnection();
			System.out.println("11111");
			Integer x = Integer.valueOf(id_up.getText());
			PreparedStatement st = d.con.prepareStatement("update student_details set stu_name = ? , stu_email = ? where stu_id = ? ");
			System.out.println("11111");
			st.setString(1,name_up.getText());
			st.setString(2,email_up.getText());
			st.setInt(3,x);
			System.out.println("11111");
			st.executeUpdate();
			System.out.println(" id : "+x+" name :"+name_up.getText() + " email : "+email_up.getText());
			System.out.println("update successfully ........");
		}
		catch(SQLException e)
		{
			System.out.println(e.toString());
		}
	}
	
	
	public static void main(String args[])
	{
		new MenuPanel();
	}
}