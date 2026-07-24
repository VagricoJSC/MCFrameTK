package mcframe.serverMAUD.MAUDL6020;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import mcframe.commonCore.container.MCContainer;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.notice.MCLog;
import mcframe.serverCore.logic.MCController;
import mcframe.serverCore.logic.MCDBSubOperation;
import mcframe.serverCore.logic.MCOperation;
import mcframe.serverCore.queryapi.IFMCFMSQL.MCFMExpr;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import mcframe.serverCore.resource.MCConfig;
import mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil;
import mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil;
import mcframe.serverMAUD.MAUDL6010.MAUDL_RLSearcher;
import static mcframe.commonFX.notice.FX_Msg.*;
import mcframe.commonCore.lang.MCDataType;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import static mcframe.serverFXUC.FXUCL0010.FXUCL_DataUtil.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;

public abstract class MAUDL_LCLRLSearcher_MC extends MAUDL_RLSearcher {

	protected static final String SELECT_LCL = "SELECT_LCL";

	protected MCDBContainer _wkTbl;
	protected String[] _keyCols;

	// 上り項目設定
	protected void up() {
		super.up();

		for (String grp : getSelectLclGrpNames()) {
			mapUpContainers(grp);
		}
	}

	// 連携ロジック実行
	// MCDBController のジェネリクス
	protected void doIt() {
		super.doIt();

		// メインの検索結果がなければ、名称マスタは検索しない
		if (checkDtlNoSelect()) {
			return;
		}

		doItLcl();
	}

	/**
	 * メインのマスタの検索で検索結果が無かったとき、trueを返す
	 */
	protected boolean checkDtlNoSelect() {
		for (MCController ctrl : getSubOpes(SELECT)) {
			if (ctrl instanceof MCDBSubOperation) {
				@SuppressWarnings("unchecked")
				MCList<MCDBContainer> rslt = (MCList<MCDBContainer>) ((MCDBSubOperation<?>) ctrl)
						.down0;
				MCDBContainer dbc = (MCDBContainer) ((MCDBSubOperation<?>) ctrl)
						.dbc();
				if (!rslt.isEmpty()) {
					_wkTbl = dbc.getPkWorkDbc("W1");
					if (isNull(_wkTbl)) {
						setCondL(rslt);
					}
					else {
						_condL = MCList.create(MCRow.class);

						// ワークテーブルが存在する場合、メインのマスタの検索結果を格納
						insPkWk(createSqlId("MAUDL6020", _wkTbl, "MAUDL_LCLRLSearcher_I01"), _wkTbl, rslt);
						_keyCols = dbc.getKeyColumn();
					}
					return false;
				}
			}
			else if (ctrl instanceof MCOperation) {
				if (!((MCOperation) ctrl).down(0).isEmpty()) {
					if (((MCOperation) ctrl).down(0) instanceof MCContainer) {
						setCondL(((MCOperation) ctrl).down(0));
					}
					return false;
				}
			}
		}
		return true;
	}

	@SuppressWarnings("unchecked")
	protected void doItLcl() {
		for (String grp : getSelectLclGrpNames()) {
			for (MCController ctrl : getSubOpes(grp)) {
				if (ctrl instanceof MCDBSubOperation) {
					_ctrl = ctrl;

					MCList<MCRow> cond = (MCList<MCRow>)getCondL(ctrl);
					MCQueryApiBuilder builder = ((MCDBSubOperation<?>) ctrl).builder();
					MCList<MCDBContainer> rslt = (MCList<MCDBContainer>) ((MCDBSubOperation<?>) ctrl).down0;
					dbSelectLcl(builder, cond, rslt, ctrl);

				}
				else if (ctrl instanceof MCOperation) {
					((MCOperation) ctrl).exec();
				}
			}
		}
	}

	protected MCList<MCRow> _condL;

	/**
	 * メインのマスタの検索検索結果をロケールの検索条件としてセットする
	 */
	@SuppressWarnings("unchecked")
	protected void setCondL(MCContainer list) {
		String[] nms;
		if (list instanceof MCList && !list.isEmpty() && ((MCList<?>)list).get(0) instanceof MCDBContainer) {
			nms = ((MCDBContainer)((MCList<?>) list).get(0)).getKeyColumn();
		}
		else {
			nms = list.getNameArray();
		}

		_condL = MCList.create(MCRow.class);
		for (MCRow r : (MCList<MCRow>) list) {
			MCRow bindR = MCRow.create();
			for (String nm : nms) {
				if (list.getDataType(nm).equals(MCDataType.STRING)) {
					bindR.addStringColumn(nm, r.getString(nm));
				}
				else if (list.getDataType(nm).equals(MCDataType.NUMBER)) {
					bindR.addNumberColumn(nm, r.getNumber(nm));
				}
				else if (list.getDataType(nm).equals(MCDataType.DATE)) {
					bindR.addDateColumn(nm, r.getDate(nm));
				}
			}
			_condL.add(bindR);
		}
	}

	/** 検索条件のList を取得します。<p>
	 *  SELECTオペレーションで取得した結果を検索条件とします。
	 */
	protected MCList<?> getCondL(MCController ctrl) {
		return _condL;
	}

	/** 引数builderで、引数condを条件にして検索処理を実行します。 */
	protected <R extends MCDBContainer> void dbSelectLcl(MCQueryApiBuilder builder,
			MCList<MCRow> cond, MCList<R> rslt, MCController ctrl) {

		setCanceled(false);
		condCustomizeLcl(cond);
		dbcCustomizeLcl(builder, rslt);

		if (!getCanceled()) {
			// メインマスタの検索結果を条件とした検索（条件ＯＲ結合）
			if (isNull(_wkTbl)) {
				MAUCL_DbUtil.dbSelect(createSqlId("MAUDL6020", builder.getBaseDbc(), "MAUDL_LCLRLSearcher_S01"), rslt, builder, cond);
			}
			// ワークテーブル（メインマスタの検索結果格納）を用いた検索
			else {
				MAUCL_DbUtil.dbSelect(createSqlId("MAUDL6020", builder.getBaseDbc(), "MAUDL_LCLRLSearcher_S02"), rslt, builder);
			}
		}
		else {
			MCLog.write(FXBAL0017);
		}

		afterSelect(rslt);
	}

	/** 検索条件をカスタマイズします。 */
	protected void condCustomizeLcl(MCList<?> cond) {
		// defaultでは何もしません。
	}

	/** ＤＢコンテナをカスタマイズします。*/
	protected <R extends MCDBContainer> void dbcCustomizeLcl(MCQueryApiBuilder builder, MCList<R> rslt) {
		if (isNull(_wkTbl)) {
			setWhereLcl(builder);
		}
		else {
			// ワークテーブルを用いた検索条件の設定
			MAUCL_DbUtil.setSelPkWk(builder, _wkTbl, false, _keyCols);
			MCPermColumn col = builder.getBaseDbc().getColumn$(_delFlagColName);
			if (_hasDelFlag && col != null && !isNull(_delFlgStr)) {
				builder.addWhereWithAnd(MCQueryApiBuilder.makeEq(col, value(_delFlgStr)));
			}
		}
	}

	/** キー項目のWHERE句をカットオフで設定 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	protected <R extends MCDBContainer> void setWhereLcl(MCQueryApiBuilder builder) {
		for (String colnm : builder.getBaseDbc().getKeyColumn()) {
			MCPermColumn col = builder.getBaseDbc().getColumn$(colnm);
			if (col instanceof MCFMExpr) {
				builder.addWhereWithCutOffAnd(((MCFMExpr)col).eq(bind(colnm)));
			}
		}
	}

	// 下り項目設定
	protected void down() {
		super.down();

		for (String grp : getSelectLclGrpNames()) {
			mapDownContainers(grp);
			downColumnsDataLcl(grp);
		}
	}

	protected void downColumnsDataLcl(String grp) {
		MCList<?> dbc = null;

		// 検索結果を持つdbcの取得
		List<MCController> ctrls = getSubOpes(grp);
		MCController ctrl = ctrls.get(0);
		if (ctrl instanceof MCDBSubOperation) {
			dbc = ((MCDBSubOperation<?>) ctrl).down0;
		}
		else {
			return;
		}

		MCContainer c = down(getDownBlockNumber(grp, ctrl));
		if (c instanceof MCList) {
			@SuppressWarnings("unchecked")
			MCList<MCRow> down = (MCList<MCRow>) c;

			for (int i = 0; i < down.size(); i++) {

				downColumnsData(down.get(i), dbc.get(i));

				// ロケールの名称設定
				putNameNE(down.get(i), "lcl_cd", "lcl_nm");
			}
		}
		// 機能名の設定
		MAUCL_MCDataUtil.setFuncNm(c);

	}

	/**
	 * ロケール名称の設定
	 *
	 * @param r 対象行
	 * @param src ロケールＣＤの項目名（"lcl_cd"）
	 * @param tgt ロケール名称の項目名（"lcl_nm"）
	 */
	public static <E extends MCRow> void putNameNE(MCRow r, String src, String tgt) {
		MCList<MCRow> lclLst = MCConfig.common.getEntryLocaleList("lcl_cd", "lcl_nm");
		MCRow row = lclLst.getFirst("lcl_cd", r.getStringNE(src));
		if (row != null) {
			r.setStringNE(tgt, row.getStringNE("lcl_nm"));
		}
	}

	/**
	 * 「SELECT_LCL」で始まるサブオペレーショングループ名を返す
	 */
	protected List<String> getSelectLclGrpNames() {
		List<String> l = new ArrayList<String>();
		for (String grp : getGrpNames()) {
			if (grp.startsWith(SELECT_LCL)) {
				l.add(grp);
			}
		}
		Collections.sort(l);
		return l;
	}

	/**
	 * 「SELECT」「SELECT_LCLxx」以外の「SELECT」で始まるサブオペレーショングループ名を返す
	 */
	@Override
	protected List<String> getOtherSelectGrpNames() {
		List<String> l = new ArrayList<String>();
		for (String grp : getGrpNames()) {
			if (grp.startsWith(SELECT) && !grp.equals(SELECT)
					&& !grp.startsWith(SELECT_LCL)) {
				l.add(grp);
			}
		}
		Collections.sort(l);
		return l;
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
		else if (grp.startsWith(SELECT_LCL)) {
			// SELECT_LCLサブオペレーショングループは最後
			int i = getOtherSelectOpesCount() + 1;
			for (String g : getSelectLclGrpNames()) {
				for (MCController c : getSubOpes(g)) {
					if (ctrl == c) {
						return i;
					}
					i++;
				}
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

	protected int getOtherSelectOpesCount() {
		int i = 0;
		List<String> grpNames = getOtherSelectGrpNames();
		for (String grp : grpNames) {
			i += getSubOpes(grp) != null ? getSubOpes(grp).size() : 0;
		}
		return i;
	}
}
