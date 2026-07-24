package mcframe.serverMABC.MABCL2090;

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
import mcframe.serverMABC.MABCL2090.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMABC.MABCL2090.Query.*;
import mcframe.serverFXUC.FXUCL0170.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_CostDptReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_CostDptReg_MC extends MABCL_CostDptReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * CostDpt_UpdChk01オペレーション.<p>
	 *
	 * 原価部門マスタの登録前のチェックを行います。<br>
	 */
	public class CostDpt_UpdChk01 extends MABCL_CostDptReg_MC_A.CostDpt_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			for(CostDpt_UpdChk01_DtlR row : up0()){
				if (isNotCd(row.dpt_cd())){
					msgL.add(new MCMessage(row, CostDpt_UpdChk01_DtlR.$dpt_cd, MABCL0306, 
									getLabel(row, CostDpt_UpdChk01_DtlR.$dpt_cd), row.dpt_cd(), toDispGUIIndex(row)));
					continue;
				}
				if (row.del_flg()) {
					continue ;
				}
				
				if (row.getBooleanNE("err_flg")) {
					continue;
				}

				// 条件付必須チェック
				if (MAC_DPT_CONFIG_TYP.isLG_GRP(row.dpt_config_typ())) {
					msgL.addAll(check(row, CostDpt_UpdChk01_DtlR.$lg_grp_cd, new FXUCL_RequiredValidater()));
				}
				if (MAC_DPT_CONFIG_TYP.isLOC_GRP(row.dpt_config_typ())) {
					msgL.addAll(check(row, CostDpt_UpdChk01_DtlR.$loc_grp_cd, new FXUCL_RequiredValidater()));
				}
				if (MAC_DPT_CONFIG_TYP.isWG(row.dpt_config_typ())) {
					msgL.addAll(check(row, CostDpt_UpdChk01_DtlR.$wg_cd, new FXUCL_RequiredValidater()));
				}
				if (MAC_DPT_CONFIG_TYP.isSITE(row.dpt_config_typ())) {
					msgL.addAll(check(row, CostDpt_UpdChk01_DtlR.$site_cd, new FXUCL_RequiredValidater()));
				}

				// 個別チェック
				// 部門構成区分に「3：物流Ｇ」以外が設定されているが物流グループＣＤが設定されている
				if (!MAC_DPT_CONFIG_TYP.isLG_GRP(row.dpt_config_typ())) {
					if (!isNull(row.lg_grp_cd())) {
						msgL.add(new MCMessage(row, CostDpt_UpdChk01_DtlR.$lg_grp_cd, MABCL0268, toDispGUIIndex(row)));
					}
				}
				// 部門構成区分に「4：製造場所Ｇ」以外が設定されているが製造場所グループＣＤが設定されている
				if (!MAC_DPT_CONFIG_TYP.isLOC_GRP(row.dpt_config_typ())) {
					if (!isNull(row.loc_grp_cd())) {
						msgL.add(new MCMessage(row, CostDpt_UpdChk01_DtlR.$loc_grp_cd, MABCL0269, toDispGUIIndex(row)));
					}
				}
				// 部門構成区分に「5：ＷＧ」以外が設定されているがワーキンググループＣＤが設定されている
				if (!MAC_DPT_CONFIG_TYP.isWG(row.dpt_config_typ())) {
					if (!isNull(row.wg_cd())) {
						msgL.add(new MCMessage(row, CostDpt_UpdChk01_DtlR.$wg_cd, MABCL0270, toDispGUIIndex(row)));
					}
				}
				// 部門構成区分に「6：工場・物流倉庫」以外が設定されているが工場・物流倉庫ＣＤが設定されている
				if (!MAC_DPT_CONFIG_TYP.isSITE(row.dpt_config_typ())) {
					if (!isNull(row.site_cd())) {
						msgL.add(new MCMessage(row, CostDpt_UpdChk01_DtlR.$site_cd, MABCL0271, toDispGUIIndex(row)));
					}
				}
			}
			return msgL;
		}
	}
	/**
	 * CostDpt_Upd01オペレーション.<p>
	 *
	 * 原価部門マスタの登録を行います。<br>
	 */
	public class CostDpt_Upd01 extends MABCL_CostDptReg_MC_A.CostDpt_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * CostDptLcl_UpdChk01オペレーション.<p>
	 *
	 * 原価部門名称マスタの登録前のチェックを行います。<br>
	 */
	public class CostDptLcl_UpdChk01 extends MABCL_CostDptReg_MC_A.CostDptLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * CostDptLcl_Upd01オペレーション.<p>
	 *
	 * 原価部門名称マスタの登録を行います。<br>
	 */
	public class CostDptLcl_Upd01 extends MABCL_CostDptReg_MC_A.CostDptLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * CostDpt_DelChk01オペレーション.<p>
	 *
	 * 原価部門マスタ、原価品群名称マスタの削除前のチェックを行います。<br>
	 */
	public class CostDpt_DelChk01 extends MABCL_CostDptReg_MC_A.CostDpt_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * CostDpt_InsChk01オペレーション.<p>
	 *
	 * 会計部門マスタから原価部門マスタへ取込する前のチェックを行う<br>
	 */
	public class CostDpt_InsChk01 extends MABCL_CostDptReg_MC_A.CostDpt_InsChk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			msgL.addAll(chk());
			return msgL;
		}

		protected MCMessageList chk() {
			MCMessageList msgL = new MCMessageList();
			if(!hasErrFlgOn(up0())) {
				// 対象日チェック
				MCList<MAM_TERM_R> term = MCList.create(MAM_TERM_R.class);
				MAM_TERM_R t = MAM_TERM_R.create("T");
				MCQueryApiBuilder term_bldr = MCQueryApiBuilder.create(t);
				term_bldr.setSelect(t.term);
				term_bldr.setWhere(value(0).eq(value(0)));
				term_bldr.addWhereWithAnd(
						bind("1").between(t.term, t.term_end_ym.subtractDays(value(1))),
						up0().tgt_dt());
				int cnt = dbSelect("MABCL2090_MAM_TERM_S01", term, term_bldr);

				if (cnt == 0) {
					MCMessage msg = new MCMessage(MABCL0312, toYMDString(up0().tgt_dt()));
					msgL.add(msg);
				}
			}
			return msgL;
		}
	}
	/**
	 * CostDpt_Del01オペレーション.<p>
	 *
	 * 原価部門マスタ、原価品群名称マスタの削除を行います。<br>
	 */
	public class CostDpt_Del01 extends MABCL_CostDptReg_MC_A.CostDpt_Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 原価部門マスタ、原価部門名称マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABCL_CostDptReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder, MCList<R> rslt) {
			super.dbcCustomize(builder, rslt);
			if (rslt.createRow() instanceof MAM_COST_DPT_R) {
				dbcCustomizeSub(builder);
			}
		}

		protected <R extends MCDBContainer> void dbcCustomizeSub(MCQueryApiBuilder builder) {
			
			MCDBContainer t = builder.getBaseDbc();
			
			// 期の検索条件をwhere句に追加
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeGte(t.getColumn$("term"), bind(Srch01_CndR.$term_fr)));
			builder.addWhereWithCutOffAnd(MCQueryApiBuilder.makeLte(t.getColumn$("term"), bind(Srch01_CndR.$term_to)));
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 原価部門マスタ、原価部門名称マスタの登録を行います。（マスタ画面用）<br>
	 */
	public class Upd01 extends MABCL_CostDptReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 原価部門マスタ、原価部門名称マスタの削除を行います。<br>
	 */
	public class Del01 extends MABCL_CostDptReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Ins01オペレーション.<p>
	 *
	 * 会計部門マスタから原価部門マスタへ取込処理を行う<br>
	 */
	public class Ins01 extends MABCL_CostDptReg_MC_A.Ins01 {
		@Override
		protected void call() {
			callThisInsChk01();
			throwUpdErr();
			copyDpt();
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisInsChk01() {
			MABCL_CostDptReg.CostDpt_InsChk01 ope = MABCL_CostDptReg.crtCostDpt_InsChk01();
			MCRow.copyall(ope.up0(), up0());
			ope.exec();
		}

		protected void copyDpt() {
			up0().addStringColumn("ins_only", toTrueStr(up0().ins_only_flg()));
			
			MCList<MAM_AC_DPT_R> regL = MCList.create(MAM_AC_DPT_R.class);
			regL.addBooleanColumn("upd_flg", false);
			regL.addDateColumn(MAM_TERM_R.$term);
			executeQuery(regL, MABCL2090_MAM_AC_DPT_S01(), up0());
			MCIndexKey idxRegL = regL.createIndex(MAM_AC_DPT_R.$ac_dpt_cd, MAM_TERM_R.$term);
			
			MCList<MAM_COST_DPT_R> costDptWkL = MCList.create(MAM_COST_DPT_R.class);
			MCQueryApiBuilder costDptWkBldr = MCQueryApiBuilder.create(MAM_COST_DPT_R.create("T"));
			dbWkDelete("MABCL2090_MAW_COST_DPT_D01", costDptWkBldr.getBaseDbc());
			for (MAM_AC_DPT_R regR : regL) {
				MAM_COST_DPT_R wkR = MAM_COST_DPT_R.create();
				wkR.dpt_cd(regR.ac_dpt_cd());
				wkR.term(regR.getDateNE(MAM_TERM_R.$term));
				costDptWkL.add(wkR);
			}
			dbWkInsert("MABCL2090_MAW_COST_DPT_I01", costDptWkL, costDptWkBldr.getBaseDbc());
			
			MCList<MAM_COST_DPT_R> costDptUpdL = MCList.create(MAM_COST_DPT_R.class);
			executeQuery(costDptUpdL, MABCL2090_MAM_COST_DPT_S01());
			
			dbWkDelete("MABCL2090_MAW_COST_DPT_D02", costDptWkBldr.getBaseDbc());

			for(MAM_COST_DPT_R r : costDptUpdL) {
				MAM_AC_DPT_R regR = regL.getFirst(idxRegL, r.dpt_cd(), r.getDateNE(MAM_TERM_R.$term));
				regR.setBooleanNE("upd_flg", true);
				r.dpt_nm(regR.ac_dpt_nm());
			}
			if (!costDptUpdL.isEmpty()) {
				MAM_COST_DPT_R costDptUpdR = MAM_COST_DPT_R.create("T");
				MCQueryApiBuilder costDptUpdBldr = MCQueryApiBuilder.create(costDptUpdR);
				costDptUpdBldr.setSet(costDptUpdR.dpt_nm);
				dbUpdateKey("MABCL2090_MAM_COST_DPT_U01", costDptUpdL, costDptUpdBldr);
			}
			
			MCList<MAM_COST_DPT_R> costDptInsL = MCList.create(MAM_COST_DPT_R.class);
			for (MAM_AC_DPT_R r : regL.subList("upd_flg", false)) {
				MAM_COST_DPT_R insR = MAM_COST_DPT_R.create();
				insR.dpt_cd(r.ac_dpt_cd());
				insR.term(r.getDateNE(MAM_TERM_R.$term));
				insR.dpt_nm(r.ac_dpt_nm());
				insR.dpt_config_typ(MAC_DPT_CONFIG_TYP.NON.value());
				costDptInsL.add(insR);
			}
			if (!costDptInsL.isEmpty()) {
				MAM_COST_DPT_R costDptInsR = MAM_COST_DPT_R.create("T");
				MCQueryApiBuilder costDptInsBldr = MCQueryApiBuilder.create(costDptInsR);
				dbInsert("MABCL2090_MAM_COST_DPT_I01", costDptInsL, costDptInsBldr);
			}
		}
	}

	//FMCB CUSTOM END
}