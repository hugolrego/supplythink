package org.br.smartsupply.utils;

public class JdbcUtils {

	public static final String USUARIO_POR_LOGIN = "select login,senha, ativo, nome from usuario where login = ? ";
	public static final String PERMISSOES_POR_USUARIO = " select u.login,p.nome as nome_permissao FROM USUARIO_PERMISSAO up "
													  +" JOIN USUARIO u on u.id = up.usuario_id " 
													  +" join PERMISSAO p ON p.id = up.permissao_id "
													  +" WHERE u.login = ? ";
	public static final String PERMISSOES_POR_GRUPO = "  select g.id, g.nome,p.nome as nome_permissao  FROM GRUPO_PERMISSAO gp "
													  +" JOIN GRUPO g on g.id = gp.grupo_id "
													  +" join PERMISSAO p ON p.id = gp.permissao_id "
													  +" JOIN USUARIO_GRUPO ug on gp.grupo_id = g.id "
													  +" JOIN USUARIO u on u.id = ug.usuario_id "
													  +" WHERE u.login = ? ";
	
	
}
