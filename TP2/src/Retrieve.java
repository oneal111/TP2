
public class Retrieve {
	
	public static<T> Collection<T> Retrieve(Class<T> c, String sql){
		Collection<T> result = new ArrayList();
		/* Run sql query using jdbc. */
		ResultSet res = st.executeQuery(sql);
		ResultSetMetaData resultMeta = res.getMetaData();
		while(res.next()) {
			 for(int i = 1; i <= resultMeta.getColumnCount(); i++)
			 T item = c.newInstance();
			 try {
				 Field f = T.getDeclaredField("etudiant");
	            } catch (SQLException e) {
	                e.printStackTrace();
	            } catch (IllegalAccessException e) {
	                e.printStackTrace();
	            }
			 res.add(item);
			 }
			 return result;
	}
	Collection<etudiant>
	etudiant = retrieve(etudiant.class, "select * from etudiant");

	}

