package mcframe.serverMABC.MABCL0700;

import mcframe.commonCore.lang.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.commonCore.notice.*;
import mcframe.serverCore.logic.*;
import mcframe.serverCore.notice.MCMessagePool;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.serverMA.dbc.*;
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverMABC.MABCL0710.*; // このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMABC.MABCL0700.*; // このimportはFrameManagerの自動生成で追加されました。
import java.util.ArrayList;
import java.util.List;
import mcframe.serverCore.resource.MCConfig;
import mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil;
import mcframe.serverFXUC.FXUCL0170.*;
import static mcframe.serverCore.requester.MCRequestObject.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_LocReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_LocReg_MC extends MABCL_LocReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Loc_UpdChk01オペレーション.<p>
	 *
	 * 場所マスタの登録前のチェックを行います。<br>
	 */
	public class Loc_UpdChk01 extends MABCL_LocReg_MC_A.Loc_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for (Loc_UpdChk01_DtlR r : up0()) {
				if (isNotCd(r.loc_cd())) {
					msgList.add(new MCMessage(r, Loc_UpdChk01_DtlR.$loc_cd, MABCL0306,
							getLabel(r, Loc_UpdChk01_DtlR.$loc_cd), r.loc_cd(),
							toDispGUIIndex(r)));
					continue;
				}
				if (r.del_flg()) {
					continue;
				}
				if (r.getBooleanNE("err_flg")) {
					continue;
				}

				// 条件付必須チェック
				if (r.addr_flg()) {
					msgList.addAll(check(r, Loc_UpdChk01_DtlR.$addr1,
							new FXUCL_RequiredValidater()));
				}

				// 個別チェック
				if (isSame(r.rsrc_cd1(), r.rsrc_cd2())) {
					if (!isNull(r.rsrc_cd1())) {
						msgList.add(new MCMessage(r, Loc_UpdChk01_DtlR.$rsrc_cd1,
								MABCL0150, toDispGUIIndex(r)));
					}
				}
				if (isNull(r.sppl_cd())) {
					if (!isNull(r.maker_cd())) {
						msgList.add(new MCMessage(r, Loc_UpdChk01_DtlR.$maker_cd,
								MABCL0043, toDispGUIIndex(r)));
					}
					if (r.pre_outsrc_act_flg()) {
						msgList.add(getMsg(r, Loc_UpdChk01_DtlR.$pre_outsrc_act_flg,
								MABCL0180));
					}
					if (r.ddlv_prov_insp_flg()) {
						msgList.add(getMsg(r, Loc_UpdChk01_DtlR.$ddlv_prov_insp_flg,
								MABCL0180));
					}
				}
				else {
					if (!MAC_LOC_MNG_TYP.isPRD(r.loc_mng_typ())) {
						msgList.add(new MCMessage(r, Loc_UpdChk01_DtlR.$loc_mng_typ,
								MABCL0044, toDispGUIIndex(r)));
					}

					if (r.lg_def_flg()) {
						msgList.add(new MCMessage(r, Loc_UpdChk01_DtlR.$lg_def_flg,
								MABCL0046, toDispGUIIndex(r)));
					}
				}
				if (!r.stktk_tgt_flg()) {
					if (r.stktk_tor_disp_flg()) {
						msgList.add(getMsg(r, Loc_UpdChk01_DtlR.$stktk_tor_disp_flg,
								MABCL0224));
					}
					if (r.stktk_tor_ex_zero_flg()) {
						msgList.add(getMsg(r, Loc_UpdChk01_DtlR.$stktk_tor_ex_zero_flg,
								MABCL0224));
					}
					if (r.stktk_act_ex_zero_flg()) {
						msgList.add(getMsg(r, Loc_UpdChk01_DtlR.$stktk_act_ex_zero_flg,
								MABCL0224));
					}
					if (r.stktk_amt_flg()) {
						msgList.add(
								getMsg(r, Loc_UpdChk01_DtlR.$stktk_amt_flg, MABCL0224));
					}
				}
				if (!r.addr_flg()) {
					if (!isNull(r.zip_cd())) {
						msgList.add(getMsg(r, Loc_UpdChk01_DtlR.$zip_cd, MABCL0257));
					}
					if (!isNull(r.addr1())) {
						msgList.add(getMsg(r, Loc_UpdChk01_DtlR.$addr1, MABCL0257));
					}
					if (!isNull(r.addr2())) {
						msgList.add(getMsg(r, Loc_UpdChk01_DtlR.$addr2, MABCL0257));
					}
					if (!isNull(r.addr3())) {
						msgList.add(getMsg(r, Loc_UpdChk01_DtlR.$addr3, MABCL0257));
					}
					if (!isNull(r.addr4())) {
						msgList.add(getMsg(r, Loc_UpdChk01_DtlR.$addr4, MABCL0257));
					}
				}
				// ローケル存在チェック
				MCMessageList l = checkLocaleEntry(r.prnt_lcl_cd());
				if (!l.isEmpty()) {
					l.get(0).setCauseRow(r, Loc_UpdChk01_DtlR.$prnt_lcl_cd);
					msgList.addAll(l);
				}
			}
			return msgList;
		}

		/** 項目名、行番号を引数に持つメッセージ */
		protected MCMessage getMsg(Loc_UpdChk01_DtlR r, String col, String id) {
			return new MCMessage(r, col, id, getLabel(r, col), toDispGUIIndex(r));
		}
	}

	/**
	 * Loc_Upd01オペレーション.<p>
	 *
	 * 場所マスタの登録を行います。<br>
	 */
	public class Loc_Upd01 extends MABCL_LocReg_MC_A.Loc_Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected <R extends MCDBContainer> void afterUpdate(MCList<R> dbc) {
			super.afterUpdate(dbc);

			for (R r : dbc) {
				if (dbc.createRow() instanceof MAM_LOC_R) {
					checkLgDefFlg((MAM_LOC_R) r);
				}
			}
		}

		/**
		 * 同一物流Ｇで物流標準場所ＦＬＧ＝オンは1件のみチェック
		 */
		protected void checkLgDefFlg(MAM_LOC_R r) {

			if (!r.lg_def_flg() || r.del_flg()) {
				return;
			}

			MAM_LOC_R t = MAM_LOC_R.create("T");
			int i = execDbCount("MABCL0700_MAM_LOC_S01", t,
					t.lg_grp_cd.eq(bind("lg_grp_cd"))
					.and(t.loc_cd.neq(bind("loc_cd")))
					.and(t.lg_def_flg.eq(value(true)))
					.and(t.del_flg.eq(value(false))),
					r);

			if (i > 0) {
				getMsgList().add(new MCMessage(r, MAM_LOC_R.$lg_def_flg, MABCL0149,
						r.lg_grp_cd(), toDispGUIIndex(r)));
			}
		}
	}

	/**
	 * LocLcl_UpdChk01オペレーション.<p>
	 *
	 * 汎用分類名称マスタの登録前のチェックを行います。<br>
	 */
	public class LocLcl_UpdChk01 extends MABCL_LocReg_MC_A.LocLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	/**
	 * LocLcl_Upd01オペレーション.<p>
	 *
	 * 汎用分類名称マスタの登録を行います。<br>
	 */
	public class LocLcl_Upd01 extends MABCL_LocReg_MC_A.LocLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	/**
	 * Loc_DelChk01オペレーション.<p>
	 *
	 * 場所マスタの削除前のチェックを行います。<br>
	 */
	public class Loc_DelChk01 extends MABCL_LocReg_MC_A.Loc_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	/**
	 * Loc_Del01オペレーション.<p>
	 *
	 * 場所マスタの削除を行います。<br>
	 */
	public class Loc_Del01 extends MABCL_LocReg_MC_A.Loc_Del01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected <R extends MCDBContainer> void dbLockDelUpdInsByStatusCheck(
				MCQueryApiBuilder builder, MCList<R> rslt, boolean updChk) {

			if (rslt.createRow().tableName().equals("MAM_STR_LN")
					|| rslt.createRow().tableName().equals("MAM_LOC_SUB")) {
				dbDelLcl(builder, rslt);
			}
			else {
				super.dbLockDelUpdInsByStatusCheck(builder, rslt, updChk);
			}
		}
	}

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 場所マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABCL_LocReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doItLcl() {
			super.doItLcl();
		}

		@Override
		protected List<String> getSelectLclGrpNames() {
			List<String> l = new ArrayList<String>();
			l.add("SELECT_SUB1");
			l.add("SELECT_SUB2");
			l.addAll(super.getSelectLclGrpNames());
			return l;
		}

		@Override
		protected List<String> getOtherSelectGrpNames() {
			return new ArrayList<String>();
		}

		@Override
		protected <R extends MCDBContainer> void dbcCustomizeLcl(
				MCQueryApiBuilder builder, MCList<R> rslt) {
			super.dbcCustomizeLcl(builder, rslt);

			if (builder.getBaseDbc() instanceof MAM_LOC_SUB_R) {
				MAM_DPT_R asst = MAM_DPT_R.create("ASST");
				MAM_DPT_R sls = MAM_DPT_R.create("SLS");
				MAM_LOC_SUB_R t = MAM_LOC_SUB_R.create(builder.getBaseDbcAlias());

				builder.addSelect(asst.dpt_nm.as("asst_dpt_nm"));
				builder.addSelect(sls.dpt_nm.as("sls_dpt_nm"));
				builder.addLeftOuterJoin(asst, t.asst_dpt_cd.eq(asst.dpt_cd)
						.and(t.st_dt.between(asst.st_dt, asst.end_dt)));
				builder.addLeftOuterJoin(sls, t.sls_dpt_cd.eq(sls.dpt_cd)
						.and(t.st_dt.between(sls.st_dt, sls.end_dt)));

			}
			if (builder.getBaseDbc() instanceof MAM_STR_LN_R) {
				MAM_STR_LN_R lcl = MAM_STR_LN_R.create("LCL");
				MAM_STR_LN_R t = MAM_STR_LN_R.create(builder.getBaseDbcAlias());
				builder.addSelect(lcl.str_ln_nm.as("str_ln_nm_lcl"));
				builder.addLeftOuterJoin(lcl,
						t.loc_cd.eq(lcl.loc_cd)
						.and(t.str_ln_cd.eq(lcl.str_ln_cd)));
			}
			if (builder.getBaseDbc() instanceof MAM_STR_LN_LCL_R) {
				MAM_STR_LN_LCL_R t = MAM_STR_LN_LCL_R.create(builder.getBaseDbcAlias());
				MAM_STR_LN_R str_ln = MAM_STR_LN_R.create("STR_LN");

				builder.addInnerJoin(str_ln,
						t.loc_cd.eq(str_ln.loc_cd)
						.and(t.str_ln_cd.eq(str_ln.str_ln_cd)));
				if (_hasDelFlag && !isNull(_delFlgStr)) {
					if (up0().on_del_flg()) {
						builder.addWhereWithAnd(str_ln.del_flg.eq(value(true)));
					}
					else {
						builder.addWhereWithAnd(str_ln.del_flg.eq(value(false)));
					}
				}
			}
		}

		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder,
				MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);

			if (builder.getBaseDbc() instanceof MAM_LOC_R) {
				dbcCustomizeSub(builder);
			}
		}

		protected void dbcCustomizeSub(MCQueryApiBuilder builder) {
			if (up0().no_sppl_flg()) {
				MAM_LOC_R t = MAM_LOC_R.create(builder.getBaseDbcAlias());
				builder.addWhereWithAnd(t.sppl_cd.isNull());
			}
		}

		@Override
		protected <R extends MCDBContainer> void dbSelectLcl(MCQueryApiBuilder builder,
				MCList<MCRow> cond, MCList<R> rslt, MCController ctrl) {
			if (builder.getBaseDbc() instanceof MAM_STR_LN_LCL_R) {
				// 棚・ライン名称マスタ検索条件をセット
				setCondL(getSubOpes(SELECT_SUB2).get(0).down(0));
				// 棚・ラインマスタが０件なら棚・ライン名称マスタを検索しない
				if (getCondL(getSubOpes(SELECT_SUB2).get(0)).isEmpty()) {
					return;
				}
			}
			super.dbSelectLcl(builder, cond, rslt, ctrl);
		}
		
		@Override
		protected void down_SELECT_c0_0(Srch01_Rslt1R r_dest, MAM_LOC_R r_src) {
			super.down_SELECT_c0_0(r_dest, r_src);

			// 帳票出力ロケール名
			if (!isNull(r_src.prnt_lcl_cd())) {
				MCList<MCRow> lclLst = MCConfig.common.getEntryLocaleList("lcl_cd",
						"lcl_nm");
				MCRow row = lclLst.getFirst("lcl_cd", r_src.prnt_lcl_cd());
				if (row != null) {
					r_dest.prnt_lcl_nm(row.getStringNE("lcl_nm"));
				}
			}
		}

		@Override
		protected void down_SELECT_SUB1_c1_0(Srch01_Rslt2R r_dest, MAM_LOC_SUB_R r_src) {
			super.down_SELECT_SUB1_c1_0(r_dest, r_src);

			// 機能名の設定
			MAUCL_MCDataUtil.setFuncNm(r_dest);
		}

		@Override
		protected void down_SELECT_SUB2_c2_0(Srch01_Rslt3R r_dest, MAM_STR_LN_R r_src) {
			super.down_SELECT_SUB2_c2_0(r_dest, r_src);

			// 機能名の設定
			MAUCL_MCDataUtil.setFuncNm(r_dest);
		}
	}

	/**
	 * Upd01オペレーション.<p>
	 *
	 * 場所マスタの登録を行います。（マスタ画面用）<br>
	 */
	public class Upd01 extends MABCL_LocReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();
		}
	}

	/**
	 * Del01オペレーション.<p>
	 *
	 * 場所マスタの削除を行います。<br>
	 */
	public class Del01 extends MABCL_LocReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	/**
	 * StrLn_UpdChk01オペレーション.<p>
	 *
	 * 棚・ラインマスタの登録前のチェックを行います。<br>
	 */
	public class StrLn_UpdChk01 extends MABCL_LocReg_MC_A.StrLn_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();

			// 場所マスタ取得
			initLocCache(up0());

			for (StrLn_UpdChk01_DtlR r : up0()) {
				if (isNotCd(r.str_ln_cd())) {
					msgList.add(new MCMessage(r, StrLn_UpdChk01_DtlR.$str_ln_cd,
							MABCL0306, getLabel(r, StrLn_UpdChk01_DtlR.$str_ln_cd),
							r.str_ln_cd(), toDispGUIIndex(r)));
					continue;
				}
				if (r.del_flg()) {
					continue;
				}
				if (r.getBooleanNE("err_flg")) {
					continue;
				}
				MAM_LOC_R locR = getLocR(r.loc_cd());
				if (locR == null) {
					msgList.add(new MCMessage(r, StrLn_UpdChk01_DtlR.$loc_cd, MABCL0315,
							r.loc_cd(), toDispGUIIndex(r)));
				}
				if (locR != null && !locR.str_ln_tgt_flg()) {
					msgList.add(new MCMessage(r, StrLn_UpdChk01_DtlR.$loc_cd, MABCL0319,
							r.loc_cd(), toDispGUIIndex(r)));
				}
			}
			return msgList;
		}
	}

	/**
	 * StrLn_Upd01オペレーション.<p>
	 *
	 * 棚・ラインマスタの登録を行います。<br>
	 */
	public class StrLn_Upd01 extends MABCL_LocReg_MC_A.StrLn_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	/**
	 * LclStrLn_UpdChk01オペレーション.<p>
	 *
	 * 棚・ラインマスタの登録前のチェックを行います。<br>
	 */
	public class LclStrLn_UpdChk01 extends MABCL_LocReg_MC_A.LclStrLn_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();

			// 棚・ラインマスタ取得
			initStrLnCache(up0());

			for (LclStrLn_UpdChk01_DtlR r : up0()) {
				MAM_STR_LN_R strLnR = getStrLnR(r.loc_cd(), r.str_ln_cd());
				if (strLnR == null) {
					msgList.add(new MCMessage(r, LclStrLn_UpdChk01_DtlR.$str_ln_cd,
							MABCL0316, r.loc_cd(), r.str_ln_cd(), toDispGUIIndex(r)));
				}
			}
			return msgList;
		}
	}

	/**
	 * LclStrLn_Upd01オペレーション.<p>
	 *
	 * 棚・ラインマスタの登録を行います。<br>
	 */
	public class LclStrLn_Upd01 extends MABCL_LocReg_MC_A.LclStrLn_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	// ///////////////////////////////////////////////
	// マスタ取得（ここから）
	// ///////////////////////////////////////////////
	protected static final Class<MABCL_LocReg> CLAZZ = MABCL_LocReg.class;

	/**
	 * 場所マスタの主キーワークテーブル作成
	 */
	protected void insLocWk(MCList<? extends MCRow> bindL) {
		MAW_LOC_KEY_R S0T = MAW_LOC_KEY_R.create("T");

		dbWkDelete("MABCL0700_MAW_LOC_KEY_D01", MAM_LOC_R.create());

		MCInsert q2 = sql("MABCL0700_MAW_LOC_KEY_I01").insert(S0T).columns(S0T.loc_cd)
				.values(bind("loc_cd"));
		q2.executeBatchUpdate(bindL);
	}

	/**
	 * 「MAM_LOC_」取得
	 */
	MCList<MAM_LOC_R> _locL;

	MCIndexKey _locKey;

	protected void initLocCache(MCList<StrLn_UpdChk01_DtlR> dtlL) {
		// ワーク作成
		insLocWk(dtlL);

		// 検索
		MCList<MAM_LOC_R> dbc = MCList.create(MAM_LOC_R.class);
		MAM_LOC_R t = MAM_LOC_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		MAW_LOC_KEY_R S1W = MAW_LOC_KEY_R.create("W");
		dbc_bldr.setSelect(t.loc_cd);
		dbc_bldr.addSelect(t.str_ln_tgt_flg);
		dbc_bldr.setWhere(value(0).eq(value(0)));
		dbc_bldr.addWhereWithAnd(exists(
				subQuery().select(value("X")).from(S1W).where(S1W.loc_cd.eq(t.loc_cd))));
		dbSelect("MABCL0700_MAM_LOC_S02", dbc, dbc_bldr);

		// インデックス作成
		object(CLAZZ)._locL = dbc;
		object(CLAZZ)._locKey = object(CLAZZ)._locL.createIndex(MAM_LOC_R.$loc_cd);

	}

	protected MAM_LOC_R getLocR(String locCd) {
		return object(CLAZZ)._locL.getFirst(object(CLAZZ)._locKey, locCd);
	}

	/**
	 * 棚・ラインマスタの主キーワークテーブル作成
	 */
	protected void insStrLnWk(MCList<? extends MCRow> bindL) {
		MAW_STR_LN_KEY_R S0T = MAW_STR_LN_KEY_R.create("T");

		dbWkDelete("MABCL0700_MAW_STR_LN_KEY_D01", MAM_STR_LN_R.create());

		MCInsert q2 = sql("MABCL0700_MAW_STR_LN_KEY_I01").insert(S0T)
				.columns(S0T.loc_cd, S0T.str_ln_cd)
				.values(bind("loc_cd"), bind("str_ln_cd"));
		q2.executeBatchUpdate(bindL);

	}

	/**
	 * 「MAM_STR_LN_」取得
	 */
	MCList<MAM_STR_LN_R> _strLnL;

	MCIndexKey _strLnKey;

	protected void initStrLnCache(MCList<LclStrLn_UpdChk01_DtlR> dtlL) {
		// ワーク作成
		insStrLnWk(dtlL);

		// 検索
		MCList<MAM_STR_LN_R> dbc = MCList.create(MAM_STR_LN_R.class);
		MAM_STR_LN_R t = MAM_STR_LN_R.create("T");
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
		MAW_STR_LN_KEY_R S1W = MAW_STR_LN_KEY_R.create("W");
		dbc_bldr.setSelect(t.loc_cd, t.str_ln_cd);
		dbc_bldr.setWhere(value(0).eq(value(0)));
		dbc_bldr.addWhereWithAnd(exists(subQuery().select(value("X")).from(S1W)
				.where(S1W.loc_cd.eq(t.loc_cd)
						.and(S1W.str_ln_cd.eq(t.str_ln_cd)))));
		dbSelect("MABCL0700_MAM_STR_LN_S01", dbc, dbc_bldr);

		// インデックス作成
		object(CLAZZ)._strLnL = dbc;
		object(CLAZZ)._strLnKey = object(CLAZZ)._strLnL.createIndex(MAM_STR_LN_R.$loc_cd,
				MAM_STR_LN_R.$str_ln_cd);
	}

	protected MAM_STR_LN_R getStrLnR(String locCd, String strLnCd) {
		return object(CLAZZ)._strLnL.getFirst(object(CLAZZ)._strLnKey, locCd, strLnCd);
	}
	// ///////////////////////////////////////////////
	// マスタ取得（ここまで）
	// ///////////////////////////////////////////////

	//FMCB CUSTOM END
}