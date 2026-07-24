package mcframe.serverMAUD.MAUDL5030;

import static mcframe.serverCore.queryapi.IFMCSQL.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import mcframe.commonCore.container.MCContainer;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.lang.MCBooleanUtil;
import mcframe.serverCore.logic.MCController;
import mcframe.serverCore.logic.MCDBSubOperation;
import mcframe.serverCore.logic.MCOperation;
import mcframe.serverCore.mcjdbc.MCDatabaseManager;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverFXBA.FXBAL0050.FXBAL_MCRLSearcher;
import mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;

public abstract class MAUDL_RLSearcher_MC extends FXBAL_MCRLSearcher {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MA";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MAUD";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MAUDL5030";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	// //////////////////////////////////////////
	// 検索前処理（ここから）
	// //////////////////////////////////////////

	/**論理削除ＦＬＧのカラム名*/
	protected static final String _delFlagColName = "del_flg";
	/**検索条件、論理削除ＦＬＧ（オン／オフ）のカラム名*/
	protected static final String _onDelFlagColName = "on_del_flg";
	protected static final String _offDelFlagColName = "off_del_flg";

	protected String _delFlgStr;

	// //////////////////////////////////////////
	// 論理削除フラグ制御オフ処理（ここから）
	// //////////////////////////////////////////
	
	protected String _orgDelFlgCtl = null;
	protected String _orgReleaseFlgCtl = null;
	@Override
	protected void call() {
		setDelFlgCtl(isDelFlgCtl());
		setReleaseFlgCtl(isReleaseFlgCtl());
		try {
			super.call();
		}
		finally {
			rvrsDelFlgCtl();
			rvrsReleaseFlgCtl();
		}
	}
	
	/**
	 * 論理削除フラグ制御のオン・オフを取得します。<p>
	 * デフォルトではfalseを返します。
	 */
	protected boolean isDelFlgCtl() {
		return false;
	}

	/**
	 * 論理削除フラグ制御のオン・オフを設定します。<p>
	 * @param flg 論理削除フラグ制御のオン・オフ
	 */
	protected void setDelFlgCtl(boolean flg) {
		MCRow r = MCRow.create();
		sql(createSqlId("MAUDL5030", "MAPA_CONTEXT$F_GET_DEL_FLG_CTL", "MAUDL_RLSearcher_setDelFlgCtl"))
		.mainQuery().select(
				MAPA_CONTEXT$F_GET_DEL_FLG_CTL().as("del_flg_ctl")
				).executeQuery(r);
		_orgDelFlgCtl = r.getString("del_flg_ctl");
		r.setString("del_flg_ctl", MCBooleanUtil.booleanToDBString(flg));
		String procid = "MAPA_CONTEXT$SET_DEL_FLG_CTL";
		execProc(createSqlId("MAUDL5030", procid, "MAUDL_RLSearcher_setDelFlgCtl")
				, procid, r, ":del_flg_ctl");
	}

	/**
	 * リリースフラグ制御のオン・オフを取得します。<p>
	 * デフォルトではfalseを返します。<p>
	 */
	protected boolean isReleaseFlgCtl() {
		return false;
	}

	/**
	 * リリースフラグ制御のオン・オフを設定します。<p>
	 * @param flg リリースフラグ制御のオン・オフ<p>
	 */
	protected void setReleaseFlgCtl(boolean flg) {
		MCRow r = MCRow.create();
		sql(createSqlId("MAUDL5030", "MAPA_CONTEXT$F_GET_RELEASE_FLG_CTL", "MAUDL_RLSearcher_setReleaseFlgCtl"))
		.mainQuery().select(
				MAPA_CONTEXT$F_GET_RELEASE_FLG_CTL().as("release_flg_ctl")
				).executeQuery(r);
		_orgReleaseFlgCtl = r.getString("release_flg_ctl");
		r.setString("release_flg_ctl", MCBooleanUtil.booleanToDBString(flg));
		String procid = "MAPA_CONTEXT$SET_RELEASE_FLG_CTL";
		execProc(createSqlId("MAUDL5030", procid, "MAUDL_RLSearcher_setReleaseFlgCtl")
				, procid, r, ":release_flg_ctl");
	}

	/**
	 * 論理削除フラグを戻す。<p>
	 */
	protected void rvrsDelFlgCtl() {
		MCRow r = MCRow.create();
		r.addStringColumn("del_flg_ctl", _orgDelFlgCtl);
		String procid = "MAPA_CONTEXT$SET_DEL_FLG_CTL";
		execProc(createSqlId("MAUDL5030", procid, "MAUDL_RLSearcher_rvrsDelFlgCtl")
				, procid, r, ":del_flg_ctl");

	}

	/**
	 * リリースフラグ制御のオン・オフを戻す。<p>
	 */
	protected void rvrsReleaseFlgCtl() {
		MCRow r = MCRow.create();
		r.addStringColumn("release_flg_ctl", _orgReleaseFlgCtl);
		String procid = "MAPA_CONTEXT$SET_RELEASE_FLG_CTL";
		execProc(createSqlId("MAUDL5030", procid, "MAUDL_RLSearcher_rvrsReleaseFlgCtl")
				, procid, r, ":release_flg_ctl");

	}

	// //////////////////////////////////////////
	// 論理削除フラグ制御オフ処理（ここまで）
	// //////////////////////////////////////////
	
	@Override
	protected void condCustomize(MCRow cond) {
		super.condCustomize(cond);
		if (cond == null) {
			return;
		}
		checkDelFlagCnd(cond);
	}
	
	protected boolean _hasDelFlag;
	/**
	 * del_flgの検索条件の有無を確認します。
	 * 
	 */
	protected void checkDelFlagCnd(MCRow r) {
		_hasDelFlag = r.contains(_onDelFlagColName);
		if (_hasDelFlag) {
			_delFlgStr = getDelFlgStr(r);
			r.setStringNE(_delFlagColName, _delFlgStr);
		}
	}

	protected String getDelFlgStr(MCRow r) {
		boolean onDelFlg = r.getBoolean(_onDelFlagColName);
		boolean offDelFlg = r.getBoolean(_offDelFlagColName);

		if (onDelFlg == offDelFlg) {
			return null;
		}
		else if (onDelFlg) {
			return MCBooleanUtil.booleanToDBString(true);
		}
		else {
			return MCBooleanUtil.booleanToDBString(false);
		}
	}

	@Override
	protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder, MCList<R> rslt) {
		super.dbcCustomize(builder, rslt);
		addDelFlagCnd(builder);
		
	}

	protected void addDelFlagCnd(MCQueryApiBuilder builder) {
		if (_hasDelFlag && existsDelFlg(builder)) {
			MCPermColumn del_flg = builder.getBaseDbc().getColumn$("del_flg");
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeEq(del_flg, bind(_delFlagColName)));
		}
	}

	protected boolean existsDelFlg(MCQueryApiBuilder builder) {
		for (String c : builder.getBaseDbc().getColumnPathArray()) {
			if (c.equals(_delFlagColName)) {
				return true;
			}
		}
		return false;
	}

	// 上り項目設定
	protected void up() {
		super.up();

		for (String grp : getOtherSelectGrpNames()) {
			mapUpContainers(grp);
		}
	}
	
	// 連携ロジック実行
	// MCDBController のジェネリクス
	protected void doIt() {
		super.doIt();

		// メインの検索結果がなければ、以降は検索しない
		if (checkDtlNoSelect()) {
			return;
		}

		for (String grp : getOtherSelectGrpNames()) {
			doIt(grp);
		}
	}
	/**
	 * メインのマスタの検索で検索結果が無かったとき、trueを返す
	 */
	protected boolean checkDtlNoSelect() {
		for (MCController ctrl : getSubOpes(SELECT)) {
			if (ctrl instanceof MCDBSubOperation) {
				@SuppressWarnings("unchecked")
				List<MCDBContainer> dbc = (List<MCDBContainer>) ((MCDBSubOperation<?>) ctrl)
						.down0;
				if (!dbc.isEmpty()) {
					return false;
				}
			}
			else if (ctrl instanceof MCOperation) {
				if (!((MCOperation) ctrl).down(0).isEmpty()) {
					return false;
				}
			}
		}
		return true;
	}
	protected void doIt(String grp) {
		for (MCController ctrl : getSubOpes(grp)) {
			if (ctrl instanceof MCDBSubOperation) {
				_ctrl = ctrl;
				MCRow cond = getCond(ctrl);
				
				MCQueryApiBuilder builder =((MCDBSubOperation<?>) ctrl).builder();
				@SuppressWarnings("unchecked")
				MCList<MCDBContainer> rslt = (MCList<MCDBContainer>) ((MCDBSubOperation<?>) ctrl).down0;

				dbSelect(builder, cond, rslt, ctrl);
			}
			else if (ctrl instanceof MCOperation) {
				((MCOperation) ctrl).exec();
			}
		}
	}

	// 下り項目設定
	protected void down() {
		super.down();

		for (String grp : getOtherSelectGrpNames()) {
			mapDownContainers(grp);
			downColumnsData(grp);
		}
	}
	protected void downColumnsData(String grp) {
		for (MCController ctrl : getSubOpes(grp)) {
			if (ctrl instanceof MCDBSubOperation) {
				MCList<?> dbc = ((MCDBSubOperation<?>) ctrl).down0;
				MCContainer c = down(getDownBlockNumber(grp, ctrl));

				// 定数名の設定
				MAUCL_MCDataUtil.setConstNm(c);
				// 機能名の設定
				MAUCL_MCDataUtil.setFuncNm(c);

				if (c instanceof MCList) {
					@SuppressWarnings("unchecked")
					MCList<MCRow> down = (MCList<MCRow>) c;
					for (int i = 0; i < down.size(); i++) {
						downColumnsData(down.get(i), dbc.get(i));
					}
				}
			}
		}
	}
	protected int getDownBlockNumber(String grp, MCController ctrl) {
		if (grp.equals(SELECT)) {
			// SELECTサブオペレーショングループは先頭
			int i = 0;
			for (MCController c : getSubOpes(SELECT)) {
				if (ctrl == c) {
					return i;
				}
				i++;
			}
		}
		else {
			int i = getSubOpes(SELECT).size();
			for (String g : getOtherSelectGrpNames()) {
				for (MCController c : getSubOpes(g)) {
					if (ctrl == c) {
						return i;
					}
					i++;
				}
			}
		}
		return -1;
	}
	
	/**
	 * 「SELECT」以外の「SELECT」で始まるサブオペレーショングループ名を返す
	 */
	protected List<String> getOtherSelectGrpNames() {
		List<String> l = new ArrayList<String>();
		for (String grp : getGrpNames()) {
			if (grp.startsWith(SELECT) && !grp.equals(SELECT)) {
				l.add(grp);
			}
		}
		Collections.sort(l);
		return l;
	}

	@SuppressWarnings("unchecked")
	protected MCList<MCRow> getDown(MCController ctrl) {
		MCContainer c = ctrl.down(0);
		if (c instanceof MCList){
			return (MCList<MCRow>)c;
		}
		return null;
	}

	// //////////////////////////////////////////
	// 検索前処理（ここまで）
	// //////////////////////////////////////////
	
	
	// //////////////////////////////////////////
	// 検索後処理（ここから）
	// //////////////////////////////////////////
	@Override
	protected void downColumnsData() {
		super.downColumnsData();

		// 定数名の設定
		MAUCL_MCDataUtil.setConstNm(down(0));
		// 機能名の設定
		MAUCL_MCDataUtil.setFuncNm(down(0));
	}

	// //////////////////////////////////////////
	// 検索後処理（ここまで）
	// //////////////////////////////////////////

}

