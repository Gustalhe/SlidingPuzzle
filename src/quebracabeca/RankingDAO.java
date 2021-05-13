/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quebracabeca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Gustavo
 */
public class RankingDAO {

    //////////////////////////////Facil/////////////////////////////
    public static int segundosPrimeiroLetrasFacil = 65;
    public static int segundosSegundoLetrasFacil = 65;
    public static int segundosTerceiroLetrasFacil = 65;
    public static int minutosPrimeiroLetrasFacil = 65;
    public static int minutosSegundoLetrasFacil = 65;
    public static int minutosTerceiroLetrasFacil = 65;
    public static int milisegPrimeiroLetraFacil = 1005;
    public static int milisegSegundoLetraFacil = 1005;
    public static int milisegTerceiroLetraFacil = 1005;

    public static int segundosPrimeiroNumeroFacil = 65;
    public static int segundosSegundoNumeroFacil = 65;
    public static int segundosTerceiroNumeroFacil = 65;
    public static int minutosPrimeiroNumeroFacil = 65;
    public static int minutosSegundoNumeroFacil = 65;
    public static int minutosTerceiroNumeroFacil = 65;
    public static int milisegPrimeiroNumeroFacil = 1005;
    public static int milisegSegundoNumeroFacil = 1005;
    public static int milisegTerceiroNumeroFacil = 1005;

    public static int segundosPrimeiroImagemFacil = 65;
    public static int segundosSegundoImagemFacil = 65;
    public static int segundosTerceiroImagemFacil = 65;
    public static int minutosPrimeiroImagemFacil = 65;
    public static int minutosSegundoImagemFacil = 65;
    public static int minutosTerceiroImagemFacil = 65;
    public static int milisegPrimeiroImagemFacil = 1005;
    public static int milisegSegundoImagemFacil = 1005;
    public static int milisegTerceiroImagemFacil = 1005;

//////////////////////////////Medio/////////////////////////////
    public static int segundosPrimeiroLetrasMedio = 65;
    public static int segundosSegundoLetrasMedio = 65;
    public static int segundosTerceiroLetrasMedio = 65;
    public static int minutosPrimeiroLetrasMedio = 65;
    public static int minutosSegundoLetrasMedio = 65;
    public static int minutosTerceiroLetrasMedio = 65;
    public static int milisegPrimeiroLetrasMedio = 1005;
    public static int milisegSegundoLetrasMedio = 1005;
    public static int milisegTerceiroLetrasMedio = 1005;

    public static int segundosPrimeiroNumeroMedio = 65;
    public static int segundosSegundoNumeroMedio = 65;
    public static int segundosTerceiroNumeroMedio = 65;
    public static int minutosPrimeiroNumeroMedio = 65;
    public static int minutosSegundoNumeroMedio = 65;
    public static int minutosTerceiroNumeroMedio = 65;
    public static int milisegPrimeiroNumeroMedio = 1005;
    public static int milisegSegundoNumeroMedio = 1005;
    public static int milisegTerceiroNumeroMedio = 1005;

    public static int segundosPrimeiroImagemMedio = 65;
    public static int segundosSegundoImagemMedio = 65;
    public static int segundosTerceiroImagemMedio = 65;
    public static int minutosPrimeiroImagemMedio = 65;
    public static int minutosSegundoImagemMedio = 65;
    public static int minutosTerceiroImagemMedio = 65;
    public static int milisegPrimeiroImagemMedio = 1005;
    public static int milisegSegundoImagemMedio = 1005;
    public static int milisegTerceiroImagemMedio = 1005;

    ///////////////////////////Dificil///////////////////////////
    public static int segundosPrimeiroLetrasDificil = 65;
    public static int segundosSegundoLetrasDificil = 65;
    public static int segundosTerceiroLetrasDificil = 65;
    public static int minutosPrimeiroLetrasDificil = 65;
    public static int minutosSegundoLetrasDificil = 65;
    public static int minutosTerceiroLetrasDificil = 65;
    public static int milisegPrimeiroLetrasDificil = 1005;
    public static int milisegSegundoLetrasDificil = 1005;
    public static int milisegTerceiroLetrasDificil = 1005;

    public static int segundosPrimeiroNumeroDificil = 65;
    public static int segundosSegundoNumeroDificil = 65;
    public static int segundosTerceiroNumeroDificil = 65;
    public static int minutosPrimeiroNumeroDificil = 65;
    public static int minutosSegundoNumeroDificil = 65;
    public static int minutosTerceiroNumeroDificil = 65;
    public static int milisegPrimeiroNumeroDificil = 1005;
    public static int milisegSegundoNumeroDificil = 1005;
    public static int milisegTerceiroNumeroDificil = 1005;

    public static int segundosPrimeiroImagemDificil = 65;
    public static int segundosSegundoImagemDificil = 65;
    public static int segundosTerceiroImagemDificil = 65;
    public static int minutosPrimeiroImagemDificil = 65;
    public static int minutosSegundoImagemDificil = 65;
    public static int minutosTerceiroImagemDificil = 65;
    public static int milisegPrimeiroImagemDificil = 1005;
    public static int milisegSegundoImagemDificil = 1005;
    public static int milisegTerceiroImagemDificil = 1005;

    public void letraEasy() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbJoguinho", "root", "");
            Statement stm = conn.createStatement();

            ResultSet rs = stm.executeQuery("SELECT tbJogador.posicao, tbJogador.min, tbJogador.seg, tbJogador.miliseg FROM tbJogador where tbJogador.tipo = 'LF';");

            if (!rs.wasNull()) {
                while (rs.next()) {

                    if (rs.getInt("posicao") == 1) {
                        segundosPrimeiroLetrasFacil = rs.getInt("seg");
                        minutosPrimeiroLetrasFacil = rs.getInt("min");
                        milisegPrimeiroLetraFacil = rs.getInt("miliseg");
                    }
                    if (rs.getInt("posicao") == 2) {
                        segundosSegundoLetrasFacil = rs.getInt("seg");
                        minutosSegundoLetrasFacil = rs.getInt("min");
                        milisegSegundoLetraFacil = rs.getInt("miliseg");
                    }
                    if (rs.getInt("posicao") == 3) {
                        segundosTerceiroLetrasFacil = rs.getInt("seg");
                        minutosTerceiroLetrasFacil = rs.getInt("min");
                        milisegTerceiroLetraFacil = rs.getInt("miliseg");
                    }
                }

            }

            stm.close();
            conn.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
        if (Cronometro.segundosFeitosJogador < segundosPrimeiroLetrasFacil && Cronometro.minutosFeitosJogador <= minutosPrimeiroLetrasFacil) {
            //Primeiro
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbJoguinho", "root", "");
                Statement stm = conn.createStatement();

                ResultSet rs = stm.executeQuery("SELECT tbJogador.posicao as posicao, tbJogador.min, tbJogador.seg, tbJogador.miliseg FROM tbJogador where tbJogador.tipo = 'LF' and posicao = 1;");

                if (!rs.isBeforeFirst()) {
                    String sqlInsert = "INSERT INTO tbJogador(nome,seg,min,miliseg,tipo,posicao)"
                            + "values ( '" + FormFirstMenu.nomeUsuario + "'," + Cronometro.segundosFeitosJogador + "," + Cronometro.minutosFeitosJogador + "," + Cronometro.milisegFeitosJogador + ",'LF', 1 );";
                    stm.executeUpdate(sqlInsert);

                } else {

                    if (Cronometro.segundosFeitosJogador < segundosPrimeiroLetrasFacil && Cronometro.minutosFeitosJogador <= minutosPrimeiroLetrasFacil) {

                        String sqlUpdate = "update tbJogador "
                                + " set nome = '" + FormFirstMenu.nomeUsuario + "', miliseg = " + Cronometro.milisegFeitosJogador + ",seg = " + Cronometro.segundosFeitosJogador + ", min = " + Cronometro.minutosFeitosJogador
                                + "  where tipo = 'LF' and posicao = 1;";

                        stm.executeUpdate(sqlUpdate);

                    }

                }

                stm.close();
                conn.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        if (Cronometro.segundosFeitosJogador == segundosPrimeiroLetrasFacil && Cronometro.minutosFeitosJogador == minutosPrimeiroLetrasFacil && Cronometro.milisegFeitosJogador < milisegPrimeiroLetraFacil) {
            //primeiro Miliseg
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbJoguinho", "root", "");
                Statement stm = conn.createStatement();

                String sqlUpdate = "update tbJogador "
                        + " set nome = '" + FormFirstMenu.nomeUsuario + "', miliseg = " + Cronometro.milisegFeitosJogador + ",seg = " + Cronometro.segundosFeitosJogador + ", min = " + Cronometro.minutosFeitosJogador
                        + "  where tipo = 'LF' and posicao = 1;";

                stm.executeUpdate(sqlUpdate);

                stm.close();
                conn.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
        if (Cronometro.segundosFeitosJogador > segundosPrimeiroLetrasFacil && Cronometro.segundosFeitosJogador < segundosSegundoLetrasFacil && Cronometro.minutosFeitosJogador <= minutosSegundoLetrasFacil) {
            //segundo
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbJoguinho", "root", "");
                Statement stm = conn.createStatement();

                ResultSet rs = stm.executeQuery("SELECT tbJogador.posicao as posicao, tbJogador.min, tbJogador.seg, tbJogador.miliseg FROM tbJogador where tbJogador.tipo = 'LF' and posicao = 2;");

                if (!rs.isBeforeFirst()) {
                    String sqlInsert = "INSERT INTO tbJogador(nome,seg,min,miliseg,tipo,posicao)"
                            + "values ( '" + FormFirstMenu.nomeUsuario + "'," + Cronometro.segundosFeitosJogador + "," + Cronometro.minutosFeitosJogador + "," + Cronometro.milisegFeitosJogador + ",'LF', 2 );";
                    stm.executeUpdate(sqlInsert);

                } else {

                    if (Cronometro.segundosFeitosJogador < segundosSegundoLetrasFacil && Cronometro.minutosFeitosJogador <= minutosSegundoLetrasFacil) {

                        String sqlUpdate = "update tbJogador "
                                + " set nome = '" + FormFirstMenu.nomeUsuario + "', miliseg = " + Cronometro.milisegFeitosJogador + ",seg = " + Cronometro.segundosFeitosJogador + ", min = " + Cronometro.minutosFeitosJogador
                                + "  where tipo = 'LF' and posicao = 2;";

                        stm.executeUpdate(sqlUpdate);

                    }

                }

                stm.close();
                conn.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }

        if (Cronometro.segundosFeitosJogador == segundosSegundoLetrasFacil && Cronometro.minutosFeitosJogador == minutosSegundoLetrasFacil && Cronometro.milisegFeitosJogador < milisegSegundoLetraFacil) {
            //Segundo Miliseg
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbJoguinho", "root", "");
                Statement stm = conn.createStatement();

                String sqlUpdate = "update tbJogador "
                        + " set nome = '" + FormFirstMenu.nomeUsuario + "', miliseg = " + Cronometro.milisegFeitosJogador + ",seg = " + Cronometro.segundosFeitosJogador + ", min = " + Cronometro.minutosFeitosJogador
                        + "  where tipo = 'LF' and posicao = 2;";

                stm.executeUpdate(sqlUpdate);

                stm.close();
                conn.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
        if (Cronometro.segundosFeitosJogador > segundosSegundoLetrasFacil && Cronometro.segundosFeitosJogador < segundosTerceiroLetrasFacil && Cronometro.minutosFeitosJogador <= minutosTerceiroLetrasFacil) {
            //Terceiro
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbJoguinho", "root", "");
                Statement stm = conn.createStatement();

                ResultSet rs = stm.executeQuery("SELECT tbJogador.posicao as posicao, tbJogador.min, tbJogador.seg, tbJogador.miliseg FROM tbJogador where tbJogador.tipo = 'LF' and posicao = 3;");

                if (!rs.isBeforeFirst()) {

                    String sqlInsert = "INSERT INTO tbJogador(nome,seg,min,miliseg,tipo,posicao)"
                            + "values ( '" + FormFirstMenu.nomeUsuario + "'," + Cronometro.segundosFeitosJogador + "," + Cronometro.minutosFeitosJogador + "," + Cronometro.milisegFeitosJogador + ",'LF', 3 );";
                    stm.executeUpdate(sqlInsert);

                } else {

                    if (Cronometro.segundosFeitosJogador < segundosTerceiroLetrasFacil && Cronometro.minutosFeitosJogador <= minutosTerceiroLetrasFacil) {

                        String sqlUpdate = "update tbJogador "
                                + " set nome = '" + FormFirstMenu.nomeUsuario + "', miliseg = " + Cronometro.milisegFeitosJogador + ",seg = " + Cronometro.segundosFeitosJogador + ", min = " + Cronometro.minutosFeitosJogador
                                + "  where tipo = 'LF' and posicao = 3;";

                        stm.executeUpdate(sqlUpdate);

                    }
                }

                stm.close();
                conn.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        if (Cronometro.segundosFeitosJogador == segundosTerceiroLetrasFacil && Cronometro.minutosFeitosJogador == minutosTerceiroLetrasFacil && Cronometro.milisegFeitosJogador < milisegTerceiroLetraFacil) {
            //Terceiro MIliseg

            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbJoguinho", "root", "");
                Statement stm = conn.createStatement();

                String sqlUpdate = "update tbJogador "
                        + " set nome = '" + FormFirstMenu.nomeUsuario + "', miliseg = " + Cronometro.milisegFeitosJogador + ",seg = " + Cronometro.segundosFeitosJogador + ", min = " + Cronometro.minutosFeitosJogador
                        + "  where tipo = 'LF' and posicao = 3;";
                stm.executeUpdate(sqlUpdate);

                stm.close();
                conn.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }//OK
    public void numeroEasy() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbJoguinho", "root", "");
            Statement stm = conn.createStatement();

            ResultSet rs = stm.executeQuery("SELECT tbJogador.posicao, tbJogador.min, tbJogador.seg, tbJogador.miliseg FROM tbJogador where tbJogador.tipo = 'NF';");

            if (!rs.wasNull()) {
                while (rs.next()) {

                    if (rs.getInt("posicao") == 1) {
                        segundosPrimeiroNumeroFacil = rs.getInt("seg");
                        minutosPrimeiroNumeroFacil = rs.getInt("min");
                        milisegPrimeiroNumeroFacil = rs.getInt("miliseg");
                    }
                    if (rs.getInt("posicao") == 2) {
                        segundosSegundoNumeroFacil = rs.getInt("seg");
                        minutosSegundoNumeroFacil = rs.getInt("min");
                        milisegSegundoNumeroFacil = rs.getInt("miliseg");
                    }
                    if (rs.getInt("posicao") == 3) {
                        segundosTerceiroNumeroFacil = rs.getInt("seg");
                        minutosTerceiroNumeroFacil = rs.getInt("min");
                        milisegTerceiroNumeroFacil = rs.getInt("miliseg");
                    }
                }

            }

            stm.close();
            conn.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        if (Cronometro.segundosFeitosJogador < segundosPrimeiroNumeroFacil && Cronometro.minutosFeitosJogador <= minutosPrimeiroNumeroFacil) {
            //Primeiro
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbJoguinho", "root", "");
                Statement stm = conn.createStatement();

                ResultSet rs = stm.executeQuery("SELECT tbJogador.posicao as posicao, tbJogador.min, tbJogador.seg, tbJogador.miliseg FROM tbJogador where tbJogador.tipo = 'NF' and posicao = 1;");

                if (!rs.isBeforeFirst()) {
                    String sqlInsert = "INSERT INTO tbJogador(nome,seg,min,miliseg,tipo,posicao)"
                            + "values ( '" + FormFirstMenu.nomeUsuario + "'," + Cronometro.segundosFeitosJogador + "," + Cronometro.minutosFeitosJogador + "," + Cronometro.milisegFeitosJogador + ",'NF', 1 );";
                    stm.executeUpdate(sqlInsert);

                } else {

                    if (Cronometro.segundosFeitosJogador < segundosPrimeiroNumeroFacil && Cronometro.minutosFeitosJogador <= minutosPrimeiroNumeroFacil) {

                        String sqlUpdate = "update tbJogador "
                                + " set nome = '" + FormFirstMenu.nomeUsuario + "', miliseg = " + Cronometro.milisegFeitosJogador + ",seg = " + Cronometro.segundosFeitosJogador + ", min = " + Cronometro.minutosFeitosJogador
                                + "  where tipo = 'NF' and posicao = 1;";

                        stm.executeUpdate(sqlUpdate);

                    }

                }

                stm.close();
                conn.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        if (Cronometro.segundosFeitosJogador == segundosPrimeiroNumeroFacil && Cronometro.minutosFeitosJogador == minutosPrimeiroNumeroFacil && Cronometro.milisegFeitosJogador < milisegPrimeiroNumeroFacil) {
            //primeiro Miliseg
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbJoguinho", "root", "");
                Statement stm = conn.createStatement();

                String sqlUpdate = "update tbJogador "
                        + " set nome = '" + FormFirstMenu.nomeUsuario + "', miliseg = " + Cronometro.milisegFeitosJogador + ",seg = " + Cronometro.segundosFeitosJogador + ", min = " + Cronometro.minutosFeitosJogador
                        + "  where tipo = 'NF' and posicao = 1;";

                stm.executeUpdate(sqlUpdate);

                stm.close();
                conn.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
        if (Cronometro.segundosFeitosJogador > segundosPrimeiroNumeroFacil && Cronometro.segundosFeitosJogador < segundosSegundoNumeroFacil && Cronometro.minutosFeitosJogador <= minutosSegundoNumeroFacil) {
            //segundo
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbJoguinho", "root", "");
                Statement stm = conn.createStatement();

                ResultSet rs = stm.executeQuery("SELECT tbJogador.posicao as posicao, tbJogador.min, tbJogador.seg, tbJogador.miliseg FROM tbJogador where tbJogador.tipo = 'NF' and posicao = 2;");

                if (!rs.isBeforeFirst()) {
                    String sqlInsert = "INSERT INTO tbJogador(nome,seg,min,miliseg,tipo,posicao)"
                            + "values ( '" + FormFirstMenu.nomeUsuario + "'," + Cronometro.segundosFeitosJogador + "," + Cronometro.minutosFeitosJogador + "," + Cronometro.milisegFeitosJogador + ",'NF', 2 );";
                    stm.executeUpdate(sqlInsert);

                } else {

                    if (Cronometro.segundosFeitosJogador < segundosSegundoNumeroFacil && Cronometro.minutosFeitosJogador <= minutosSegundoNumeroFacil) {

                        String sqlUpdate = "update tbJogador "
                                + " set nome = '" + FormFirstMenu.nomeUsuario + "', miliseg = " + Cronometro.milisegFeitosJogador + ",seg = " + Cronometro.segundosFeitosJogador + ", min = " + Cronometro.minutosFeitosJogador
                                + "  where tipo = 'NF' and posicao = 2;";

                        stm.executeUpdate(sqlUpdate);

                    }

                }

                stm.close();
                conn.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }

        if (Cronometro.segundosFeitosJogador == segundosSegundoNumeroFacil && Cronometro.minutosFeitosJogador == minutosSegundoNumeroFacil && Cronometro.milisegFeitosJogador < milisegSegundoNumeroFacil) {
            //Segundo Miliseg
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbJoguinho", "root", "");
                Statement stm = conn.createStatement();

                String sqlUpdate = "update tbJogador "
                        + " set nome = '" + FormFirstMenu.nomeUsuario + "', miliseg = " + Cronometro.milisegFeitosJogador + ",seg = " + Cronometro.segundosFeitosJogador + ", min = " + Cronometro.minutosFeitosJogador
                        + "  where tipo = 'NF' and posicao = 2;";

                stm.executeUpdate(sqlUpdate);

                stm.close();
                conn.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
        if (Cronometro.segundosFeitosJogador > segundosSegundoNumeroFacil && Cronometro.segundosFeitosJogador < segundosTerceiroNumeroFacil && Cronometro.minutosFeitosJogador <= minutosTerceiroNumeroFacil) {
            //Terceiro
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbJoguinho", "root", "");
                Statement stm = conn.createStatement();

                ResultSet rs = stm.executeQuery("SELECT tbJogador.posicao as posicao, tbJogador.min, tbJogador.seg, tbJogador.miliseg FROM tbJogador where tbJogador.tipo = 'NF' and posicao = 3;");

                if (!rs.isBeforeFirst()) {

                    String sqlInsert = "INSERT INTO tbJogador(nome,seg,min,miliseg,tipo,posicao)"
                            + "values ( '" + FormFirstMenu.nomeUsuario + "'," + Cronometro.segundosFeitosJogador + "," + Cronometro.minutosFeitosJogador + "," + Cronometro.milisegFeitosJogador + ",'NF', 3 );";
                    stm.executeUpdate(sqlInsert);

                } else {

                    if (Cronometro.segundosFeitosJogador < segundosTerceiroNumeroFacil && Cronometro.minutosFeitosJogador <= minutosTerceiroNumeroFacil) {

                        String sqlUpdate = "update tbJogador "
                                + " set nome = '" + FormFirstMenu.nomeUsuario + "', miliseg = " + Cronometro.milisegFeitosJogador + ",seg = " + Cronometro.segundosFeitosJogador + ", min = " + Cronometro.minutosFeitosJogador
                                + "  where tipo = 'NF' and posicao = 3;";

                        stm.executeUpdate(sqlUpdate);

                    }
                }

                stm.close();
                conn.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        if (Cronometro.segundosFeitosJogador == segundosTerceiroNumeroFacil && Cronometro.minutosFeitosJogador == minutosTerceiroNumeroFacil && Cronometro.milisegFeitosJogador < milisegTerceiroNumeroFacil) {
            //Terceiro MIliseg

            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbJoguinho", "root", "");
                Statement stm = conn.createStatement();

                String sqlUpdate = "update tbJogador "
                        + " set nome = '" + FormFirstMenu.nomeUsuario + "', miliseg = " + Cronometro.milisegFeitosJogador + ",seg = " + Cronometro.segundosFeitosJogador + ", min = " + Cronometro.minutosFeitosJogador
                        + "  where tipo = 'NF' and posicao = 3;";
                stm.executeUpdate(sqlUpdate);

                stm.close();
                conn.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

    }//OK
    public void imagemEasy() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbJoguinho", "root", "");
            Statement stm = conn.createStatement();

            ResultSet rs = stm.executeQuery("SELECT tbJogador.posicao, tbJogador.min, tbJogador.seg, tbJogador.miliseg FROM tbJogador where tbJogador.tipo = 'IF';");

            if (!rs.wasNull()) {
                while (rs.next()) {

                    if (rs.getInt("posicao") == 1) {
                        segundosPrimeiroImagemFacil = rs.getInt("seg");
                        minutosPrimeiroImagemFacil = rs.getInt("min");
                        milisegPrimeiroImagemFacil = rs.getInt("miliseg");
                    }
                    if (rs.getInt("posicao") == 2) {
                        segundosSegundoImagemFacil = rs.getInt("seg");
                        minutosSegundoImagemFacil = rs.getInt("min");
                        milisegSegundoImagemFacil = rs.getInt("miliseg");
                    }
                    if (rs.getInt("posicao") == 3) {
                        segundosTerceiroImagemFacil = rs.getInt("seg");
                        minutosTerceiroImagemFacil = rs.getInt("min");
                        milisegTerceiroImagemFacil = rs.getInt("miliseg");
                    }
                }

            }

            stm.close();
            conn.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        if (Cronometro.segundosFeitosJogador < segundosPrimeiroImagemFacil && Cronometro.minutosFeitosJogador <= minutosPrimeiroImagemFacil) {
            //Primeiro
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbJoguinho", "root", "");
                Statement stm = conn.createStatement();

                ResultSet rs = stm.executeQuery("SELECT tbJogador.posicao as posicao, tbJogador.min, tbJogador.seg, tbJogador.miliseg FROM tbJogador where tbJogador.tipo = 'IF' and posicao = 1;");

                if (!rs.isBeforeFirst()) {
                    String sqlInsert = "INSERT INTO tbJogador(nome,seg,min,miliseg,tipo,posicao)"
                            + "values ( '" + FormFirstMenu.nomeUsuario + "'," + Cronometro.segundosFeitosJogador + "," + Cronometro.minutosFeitosJogador + "," + Cronometro.milisegFeitosJogador + ",'IF', 1 );";
                    stm.executeUpdate(sqlInsert);

                } else {

                    if (Cronometro.segundosFeitosJogador < segundosPrimeiroImagemFacil && Cronometro.minutosFeitosJogador <= minutosPrimeiroImagemFacil) {

                        String sqlUpdate = "update tbJogador "
                                + " set nome = '" + FormFirstMenu.nomeUsuario + "', miliseg = " + Cronometro.milisegFeitosJogador + ",seg = " + Cronometro.segundosFeitosJogador + ", min = " + Cronometro.minutosFeitosJogador
                                + "  where tipo = 'IF' and posicao = 1;";
                        stm.executeUpdate(sqlUpdate);
                    }

                }

                stm.close();
                conn.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        if (Cronometro.segundosFeitosJogador == segundosPrimeiroImagemFacil && Cronometro.minutosFeitosJogador == minutosPrimeiroImagemFacil && Cronometro.milisegFeitosJogador < milisegPrimeiroImagemFacil) {
            //primeiro Miliseg
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbJoguinho", "root", "");
                Statement stm = conn.createStatement();

                String sqlUpdate = "update tbJogador "
                        + " set nome = '" + FormFirstMenu.nomeUsuario + "', miliseg = " + Cronometro.milisegFeitosJogador + ",seg = " + Cronometro.segundosFeitosJogador + ", min = " + Cronometro.minutosFeitosJogador
                        + "  where tipo = 'IF' and posicao = 1;";

                stm.executeUpdate(sqlUpdate);

                stm.close();
                conn.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        if (Cronometro.segundosFeitosJogador > segundosPrimeiroImagemFacil && Cronometro.segundosFeitosJogador < segundosSegundoImagemFacil && Cronometro.minutosFeitosJogador <= minutosSegundoImagemFacil) {
            //segundo
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbJoguinho", "root", "");
                Statement stm = conn.createStatement();

                ResultSet rs = stm.executeQuery("SELECT tbJogador.posicao as posicao, tbJogador.min, tbJogador.seg, tbJogador.miliseg FROM tbJogador where tbJogador.tipo = 'IF' and posicao = 2;");

                if (!rs.isBeforeFirst()) {
                    String sqlInsert = "INSERT INTO tbJogador(nome,seg,min,miliseg,tipo,posicao)"
                            + "values ( '" + FormFirstMenu.nomeUsuario + "'," + Cronometro.segundosFeitosJogador + "," + Cronometro.minutosFeitosJogador + "," + Cronometro.milisegFeitosJogador + ",'IF', 2 );";
                    stm.executeUpdate(sqlInsert);

                } else {

                    if (Cronometro.segundosFeitosJogador < segundosSegundoImagemFacil && Cronometro.minutosFeitosJogador <= minutosSegundoImagemFacil) {

                        String sqlUpdate = "update tbJogador "
                                + " set nome = '" + FormFirstMenu.nomeUsuario + "', miliseg = " + Cronometro.milisegFeitosJogador + ",seg = " + Cronometro.segundosFeitosJogador + ", min = " + Cronometro.minutosFeitosJogador
                                + "  where tipo = 'IF' and posicao = 2;";

                        stm.executeUpdate(sqlUpdate);

                    }

                }

                stm.close();
                conn.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }

        if (Cronometro.segundosFeitosJogador == segundosSegundoImagemFacil && Cronometro.minutosFeitosJogador == minutosSegundoImagemFacil && Cronometro.milisegFeitosJogador < milisegSegundoImagemFacil) {
            //Segundo Miliseg
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbJoguinho", "root", "");
                Statement stm = conn.createStatement();

                String sqlUpdate = "update tbJogador "
                        + " set nome = '" + FormFirstMenu.nomeUsuario + "', miliseg = " + Cronometro.milisegFeitosJogador + ",seg = " + Cronometro.segundosFeitosJogador + ", min = " + Cronometro.minutosFeitosJogador
                        + "  where tipo = 'IF' and posicao = 2;";

                stm.executeUpdate(sqlUpdate);

                stm.close();
                conn.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
        if (Cronometro.segundosFeitosJogador > segundosSegundoImagemFacil && Cronometro.segundosFeitosJogador < segundosTerceiroImagemFacil && Cronometro.minutosFeitosJogador <= minutosTerceiroImagemFacil) {
            //Terceiro
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbJoguinho", "root", "");
                Statement stm = conn.createStatement();

                ResultSet rs = stm.executeQuery("SELECT tbJogador.posicao as posicao, tbJogador.min, tbJogador.seg, tbJogador.miliseg FROM tbJogador where tbJogador.tipo = 'IF' and posicao = 3;");

                if (!rs.isBeforeFirst()) {

                    String sqlInsert = "INSERT INTO tbJogador(nome,seg,min,miliseg,tipo,posicao)"
                            + "values ( '" + FormFirstMenu.nomeUsuario + "'," + Cronometro.segundosFeitosJogador + "," + Cronometro.minutosFeitosJogador + "," + Cronometro.milisegFeitosJogador + ",'IF', 3 );";
                    stm.executeUpdate(sqlInsert);

                } else {

                    if (Cronometro.segundosFeitosJogador < segundosTerceiroImagemFacil && Cronometro.minutosFeitosJogador <= minutosTerceiroImagemFacil) {

                        String sqlUpdate = "update tbJogador "
                                + " set nome = '" + FormFirstMenu.nomeUsuario + "', miliseg = " + Cronometro.milisegFeitosJogador + ",seg = " + Cronometro.segundosFeitosJogador + ", min = " + Cronometro.minutosFeitosJogador
                                + "  where tipo = 'IF' and posicao = 3;";

                        stm.executeUpdate(sqlUpdate);

                    }
                }

                stm.close();
                conn.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        if (Cronometro.segundosFeitosJogador == segundosTerceiroImagemFacil && Cronometro.minutosFeitosJogador == minutosTerceiroImagemFacil && Cronometro.milisegFeitosJogador < milisegTerceiroImagemFacil) {
            //Terceiro MIliseg

            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbJoguinho", "root", "");
                Statement stm = conn.createStatement();

                String sqlUpdate = "update tbJogador "
                        + " set nome = '" + FormFirstMenu.nomeUsuario + "', miliseg = " + Cronometro.milisegFeitosJogador + ",seg = " + Cronometro.segundosFeitosJogador + ", min = " + Cronometro.minutosFeitosJogador
                        + "  where tipo = 'IF' and posicao = 3;";
                stm.executeUpdate(sqlUpdate);

                stm.close();
                conn.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

    }//OK
    
    public void letraMedium() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbJoguinho", "root", "");
            Statement stm = conn.createStatement();

            ResultSet rs = stm.executeQuery("SELECT tbJogador.posicao, tbJogador.min, tbJogador.seg, tbJogador.miliseg FROM tbJogador where tbJogador.tipo = 'LM';");

            if (!rs.wasNull()) {
                while (rs.next()) {

                    if (rs.getInt("posicao") == 1) {
                        segundosPrimeiroLetrasMedio = rs.getInt("seg");
                        minutosPrimeiroLetrasMedio = rs.getInt("min");
                        milisegPrimeiroLetrasMedio = rs.getInt("miliseg");
                    }
                    if (rs.getInt("posicao") == 2) {
                        segundosSegundoLetrasMedio = rs.getInt("seg");
                        minutosSegundoLetrasMedio = rs.getInt("min");
                        milisegSegundoLetrasMedio = rs.getInt("miliseg");
                    }
                    if (rs.getInt("posicao") == 3) {
                        segundosTerceiroLetrasMedio = rs.getInt("seg");
                        minutosTerceiroLetrasMedio = rs.getInt("min");
                        milisegTerceiroLetrasMedio = rs.getInt("miliseg");
                    }
                }

            }

            stm.close();
            conn.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
        if (Cronometro.segundosFeitosJogador < segundosPrimeiroLetrasMedio && Cronometro.minutosFeitosJogador <= minutosPrimeiroLetrasMedio) {
            //Primeiro
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbJoguinho", "root", "");
                Statement stm = conn.createStatement();

                ResultSet rs = stm.executeQuery("SELECT tbJogador.posicao as posicao, tbJogador.min, tbJogador.seg, tbJogador.miliseg FROM tbJogador where tbJogador.tipo = 'LM' and posicao = 1;");

                if (!rs.isBeforeFirst()) {
                    String sqlInsert = "INSERT INTO tbJogador(nome,seg,min,miliseg,tipo,posicao)"
                            + "values ( '" + FormFirstMenu.nomeUsuario + "'," + Cronometro.segundosFeitosJogador + "," + Cronometro.minutosFeitosJogador + "," + Cronometro.milisegFeitosJogador + ",'LM', 1 );";
                    stm.executeUpdate(sqlInsert);

                } else {

                    if (Cronometro.segundosFeitosJogador < segundosPrimeiroLetrasMedio && Cronometro.minutosFeitosJogador <= minutosPrimeiroLetrasMedio) {

                        String sqlUpdate = "update tbJogador "
                                + " set nome = '" + FormFirstMenu.nomeUsuario + "', miliseg = " + Cronometro.milisegFeitosJogador + ",seg = " + Cronometro.segundosFeitosJogador + ", min = " + Cronometro.minutosFeitosJogador
                                + "  where tipo = 'LM' and posicao = 1;";

                        stm.executeUpdate(sqlUpdate);

                    }

                }

                stm.close();
                conn.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        if (Cronometro.segundosFeitosJogador == segundosPrimeiroLetrasMedio && Cronometro.minutosFeitosJogador == minutosPrimeiroLetrasMedio && Cronometro.milisegFeitosJogador < milisegPrimeiroLetrasMedio) {
            //primeiro Miliseg
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbJoguinho", "root", "");
                Statement stm = conn.createStatement();

                String sqlUpdate = "update tbJogador "
                        + " set nome = '" + FormFirstMenu.nomeUsuario + "', miliseg = " + Cronometro.milisegFeitosJogador + ",seg = " + Cronometro.segundosFeitosJogador + ", min = " + Cronometro.minutosFeitosJogador
                        + "  where tipo = 'LM' and posicao = 1;";

                stm.executeUpdate(sqlUpdate);

                stm.close();
                conn.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }

        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        if (Cronometro.segundosFeitosJogador > segundosPrimeiroLetrasMedio && Cronometro.segundosFeitosJogador < segundosSegundoLetrasMedio && Cronometro.minutosFeitosJogador <= minutosSegundoLetrasMedio) {
            //segundo
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbJoguinho", "root", "");
                Statement stm = conn.createStatement();

                ResultSet rs = stm.executeQuery("SELECT tbJogador.posicao as posicao, tbJogador.min, tbJogador.seg, tbJogador.miliseg FROM tbJogador where tbJogador.tipo = 'LM' and posicao = 2;");

                if (!rs.isBeforeFirst()) {
                    String sqlInsert = "INSERT INTO tbJogador(nome,seg,min,miliseg,tipo,posicao)"
                            + "values ( '" + FormFirstMenu.nomeUsuario + "'," + Cronometro.segundosFeitosJogador + "," + Cronometro.minutosFeitosJogador + "," + Cronometro.milisegFeitosJogador + ",'LM', 2 );";
                    stm.executeUpdate(sqlInsert);

                } else {

                    if (Cronometro.segundosFeitosJogador < segundosSegundoLetrasMedio && Cronometro.minutosFeitosJogador <= minutosSegundoLetrasMedio) {

                        String sqlUpdate = "update tbJogador "
                                + " set nome = '" + FormFirstMenu.nomeUsuario + "', miliseg = " + Cronometro.milisegFeitosJogador + ",seg = " + Cronometro.segundosFeitosJogador + ", min = " + Cronometro.minutosFeitosJogador
                                + "  where tipo = 'LM' and posicao = 2;";

                        stm.executeUpdate(sqlUpdate);

                    }

                }

                stm.close();
                conn.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }

        if (Cronometro.segundosFeitosJogador == segundosSegundoLetrasMedio && Cronometro.minutosFeitosJogador == minutosSegundoLetrasMedio && Cronometro.milisegFeitosJogador < milisegSegundoLetrasMedio) {
            //Segundo Miliseg
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbJoguinho", "root", "");
                Statement stm = conn.createStatement();

                String sqlUpdate = "update tbJogador "
                        + " set nome = '" + FormFirstMenu.nomeUsuario + "', miliseg = " + Cronometro.milisegFeitosJogador + ",seg = " + Cronometro.segundosFeitosJogador + ", min = " + Cronometro.minutosFeitosJogador
                        + "  where tipo = 'LM' and posicao = 2;";

                stm.executeUpdate(sqlUpdate);

                stm.close();
                conn.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
        if (Cronometro.segundosFeitosJogador > segundosSegundoLetrasMedio && Cronometro.segundosFeitosJogador < segundosTerceiroLetrasMedio && Cronometro.minutosFeitosJogador <= minutosTerceiroLetrasMedio) {
            //Terceiro
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbJoguinho", "root", "");
                Statement stm = conn.createStatement();

                ResultSet rs = stm.executeQuery("SELECT tbJogador.posicao as posicao, tbJogador.min, tbJogador.seg, tbJogador.miliseg FROM tbJogador where tbJogador.tipo = 'LM' and posicao = 3;");

                if (!rs.isBeforeFirst()) {

                    String sqlInsert = "INSERT INTO tbJogador(nome,seg,min,miliseg,tipo,posicao)"
                            + "values ( '" + FormFirstMenu.nomeUsuario + "'," + Cronometro.segundosFeitosJogador + "," + Cronometro.minutosFeitosJogador + "," + Cronometro.milisegFeitosJogador + ",'LM', 3 );";
                    stm.executeUpdate(sqlInsert);

                } else {

                    if (Cronometro.segundosFeitosJogador < segundosTerceiroLetrasMedio && Cronometro.minutosFeitosJogador <= minutosTerceiroLetrasMedio) {

                        String sqlUpdate = "update tbJogador "
                                + " set nome = '" + FormFirstMenu.nomeUsuario + "', miliseg = " + Cronometro.milisegFeitosJogador + ",seg = " + Cronometro.segundosFeitosJogador + ", min = " + Cronometro.minutosFeitosJogador
                                + "  where tipo = 'LM' and posicao = 3;";

                        stm.executeUpdate(sqlUpdate);

                    }
                }

                stm.close();
                conn.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        if (Cronometro.segundosFeitosJogador == segundosTerceiroLetrasMedio && Cronometro.minutosFeitosJogador == minutosTerceiroLetrasMedio && Cronometro.milisegFeitosJogador < milisegTerceiroLetrasMedio) {
            //Terceiro MIliseg

            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbJoguinho", "root", "");
                Statement stm = conn.createStatement();

                String sqlUpdate = "update tbJogador "
                        + " set nome = '" + FormFirstMenu.nomeUsuario + "', miliseg = " + Cronometro.milisegFeitosJogador + ",seg = " + Cronometro.segundosFeitosJogador + ", min = " + Cronometro.minutosFeitosJogador
                        + "  where tipo = 'LM' and posicao = 3;";
                stm.executeUpdate(sqlUpdate);

                stm.close();
                conn.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

    } //OK
    public void numeroMedium() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbJoguinho", "root", "");
            Statement stm = conn.createStatement();

            ResultSet rs = stm.executeQuery("SELECT tbJogador.posicao, tbJogador.min, tbJogador.seg, tbJogador.miliseg FROM tbJogador where tbJogador.tipo = 'NM';");

            if (!rs.wasNull()) {
                while (rs.next()) {

                    if (rs.getInt("posicao") == 1) {
                        segundosPrimeiroNumeroMedio = rs.getInt("seg");
                        minutosPrimeiroNumeroMedio = rs.getInt("min");
                        milisegPrimeiroNumeroMedio = rs.getInt("miliseg");
                    }
                    if (rs.getInt("posicao") == 2) {
                        segundosSegundoNumeroMedio = rs.getInt("seg");
                        minutosSegundoNumeroMedio = rs.getInt("min");
                        milisegSegundoNumeroMedio = rs.getInt("miliseg");
                    }
                    if (rs.getInt("posicao") == 3) {
                        segundosTerceiroNumeroMedio = rs.getInt("seg");
                        minutosTerceiroNumeroMedio = rs.getInt("min");
                        milisegTerceiroNumeroMedio = rs.getInt("miliseg");
                    }
                }

            }

            stm.close();
            conn.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
        if (Cronometro.segundosFeitosJogador < segundosPrimeiroNumeroMedio && Cronometro.minutosFeitosJogador <= minutosPrimeiroNumeroMedio) {
            //Primeiro
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbJoguinho", "root", "");
                Statement stm = conn.createStatement();

                ResultSet rs = stm.executeQuery("SELECT tbJogador.posicao as posicao, tbJogador.min, tbJogador.seg, tbJogador.miliseg FROM tbJogador where tbJogador.tipo = 'NM' and posicao = 1;");

                if (!rs.isBeforeFirst()) {
                    String sqlInsert = "INSERT INTO tbJogador(nome,seg,min,miliseg,tipo,posicao)"
                            + "values ( '" + FormFirstMenu.nomeUsuario + "'," + Cronometro.segundosFeitosJogador + "," + Cronometro.minutosFeitosJogador + "," + Cronometro.milisegFeitosJogador + ",'NM', 1 );";
                    stm.executeUpdate(sqlInsert);

                } else {

                    if (Cronometro.segundosFeitosJogador < segundosPrimeiroNumeroMedio && Cronometro.minutosFeitosJogador <= minutosPrimeiroNumeroMedio) {

                        String sqlUpdate = "update tbJogador "
                                + " set nome = '" + FormFirstMenu.nomeUsuario + "', miliseg = " + Cronometro.milisegFeitosJogador + ",seg = " + Cronometro.segundosFeitosJogador + ", min = " + Cronometro.minutosFeitosJogador
                                + "  where tipo = 'NM' and posicao = 1;";

                        stm.executeUpdate(sqlUpdate);

                    }

                }

                stm.close();
                conn.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        if (Cronometro.segundosFeitosJogador == segundosPrimeiroNumeroMedio && Cronometro.minutosFeitosJogador == minutosPrimeiroNumeroMedio && Cronometro.milisegFeitosJogador < milisegPrimeiroNumeroMedio) {
            //primeiro Miliseg
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbJoguinho", "root", "");
                Statement stm = conn.createStatement();

                String sqlUpdate = "update tbJogador "
                        + " set nome = '" + FormFirstMenu.nomeUsuario + "', miliseg = " + Cronometro.milisegFeitosJogador + ",seg = " + Cronometro.segundosFeitosJogador + ", min = " + Cronometro.minutosFeitosJogador
                        + "  where tipo = 'NM' and posicao = 1;";

                stm.executeUpdate(sqlUpdate);

                stm.close();
                conn.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }

        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        if (Cronometro.segundosFeitosJogador > segundosPrimeiroNumeroMedio && Cronometro.segundosFeitosJogador < segundosSegundoNumeroMedio && Cronometro.minutosFeitosJogador <= minutosSegundoNumeroMedio) {
            //segundo
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbJoguinho", "root", "");
                Statement stm = conn.createStatement();

                ResultSet rs = stm.executeQuery("SELECT tbJogador.posicao as posicao, tbJogador.min, tbJogador.seg, tbJogador.miliseg FROM tbJogador where tbJogador.tipo = 'NM' and posicao = 2;");

                if (!rs.isBeforeFirst()) {
                    String sqlInsert = "INSERT INTO tbJogador(nome,seg,min,miliseg,tipo,posicao)"
                            + "values ( '" + FormFirstMenu.nomeUsuario + "'," + Cronometro.segundosFeitosJogador + "," + Cronometro.minutosFeitosJogador + "," + Cronometro.milisegFeitosJogador + ",'NM', 2 );";
                    stm.executeUpdate(sqlInsert);

                } else {

                    if (Cronometro.segundosFeitosJogador < segundosSegundoNumeroMedio && Cronometro.minutosFeitosJogador <= minutosSegundoNumeroMedio) {

                        String sqlUpdate = "update tbJogador "
                                + " set nome = '" + FormFirstMenu.nomeUsuario + "', miliseg = " + Cronometro.milisegFeitosJogador + ",seg = " + Cronometro.segundosFeitosJogador + ", min = " + Cronometro.minutosFeitosJogador
                                + "  where tipo = 'NM' and posicao = 2;";

                        stm.executeUpdate(sqlUpdate);

                    }

                }

                stm.close();
                conn.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }

        if (Cronometro.segundosFeitosJogador == segundosSegundoNumeroMedio && Cronometro.minutosFeitosJogador == minutosSegundoNumeroMedio && Cronometro.milisegFeitosJogador < milisegSegundoNumeroMedio) {
            //Segundo Miliseg
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbJoguinho", "root", "");
                Statement stm = conn.createStatement();

                String sqlUpdate = "update tbJogador "
                        + " set nome = '" + FormFirstMenu.nomeUsuario + "', miliseg = " + Cronometro.milisegFeitosJogador + ",seg = " + Cronometro.segundosFeitosJogador + ", min = " + Cronometro.minutosFeitosJogador
                        + "  where tipo = 'NM' and posicao = 2;";

                stm.executeUpdate(sqlUpdate);

                stm.close();
                conn.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
        if (Cronometro.segundosFeitosJogador > segundosSegundoNumeroMedio && Cronometro.segundosFeitosJogador < segundosTerceiroNumeroMedio && Cronometro.minutosFeitosJogador <= minutosTerceiroNumeroMedio) {
            //Terceiro
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbJoguinho", "root", "");
                Statement stm = conn.createStatement();

                ResultSet rs = stm.executeQuery("SELECT tbJogador.posicao as posicao, tbJogador.min, tbJogador.seg, tbJogador.miliseg FROM tbJogador where tbJogador.tipo = 'NM' and posicao = 3;");

                if (!rs.isBeforeFirst()) {

                    String sqlInsert = "INSERT INTO tbJogador(nome,seg,min,miliseg,tipo,posicao)"
                            + "values ( '" + FormFirstMenu.nomeUsuario + "'," + Cronometro.segundosFeitosJogador + "," + Cronometro.minutosFeitosJogador + "," + Cronometro.milisegFeitosJogador + ",'NM', 3 );";
                    stm.executeUpdate(sqlInsert);

                } else {

                    if (Cronometro.segundosFeitosJogador < segundosTerceiroNumeroMedio && Cronometro.minutosFeitosJogador <= minutosTerceiroNumeroMedio) {

                        String sqlUpdate = "update tbJogador "
                                + " set nome = '" + FormFirstMenu.nomeUsuario + "', miliseg = " + Cronometro.milisegFeitosJogador + ",seg = " + Cronometro.segundosFeitosJogador + ", min = " + Cronometro.minutosFeitosJogador
                                + "  where tipo = 'NM' and posicao = 3;";

                        stm.executeUpdate(sqlUpdate);

                    }
                }

                stm.close();
                conn.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        if (Cronometro.segundosFeitosJogador == segundosTerceiroNumeroMedio && Cronometro.minutosFeitosJogador == minutosTerceiroNumeroMedio && Cronometro.milisegFeitosJogador < milisegTerceiroNumeroMedio) {
            //Terceiro MIliseg

            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbJoguinho", "root", "");
                Statement stm = conn.createStatement();

                String sqlUpdate = "update tbJogador "
                        + " set nome = '" + FormFirstMenu.nomeUsuario + "', miliseg = " + Cronometro.milisegFeitosJogador + ",seg = " + Cronometro.segundosFeitosJogador + ", min = " + Cronometro.minutosFeitosJogador
                        + "  where tipo = 'NM' and posicao = 3;";
                stm.executeUpdate(sqlUpdate);

                stm.close();
                conn.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

    }//OK
    public void imagemMedium() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbJoguinho", "root", "");
            Statement stm = conn.createStatement();

            ResultSet rs = stm.executeQuery("SELECT tbJogador.posicao, tbJogador.min, tbJogador.seg, tbJogador.miliseg FROM tbJogador where tbJogador.tipo = 'IM';");

            if (!rs.wasNull()) {
                while (rs.next()) {

                    if (rs.getInt("posicao") == 1) {
                        segundosPrimeiroImagemMedio = rs.getInt("seg");
                        minutosPrimeiroImagemMedio = rs.getInt("min");
                        milisegPrimeiroImagemMedio = rs.getInt("miliseg");
                    }
                    if (rs.getInt("posicao") == 2) {
                        segundosSegundoImagemMedio = rs.getInt("seg");
                        minutosSegundoImagemMedio = rs.getInt("min");
                        milisegSegundoImagemMedio = rs.getInt("miliseg");
                    }
                    if (rs.getInt("posicao") == 3) {
                        segundosTerceiroImagemMedio = rs.getInt("seg");
                        minutosTerceiroImagemMedio = rs.getInt("min");
                        milisegTerceiroImagemMedio = rs.getInt("miliseg");
                    }
                }

            }

            stm.close();
            conn.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
        if (Cronometro.segundosFeitosJogador < segundosPrimeiroImagemMedio && Cronometro.minutosFeitosJogador <= minutosPrimeiroImagemMedio) {
            //Primeiro
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbJoguinho", "root", "");
                Statement stm = conn.createStatement();

                ResultSet rs = stm.executeQuery("SELECT tbJogador.posicao as posicao, tbJogador.min, tbJogador.seg, tbJogador.miliseg FROM tbJogador where tbJogador.tipo = 'IM' and posicao = 1;");

                if (!rs.isBeforeFirst()) {
                    String sqlInsert = "INSERT INTO tbJogador(nome,seg,min,miliseg,tipo,posicao)"
                            + "values ( '" + FormFirstMenu.nomeUsuario + "'," + Cronometro.segundosFeitosJogador + "," + Cronometro.minutosFeitosJogador + "," + Cronometro.milisegFeitosJogador + ",'IM', 1 );";
                    stm.executeUpdate(sqlInsert);

                } else {

                    if (Cronometro.segundosFeitosJogador < segundosPrimeiroImagemMedio && Cronometro.minutosFeitosJogador <= minutosPrimeiroImagemMedio) {

                        String sqlUpdate = "update tbJogador "
                                + " set nome = '" + FormFirstMenu.nomeUsuario + "', miliseg = " + Cronometro.milisegFeitosJogador + ",seg = " + Cronometro.segundosFeitosJogador + ", min = " + Cronometro.minutosFeitosJogador
                                + "  where tipo = 'IM' and posicao = 1;";

                        stm.executeUpdate(sqlUpdate);

                    }

                }

                stm.close();
                conn.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        if (Cronometro.segundosFeitosJogador == segundosPrimeiroImagemMedio && Cronometro.minutosFeitosJogador == minutosPrimeiroImagemMedio && Cronometro.milisegFeitosJogador < milisegPrimeiroImagemMedio) {
            //primeiro Miliseg
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbJoguinho", "root", "");
                Statement stm = conn.createStatement();

                String sqlUpdate = "update tbJogador "
                        + " set nome = '" + FormFirstMenu.nomeUsuario + "', miliseg = " + Cronometro.milisegFeitosJogador + ",seg = " + Cronometro.segundosFeitosJogador + ", min = " + Cronometro.minutosFeitosJogador
                        + "  where tipo = 'IM' and posicao = 1;";

                stm.executeUpdate(sqlUpdate);

                stm.close();
                conn.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }

        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        if (Cronometro.segundosFeitosJogador > segundosPrimeiroImagemMedio && Cronometro.segundosFeitosJogador < segundosSegundoImagemMedio && Cronometro.minutosFeitosJogador <= minutosSegundoImagemMedio) {
            //segundo
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbJoguinho", "root", "");
                Statement stm = conn.createStatement();

                ResultSet rs = stm.executeQuery("SELECT tbJogador.posicao as posicao, tbJogador.min, tbJogador.seg, tbJogador.miliseg FROM tbJogador where tbJogador.tipo = 'IM' and posicao = 2;");

                if (!rs.isBeforeFirst()) {
                    String sqlInsert = "INSERT INTO tbJogador(nome,seg,min,miliseg,tipo,posicao)"
                            + "values ( '" + FormFirstMenu.nomeUsuario + "'," + Cronometro.segundosFeitosJogador + "," + Cronometro.minutosFeitosJogador + "," + Cronometro.milisegFeitosJogador + ",'IM', 2 );";
                    stm.executeUpdate(sqlInsert);

                } else {

                    if (Cronometro.segundosFeitosJogador < segundosSegundoImagemMedio && Cronometro.minutosFeitosJogador <= minutosSegundoImagemMedio) {

                        String sqlUpdate = "update tbJogador "
                                + " set nome = '" + FormFirstMenu.nomeUsuario + "', miliseg = " + Cronometro.milisegFeitosJogador + ",seg = " + Cronometro.segundosFeitosJogador + ", min = " + Cronometro.minutosFeitosJogador
                                + "  where tipo = 'IM' and posicao = 2;";

                        stm.executeUpdate(sqlUpdate);

                    }

                }

                stm.close();
                conn.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }

        if (Cronometro.segundosFeitosJogador == segundosSegundoImagemMedio && Cronometro.minutosFeitosJogador == minutosSegundoImagemMedio && Cronometro.milisegFeitosJogador < milisegSegundoImagemMedio) {
            //Segundo Miliseg
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbJoguinho", "root", "");
                Statement stm = conn.createStatement();

                String sqlUpdate = "update tbJogador "
                        + " set nome = '" + FormFirstMenu.nomeUsuario + "', miliseg = " + Cronometro.milisegFeitosJogador + ",seg = " + Cronometro.segundosFeitosJogador + ", min = " + Cronometro.minutosFeitosJogador
                        + "  where tipo = 'IM' and posicao = 2;";

                stm.executeUpdate(sqlUpdate);

                stm.close();
                conn.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
        if (Cronometro.segundosFeitosJogador > segundosSegundoImagemMedio && Cronometro.segundosFeitosJogador < segundosTerceiroImagemMedio && Cronometro.minutosFeitosJogador <= minutosTerceiroImagemMedio) {
            //Terceiro
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbJoguinho", "root", "");
                Statement stm = conn.createStatement();

                ResultSet rs = stm.executeQuery("SELECT tbJogador.posicao as posicao, tbJogador.min, tbJogador.seg, tbJogador.miliseg FROM tbJogador where tbJogador.tipo = 'IM' and posicao = 3;");

                if (!rs.isBeforeFirst()) {

                    String sqlInsert = "INSERT INTO tbJogador(nome,seg,min,miliseg,tipo,posicao)"
                            + "values ( '" + FormFirstMenu.nomeUsuario + "'," + Cronometro.segundosFeitosJogador + "," + Cronometro.minutosFeitosJogador + "," + Cronometro.milisegFeitosJogador + ",'IM', 3 );";
                    stm.executeUpdate(sqlInsert);

                } else {

                    if (Cronometro.segundosFeitosJogador < segundosTerceiroImagemMedio && Cronometro.minutosFeitosJogador <= minutosTerceiroImagemMedio) {

                        String sqlUpdate = "update tbJogador "
                                + " set nome = '" + FormFirstMenu.nomeUsuario + "', miliseg = " + Cronometro.milisegFeitosJogador + ",seg = " + Cronometro.segundosFeitosJogador + ", min = " + Cronometro.minutosFeitosJogador
                                + "  where tipo = 'IM' and posicao = 3;";

                        stm.executeUpdate(sqlUpdate);

                    }
                }

                stm.close();
                conn.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        if (Cronometro.segundosFeitosJogador == segundosTerceiroImagemMedio && Cronometro.minutosFeitosJogador == minutosTerceiroImagemMedio && Cronometro.milisegFeitosJogador < milisegTerceiroImagemMedio) {
            //Terceiro MIliseg

            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbJoguinho", "root", "");
                Statement stm = conn.createStatement();

                String sqlUpdate = "update tbJogador "
                        + " set nome = '" + FormFirstMenu.nomeUsuario + "', miliseg = " + Cronometro.milisegFeitosJogador + ",seg = " + Cronometro.segundosFeitosJogador + ", min = " + Cronometro.minutosFeitosJogador
                        + "  where tipo = 'IM' and posicao = 3;";
                stm.executeUpdate(sqlUpdate);

                stm.close();
                conn.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

    }//OK
    
    public void letraHard() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbJoguinho", "root", "");
            Statement stm = conn.createStatement();

            ResultSet rs = stm.executeQuery("SELECT tbJogador.posicao, tbJogador.min, tbJogador.seg, tbJogador.miliseg FROM tbJogador where tbJogador.tipo = 'LD';");

            if (!rs.wasNull()) {
                while (rs.next()) {

                    if (rs.getInt("posicao") == 1) {
                        segundosPrimeiroLetrasDificil = rs.getInt("seg");
                        minutosPrimeiroLetrasDificil = rs.getInt("min");
                        milisegPrimeiroLetrasDificil = rs.getInt("miliseg");
                    }
                    if (rs.getInt("posicao") == 2) {
                        segundosSegundoLetrasDificil = rs.getInt("seg");
                        minutosSegundoLetrasDificil = rs.getInt("min");
                        milisegSegundoLetrasDificil = rs.getInt("miliseg");
                    }
                    if (rs.getInt("posicao") == 3) {
                        segundosTerceiroLetrasDificil = rs.getInt("seg");
                        minutosTerceiroLetrasDificil = rs.getInt("min");
                        milisegTerceiroLetrasDificil = rs.getInt("miliseg");
                    }
                }

            }

            stm.close();
            conn.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
        if (Cronometro.segundosFeitosJogador < segundosPrimeiroLetrasDificil && Cronometro.minutosFeitosJogador <= minutosPrimeiroLetrasDificil) {
            //Primeiro
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbJoguinho", "root", "");
                Statement stm = conn.createStatement();

                ResultSet rs = stm.executeQuery("SELECT tbJogador.posicao as posicao, tbJogador.min, tbJogador.seg, tbJogador.miliseg FROM tbJogador where tbJogador.tipo = 'LD' and posicao = 1;");

                if (!rs.isBeforeFirst()) {
                    String sqlInsert = "INSERT INTO tbJogador(nome,seg,min,miliseg,tipo,posicao)"
                            + "values ( '" + FormFirstMenu.nomeUsuario + "'," + Cronometro.segundosFeitosJogador + "," + Cronometro.minutosFeitosJogador + "," + Cronometro.milisegFeitosJogador + ",'LD', 1 );";
                    stm.executeUpdate(sqlInsert);

                } else {

                    if (Cronometro.segundosFeitosJogador < segundosPrimeiroLetrasDificil && Cronometro.minutosFeitosJogador <= minutosPrimeiroLetrasDificil) {

                        String sqlUpdate = "update tbJogador "
                                + " set nome = '" + FormFirstMenu.nomeUsuario + "', miliseg = " + Cronometro.milisegFeitosJogador + ",seg = " + Cronometro.segundosFeitosJogador + ", min = " + Cronometro.minutosFeitosJogador
                                + "  where tipo = 'LD' and posicao = 1;";

                        stm.executeUpdate(sqlUpdate);

                    }

                }

                stm.close();
                conn.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        if (Cronometro.segundosFeitosJogador == segundosPrimeiroLetrasDificil && Cronometro.minutosFeitosJogador == minutosPrimeiroLetrasDificil && Cronometro.milisegFeitosJogador < milisegPrimeiroLetrasDificil) {
            //primeiro Miliseg
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbJoguinho", "root", "");
                Statement stm = conn.createStatement();

                String sqlUpdate = "update tbJogador "
                        + " set nome = '" + FormFirstMenu.nomeUsuario + "', miliseg = " + Cronometro.milisegFeitosJogador + ",seg = " + Cronometro.segundosFeitosJogador + ", min = " + Cronometro.minutosFeitosJogador
                        + "  where tipo = 'LD' and posicao = 1;";

                stm.executeUpdate(sqlUpdate);

                stm.close();
                conn.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }

        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        if (Cronometro.segundosFeitosJogador > segundosPrimeiroLetrasDificil && Cronometro.segundosFeitosJogador < segundosSegundoLetrasDificil && Cronometro.minutosFeitosJogador <= minutosSegundoLetrasDificil) {
            //segundo
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbJoguinho", "root", "");
                Statement stm = conn.createStatement();

                ResultSet rs = stm.executeQuery("SELECT tbJogador.posicao as posicao, tbJogador.min, tbJogador.seg, tbJogador.miliseg FROM tbJogador where tbJogador.tipo = 'LD' and posicao = 2;");

                if (!rs.isBeforeFirst()) {
                    String sqlInsert = "INSERT INTO tbJogador(nome,seg,min,miliseg,tipo,posicao)"
                            + "values ( '" + FormFirstMenu.nomeUsuario + "'," + Cronometro.segundosFeitosJogador + "," + Cronometro.minutosFeitosJogador + "," + Cronometro.milisegFeitosJogador + ",'LD', 2 );";
                    stm.executeUpdate(sqlInsert);

                } else {

                    if (Cronometro.segundosFeitosJogador < segundosSegundoLetrasDificil && Cronometro.minutosFeitosJogador <= minutosSegundoLetrasDificil) {

                        String sqlUpdate = "update tbJogador "
                                + " set nome = '" + FormFirstMenu.nomeUsuario + "', miliseg = " + Cronometro.milisegFeitosJogador + ",seg = " + Cronometro.segundosFeitosJogador + ", min = " + Cronometro.minutosFeitosJogador
                                + "  where tipo = 'LD' and posicao = 2;";

                        stm.executeUpdate(sqlUpdate);

                    }

                }

                stm.close();
                conn.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }

        if (Cronometro.segundosFeitosJogador == segundosSegundoLetrasDificil && Cronometro.minutosFeitosJogador == minutosSegundoLetrasDificil && Cronometro.milisegFeitosJogador < milisegSegundoLetrasDificil) {
            //Segundo Miliseg
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbJoguinho", "root", "");
                Statement stm = conn.createStatement();

                String sqlUpdate = "update tbJogador "
                        + " set nome = '" + FormFirstMenu.nomeUsuario + "', miliseg = " + Cronometro.milisegFeitosJogador + ",seg = " + Cronometro.segundosFeitosJogador + ", min = " + Cronometro.minutosFeitosJogador
                        + "  where tipo = 'LD' and posicao = 2;";

                stm.executeUpdate(sqlUpdate);

                stm.close();
                conn.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
        if (Cronometro.segundosFeitosJogador > segundosSegundoLetrasDificil && Cronometro.segundosFeitosJogador < segundosTerceiroLetrasDificil && Cronometro.minutosFeitosJogador <= minutosTerceiroLetrasDificil) {
            //Terceiro
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbJoguinho", "root", "");
                Statement stm = conn.createStatement();

                ResultSet rs = stm.executeQuery("SELECT tbJogador.posicao as posicao, tbJogador.min, tbJogador.seg, tbJogador.miliseg FROM tbJogador where tbJogador.tipo = 'LD' and posicao = 3;");

                if (!rs.isBeforeFirst()) {

                    String sqlInsert = "INSERT INTO tbJogador(nome,seg,min,miliseg,tipo,posicao)"
                            + "values ( '" + FormFirstMenu.nomeUsuario + "'," + Cronometro.segundosFeitosJogador + "," + Cronometro.minutosFeitosJogador + "," + Cronometro.milisegFeitosJogador + ",'LD', 3 );";
                    stm.executeUpdate(sqlInsert);

                } else {

                    if (Cronometro.segundosFeitosJogador < segundosTerceiroLetrasDificil && Cronometro.minutosFeitosJogador <= minutosTerceiroLetrasDificil) {

                        String sqlUpdate = "update tbJogador "
                                + " set nome = '" + FormFirstMenu.nomeUsuario + "', miliseg = " + Cronometro.milisegFeitosJogador + ",seg = " + Cronometro.segundosFeitosJogador + ", min = " + Cronometro.minutosFeitosJogador
                                + "  where tipo = 'LD' and posicao = 3;";

                        stm.executeUpdate(sqlUpdate);

                    }
                }

                stm.close();
                conn.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        if (Cronometro.segundosFeitosJogador == segundosTerceiroLetrasDificil && Cronometro.minutosFeitosJogador == minutosTerceiroLetrasDificil && Cronometro.milisegFeitosJogador < milisegTerceiroLetrasDificil) {
            //Terceiro MIliseg

            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbJoguinho", "root", "");
                Statement stm = conn.createStatement();

                String sqlUpdate = "update tbJogador "
                        + " set nome = '" + FormFirstMenu.nomeUsuario + "', miliseg = " + Cronometro.milisegFeitosJogador + ",seg = " + Cronometro.segundosFeitosJogador + ", min = " + Cronometro.minutosFeitosJogador
                        + "  where tipo = 'LD' and posicao = 3;";
                stm.executeUpdate(sqlUpdate);

                stm.close();
                conn.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

    } //OK
    public void numeroHard(){
         
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbJoguinho", "root", "");
            Statement stm = conn.createStatement();

            ResultSet rs = stm.executeQuery("SELECT tbJogador.posicao, tbJogador.min, tbJogador.seg, tbJogador.miliseg FROM tbJogador where tbJogador.tipo = 'ND';");

            if (!rs.wasNull()) {
                while (rs.next()) {

                    if (rs.getInt("posicao") == 1) {
                        segundosPrimeiroNumeroDificil = rs.getInt("seg");
                        minutosPrimeiroNumeroDificil = rs.getInt("min");
                        milisegPrimeiroNumeroDificil = rs.getInt("miliseg");
                    }
                    if (rs.getInt("posicao") == 2) {
                        segundosSegundoNumeroDificil = rs.getInt("seg");
                        minutosSegundoNumeroDificil = rs.getInt("min");
                        milisegSegundoNumeroDificil = rs.getInt("miliseg");
                    }
                    if (rs.getInt("posicao") == 3) {
                        segundosTerceiroNumeroDificil = rs.getInt("seg");
                        minutosTerceiroNumeroDificil = rs.getInt("min");
                        milisegTerceiroNumeroDificil = rs.getInt("miliseg");
                    }
                }

            }

            stm.close();
            conn.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
        if (Cronometro.segundosFeitosJogador < segundosPrimeiroNumeroDificil && Cronometro.minutosFeitosJogador <= minutosPrimeiroNumeroDificil) {
            //Primeiro
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbJoguinho", "root", "");
                Statement stm = conn.createStatement();

                ResultSet rs = stm.executeQuery("SELECT tbJogador.posicao as posicao, tbJogador.min, tbJogador.seg, tbJogador.miliseg FROM tbJogador where tbJogador.tipo = 'ND' and posicao = 1;");

                if (!rs.isBeforeFirst()) {
                    String sqlInsert = "INSERT INTO tbJogador(nome,seg,min,miliseg,tipo,posicao)"
                            + "values ( '" + FormFirstMenu.nomeUsuario + "'," + Cronometro.segundosFeitosJogador + "," + Cronometro.minutosFeitosJogador + "," + Cronometro.milisegFeitosJogador + ",'ND', 1 );";
                    stm.executeUpdate(sqlInsert);

                } else {

                    if (Cronometro.segundosFeitosJogador < segundosPrimeiroNumeroDificil && Cronometro.minutosFeitosJogador <= minutosPrimeiroNumeroDificil) {

                        String sqlUpdate = "update tbJogador "
                                + " set nome = '" + FormFirstMenu.nomeUsuario + "', miliseg = " + Cronometro.milisegFeitosJogador + ",seg = " + Cronometro.segundosFeitosJogador + ", min = " + Cronometro.minutosFeitosJogador
                                + "  where tipo = 'ND' and posicao = 1;";

                        stm.executeUpdate(sqlUpdate);

                    }

                }

                stm.close();
                conn.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        if (Cronometro.segundosFeitosJogador == segundosPrimeiroNumeroDificil && Cronometro.minutosFeitosJogador == minutosPrimeiroNumeroDificil && Cronometro.milisegFeitosJogador < milisegPrimeiroNumeroDificil) {
            //primeiro Miliseg
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbJoguinho", "root", "");
                Statement stm = conn.createStatement();

                String sqlUpdate = "update tbJogador "
                        + " set nome = '" + FormFirstMenu.nomeUsuario + "', miliseg = " + Cronometro.milisegFeitosJogador + ",seg = " + Cronometro.segundosFeitosJogador + ", min = " + Cronometro.minutosFeitosJogador
                        + "  where tipo = 'ND' and posicao = 1;";

                stm.executeUpdate(sqlUpdate);

                stm.close();
                conn.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }

        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        if (Cronometro.segundosFeitosJogador > segundosPrimeiroNumeroDificil && Cronometro.segundosFeitosJogador < segundosSegundoNumeroDificil && Cronometro.minutosFeitosJogador <= minutosSegundoNumeroDificil) {
            //segundo
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbJoguinho", "root", "");
                Statement stm = conn.createStatement();

                ResultSet rs = stm.executeQuery("SELECT tbJogador.posicao as posicao, tbJogador.min, tbJogador.seg, tbJogador.miliseg FROM tbJogador where tbJogador.tipo = 'ND' and posicao = 2;");

                if (!rs.isBeforeFirst()) {
                    String sqlInsert = "INSERT INTO tbJogador(nome,seg,min,miliseg,tipo,posicao)"
                            + "values ( '" + FormFirstMenu.nomeUsuario + "'," + Cronometro.segundosFeitosJogador + "," + Cronometro.minutosFeitosJogador + "," + Cronometro.milisegFeitosJogador + ",'ND', 2 );";
                    stm.executeUpdate(sqlInsert);

                } else {

                    if (Cronometro.segundosFeitosJogador < segundosSegundoNumeroDificil && Cronometro.minutosFeitosJogador <= minutosSegundoNumeroDificil) {

                        String sqlUpdate = "update tbJogador "
                                + " set nome = '" + FormFirstMenu.nomeUsuario + "', miliseg = " + Cronometro.milisegFeitosJogador + ",seg = " + Cronometro.segundosFeitosJogador + ", min = " + Cronometro.minutosFeitosJogador
                                + "  where tipo = 'ND' and posicao = 2;";

                        stm.executeUpdate(sqlUpdate);

                    }

                }

                stm.close();
                conn.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }

        if (Cronometro.segundosFeitosJogador == segundosSegundoNumeroDificil && Cronometro.minutosFeitosJogador == minutosSegundoNumeroDificil && Cronometro.milisegFeitosJogador < milisegSegundoNumeroDificil) {
            //Segundo Miliseg
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbJoguinho", "root", "");
                Statement stm = conn.createStatement();

                String sqlUpdate = "update tbJogador "
                        + " set nome = '" + FormFirstMenu.nomeUsuario + "', miliseg = " + Cronometro.milisegFeitosJogador + ",seg = " + Cronometro.segundosFeitosJogador + ", min = " + Cronometro.minutosFeitosJogador
                        + "  where tipo = 'ND' and posicao = 2;";

                stm.executeUpdate(sqlUpdate);

                stm.close();
                conn.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
        if (Cronometro.segundosFeitosJogador > segundosSegundoNumeroDificil && Cronometro.segundosFeitosJogador < segundosTerceiroNumeroDificil && Cronometro.minutosFeitosJogador <= minutosTerceiroNumeroDificil) {
            //Terceiro
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbJoguinho", "root", "");
                Statement stm = conn.createStatement();

                ResultSet rs = stm.executeQuery("SELECT tbJogador.posicao as posicao, tbJogador.min, tbJogador.seg, tbJogador.miliseg FROM tbJogador where tbJogador.tipo = 'ND' and posicao = 3;");

                if (!rs.isBeforeFirst()) {

                    String sqlInsert = "INSERT INTO tbJogador(nome,seg,min,miliseg,tipo,posicao)"
                            + "values ( '" + FormFirstMenu.nomeUsuario + "'," + Cronometro.segundosFeitosJogador + "," + Cronometro.minutosFeitosJogador + "," + Cronometro.milisegFeitosJogador + ",'ND', 3 );";
                    stm.executeUpdate(sqlInsert);

                } else {

                    if (Cronometro.segundosFeitosJogador < segundosTerceiroNumeroDificil && Cronometro.minutosFeitosJogador <= minutosTerceiroNumeroDificil) {

                        String sqlUpdate = "update tbJogador "
                                + " set nome = '" + FormFirstMenu.nomeUsuario + "', miliseg = " + Cronometro.milisegFeitosJogador + ",seg = " + Cronometro.segundosFeitosJogador + ", min = " + Cronometro.minutosFeitosJogador
                                + "  where tipo = 'ND' and posicao = 3;";

                        stm.executeUpdate(sqlUpdate);

                    }
                }

                stm.close();
                conn.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        if (Cronometro.segundosFeitosJogador == segundosTerceiroNumeroDificil && Cronometro.minutosFeitosJogador == minutosTerceiroNumeroDificil && Cronometro.milisegFeitosJogador < milisegTerceiroNumeroDificil) {
            //Terceiro MIliseg

            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbJoguinho", "root", "");
                Statement stm = conn.createStatement();

                String sqlUpdate = "update tbJogador "
                        + " set nome = '" + FormFirstMenu.nomeUsuario + "', miliseg = " + Cronometro.milisegFeitosJogador + ",seg = " + Cronometro.segundosFeitosJogador + ", min = " + Cronometro.minutosFeitosJogador
                        + "  where tipo = 'ND' and posicao = 3;";
                stm.executeUpdate(sqlUpdate);

                stm.close();
                conn.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        
    }//OK
    public void imagemHard(){
          
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbJoguinho", "root", "");
            Statement stm = conn.createStatement();

            ResultSet rs = stm.executeQuery("SELECT tbJogador.posicao, tbJogador.min, tbJogador.seg, tbJogador.miliseg FROM tbJogador where tbJogador.tipo = 'ID';");

            if (!rs.wasNull()) {
                while (rs.next()) {

                    if (rs.getInt("posicao") == 1) {
                        segundosPrimeiroImagemDificil = rs.getInt("seg");
                        minutosPrimeiroImagemDificil = rs.getInt("min");
                        milisegPrimeiroImagemDificil = rs.getInt("miliseg");
                    }
                    if (rs.getInt("posicao") == 2) {
                        segundosSegundoImagemDificil = rs.getInt("seg");
                        minutosSegundoImagemDificil = rs.getInt("min");
                        milisegSegundoImagemDificil = rs.getInt("miliseg");
                    }
                    if (rs.getInt("posicao") == 3) {
                        segundosTerceiroImagemDificil = rs.getInt("seg");
                        minutosTerceiroImagemDificil = rs.getInt("min");
                        milisegTerceiroImagemDificil = rs.getInt("miliseg");
                    }
                }

            }

            stm.close();
            conn.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
        if (Cronometro.segundosFeitosJogador < segundosPrimeiroImagemDificil && Cronometro.minutosFeitosJogador <= minutosPrimeiroImagemDificil) {
            //Primeiro
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbJoguinho", "root", "");
                Statement stm = conn.createStatement();

                ResultSet rs = stm.executeQuery("SELECT tbJogador.posicao as posicao, tbJogador.min, tbJogador.seg, tbJogador.miliseg FROM tbJogador where tbJogador.tipo = 'ID' and posicao = 1;");

                if (!rs.isBeforeFirst()) {
                    String sqlInsert = "INSERT INTO tbJogador(nome,seg,min,miliseg,tipo,posicao)"
                            + "values ( '" + FormFirstMenu.nomeUsuario + "'," + Cronometro.segundosFeitosJogador + "," + Cronometro.minutosFeitosJogador + "," + Cronometro.milisegFeitosJogador + ",'ID', 1 );";
                    stm.executeUpdate(sqlInsert);

                } else {

                    if (Cronometro.segundosFeitosJogador < segundosPrimeiroImagemDificil && Cronometro.minutosFeitosJogador <= minutosPrimeiroImagemDificil) {

                        String sqlUpdate = "update tbJogador "
                                + " set nome = '" + FormFirstMenu.nomeUsuario + "', miliseg = " + Cronometro.milisegFeitosJogador + ",seg = " + Cronometro.segundosFeitosJogador + ", min = " + Cronometro.minutosFeitosJogador
                                + "  where tipo = 'ID' and posicao = 1;";

                        stm.executeUpdate(sqlUpdate);

                    }

                }

                stm.close();
                conn.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        if (Cronometro.segundosFeitosJogador == segundosPrimeiroImagemDificil && Cronometro.minutosFeitosJogador == minutosPrimeiroImagemDificil && Cronometro.milisegFeitosJogador < milisegPrimeiroImagemDificil) {
            //primeiro Miliseg
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbJoguinho", "root", "");
                Statement stm = conn.createStatement();

                String sqlUpdate = "update tbJogador "
                        + " set nome = '" + FormFirstMenu.nomeUsuario + "', miliseg = " + Cronometro.milisegFeitosJogador + ",seg = " + Cronometro.segundosFeitosJogador + ", min = " + Cronometro.minutosFeitosJogador
                        + "  where tipo = 'ID' and posicao = 1;";

                stm.executeUpdate(sqlUpdate);

                stm.close();
                conn.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }

        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        if (Cronometro.segundosFeitosJogador > segundosPrimeiroImagemDificil && Cronometro.segundosFeitosJogador < segundosSegundoImagemDificil && Cronometro.minutosFeitosJogador <= minutosSegundoImagemDificil) {
            //segundo
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbJoguinho", "root", "");
                Statement stm = conn.createStatement();

                ResultSet rs = stm.executeQuery("SELECT tbJogador.posicao as posicao, tbJogador.min, tbJogador.seg, tbJogador.miliseg FROM tbJogador where tbJogador.tipo = 'ID' and posicao = 2;");

                if (!rs.isBeforeFirst()) {
                    String sqlInsert = "INSERT INTO tbJogador(nome,seg,min,miliseg,tipo,posicao)"
                            + "values ( '" + FormFirstMenu.nomeUsuario + "'," + Cronometro.segundosFeitosJogador + "," + Cronometro.minutosFeitosJogador + "," + Cronometro.milisegFeitosJogador + ",'ID', 2 );";
                    stm.executeUpdate(sqlInsert);

                } else {

                    if (Cronometro.segundosFeitosJogador < segundosSegundoImagemDificil && Cronometro.minutosFeitosJogador <= minutosSegundoImagemDificil) {

                        String sqlUpdate = "update tbJogador "
                                + " set nome = '" + FormFirstMenu.nomeUsuario + "', miliseg = " + Cronometro.milisegFeitosJogador + ",seg = " + Cronometro.segundosFeitosJogador + ", min = " + Cronometro.minutosFeitosJogador
                                + "  where tipo = 'ID' and posicao = 2;";

                        stm.executeUpdate(sqlUpdate);

                    }

                }

                stm.close();
                conn.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }

        if (Cronometro.segundosFeitosJogador == segundosSegundoImagemDificil && Cronometro.minutosFeitosJogador == minutosSegundoImagemDificil && Cronometro.milisegFeitosJogador < milisegSegundoImagemDificil) {
            //Segundo Miliseg
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbJoguinho", "root", "");
                Statement stm = conn.createStatement();

                String sqlUpdate = "update tbJogador "
                        + " set nome = '" + FormFirstMenu.nomeUsuario + "', miliseg = " + Cronometro.milisegFeitosJogador + ",seg = " + Cronometro.segundosFeitosJogador + ", min = " + Cronometro.minutosFeitosJogador
                        + "  where tipo = 'ID' and posicao = 2;";

                stm.executeUpdate(sqlUpdate);

                stm.close();
                conn.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
        if (Cronometro.segundosFeitosJogador > segundosSegundoImagemDificil && Cronometro.segundosFeitosJogador < segundosTerceiroImagemDificil && Cronometro.minutosFeitosJogador <= minutosTerceiroImagemDificil) {
            //Terceiro
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbJoguinho", "root", "");
                Statement stm = conn.createStatement();

                ResultSet rs = stm.executeQuery("SELECT tbJogador.posicao as posicao, tbJogador.min, tbJogador.seg, tbJogador.miliseg FROM tbJogador where tbJogador.tipo = 'ID' and posicao = 3;");

                if (!rs.isBeforeFirst()) {

                    String sqlInsert = "INSERT INTO tbJogador(nome,seg,min,miliseg,tipo,posicao)"
                            + "values ( '" + FormFirstMenu.nomeUsuario + "'," + Cronometro.segundosFeitosJogador + "," + Cronometro.minutosFeitosJogador + "," + Cronometro.milisegFeitosJogador + ",'ID', 3 );";
                    stm.executeUpdate(sqlInsert);

                } else {

                    if (Cronometro.segundosFeitosJogador < segundosTerceiroImagemDificil && Cronometro.minutosFeitosJogador <= minutosTerceiroImagemDificil) {

                        String sqlUpdate = "update tbJogador "
                                + " set nome = '" + FormFirstMenu.nomeUsuario + "', miliseg = " + Cronometro.milisegFeitosJogador + ",seg = " + Cronometro.segundosFeitosJogador + ", min = " + Cronometro.minutosFeitosJogador
                                + "  where tipo = 'ID' and posicao = 3;";

                        stm.executeUpdate(sqlUpdate);

                    }
                }

                stm.close();
                conn.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        if (Cronometro.segundosFeitosJogador == segundosTerceiroImagemDificil && Cronometro.minutosFeitosJogador == minutosTerceiroImagemDificil && Cronometro.milisegFeitosJogador < milisegTerceiroImagemDificil) {
            //Terceiro MIliseg

            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbJoguinho", "root", "");
                Statement stm = conn.createStatement();

                String sqlUpdate = "update tbJogador "
                        + " set nome = '" + FormFirstMenu.nomeUsuario + "', miliseg = " + Cronometro.milisegFeitosJogador + ",seg = " + Cronometro.segundosFeitosJogador + ", min = " + Cronometro.minutosFeitosJogador
                        + "  where tipo = 'ID' and posicao = 3;";
                stm.executeUpdate(sqlUpdate);

                stm.close();
                conn.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }//OK
    
    
    
}
