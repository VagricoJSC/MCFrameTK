package mcframe.serverMAUD.MAUDL5010;

import static mcframe.serverCore.requester.MCRequestObject.*;

import java.util.List;
import java.util.Arrays;

import mcframe.commonMAUD.MAUDC0030.MAUDC_RLBase;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.util.MCCollectionUtil;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import mcframe.serverFXBA.FXBAL0060.FXBAL_MCRLUtil;
import mcframe.serverFXUC.FXUCL0010.FXUCL_DataUtil;
import mcframe.serverMA.dbc.MAM_USR_R;

public class MAUDL_RLUtil_MC extends FXBAL_MCRLUtil {
	

	private static final Class<MAUDL_RLUtil> _clazz = MAUDL_RLUtil.class;

	/**
	 * ロジック共通の登録担当者名カラム名を取得します。<p>
	 */
	public static String getInsUsrNmColumn(){
		return object(_clazz)._getInsUsrNmColumn();
	}
	/**
	 * ロジック共通の登録担当者名カラム名を取得します。<p>
	 */
	protected String _getInsUsrNmColumn(){
		return MAUDC_RLBase.getInsUsrNmColumn();
	}
	/**
	 * ロジック共通の更新担当者名カラム名を取得します。<p>
	 */
	public static String getUpdUsrNmColumn(){
		return object(_clazz)._getUpdUsrNmColumn();
	}
	/**
	 * ロジック共通の更新担当者名カラム名を取得します。<p>
	 */
	protected String _getUpdUsrNmColumn(){
		return MAUDC_RLBase.getUpdUsrNmColumn();
	}
	/**
	 * ロジック共通の論理削除担当者名カラム名を取得します。<p>
	 */
	public static String getDelUsrNmColumn(){
		return object(_clazz)._getDelUsrNmColumn();
	}
	/**
	 * ロジック共通の論理削除担当者名カラム名を取得します。<p>
	 */
	protected String _getDelUsrNmColumn(){
		return MAUDC_RLBase.getDelUsrNmColumn();
	}

	/**更新関係のカラム名の配列を取得します。*/
	protected static String[] getUpdColNames(){
		return object(_clazz)._getUpdColNames();
	}

	/**更新関係のカラム名の配列を取得します。*/
	@Override
	protected String[] _getUpdColNames(){
		return MCCollectionUtil.concat(super.getUpdColNames(), new String[]{
			getInsUsrNmColumn(),getUpdUsrNmColumn()
		});
	}	
	
	// //////////////////////////////////////////////////
	// ＤＢＣ用ユーティリティー（ここから）
	// //////////////////////////////////////////////////

	protected String _updUsrTableAliasPref = "UPD_USR";
	protected String _insUsrTableAliasPref = "INS_USR";
	protected String _delUsrTableAliasPref = "DEL_USR";
	
	/**
	 * DBCにUPD_USR_NM,INS_USR_NM,DEL_USR_NM を取得させる設定を追加します。
	 * <p>
	 * upd_usr_id, ins_usr_id, del_usr_id を持たない、テーブル、ビューを検索する場合は、<br>
	 * この処理を行わせないでください。
	 */
	public static <R extends MCDBContainer> void setSelectUsrNm(MCQueryApiBuilder builder) {
		object(_clazz)._setSelectUsrNm(builder);
	}
	@SuppressWarnings({ "unchecked", "rawtypes" })
	protected <R extends MCDBContainer> void _setSelectUsrNm(MCQueryApiBuilder builder) {
		MCPermColumn upd_usr_id = builder.getBaseDbc().getColumn$("upd_usr_id");
		if (upd_usr_id != null) {
			String updUsrAlias = getUsrAliasName(builder.getBaseDbc(), _updUsrTableAliasPref);
			MAM_USR_R USR = MAM_USR_R.create(updUsrAlias);
			builder.addSelect(_getUpdUsrNmColumn(), USR.usr_nm.as("upd_usr_nm"));
			builder.addLeftOuterJoin(USR, MCQueryApiBuilder.makeEq(upd_usr_id, USR.usr_cd));
		}
		MCPermColumn ins_usr_id = builder.getBaseDbc().getColumn$("ins_usr_id");
		if (ins_usr_id != null) {
			String insUsrAlias = getUsrAliasName(builder.getBaseDbc(), _insUsrTableAliasPref);
			MAM_USR_R USR = MAM_USR_R.create(insUsrAlias);
			builder.addSelect(_getInsUsrNmColumn(), USR.usr_nm.as("ins_usr_nm"));
			builder.addLeftOuterJoin(USR, MCQueryApiBuilder.makeEq(ins_usr_id, USR.usr_cd));
		}
		MCPermColumn del_usr_id = builder.getBaseDbc().getColumn$("del_usr_id");
		if (del_usr_id != null) {
			String delUsrAlias = getUsrAliasName(builder.getBaseDbc(), _delUsrTableAliasPref);
			MAM_USR_R USR = MAM_USR_R.create(delUsrAlias);
			builder.addSelect(_getDelUsrNmColumn(), USR.usr_nm.as("del_usr_nm"));
			builder.addLeftOuterJoin(USR, MCQueryApiBuilder.makeEq(del_usr_id, USR.usr_cd));
		}
	}

	/**
	 * 更新者名、登録者名用の表別名用文字列を返します。<p>
	 * DB定義に指定されていない表別名を返します。
	 * 
	 */
	protected String getUsrAliasName(MCDBContainer dbc, String pref, String... exptAlias) {
		int cnt = 0;
		return getUsrAliasNameSub(dbc, pref, cnt, exptAlias);
	}

	protected String getUsrAliasNameSub(MCDBContainer dbc, String pref, int cnt, String... exptAlias) {
		String uAlias = pref + String.valueOf(cnt);
		if (dbc.getForeignInfoNE(uAlias) != null) {
			return getUsrAliasNameSub(dbc, pref, cnt + 1);
		}
		for (String c : exptAlias) {
			if (FXUCL_DataUtil.isSame(uAlias, c)) {
				return getUsrAliasNameSub(dbc, pref, cnt + 1);
			}
		}
		return uAlias;
	}
	
	/** 
	 * 下り電文のRowのカラムに DBコンテナのRow の担当者名の値を設定します。<p> 
	 */
	public static void setUsrNm(MCRow r_dest, MCRow r_src) {
		object(_clazz)._setUsrNm(r_dest, r_src);		
	}
	protected void _setUsrNm(MCRow r_dest, MCRow r_src) {
		List<String> l = Arrays.asList(r_src.getColumnPathArray());
		if (l.contains("upd_usr_id")) {
			r_dest.setValueNE(_getUpdUsrNmColumn(), r_src.getValueNE(_getUpdUsrNmColumn()));
		}
		if (l.contains("ins_usr_id")) {
			r_dest.setValueNE(_getInsUsrNmColumn(), r_src.getValueNE(_getInsUsrNmColumn()));
		}
		if (l.contains("del_usr_id")) {
			r_dest.setValueNE(_getDelUsrNmColumn(), r_src.getValueNE(_getDelUsrNmColumn()));
		}
	}
	// //////////////////////////////////////////////////
	// ＤＢＣ用ユーティリティー（ここまで）
	// //////////////////////////////////////////////////
}

