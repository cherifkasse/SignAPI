package net.gainde2000.cf.entity;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import come.example.signapi.model.InfosRetour;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GestBD {

	Properties prop = null;
	Logger log = null;
	protected Connection conn = null;

	public GestBD() {
		log = LogManager.getLogger(GestBD.class);
		log.debug("GestBD class constructor");
		try (InputStream input = Registration.class.getClassLoader().getResourceAsStream("config.properties")) {

			prop = new Properties();

			if (input == null) {
				System.out.println("Sorry, unable to find config.properties");
				log.error("Sorry, unable to find config.properties");
				return;
			}
			// load a properties file from class path, inside static method
			prop.load(input);

		} catch (IOException ex) {
			StringWriter sw = new StringWriter();
			ex.printStackTrace(new PrintWriter(sw));
			String exceptionAsString = sw.toString();
			log.error(exceptionAsString);
		}
	}

	protected void OpenConnection() {

		try {
			Class.forName("org.sqlite.JDBC");
			// db parameters
			String url = "jdbc:sqlite:" + prop.getProperty("reposbd");
			// create a connection to the database
			conn = DriverManager.getConnection(url);

			System.out.println("Connection to SQLite has been established.");
			log.info("Connection to SQLite has been established.");

		} catch (SQLException e) {
			log.error(e.getMessage());
			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw));
			String exceptionAsString = sw.toString();
			log.error(exceptionAsString);
		} catch (Exception ex) {
			log.error(ex.getMessage());
			StringWriter sw = new StringWriter();
			ex.printStackTrace(new PrintWriter(sw));
			String exceptionAsString = sw.toString();
			log.error(exceptionAsString);

		}
	}

	protected void CloseConnection() {

		try {
			if (!conn.isClosed()) {
				conn.close();
			}

		} catch (SQLException e) {
			log.error(e.getMessage());
			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw));
			String exceptionAsString = sw.toString();
			log.error(exceptionAsString);
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException ex) {
				log.error(ex.getMessage());
				StringWriter sw = new StringWriter();
				ex.printStackTrace(new PrintWriter(sw));
				String exceptionAsString = sw.toString();
				log.error(exceptionAsString);
			}
		}
	}

	public int Insert_Utilisateur(Utilisateur utseur) {
		PreparedStatement stmt;
		try {
			String datedujour = getUTCdatetimeAsString();
			StringBuilder sql = new StringBuilder(
					"INSERT INTO BENEFICIAIRES (enrID, PrenomNom, delegationid, SignatureKey, Passphrase, CNID, comments, Datecreation, Dateexpiration) ");
			/******************************************
			sql.append(String.format("VALUES (null, '%1$s',", utseur.getPrenom_Nom()))
					.append(String.format("%1$d,", utseur.getDelegationId()))
					.append(String.format("'%1$s',", utseur.getSignature_Key()))
					.append(String.format("'%1$s',", utseur.getActivation_Code()))
					.append(String.format("'%1$s',", utseur.getNumeroCNID()))
					.append(String.format("'TrustedApplication=%1$s',", utseur.getTrustedApplication()))
					.append(String.format("'%1$s',", datedujour))
					.append(String.format("'%1$s');", utseur.getDateExpiration_certificate() == null ? datedujour
							: utseur.getDateExpiration_certificate()));
			***********************/

			String sqlParam = "INSERT INTO BENEFICIAIRES (enrID, PrenomNom, delegationid, SignatureKey, Passphrase, CNID, comments, Datecreation, Dateexpiration) VALUES (null,?, ?, ?,?, ?, ?, ?, ?)";
			stmt = conn.prepareStatement(sqlParam);

			stmt.setString(1, String.format("%1$s", utseur.getPrenom_Nom()));
			stmt.setInt(2, Integer.parseInt(String.format("%1$d", utseur.getDelegationId())));
			stmt.setString(3, String.format("%1$s", utseur.getSignature_Key()));
			stmt.setString(4, String.format("%1$s", utseur.getActivation_Code()));
			stmt.setString(5, String.format("%1$s", utseur.getNumeroCNID()));
			stmt.setString(6, String.format("TrustedApplication=%1$s", utseur.getTrustedApplication()));
			Date utilDate=new Date();
			try {
				utilDate = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").parse(String.format("%1$s", datedujour));
			} catch (ParseException e) {
				//utilDate= new Date();
			}
			//stmt.setDate(7, new java.sql.Date(utilDate.getTime()));
			stmt.setLong(7,utilDate.getTime());
			
			//String strDate="";
			try {
				utilDate = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").parse(String.format("%1$s", (utseur.getDateExpiration_certificate()==null)? datedujour:utseur.getDateExpiration_certificate()));
			    //SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");  
			    //strDate= formatter.format((utseur.getDateExpiration_certificate()==null)? datedujour:utseur.getDateExpiration_certificate()); 
			} catch (ParseException e) {
				//utilDate= new Date();
			}
			
			//java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
			//stmt.setDate(8,sqlDate);
			stmt.setLong(8, utilDate.getTime());


			stmt.executeUpdate();

			log.debug(sqlParam+"DelegationId:"+utseur.getDelegationId()+" "+utseur.getPrenom_Nom());
			
			stmt.close();
			conn.close();
		} catch (SQLException ex) {
			log.error(ex.getMessage());
			StringWriter sw = new StringWriter();
			ex.printStackTrace(new PrintWriter(sw));
			String exceptionAsString = sw.toString();
			log.error(exceptionAsString);
		}

		return 1;
	}

	public int Insert_Operation(Utilisateur utseur) {
		PreparedStatement stmt;
		try {

			String datedujour = getUTCdatetimeAsString();
			StringBuilder sql = new StringBuilder(
					"INSERT INTO OPERATIONS (opID, delegationid,SignatureKey,Datesignature) ");
			/************************************
			sql.append("VALUES (null,").append(String.format("%1$d,", utseur.getDelegationId()))
					.append(String.format("'%1$s',", utseur.getSignature_Key()))
					.append(String.format("'%1$s');", datedujour));
			********************************/

			String sqlParam = "INSERT INTO OPERATIONS (opID, delegationid,SignatureKey,Datesignature) VALUES (null,?, ?, ?)";
			stmt = conn.prepareStatement(sqlParam);
			stmt.setInt(1, Integer.parseInt(String.format("%1$d", utseur.getDelegationId())));
			stmt.setString(2, String.format("%1$s", utseur.getSignature_Key()));
			Date utilDate=new Date();
			try {
				//utilDate = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").parse(String.format("%1$s", datedujour));
				utilDate = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").parse(String.format("%1$s", datedujour));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//stmt.setDate(3, new java.sql.Date(utilDate.getTime()));
			stmt.setLong(3, utilDate.getTime());

			stmt.executeUpdate();

			stmt.close();
			conn.close();
		} catch (SQLException ex) {
			log.error(ex.getMessage());
			StringWriter sw = new StringWriter();
			ex.printStackTrace(new PrintWriter(sw));
			String exceptionAsString = sw.toString();
			log.error(exceptionAsString);
		}

		return 1;
	}

	public String Recherche_Un_Utilisateur(long utseurID) {
		PreparedStatement stmt;
		String resultat = "";
		try {
			String sqlParam = "SELECT SignatureKey FROM BENEFICIAIRES WHERE delegationid = ?";
			stmt = conn.prepareStatement(sqlParam);
			stmt.setInt(1, Integer.parseInt(String.format("%1$d", utseurID)));

			ResultSet rs = stmt.executeQuery();
			if (rs.first()) {
				resultat = rs.getString("SignatureKey");
			}

			stmt.close();
			conn.close();

			return resultat;

		} catch (SQLException ex) {
			log.error(ex.getMessage());
			StringWriter sw = new StringWriter();
			ex.printStackTrace(new PrintWriter(sw));
			String exceptionAsString = sw.toString();
			log.error(exceptionAsString);
		}

		return resultat;
	}
	public List<InfosRetour> Recherche_Un_Utilisateur2(long utseurID) {
		PreparedStatement stmt;
		String statut = "";
		List<InfosRetour> retour_infos=new ArrayList<InfosRetour>();
		InfosRetour info=new InfosRetour();
		try {
			String sqlParam = "SELECT SignatureKey,comments,delegationid FROM BENEFICIAIRES WHERE delegationid = ?";
			stmt = conn.prepareStatement(sqlParam);
			stmt.setInt(1, Integer.parseInt(String.format("%1$d", utseurID)));

			ResultSet rs = stmt.executeQuery();
			if (rs.next()){
				statut="SUCCESS";
				info.setCle_signataire(rs.getString("SignatureKey"));
				info.setStatus(statut);
				info.setId_app(rs.getString("comments"));
				info.setId_user(rs.getString("SignatureKey"));
				retour_infos.add(info);

			}

			stmt.close();
			conn.close();

			return retour_infos;

		} catch (SQLException ex) {
			log.error(ex.getMessage());
			StringWriter sw = new StringWriter();
			ex.printStackTrace(new PrintWriter(sw));
			String exceptionAsString = sw.toString();
			log.error(exceptionAsString);
		}
		statut="ECHEC";
		retour_infos.add(info);
		return retour_infos;
	}

	public String Rechercher__Un_Utilisateur(long utseurID) {
		PreparedStatement stmt;
		String resultat = "";
		try {
			String sqlParam = "SELECT SignatureKey, Passphrase,comments FROM BENEFICIAIRES WHERE delegationid = ?";
			stmt = conn.prepareStatement(sqlParam);
			stmt.setInt(1, Integer.parseInt(String.format("%1$d", utseurID)));

			log.info(sqlParam+Integer.parseInt(String.format("%1$d", utseurID)));
			
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				resultat = rs.getString("SignatureKey");
				log.info("resultat1:"+resultat);
				resultat +="|"+ rs.getString("Passphrase");
				log.info("resultat2:"+resultat);
				resultat +="|"+ rs.getString("comments");
				log.info("resultat3:"+resultat);
			}

			stmt.close();
			conn.close();

			return resultat;

		} catch (SQLException ex) {
			log.error(ex.getMessage());
			StringWriter sw = new StringWriter();
			ex.printStackTrace(new PrintWriter(sw));
			String exceptionAsString = sw.toString();
			log.error(exceptionAsString);
		}

		return resultat;
	}
	
	public long Rechercher_Un_Utilisateur_avec_CNI(String sCNI, String leNomPrenom) {
		PreparedStatement stmt;
		long resultat = 0;
		try {
			String sqlParam = "SELECT delegationid FROM BENEFICIAIRES WHERE CNID = ? and PrenomNom = ?";
			stmt = conn.prepareStatement(sqlParam);
			stmt.setString(1, sCNI);
			stmt.setString(2, leNomPrenom);

			log.debug("SELECT delegationid FROM BENEFICIAIRES WHERE CNID ="+sCNI);
			log.debug(" and PrenomNom = "+leNomPrenom);
			
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				resultat = rs.getLong("delegationid");
				log.debug("delegationid:"+resultat);
			}

			stmt.close();
			conn.close();

			return resultat;

		} catch (SQLException ex) {
			log.error(ex.getMessage());
			StringWriter sw = new StringWriter();
			ex.printStackTrace(new PrintWriter(sw));
			String exceptionAsString = sw.toString();
			log.error(exceptionAsString);
		}

		return resultat;
	}
	
	
	
	private String getUTCdatetimeAsString() {
		final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
		final String utcTime = sdf.format(new Date());

		return utcTime;
	}

}
